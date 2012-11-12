package topc.easy;

import java.util.*;
import java.io.*;

// Member SRM 458 Division II Level Three - 950
// brute force, math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10698&rd=14180
// editorial: http://apps.topcoder.com/wiki/display/tc/Member+SRM+45
public class ProductTriplet {
    public long countTriplets(int minx, int maxx, int miny, int maxy, int minz, int maxz) {
        long x1 = minx;
        long x2 = maxx;
        long y1 = miny;
        long y2 = maxy;
        long z1 = minz;
        long z2 = maxz;

        long count = 0;

        for (long x0 = x1; x0 <= x2 && x0 * x0 < z2; x0++) {
            count += f(x0, y1, y2, z1, z2);
        }
        for (long y0 = y1; y0 <= y2 && y0 * y0 < z2; y0++) {
            count += f(y0, x1, x2, z1, z2);
        }
        for (long sq = Math.max(x1, y1); sq <= Math.min(x2, y2) && sq * sq <= z2; sq++) {
            if (z1 <= sq * sq) { count++; }
        }

        return count;
    }

    long f(long x0, long y1, long y2, long z1, long z2) {
        z1 = Math.max(z1, x0 * x0 + 1);
        if (z2 < z1) { return 0; }

        y1 = Math.max(y1, (z1 + x0 - 1) / x0);
        y2 = Math.min(y2, z2 / x0);

        return Math.max(0L, y2 - y1 + 1);
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
