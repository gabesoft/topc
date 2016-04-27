package topc.easy;

import java.io.*;
import java.util.*;
import java.math.BigInteger;

// SRM 684 Division II Level One - 250
// brute force, simulation
// statement: https://community.topcoder.com/stat?c=problem_statement&pm=14184&rd=16688
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+684
public class ZombitPandemic {
    public static final BigInteger[] unit = new BigInteger[] { BigInteger.ONE, BigInteger.ONE };
    public static final BigInteger[] zero = new BigInteger[] { BigInteger.ZERO, BigInteger.ONE };

    public static String answer(int n) {
        long[][] BC = binomialCoefficient(n + 1);
        BigInteger[][][][] cache = new BigInteger[n + 1][n + 1][(n >> 1) + 1][];
        BigInteger[] e = zero;

        for (int i = 2 + (n % 2); i <= n; i++) {
            BigInteger[] p = prob(BC, cache, i, n, 1);
            e = sum(e, mul(num(i, 1), p), false);
        }

        return e[0].toString(10) + "/" + e[1].toString(10);
    }

    private static BigInteger[] prob(long[][] BC, BigInteger[][][][] cache, int k, int n, int div) {
        if (k == 2 && n == 2) {
            return fract(1, div);
        } else if (k == 3 && n == 3) {
            return fract(1, div);
        } else if (k > n || k == n - 1) {
            return zero;
        } else if (cache[k][n][div] != null) {
            return cache[k][n][div];
        } else if (k == n) {
            BigInteger[] next = zero;

            for (int i = 2 + (n % 2); i <= n - 2; i++) {
                next = sum(next, prob(BC, cache, i, n, 1), false);
            }

            cache[k][n][div] = mul(fract(1, div), sum(unit, next, true));
            return cache[k][n][div];
        } else {
            BigInteger[] base = fract(1, div);
            BigInteger[] s = zero;

            base = mul(base, fract(BC[n][k], 1));
            base = mul(base, pow(num(k - 1, n - 1), k));
            base = mul(base, prob(BC, cache, k, k, 1));
            base = mul(base, pow(num(n - k - 1, n - 1), n - k));

            for (int i = 2 + ((n - k) % 2); i <= Math.min(k, n - k); i++) {
                s = sum(s, prob(BC, cache, i, n - k, (i == k) ? div + 1 : 1), false);
            }

            cache[k][n][div] = mul(base, s);
            return cache[k][n][div];
        }
    }

    public static BigInteger[] num(long x, long y) {
        return norm(BigInteger.valueOf(x), BigInteger.valueOf(y));
    }

    public static BigInteger[] pow(BigInteger[] x, int y) {
        BigInteger d = x[0].pow(y);
        BigInteger n = x[1].pow(y);
        return norm(d, n);
    }

    public static BigInteger[] fract(long d, long n) {
        return new BigInteger[] { BigInteger.valueOf(d), BigInteger.valueOf(n) };
    }

    public static BigInteger[] mul(BigInteger[] x, BigInteger[] y) {
        BigInteger d = x[0].multiply(y[0]);
        BigInteger n = x[1].multiply(y[1]);
        return norm(d, n);
    }

    public static BigInteger[] sum(BigInteger[] a, BigInteger[] b, boolean sub) {
        BigInteger d1 = a[0].multiply(b[1]);
        BigInteger d2 = a[1].multiply(b[0]);
        BigInteger d = sub ? d1.subtract(d2) : d1.add(d2);
        BigInteger n = a[1].multiply(b[1]);
        return norm(d, n);
    }

    public static BigInteger[] norm(BigInteger d, BigInteger n) {
        BigInteger gcd = d.gcd(n);
        return new BigInteger[] {
            d.divide(gcd),
            n.divide(gcd)
        };
    }

    public static long[][] binomialCoefficient(long n) {
        long[][] bc = new long[(int)n + 1][(int)n + 1];

        for (int i = 0; i < n + 1; i++) {
            bc[i][0] = 1;
            for (int j = 1; j < i + 1; j++) {
                bc[i][j] = bc[i - 1][j - 1] + bc[i - 1][j];
            }
        }

        return bc;
    }

    @SuppressWarnings("unused")
    private static void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
