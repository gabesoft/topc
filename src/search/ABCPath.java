package topc.search;

import java.util.*;
import java.io.*;

// SRM 253 Division II Level Three - 1000
// search
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=4678&rd=7227
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm253
public class ABCPath {
    int n;
    int m;
    int G[][];

    int dr[] = new int[] { 0,  0, 1, -1, 1, -1,  1, -1 };
    int dc[] = new int[] { 1, -1, 0,  0, 1, -1, -1,  1 };

    public int length(String[] grid) {
        n = grid.length;
        m = grid[0].length();
        G = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                G[i][j] = grid[i].charAt(j) - 'A';
            }
        }

        int best = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (G[i][j] == 0) {
                    best = Math.max(best, find(i, j));
                }
            }
        }

        return best;
    }

    private int find(int r, int c) {
        int len  = 0;
        int size = 10 * n * m;

        int rows[] = new int[size];
        int cols[] = new int[size];
        int lens[] = new int[size];

        int head = 0;
        int tail = 0;

        rows[head] = r;
        cols[head] = c;
        lens[head] = 1;

        boolean seen[][][] = new boolean[n][m][n * m + 1];

        while (head <= tail) {
            int row = rows[head];
            int col = cols[head];

            len = lens[head];
            head++;

            if (seen[row][col][len]) { continue; }

            seen[row][col][len] = true;
            for (int i = 0; i < dr.length; i++) {
                int nr = row + dr[i];
                int nc = col + dc[i];

                if (valid(nr, nc) && G[row][col] + 1 == G[nr][nc]) {
                    tail++;
                    rows[tail] = nr;
                    cols[tail] = nc;
                    lens[tail] = len + 1;
                }
            }
        }

        return len;
    }

    private boolean valid(int r, int c) {
        return 0 <= r && r < n && 0 <= c && c < m;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
