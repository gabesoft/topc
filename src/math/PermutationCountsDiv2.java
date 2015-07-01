package topc.math;

import java.util.*;
import java.io.*;

// SRM 656 Division II Level Three - 1000
// advanced math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13739&rd=16416
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+656
public class PermutationCountsDiv2 {
    int MOD = 1000000007;

    public int countPermutations(int N, int[] pos) {
        int C[][] = new int[N + 1][N + 1];

        for (int i = 0; i <= N; i++) {
            C[i][0] = 1;
            for (int j = 1; j <= i; j++) {
                C[i][j] = (C[i - 1][j] + C[i - 1][j - 1]) % MOD;
            }
        }

        boolean[] lessThanNext = new boolean[N];
        for (int x : pos) {
            lessThanNext[x - 1] = true;
        }

        long[][] dp = new long[N + 1][N + 1];
        for (int i = 0; i <= N; i++) {
            dp[i][i] = 1;
            if (i + 1 <= N) {
                dp[i][i + 1] = 1;
            }
        }

        for (int t = 2; t <= N; t++) {
            for (int a = 0; a + t <= N; a++) {
                int b = a + t;
                dp[a][b] = 0;
                for (int i = a; i < b; i++) {
                    if ((lessThanNext[i] || i == b - 1) && (i == a || !lessThanNext[i - 1])) {
                        long p = dp[a][i];
                        long q = dp[i + 1][b];
                        long r = C[t - 1][i - a];
                        dp[a][b] += (((p * q) % MOD) * r) % MOD;
                    }
                }
                dp[a][b] %= MOD;
            }
        }

        return (int)dp[0][N];
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
