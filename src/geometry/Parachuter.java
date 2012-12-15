package topc.geometry;

import java.util.*;
import java.io.*;

// TCI '01 Round 3 Division I Level Three - 1000
// geometry
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=180&rd=52
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=invit01_r3
public class Parachuter {
    double EPS = 10e-15;

    public int overArea(String[] points, int planeX, int planeY) {
        int n = points.length;
        int x[] = new int[n];
        int y[] = new int[n];

        for (int i = 0; i < n; i++) {
            String parts[] = points[i].replace("(", "").replace(")", "").split(",");
            x[i] = Integer.parseInt(parts[0]);
            y[i] = Integer.parseInt(parts[1]);
        }

        for (int i = 0; i < n; i++) {
            int p1 = i;
            int p2 = (i + 1) % n;

            for (int j = i + 1; j < n; j++) {
                if (x[i] == x[j] && y[i] == y[j]) { 
                    return 0;
                }

                int p3 = j;
                int p4 = (j + 1) % n;

                Intersection inter = intersection(x[p1], y[p1], x[p2], y[p2], x[p3], y[p3], x[p4], y[p4]);
                if (inter.value == 1 && p1 != p3 && p1 != p4 && p2 != p3 && p2 != p4) {
                    return 0;
                }

                if (inter.value == 0 && (p1 == p3 || p1 == p4 || p2 == p3 || p2 == p4) && p4 != 0) {
                    return 0;
                }
            }
        }

        return inPolygon(x, y, planeX, planeY) ? 1 : 2;
    }

    boolean inPolygon(int[] x, int[] y, int testPointX, int testPointY) {
        int count = 0;
        int n     = x.length;

        int x2 = (int)(Math.random() * 1000 + 1000.0);
        int y2 = (int)(Math.random() * 1000 + 1000.0);

        for (int i = 0; i < n; i++) {
            int ax = x[i];
            int ay = y[i];
            int bx = x[(i + 1) % n];
            int by = y[(i + 1) % n];

            if (linePointDistance(ax, ay, bx, by, testPointX, testPointY) <= EPS) { return true; }
            if (intersection(ax, ay, bx, by, testPointX, testPointY, x2, y2).value == 1) { count++; }
        }

        return count % 2 != 0;
    }

    // computes the intersection of lines l1(A1, B1) and l2(A2, B2)
    Intersection intersection(double a1x, double a1y, double b1x, double b1y, double a2x, double a2y, double b2x, double b2y) {
        double l1[] = toLineEq(a1x, a1y, b1x, b1y);
        double l2[] = toLineEq(a2x, a2y, b2x, b2y);
        double det  = l1[0] * l2[1] - l2[0] * l1[1];

        if (Math.abs(det) <= EPS) { return new Intersection(0, 0, 0); } // lines are parallel

        double x = (l2[1] * l1[2] - l1[1] * l2[2]) / det;
        double y = (l1[0] * l2[2] - l2[0] * l1[2]) / det;

        if (onSegment(a1x, a1y, b1x, b1y, x, y) && onSegment(a2x, a2y, b2x, b2y, x, y)) {
            return new Intersection(1, x, y);
        } else {
            return new Intersection(2, 0, 0);
        }
    }

    boolean onSegment(double ax, double ay, double bx, double by, double x, double y) {
        return 
            Math.min(ax, bx) <= x && x <= Math.max(ax, bx) &&
            Math.min(ay, by) <= y && y <= Math.max(ay, by);
    }

    // computes the distance from AB to C
    double linePointDistance(int ax, int ay, int bx, int by, int cx, int cy) {
        double dist = cross(ax, ay, bx, by, cx, cy) / distance(ax, ay, bx, by);

        int dot1 = dot(ax, ay, bx, by, cx, cy);
        if (dot1 > 0) {
            return distance(bx, by, cx, cy);
        }

        int dot2 = dot(bx, by, ax, ay, cx, cy);
        if (dot2 > 0) {
            return distance(ax, ay, cx, cy);
        }

        return Math.abs(dist);
    }

    // computes the norm of the cross product |AB x BC|
    int cross(int ax, int ay, int bx, int by, int cx, int cy) {
        int abx = bx - ax;
        int aby = by - ay;
        int acx = cx - ax;
        int acy = cy - ay;
        return abx * acy  - aby * acx;
    }

    // computes the dot product AB . BC
    int dot(int ax, int ay, int bx, int by, int cx, int cy) {
        int abx = bx - ax;
        int aby = by - ay;
        int bcx = cx - bx;
        int bcy = cy - by;
        return abx * bcx + aby * bcy;
    }

    // computes the distance from A to B
    double distance(int ax, int ay, int bx, int by) {
        int d1 = ax - bx;
        int d2 = ay - by;
        return Math.sqrt(d1 * d1 + d2 * d2);
    }

    // computes the line equation for the line passing through A and B
    // the resulting equation will have the form Ux + Vy = Z
    double[] toLineEq(double ax, double ay, double bx, double by) {
        double U = by - ay;
        double V = ax - bx;
        double Z = U * ax + V * ay;
        return new double[] { U, V, Z };
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    class Intersection {
        public final int value;
        public final double x;
        public final double y;

        public Intersection(int value, double x, double y) {
            this.value = value;
            this.x = x;
            this.y = y;
        }
    }
}
