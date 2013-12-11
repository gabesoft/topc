package topc.dynamic;

import java.util.*;
import java.io.*;

// Member SRM 455 Division I Level One - 300
// dynamic programming, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10719&rd=14179
// editorial: http://apps.topcoder.com/wiki/display/tc/Algorithm+Problem+Set+Analysis
public class DonutsOnTheGridEasy {
    int n;
    int m;
    char[][] G;
    int[][][][] memo;
    boolean[][][] HZ;
    boolean[][][] VZ;

    public int calc(String[] grid) {
        n = grid.length;
        m = grid[0].length();

        G = new char[n][];
        for (int i = 0; i < n; i++) {
            G[i] = grid[i].toCharArray();
        }

        memo = new int[n + 1][m + 1][n + 1][m + 1];

        HZ = new boolean[m][m][n];
        VZ = new boolean[n][n][m];

        for (int r1 = 0; r1 < n; r1++) {
            for (int r2 = r1 + 2; r2 < n; r2++) {
                for (int c = 0; c < m; c++) {
                    VZ[r1][r2][c] = vzero(r1, r2, c);
                }
            }
        }

        for (int c1 = 0; c1 < m; c1++) {
            for (int c2 = c1 + 2; c2 < m; c2++) {
                for (int r = 0; r < n; r++) {
                    HZ[c1][c2][r] = hzero(c1, c2, r);
                }
            }
        }

        for (int w = 3; w <= n; w++) {
            for (int h = 3; h <= m; h++) {
                for (int r1 = 0; r1 <= n - w; r1++) {
                    for (int c1 = 0; c1 <= m - h; c1++) {
                        int r2 = r1 + w - 1;
                        int c2 = c1 + h - 1;

                        int x = memo[r1][c1][r2][c2];

                        x = Math.max(x, memo[r1 + 1][c1][r2][c2]);
                        x = Math.max(x, memo[r1][c1 + 1][r2][c2]);
                        x = Math.max(x, memo[r1][c1][r2 - 1][c2]);
                        x = Math.max(x, memo[r1][c1][r2][c2 - 1]);

                        if (valid(r1, c1, r2, c2)) {
                            x = Math.max(x, memo[r1 + 1][c1 + 1][r2 - 1][c2 - 1] + 1);
                        }

                        memo[r1][c1][r2][c2] = x;
                    }
                }
            }
        }

        return memo[0][0][n - 1][m - 1];
    }

    private boolean valid(int r1, int c1, int r2, int c2) {
        return VZ[r1][r2][c1]
            && VZ[r1][r2][c2]
            && HZ[c1][c2][r1]
            && HZ[c1][c2][r2];
    }

    private boolean vzero(int r1, int r2, int c) {
        for (int r = r1; r <= r2; r++) {
            if (G[r][c] != '0') {
                return false;
            }
        }
        return true;
    }

    private boolean hzero(int c1, int c2, int r) {
        for (int c = c1; c <= c2; c++) {
            if (G[r][c] != '0') {
                return false;
            }
        }
        return true;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
