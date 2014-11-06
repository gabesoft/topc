package topc.search;

import java.util.*;
import java.io.*;

// SRM 552 Division I Level One - 250
// simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12146&rd=15174
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+552
public class FoxPaintingBalls {
    public long theMax(long R, long G, long B, int N) {
        int mod = N % 3;
        long x = Math.min(R, Math.min(G, B));

        if (mod == 2) {
            long y = (N - 2) / 3;
            long t = 1 + y + 3 * y * (y + 1) / 2;

            return x / t;
        }
        if (mod == 0) {
            long y = N / 3 - 1;
            long t = 2 + 2 * y + 3 * y * (y + 1) / 2;

            return x / t;
        }

        if (mod == 1) {
            long y = (N - 1) / 3;
            long t = 1 + 3 * y * (y + 1) / 2;
            long t3 = t + (t - 1) + (t - 1);

            long z = (R / t3) * 3;
            long r = x - (R / t3) * t3;

            debug(t, t3, z, r, 10010 / 4);
            return z + r / t;
        }

        return -1;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
