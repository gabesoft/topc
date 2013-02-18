package topc.math;

import java.util.*;
import java.io.*;

// SRM 467 Division I Level Two - 500
// advanced math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10239&rd=14151
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+467
public class SuperSum {
    long MOD = 1000000007L;

    public int calculate(int k, int n) {
        return (int)binomial(n + k, k + 1, MOD);
    }

    long binomial(long n, long k, long p) {

        long numerator = 1;
        for (int i = 0; i < k; i++) {
            numerator = (numerator * (n - i)) % p;
        }

        long denominator = 1;
        for (int i = 1; i < k + 1; i++) {
            denominator = (denominator * i) % p;
        }

        return (numerator * modInverse(denominator, p)) % p;
    }

    long modInverse(long a, long p) {
        return modPow(a, p - 2, p);
    }

    long modPow(long a, long x, long p) {
        long res = 1;
        while (x > 0) {
            if (x % 2 != 0) {
                res = (res * a) % p;
            }

            a = (a * a) % p;
            x = x / 2;
        }
        return res;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
