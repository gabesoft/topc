package topc.math;

import java.util.*;
import java.math.*;

// SRM 652 Division II Level Two - 500
// simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13679&rd=16316
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+652
public class ThePermutationGameDiv2 {
    public long findMin(int N) {
        long r = 1;
        for (int i = 1; i <= N; i++) {
            r = lcm(r, i);
        }
        return r;
    }

    private long gcd(long a, long b) {
        BigInteger x = BigInteger.valueOf(a);
        BigInteger y = BigInteger.valueOf(b);
        return x.gcd(y).longValue();
    }

    private long lcm(long a, long b) {
        return a / gcd(a, b) * b;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
