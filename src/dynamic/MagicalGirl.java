package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 533 Division II Level Three - 1000
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11784&rd=14726
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+533
public class MagicalGirl {
    public double maxExpectation(int M, int[] day, int[] win, int[] gain) {
        int n = day.length;

        int[] sday    = new int[n + 1];
        int[] sgain   = new int[n + 1];
        double[] swin = new double[n + 1];
        double[][] dp = new double[n + 1][M + 1];

        // sort
        boolean[] added = new boolean[n + 1];
        for (int i = 1; i < n + 1; i++) {
            int first = Integer.MAX_VALUE / 4;
            int witch = 0;

            for (int j = 0; j < n; j++) {
                if (!added[j] && day[j] < first) {
                    first = day[j];
                    witch = j;
                }
            }

            added[witch] = true;
            sday[i]      = day[witch];
            swin[i]      = win[witch] / 100.0;
            sgain[i]     = gain[witch];
        }

        // solve
        for (int i = n; i > -1; i--) {
            for (int j = 1; j < M + 1; j++) {
                if (i == n || (j - (sday[i + 1] - sday[i]) <= 0)) {
                    dp[i][j] = (sday[i] + j) * 1.0;
                } else {
                    int m        = Math.min(M, j - (sday[i + 1] - sday[i]) + sgain[i + 1]);
                    double skip  = dp[i + 1][j - (sday[i + 1] - sday[i])];
                    double fight = (1.0 - swin[i + 1]) * sday[i + 1] + swin[i + 1] * dp[i + 1][m];
                    dp[i][j]     = Math.max(skip, fight);
                }
            }
        }

        return dp[0][M];
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
