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
        int x = (N - M % N) % N;
        int y = (int)gcd(x, N);
        return (N - y) / 2.0;
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
