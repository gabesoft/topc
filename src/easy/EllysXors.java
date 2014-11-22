package topc.easy;

import java.util.*;
import java.io.*;

// SRM 543 Division I Level One - 250
// brute force, simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11910&rd=14735
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+543
public class EllysXors {
    public long getXor(long L, long R) {
        if (L == R) { return L; }

        long[] lb = bits(L - 1);
        long[] rb = bits(R);

        long res = 0;
        for (int i = 0; i < rb.length; i++) {
            long bit = rb[i];

            if (i < lb.length) {
                bit -= lb[i];
            }

            bit %= 2;
            res |= (bit << i);
        }

        return res;
    }

    private long[] bits(long n) {
        int len = Long.toBinaryString(n).length();
        long bits[] = new long[len];

        bits[0] = (n + 1) / 2L;

        long pow = 1;
        for (int i = 1; i < len; i++) {
            pow++;

            long x = 1L << pow;
            long y = 1L << (pow - 1L);
            long prev = x * (n / x);

            while (prev < n) {
                prev += x;
            }

            if (prev > n) {
                prev -= x;
            }

            bits[i] = prev / x * y;

            for (long j = prev; j <= n; j += y) {
                if (((j >> i) & 1L) == 1) {
                    bits[i] += (n - j + 1);
                    break;
                }
            }
        }

        return bits;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
