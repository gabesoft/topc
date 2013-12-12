package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 304 Division I Level One - 300
// dynamic programming, geometry
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=6190&rd=9825
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm304
public class PolyMove {
    public double addedArea(int[] x, int[] y) {
        int n = x.length;

        double[] best = new double[n];
        double res    = 0;

        best[0] = 0;
        best[1] = 0;
        for (int i = 2; i < n; i++) {
            best[i] = Math.max(best[i - 1], best[i - 2] + dist(x[i - 2], y[i - 2], x[i], y[i]) * 0.5);
        }
        res = best[n - 1];

        Arrays.fill(best, 0);
        best[0] = 0;
        best[1] = dist(x[n - 1], y[n - 1], x[1], y[1]) * 0.5;
        best[2] = best[1];
        for (int i = 3; i < n; i++) {
            best[i] = Math.max(best[i - 1], best[i - 2] + dist(x[i - 2], y[i - 2], x[i], y[i]) * 0.5);
        }
        res = Math.max(best[n - 1], res);

        Arrays.fill(best, 0);
        best[0] = dist(x[n - 2], y[n - 2], x[0], y[0]) * 0.5;
        best[1] = best[0];
        for (int i = 2; i < n - 1; i++) {
            best[i] = Math.max(best[i - 1], best[i - 2] + dist(x[i - 2], y[i - 2], x[i], y[i]) * 0.5);
        }
        res = Math.max(best[n - 2], res);

        return res;
    }

    double dist(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
