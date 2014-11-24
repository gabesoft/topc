package topc.math;

import java.util.*;
import java.io.*;
import java.math.*;

// SRM 540 Division II Level Three - 1000
// math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11135&rd=14732
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+540
public class FractionInDifferentBases {
    public long getNumberOfGoodBases(long P, long Q, long A, long B) {
        long g = gcd(P, Q);
        P /= g;
        Q /= g;

        long prod = primeFactorsProduct(Q);
        long cnt  = countMultiples(A, B, prod);

        return (B - A + 1) - cnt;
    }

    private long countMultiples(long a, long b, long prod) {
        return b / prod - (a - 1) / prod;
    }

    private long primeFactorsProduct(long x) {
        long prod = 1;

        for (int p = 2; p <= x / p; p++) {
            if (x % p == 0) {
                prod *= p;
                while (x % p == 0) {
                    x /= p;
                }
            }
        }
        prod *= x;

        return prod;
    }

    private long gcd(long a, long b) {
        BigInteger x = BigInteger.valueOf(a);
        BigInteger y = BigInteger.valueOf(b);
        return x.gcd(y).longValue();
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
