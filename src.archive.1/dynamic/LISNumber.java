package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 585 Division I Level Two - 500
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12419&rd=15697
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+585
public class LISNumber {
    final int MOD = 1000000007;
    final int MAX = 1298;
    long C[][];

    public int count(int[] cardsnum, int K) {
        int n = cardsnum.length;
        int S = 0;

        for (int i = 0; i < n; i++) {
            S += cardsnum[i];
        }

        C = binomialCoeff(S);

        long dp[][] = new long[K][n + 1];
        dp[0][0] = 1;

        for (int t = 1; t <= n; t++) {
            S -= cardsnum[t - 1];

            for (int k = 0;  k <= K - 1; k++) {
                int s = cardsnum[t - 1];
                int slotsUp = K - k;
                int slotsDown = S + 1 - slotsUp;

                dp[k][t] = 0;

                for (int up = 0; (up <= s) && (up <= slotsUp); up++) {
                    for (int down = 0; (down + up <= s) && (down <= slotsDown); down++) {
                        int eq = s - up - down;

                        long a   = C[slotsUp][up];
                        long b   = C[slotsDown][down];
                        long res = (a * b) % MOD;

                        if (k - down - eq >= 0) {
                            res = (res * dp[k - down - eq][t - 1]) % MOD;
                        } else {
                            res = 0;
                        }

                        if (eq > 0) {
                            res = (res * C[eq + up + down - 1][eq]) % MOD;
                        }

                        dp[k][t] += res;
                    }
                }
                dp[k][t] %= MOD;
            }
        }

        return (int)dp[K - 1][n];
    }

    private long[][] binomialCoeff(int n) {
        long[][] bc = new long[MAX][MAX];

        for (int i = 0; i <= n + 1; i++) {
            bc[i][0] = 1;
            for (int j = 1; j <= i; j++) {
                bc[i][j] = (bc[i - 1][j - 1] + bc[i - 1][j]) % MOD;
            }
        }

        return bc;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
