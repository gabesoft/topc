package topc.math;

import java.math.*;
import java.util.*;
import java.io.*;

// SRM 490 Division I Level One - 250
// simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11227&rd=14243
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+490
public class Starport {
    public double getExpectedTime(int N, int M) {
        if (N == M) { return 0; }

        long g = gcd(M, N);

        N /= g;
        M /= g;

        long m = M % N;
        long max = m;

        if (m == 1) {
            max = N - 1;
        } else if (m < N - 1) {
            for (int i = 2; i < N; i++) {
                long y = i;
                long x = (y * m) % N;

                max = Math.max(max, x);

                if (x == 0) { break; }
                if (x == N - 1) { break; }
            }
        }

        return (max * g) / 2.0;
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
