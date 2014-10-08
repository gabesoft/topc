package topc.math;

import java.util.*;
import java.io.*;

// SRM 565 Division II Level Three - 1000
// math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12274&rd=15187
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+565
public class DivisibleSequence {
    public static final long MOD = 1000000009;

    public int count(int N, int H) {
        long res = 1;
        for (int p = 2; p <= N / p; p++) {
            int c = 0;
            while (N % p == 0) {
                N /= p;
                c++;
            }
            res = (res * C(H - 1 + c, c)) % MOD;
        }

        if (N > 1) {
            res = (res * H) % MOD;
        }

        return (int)res;
    }

    // modular binomial coefficient
    private long C(long n, long k) {
        if (k > n) { return 0; }

        long p = 1;
        long q = 1;
        for (int i = 1; i <= k; i++) {
            q = (q * i) % MOD;
            p = (p * (n - i + 1)) % MOD;
        }

        return modDivision(p, q);
    }

    private long modDivision(long p, long q) {
        return (p * modInverse(q)) % MOD;
    }

    private long modInverse(long x) {
        return modPow(x, MOD - 2);
    }

    private long modPow(long x, long y) {
        long r = 1;
        long a = x;

        while (y > 0) {
            if ((y & 1) == 1) {
                r = (r * a) % MOD;
            }
            a = (a * a) % MOD;
            y /= 2;
        }

        return r;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
