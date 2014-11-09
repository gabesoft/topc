package topc.geometry;

import java.util.*;
import java.io.*;

// SRM 325 Division I Level Two - 500
// geometry, math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=6765&rd=10005
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm325
public class ModularInequality {
    long INF = 3000000000L;

    public int countSolutions(int[] A, int P) {
        int min = -1;
        for (int i = 0; i < A.length; i++) {
            if (min == - 1 || fun(A, A[i]) < fun(A, A[min])) {
                min = i;
            }
        }

        if (fun(A, A[min]) > P) { return 0; }

        long labove = -INF;
        long lbelow = A[min];
        long rabove = INF;
        long rbelow = A[min];

        for (int i = 0; i < A.length; i++) {
            if (fun(A, A[i]) <= P) {
                lbelow = Math.min(lbelow, A[i]);
                rbelow = Math.max(rbelow, A[i]);
            }
        }

        long llim = binarySearch(A, P, labove, lbelow, -1);
        long rlim = binarySearch(A, P, rabove, rbelow,  1);

        return (int)(rlim - llim + 1);
    }

    private long binarySearch(int[] A, long P, long hi, long lo, int dir) {
        while (dir * lo < dir * hi) {
            long md = lo + (hi - lo + dir) / 2L;
            if (fun(A, md) > P) {
                hi = md - dir;
            } else {
                lo = md;
            }
        }
        return lo;
    }

    private long fun(int[] A, long x) {
        long r = 0;
        for (int i = 0; i < A.length; i++) {
            r += Math.abs(A[i] - x);
        }
        return r;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
