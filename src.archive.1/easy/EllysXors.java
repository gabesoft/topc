package topc.easy;

import java.util.*;
import java.io.*;

// SRM 543 Division I Level One - 250
// brute force, simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11910&rd=14735
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+543
public class EllysXors {
    public long getXor(long L, long R) {
        long n = 0;
        long d = 0;

        for (int i = 0; i < 40; i++) {
            long k    = ones(d, R + 1) - ones(d, L);
            long bit  = k % 2;
            n        |= (bit << d);
            d++;
        }

        return n;
    }

    private long ones(long d, long n) {
        long k  = 1L << d;
        long r = n / k;
        long o = (r / 2L) * k;

        if (r % 2 == 1) {
            o += n - r * k;
        }

        return o;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
