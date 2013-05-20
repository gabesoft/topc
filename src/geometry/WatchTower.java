package topc.geometry;

import java.util.*;
import java.io.*;

// SRM 240 Division I Level Two - 600
// geometry
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=4567&rd=6539
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm240
public class WatchTower {
    public double minHeight(int[] px, int[] py) {
        int n       = px.length;
        double best = Double.MAX_VALUE / 4;

        for (int i = 0; i < n; i++) {
            double y = height(px, py, px[i], py[i]);
            best     = Math.min(y, best);
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 2; j < n - 1; j++) {
                int u1 = i;
                int u2 = i + 1;
                int v1 = j;
                int v2 = j + 1;

                double p[] = intersection(
                        px[u1], py[u1], px[u2], py[u2],
                        px[v1], py[v1], px[v2], py[v2]);

                if (p == null) { continue; }

                double ix = p[0];
                double iy = p[1];

                if (px[u2] <= ix && ix <= px[v1]) {
                    int w1    = u2;
                    int w2    = v1;
                    double y2 = 0;

                    for (int k = w1; k < w2; k++) {
                        if (px[k] <= ix && ix <= px[k + 1]) {
                            y2 = height(px[k], py[k], px[k + 1], py[k + 1], ix);
                            break;
                        }
                    }

                    double y1 = height(px, py, ix, y2);
                    best      = Math.min(y1, best);
                }
            }
        }

        return best;
    }

    private double height(int[] px, int[] py, double cx, double cy) {
        int n = px.length;
        double max = 0;

        for (int j = 0; j < n; j++) {
            for (int k = 0; k < j; k++) {
                if (px[k] < cx && cx < px[j]) { continue; }
                double y = height(px[j], py[j], px[k], py[k], cx);
                max      = Math.max(max, y - cy);
            }
        }

        return max;
    }

    private double[] intersection(long x1, long y1, long x2, long y2, long x3, long y3, long x4, long y4) {
        long A1 = y2 - y1;
        long A2 = y4 - y3;
        long B1 = x1 - x2;
        long B2 = x3 - x4;
        long C1 = A1 * x1 + B1 * y1;
        long C2 = A2 * x3 + B2 * y3;

        long det = A1 * B2 - A2 * B1;

        if (det == 0) { return null; }

        double x = (B2 * C1 - B1 * C2) / (double) det;
        double y = (A1 * C2 - A2 * C1) / (double) det;

        return new double[] { x, y };
    }

    private double height(double x1, double y1, double x2, double y2, double x) {
        return y1 + (y2 - y1) * (x - x1) / (x2 - x1);
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
