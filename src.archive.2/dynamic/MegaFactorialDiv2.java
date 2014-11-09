package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 569 Division II Level Three - 1000
// dynamic programming, simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12400&rd=15489
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+569
public class MegaFactorialDiv2 {
    public static final int MOD = 1000000009;
    long[][] C;

    public int countDivisors(int N, int K) {
        C = new long[N + K + 1][N + K + 1];
        for (int i = 0; i <= K + N; i++) {
            C[i][0] = 1;
            for (int j = 1; j <= i; j++) {
                C[i][j] = (C[i - 1][j - 1] + C[i - 1][j]) % MOD;
            }
        }

        boolean[] composite = new boolean[N + 1];
        long res = 1;

        for (int i = 2; i <= N; i++) {
            if (!composite[i]) {
                for (int j = i + i; j <= N; j += i) {
                    composite[j] = true;
                }
                res *= (primeAppears(N, K, i) + 1);
                res %= MOD;
            }
        }

        return (int)(res % MOD);
    }

    private long primeAppears(int N, int K, int p) {
        long res = 0;
        for (int x = 1; x <= N; x++) {
            int c = 0;
            int y = x;
            while (y % p == 0) {
                y /= p;
                c++;
            }
            if (c > 0) {
                res += c * C[K + N - x - 1][N - x];
                res %= MOD;
            }
        }

        return res % MOD;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
