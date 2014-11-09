package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 580 Division II Level Three - 1000
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12579&rd=15500
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+580
public class WallGameDiv2 {
    public static final int INF = 1 << 30;
    char[][] C;
    int[][][] dp;
    int n;
    int m;

    public int play(String[] costs) {
        n = costs.length;
        m = costs[0].length();
        C = new char[n][];

        for (int i = 0; i < n; i++) {
            C[i] = costs[i].toCharArray();
        }

        dp = new int[n][m][3];
        for (int[][] d : dp) {
            for (int[] d2 : d) {
                Arrays.fill(d2, -2);
            }
        }

        return max(0, 0, 0);
    }

    private int max(int row, int col, int dir) {
        if (row < 0 || row > n - 1 || col < 0 || col > m - 1 || C[row][col] == 'x') {
            return -INF;
        }
        if (row == n - 1) {
            return C[row][col] - '0';
        }
        if (dp[row][col][1 + dir] > -2) {
            return dp[row][col][1 + dir];
        }

        int a = dir >= 0 ? max(row, col + 1, 1) : -INF;
        int b = max(row + 1, col, 0);
        int c = dir <= 0 ? max(row, col - 1, -1) : -INF;

        int best = -INF;

        best = Math.max(best, a);
        best = Math.max(best, b);
        best = Math.max(best, c);

        dp[row][col][1 + dir] = (C[row][col] - '0') + best;

        return dp[row][col][1 + dir];
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
