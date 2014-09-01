package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 599 Division II Level Three - 950
// dynamic programming, graph theory, string manipulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12871&rd=15711
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+599
public class SimilarNames2 {
    public static final long MOD = 1000000007;

    public int count(String[] names, int L) {
        int n = names.length;
        long dp[][] = new long[L + 1][n];

        for (int i = 0; i < n; i++) {
            dp[L][i] = 1;
        }

        for (int i = L - 1; i >= 1; i--) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = 0;

                for (int k = 0; k < n; k++) {
                    if (j != k && names[k].startsWith(names[j])) {
                        dp[i][j] += dp[i + 1][k];
                    }
                }

                dp[i][j] %= MOD;
            }
        }

        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += dp[1][i];
        }
        sum %= MOD;

        long f = 1;
        for (int i = 1; i <= n - L; i++) {
            f = (f * i) % MOD;
        }

        return (int)((sum * f) % MOD);
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
