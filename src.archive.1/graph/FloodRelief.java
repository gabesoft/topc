package topc.graph;

import java.util.*;
import java.io.*;

// SRM 371 Division II Level Three - 1000
// graph theory, recursion
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=8243&rd=10787
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm371
public class FloodRelief {
    int n;
    int m;

    int [] dx = {0, 0, 1, -1};
    int [] dy = {1, -1, 0, 0}; 

    public int minimumPumps(String[] heights) {
        n = heights.length;
        m = heights[0].length();

        int grid[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = heights[i].charAt(j) - 'a' + 1;
            }
        }

        int values[] = new int[5000];
        int id       = 101;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                findRegions(grid, values, i, j, id++);
            }
        }

        boolean hasPump[] = new boolean[values.length];
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < m; c++) {
                for (int i = 0; i < dx.length; i++) {
                    int nr = r + dx[i];
                    int nc = c + dy[i];

                    if (valid(nr, nc) && values[grid[nr][nc]] > values[grid[r][c]]) {
                        hasPump[grid[nr][nc]] = true;
                    }
                }
            }
        }

        int count = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] > 0 && !hasPump[i]) {
                count++;
            }
        }

        return count;
    }

    void findRegions(int[][] grid, int[] values, int r, int c, int id) {
        int v = grid[r][c];

        if (v > 100) { return; }

        grid[r][c] = id;
        values[id] = v;

        for (int i = 0; i < dx.length; i++) {
            int nr = r + dx[i];
            int nc = c + dy[i];

            if (valid(nr, nc) && grid[nr][nc] == v) {
                findRegions(grid, values, nr, nc, id);
            }
        }
    }

    boolean valid(int r, int c) {
        return 0 <= r && r < n && 0 <= c && c < m;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
