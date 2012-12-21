package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 173 Division I Level Three - 1000
// dynamic programming, geometry
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=1960&rd=4670
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm173
public class ElectronicScarecrows {
    int K;

    public double largestArea(int[] x, int[] y, int k) {
        this.K      = k;
        double best = 0.0;

        for (int i = 0; i < x.length; i++) {
            Point set[]      = getSet(x, y, i);
            double cache[][] = buildCache(set.length, K);
            double next      = largest(set, cache, 0, 0);
            best             = Math.max(best, next);
        }

        return best;
    }

    double[][] buildCache(int n, int m) {
        double cache[][] = new double[n][m];
        for (int j = 0; j < cache.length; j++) {
            Arrays.fill(cache[j], -2.0);
        }
        return cache;
    }

    Point[] getSet(int[] x, int[] y, int index) {
        int x0 = x[index];
        int y0 = y[index];

        ArrayList<Point> set = new ArrayList<Point>();

        for (int i = 0; i < x.length; i++) {
            if (i != index && !exclude(x0, y0, x[i], y[i])) {
                int px       = x[i] - x0;
                int py       = y[i] - y0;
                int dist     = px * px + py * py;
                double alpha = Math.atan(px / (double) py);
                alpha        = (alpha < 0) ? Math.PI + alpha : alpha;
                set.add(new Point(px, py, dist, alpha));
            }
        }

        Collections.sort(set);

        set.add(0, new Point(0, 0, 0, 0.0));
        set.add(new Point(0, 0, 0, 0.0));

        Point result[] = new Point[set.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = set.get(i);
        }

        return result;
    }

    boolean exclude(int x0, int y0, int x, int y) {
        return x < x0 || (x == x0 && y < y0);
    }

    double largest(Point[] points, double[][] cache, int index, int k) {
        int n = points.length;

        if (k == K - 1) { return areaBelow(points[index], points[n - 1]); }
        if (cache[index][k] > -1.0) { return cache[index][k]; }

        double best = 0.0;

        for (int i = index + 1; i < n; i++) {
            double next = largest(points, cache, i, k + 1) + areaBelow(points[index], points[i]);
            best        = Math.max(best, next);
        }

        cache[index][k] = best;
        return best;
    }

    double areaBelow(Point p1, Point p2) {
        return (p2.x * p1.y - p1.x * p2.y) / 2.0;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    class Point implements Comparable<Point> {
        public final int x;
        public final int y;
        public final int d;
        public final double alpha;

        public Point(int x, int y, int d, double alpha) {
            this.x     = x;
            this.y     = y;
            this.d     = d;
            this.alpha = alpha;
        }

        public int compareTo(Point other) {
            return alpha == other.alpha 
                ? Integer.valueOf(d).compareTo(other.d)
                : Double.valueOf(alpha).compareTo(other.alpha);
        }
    }
}
