package topc.encryption;

import java.util.*;
import java.io.*;

// SRM 182 Division II Level Three - 1000
// encryption/compression
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=2310&rd=4730
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm182
public class RSABreaker {
    public int decrypt(long e, long n, long b) {

        long m = 1;
        for (int i = 2; i < n; i++) {
            if (gcd(i, n) == 1) {
                m++;
            }
        }

        long d = m / e;
        while ((e * d) % m != 1) {
            d++;
        }

        return (int)pow(b, d, n);
    }

    private long pow(long a, long x, long mod) {
        if (x == 0) { return 1; }
        return (a * pow(a, x - 1, mod)) % mod;
    }

    private long gcd(long a, long b) {
        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {
            long c = b;
            b = a % b;
            a = c;
        }

        return a;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
