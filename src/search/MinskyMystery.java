package topc.search;

import java.util.*;
import java.io.*;

// SRM 529 Division I Level Two - 600
// math, simple search, iteration, simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11739&rd=14722
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+529
public class MinskyMystery {
    long MOD = 1000000009L;

    public int computeAnswer(long N) {
        if (N <= 1) { return -1; }

        long sum = 2;
        for (long i = 2; i <= N; i++) {
            long div = N / i;
            long mod = N - (div * i);

            long a = ((3 * i + 1) * div) % MOD;
            long b = (3 * mod + N + 2) % MOD;

            sum += a;
            sum %= MOD;

            if (mod == 0) { break; }

            sum += b;
            sum %= MOD;

            long j = Math.min(N / div, N - 1);
            long k = (j - i) % MOD;

            if (k > 0) {
                sum += (a * k) % MOD;
                sum += (b * k) % MOD;
                sum %= MOD;

                i = j;
            }
        }

        return (int)sum;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
