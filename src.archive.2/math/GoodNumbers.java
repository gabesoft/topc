package topc.math;

import java.util.*;
import java.io.*;
import java.math.*;

// TCO13 Semifinal 2 Division I Level One - 250
// math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12816&rd=15809
// editorial: http://apps.topcoder.com/wiki/display/tc/Algorithm+Problem+Set+Analysis
public class GoodNumbers {
    public int count(int[] a, int[] b, int N) {
        int t  = a.length;
        long res = 0;

        for (int s = 1; s < (1 << t); s++) {
            int cs = 0;
            long p = 1;
            ArrayList<Integer> q = new ArrayList<Integer>();

            for (int i = 0; i < t; i++) {
                if ((s & (1 << i)) > 0) {
                    cs++;
                    q.add(b[i]);
                    long g = gcd(p, a[i]);
                    if (p > N / (a[i] / g)) {
                        p = N + 1;
                    } else {
                        p *= (a[i] / g);
                    }
                }
            }

            for (int s2 = 0; s2 < (1 << q.size()); s2++) {
                int cs2 = 0;
                long r = p;
                for (int i = 0; i < q.size(); i++) {
                    if ((s2 & (1 << i)) > 0) {
                        cs2++;
                        long g = gcd(r, q.get(i));
                        if (r > N / (q.get(i) / g)) {
                            r = N + 1;
                        } else {
                            r *= (q.get(i) / g);
                        }
                    }
                }

                if (cs % 2 != cs2 % 2) {    // exactly one is odd
                    res += multiples(N, r);
                } else {
                    res -= multiples(N, r);
                }
            }
        }

        return (int)res;
    }

    private long gcd(long a, long b) {
        BigInteger x = BigInteger.valueOf(a);
        BigInteger y = BigInteger.valueOf(b);
        return x.gcd(y).longValue();
    }

    private long multiples(long n, long r) {
        return n / r;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
