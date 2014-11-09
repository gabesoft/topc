package topc.easy;

import java.util.*;
import java.io.*;

// SRM 575 Division II Level Three - 1000
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12501&rd=15495
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+575
public class TheTilesDivTwo {
    int[] dr1 = new int[] { 0, 1, 0, -1 };
    int[] dc1 = new int[] { 1, 0, -1, 0 };

    int[] dr2 = new int[] { 1, 0, -1, 0 };
    int[] dc2 = new int[] { 0, -1, 0, 1 };

    int[] B;
    int n = 0;
    int m = 0;

    int dp[][][][][] = null;

    public int find(String[] board) {
        n = board.length;
        m = board[0].length();
        B = new int[m + 1];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[j].charAt(i) == 'X') {
                    B[i] |= (1 << j);
                }
            }
        }

        B[m] = (1 << n) - 1;

        dp = new int[n + 1][m + 1][1 << n][1 << n][1 << n];

        for (int[][][][] d1 : dp) {
            for (int[][][] d2 : d1) {
                for (int[][] d3 : d2) {
                    for (int[] d4 : d3) {
                        Arrays.fill(d4, -1);
                    }
                }
            }
        }

        return count(0, 0, 0, B[0], B[1]);
    }

    private int count(int row, int col, int prev, int cur, int nxt) {
        if (on(cur, row)) { return next(row, col, prev, cur, nxt); }
        if (dp[row][col][prev][cur][nxt] > -1) {
            return dp[row][col][prev][cur][nxt];
        }

        int best = 0;
        for (int i = 0; i < dr1.length; i++) {
            int r1 = row + dr1[i];
            int c1 = col + dc1[i];
            int r2 = row + dr2[i];
            int c2 = col + dc2[i];

            int m1 = prev;
            int m2 = prev;

            if (c1 == col) { m1 = cur; }
            if (c1 > col) { m1 = nxt; }
            if (c2 == col) { m2 = cur; }
            if (c2 > col) { m2 = nxt; }

            if (valid(r1, c1, m1) && valid(r2, c2, m2)) {
                int p = prev;
                int c = cur | (1 << row);
                int n = nxt;

                if (c1 == col) { c |= (1 << r1); }
                if (c1 < col) { p |= (1 << r1); }
                if (c1 > col) { n |= (1 << r1); }

                if (c2 == col) { c |= (1 << r2); }
                if (c2 < col) { p |= (1 << r2); }
                if (c2 > col) { n |= (1 << r2); }

                best = Math.max(best, 1 + next(row, col, p, c, n));
            }
        }

        best = Math.max(best, next(row, col, prev, cur, nxt));

        dp[row][col][prev][cur][nxt] = best;

        return best;
    }

    private boolean on(int mask, int k) {
        return ((mask >> k) & 1) == 1;
    }

    private boolean valid(int row, int col, int mask) {
        return 0 <= row && row < n && 0 <= col && col < m && !on(mask, row);
    }

    private int next(int row, int col, int prev, int cur, int nxt) {
        if (row + 2 < n) {
            return count(row + 2, col, prev, cur, nxt);
        } else if (col + 1 < m) {
            return count((col + 1) % 2, col + 1, cur, nxt, B[col + 2]);
        } else {
            return 0;
        }
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
