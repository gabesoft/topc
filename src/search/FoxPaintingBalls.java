package topc.search;

import java.util.*;
import java.io.*;

// SRM 552 Division I Level One - 250
// simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12146&rd=15174
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+552
public class FoxPaintingBalls {
    public long theMax(long R, long G, long B, int N) {
        long[] c = new long[] { R, G, B };

        Arrays.sort(c);

        if (N == 1) { return R + G + B; }
        if (N == 2) { return c[0]; }

        long c1 = 0;
        long c2 = 0;
        long c3 = 0;

        long all = N * (N + 1L) / 2L;

        c1 = all / 3;
        c2 = all / 3;
        c3 = all - (c1 + c2);

        if (c1 == c3) {
            return c[0] / c1;
        } else {
            long lo = c[0] / c3;
            long hi = c[2] / c1;

            while (lo <= hi) {
                long mid = lo + (hi - lo) / 2L;

                if (valid(c, c1, c2, c3, mid)) {
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }

            return lo - 1;
        }
    }

    private boolean valid(long[] c, long c1, long c2, long c3, long k) {
        long r0 = c[0] - k * c1;
        long r1 = c[1] - k * c1;
        long r2 = c[2] - k * c1;
        return r2 >= 0 && r1 >= 0 && r0 >= 0 && r2 + r1 + r0 >= k;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
