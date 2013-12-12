package topc.math;

import java.util.*;
import java.io.*;
import java.math.*;

// SRM 535 Division I Level One - 250
// simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11364&rd=15037
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+535
public class FoxAndGCDLCM {
    public long get(long G, long L) {
        if (G > L || L % G != 0) { return -1; }

        long M    = L / G;
        long best = M + M;

        for (long i = 1; i * i < M; i++) {
            if (M % i == 0) {
                long a = M / i;
                long b = i;
                if (gcd(a, b) == 1) {
                    best = Math.min(best, a + b);
                }
            }
        }

        return best * G;
    }

    long gcd(long a, long b) {
        BigInteger x = BigInteger.valueOf(a);
        BigInteger y = BigInteger.valueOf(b);
        return x.gcd(y).longValue();
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
