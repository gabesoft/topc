package topc.dynamic;

import java.math.*;
import java.util.*;
import java.io.*;

// TCO11 Wildcard Round Division I Level One - 250
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11515&rd=14651
// editorial: http://apps.topcoder.com/wiki/display/tc/Algorithm+Problem+Set+Analysis
public class EventOrder {
    static final long MOD = 1000000009;

    public int getCount(int longEvents, int instantEvents) {
        int maxTimes = longEvents * 2 + instantEvents;
        long[] ways  = new long[maxTimes + 1];
        long[] inv   = new long[maxTimes + 1];

        for (int i = 1; i < inv.length; i++) {
            inv[i] = BigInteger.valueOf(i).modInverse(BigInteger.valueOf(MOD)).longValue();
        }
        for (int i = 0; i < maxTimes + 1; i++) {
            int pairs = i * (i - 1) / 2;
            long comb = 1;

            ways[i] = pow(pairs, longEvents) * pow(i, instantEvents) % MOD;
            for (int j = 0; j < i; j++) {
                ways[i] = (ways[i] - ways[j] * comb % MOD + MOD) % MOD;
                comb    = comb * (i - j) % MOD * inv[j + 1] % MOD;
            }
        }

        long res = 0;
        for (long x : ways) {
            res = (res + x) % MOD;
        }

        return (int)res;
    }

    private long pow(long a, long k) {
        if (k == 0) { return 1; }
        if (k % 2 == 0) { 
            return pow(a * a % MOD, k / 2);
        } else {
            return a * pow(a, k - 1) % MOD;
        }
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
