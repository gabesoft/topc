package topc.dynamic;

import java.util.*;
import java.io.*;

// TCO10 Wildcard Division I Level One - 250
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10815&rd=14286
// editorial: http://apps.topcoder.com/wiki/display/tc/TCO'10+Wildcard+Round
public class SequencePermutation {
    long MOD = 1000000009L;

    public int determineConfigurations(int N, int M) {
        long[][] dp = new long[N + 1][M + 1];

        for (int m = 0; m <= M; m += 2) {
            dp[0][m] = 1;
        }

        for (int n = 1; n <= N; n++) {
            long[] accum = new long[M + 2];

            for (int i = 0; i <= M; i++) {
                accum[i + 1] = (accum[i] + dp[n - 1][i]) % MOD;
            }

            for (int m = 0; m <= M; m++) {
                int lower = Math.max(m - n + 1, 0);
                int upper = m;
                dp[n][m] = (accum[upper + 1] - accum[lower] + MOD) % MOD;
            }
        }

        return (int)dp[N][M];
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
