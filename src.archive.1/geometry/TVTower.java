package topc.geometry;

import java.util.*;
import java.io.*;

// SRM 183 Division I Level Two - 675
// geometry
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=2260&rd=4735
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm183
public class TVTower {
    double EPS = 10e-15;

    public double minRadius(int[] x, int[] y) {
        int n = x.length;

        if (n == 1) { return 0; }

        double best = 1e9;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                double cx = (x[i] + x[j]) / 2.0;
                double cy = (y[i] + y[j]) / 2.0;
                best      = Math.min(best, maxdist(x, y, cx, cy));

                for (int k = j + 1; k < n; k++) {
                    double[] c = center(x[i], y[i], x[j], y[j], x[k], y[k]);
                    if (c != null) {
                        best = Math.min(best, maxdist(x, y, c[0], c[1]));
                    }
                }
            }
        }

        return best;
    }

    // computes the center of the circle defined by the points A, B, C
    double[] center(double ax, double ay, double bx, double by, double cx, double cy) {
        double l1[] = toLineEq(ax, ay, bx, by);
        double l2[] = toLineEq(bx, by, cx, cy);

        double abx = (ax + bx) / 2.0;
        double aby = (ay + by) / 2.0;
        double bcx = (bx + cx) / 2.0;
        double bcy = (by + cy) / 2.0;

        double dl1 = -l1[1] * abx + l1[0] * aby;
        double dl2 = -l2[1] * bcx + l2[0] * bcy;

        double i1[] = new double[] { -l1[1], l1[0], dl1 };
        double i2[] = new double[] { -l2[1], l2[0], dl2 };

        return intersection(i1, i2);
    }

    // computes the intersection of lines l1(A1, B1) and l2(A2, B2)
    double[] intersection(double[] l1, double[] l2) {
        double det = l1[0] * l2[1] - l2[0] * l1[1];

        if (Math.abs(det) <= EPS) { return null; } // lines are parallel

        double x = (l2[1] * l1[2] - l1[1] * l2[2]) / det;
        double y = (l1[0] * l2[2] - l2[0] * l1[2]) / det;

        return new double[] { x, y };
    }

    // computes the line equation for the line passing through A and B
    // the resulting equation will have the form Ux + Vy = Z
    double[] toLineEq(double ax, double ay, double bx, double by) {
        double U = by - ay;
        double V = ax - bx;
        double Z = U * ax + V * ay;
        return new double[] { U, V, Z };
    }

    // computes the distance from the specified point to the 
    // fartherst town
    double maxdist(int[] x, int[] y, double cx, double cy) {
        double max = 0.0;
        for (int i = 0; i < x.length; i++) {
            max = Math.max(max, dist(cx, cy, x[i], y[i]));
        }
        return max;
    }

    // computes the distance from A to B
    double dist(double ax, double ay, double bx, double by) {
        double d1 = ax - bx;
        double d2 = ay - by;
        return Math.sqrt(d1 * d1 + d2 * d2);
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
