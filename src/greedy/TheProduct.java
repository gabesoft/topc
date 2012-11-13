package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 453.5 Division II Level Three - 1000
// greedy, simple math, sorting
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10421&rd=14174
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+453.5
public class TheProduct {
    public long maxProduct(int[] numbers, int k, int maxDist) {
        long INF      = 100000000000000000L;
        long dp[][][] = new long[2][50][11];

        for (int i = 0; i < 50; i++) {
            for (int j = 1; j <= 10; j++) {
                dp[0][i][j] = INF;
                dp[1][i][j] = 0L - INF;
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j <= k; j++) {
                if (j == 1) {
                    dp[0][i][j] = numbers[i];
                    dp[1][i][j] = numbers[i];
                } else {
                    for (int m = 1; m <= maxDist && m <= i; m++) {
                        dp[0][i][j] = Math.min(dp[0][i][j], dp[(numbers[i] >= 0) ? 0 : 1][i - m][j - 1] * numbers[i]);
                        dp[1][i][j] = Math.max(dp[1][i][j], dp[(numbers[i] >= 0) ? 1 : 0][i - m][j - 1] * numbers[i]);
                    }
                }
            }
        }

        long res = 0L - INF;
        for (int i = 0; i < numbers.length; i++) {
            res = Math.max(res, dp[1][i][k]);
        }

        return res;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
