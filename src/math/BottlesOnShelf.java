package topc.math;

import java.util.*;
import java.io.*;

// Member SRM 491 Division II Level Three - 1000
// math, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11008&rd=14244
// editorial: http://apps.topcoder.com/wiki/display/tc/Algorithm+Problem+Set+Analysis
public class BottlesOnShelf {
    public int getNumBroken(int N, int[] left, int[] right, int[] damage) {
        int m    = left.length;
        long res = 0;

        for (int i = 1; i < (1 << m); i++) {
            long l = 0;
            long r = 1000000000;
            long d = 1;

            for (int j = 0; j < m; j++) {
                if ((i & (1 << j)) != 0) {
                    l = Math.max(l, left[j]);
                    r = Math.min(r, right[j]);
                    d = lcm(d, damage[j]);
                }
            }

            res += (Integer.bitCount(i) % 2 == 1 ? 1 : -1) * Math.max(r / d - (l + d - 1) / d + 1, 0);
        }

        return (int)res;
    }

    long gcd(long n, long m) {
        return m > 0 ? gcd(m, n % m) : n;
    }

    long lcm(long n, long m) {
        return n / gcd(n, m) * m;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
