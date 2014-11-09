package topc.math;

import java.util.*;
import java.io.*;

// Member SRM 465 Division I Level One - 250
// simple math, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10840&rd=14182
// editorial: http://apps.topcoder.com/wiki/display/tc/Algorithm+Problem+Set+Analysis
public class TurretPlacement {
    public long count(int[] x, int[] y) {
        int n = x.length;
        long count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                count += sizes(x[i], y[i], x[j], y[j]);
            }
        }

        return count;
    }

    private long sizes(int x1, int y1, int x2, int y2) {
        double dx = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

        long d = (long)(2 * dx);
        long c = 0;

        for (long i = 1; 2 * i <= d; i++) {
            long b = d - 2 * i;

            c += 1;
            c += b * 2;
        }

        return c;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
