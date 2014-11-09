package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 536 Division II Level Three - 1000
// dynamic programming, sorting
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11802&rd=14728
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+536
public class MergersDivTwo {
    double best;

    public double findMaximum(int[] revenues, int k) {
        Arrays.sort(revenues);

        int n     = revenues.length;
        int[] sum = new int[n + 1];

        sum[0] = 0;
        for (int i = 1; i <= n; i++) {
            sum[i] = sum[i - 1] + revenues[n - i];
        }

        double[] dp = new double[n - k + 1];
        for (int i = dp.length - 1; i >= 0; i--) {
            dp[i] = (sum[n] - sum[i]) / (double) (n - i);
            for (int j = k; i + j - 1 < dp.length; j++) {
                dp[i] = Math.max(dp[i], (dp[i + j - 1] + sum[i + j - 1] - sum[i]) / (double) j);
            }
        }

        return dp[0];
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
