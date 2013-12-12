package topc.recursion;

import java.util.*;
import java.io.*;

// SRM 284 Division II Level Three - 1000
// recursion
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=4435&rd=8081
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm284
public class SnakeCount {
    int n;
    int m;
    int grid[][];

    int [] dr = {0, 0, 1, -1};
    int [] dc = {1, -1, 0, 0};

    int [] er = {1,  1, -1, -1};
    int [] ec = {1, -1,  1, -1};

    int [] fr = {0, 0, 1, -1, 1,  1, -1, -1};
    int [] fc = {1, -1, 0, 0, 1, -1,  1, -1};

    public int number(String[] image) {
        n    = image.length;
        m    = image[0].length();
        grid = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = image[i].charAt(j) - '0';
            }
        }


        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (head(grid, i, j)) {
                    int pixls = check(grid, i, j);

                    if (3 <= pixls && pixls <= 20 && checkAdjacent(grid)) {
                        count++;
                    }

                    clear(grid, i, j);
                }
            }
        }

        return count;
    }

    private boolean checkAdjacent(int[][] grid) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 2) {
                    for (int k = 0; k < er.length; k++) {
                        int nr = i + er[k];
                        int nc = j + ec[k];

                        if (inside(nr, nc) && grid[nr][nc] == 1) {
                            return false;
                        }
                    }
                }
            }
        }

        return true;
    }

    private boolean head(int[][] grid, int r, int c) {
        if (grid[r][c] == 0) { return false; }

        int count = 0;
        for (int i = 0; i < dr.length; i++) {
            int nr = r + dr[i];
            int nc = c + dc[i];

            if (inside(nr, nc) && grid[nr][nc] == 1) {
                count++;
            }
        }

        return count == 1;
    }

    private int check(int[][] grid, int r, int c) {
        grid[r][c] = 2;

        int row = -1;
        int col = -1;

        for (int i = 0; i < dr.length; i++) {
            int nr = r + dr[i];
            int nc = c + dc[i];

            if (inside(nr, nc) && grid[nr][nc] == 1) {
                if (row != -1) { return -1; }

                row = nr;
                col = nc;
            }
        }

        return row == -1 ? 1 : 1 + check(grid, row, col);
    }

    private void clear(int[][] grid, int row, int col) {
        int qr[] = new int[2 * n * m];
        int qc[] = new int[2 * n * m];

        int h = 0;
        int t = 1;

        qr[h] = row;
        qc[h] = col;

        grid[row][col] = 0;
        while (h < t) {
            int r = qr[h];
            int c = qc[h++];

            for (int i = 0; i < fr.length; i++) {
                int nr = r + fr[i];
                int nc = c + fc[i];

                if (inside(nr, nc) && grid[nr][nc] >= 1) {
                    grid[nr][nc] = 0;
                    qr[t]   = nr;
                    qc[t++] = nc;
                }
            }
        }
    }

    private boolean inside(int r, int c) {
        return 0 <= r && r < n && 0 <= c && c < m;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
