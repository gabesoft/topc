package topc.easy;

import java.util.*;
import java.io.*;

// SRM 601 Division II Level Three - 1000
// brute force, dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12872&rd=15713
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+601
public class WinterAndReindeers {
    final int INF = 50000;

    public int getNumber(String[] allA, String[] allB, String[] allC) {
        String A = join(allA);
        String B = join(allB);
        String C = join(allC);

        int n = A.length();
        int m = B.length();

        int[] cEndA = new int[2501];
        int[] cEndB = new int[2501];

        makeCEnd(A, C, cEndA);
        makeCEnd(B, C, cEndB);

        int[][][] dp = new int[2][2501][2501];

        for (int i = n; i >= 0; i--) {
            for (int j = m; j >= 0; j--) {
                for (int d = 0; d < 2; d++) {
                    if (i >= n || j >= m) {
                        dp[d][i][j] = (d != 0 ? 0 : -INF);
                    } else {
                        dp[d][i][j] = -INF;

                        if (A.charAt(i) == B.charAt(j)) {
                            dp[d][i][j] = Math.max(dp[d][i][j], 1 + dp[d][i + 1][j + 1]);
                        }

                        dp[d][i][j] = Math.max(dp[d][i][j], dp[d][i + 1][j]);
                        dp[d][i][j] = Math.max(dp[d][i][j], dp[d][i][j + 1]);

                        if ((cEndA[i] != -1) && (cEndB[j] != -1)) {
                            dp[d][i][j] = Math.max(dp[d][i][j], C.length() + dp[1][cEndA[i]][cEndB[j]]);
                        }
                    }
                }
            }
        }

        return Math.max(0, dp[0][0][0]);
    }

    private void makeCEnd(String A, String C, int[] cEnd) {
        int n = A.length();
        int m = C.length();

        for (int i = 0; i < n; i++) {
            cEnd[i] = -1;

            int k = 0;
            for (int j = i; j < n; j++) {
                if (A.charAt(j) == C.charAt(k)) {
                    k++;
                    if (k == m) {
                        cEnd[i] = j + 1;
                        break;
                    }
                }
            }
        }
    }

    String join(String[] input) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < input.length; i++) {
            builder.append(input[i]);
        }
        return builder.toString();
    }
}
