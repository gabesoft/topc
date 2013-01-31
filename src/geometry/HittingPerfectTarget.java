package topc.geometry;

import java.util.*;
import java.io.*;

// SRM 365 Division II Level Three - 1000
// brute force, geometry, math, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=7575&rd=10780
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm365
public class HittingPerfectTarget {
    double EPS = 10e-15;

    public double getProbability(int[] x1, int[] y1, int[] x2, int[] y2) {
        int n1 = x1.length;
        int n2 = x2.length;

        Point[] p1 = new Point[n1];
        Point[] p2 = new Point[n2];

        for (int i = 0; i < n1; i++) {
            p1[i] = new Point(x1[i], y1[i]);
        }
        for (int i = 0; i < n2; i++) {
            p2[i] = new Point(x2[i], y2[i]);
        }

        p1 = order(p1);
        p2 = order(p2);

        double all    = 201 * 201;
        double inside = 0;

        for (int i = -100; i < 101; i++) {
            for (int j = -100; j < 101; j++) {
                int at = 0;
                int bt = 0;
                int af = 0;
                int bf = 0;

                for (int k = 0; k < 5; k++) {
                    boolean a = inPolygon(p1, i, j);
                    boolean b = inPolygon(p2, i, j);

                    at += a ? 1 : 0;
                    af += a ? 0 : 1;

                    bt += b ? 1 : 0;
                    bf += b ? 0 : 1;
                }

                boolean a = at > af;
                boolean b = bt > bf;

                if (a && b) {
                    inside++;
                } 
            }
        }

        return inside / all;
    }

    boolean inPolygon(Point[] poly, int x1, int y1) {
        int n  = poly.length;
        int x2 = (int)(Math.random() * 1000 + 1000.0);
        int y2 = (int)(Math.random() * 1000 + 1000.0);

        int count = 0;
        for (int i = 0; i < n; i++) {
            int ax = poly[i].x;
            int ay = poly[i].y;
            int bx = poly[(i + 1) % n].x;
            int by = poly[(i + 1) % n].y;

            if (linePointDistance(ax, ay, bx, by, x1, y1, true) <= EPS) { 
                return true;
            }
            if (intersection(ax, ay, bx, by, x1, y1, x2, y2, true) != null) { 
                count++;
            }
        }

        return count % 2 != 0;
    }

    // computes the intersection of lines l1(A1, B1) and l2(A2, B2)
    double[] intersection(int a1x, int a1y, int b1x, int b1y, int a2x, int a2y, int b2x, int b2y, boolean segment) {
        double l1[] = toLineEq(a1x, a1y, b1x, b1y);
        double l2[] = toLineEq(a2x, a2y, b2x, b2y);
        double det  = l1[0] * l2[1] - l2[0] * l1[1];

        if (Math.abs(det) <= EPS) { return null; } // lines are parallel

        double x = (l2[1] * l1[2] - l1[1] * l2[2]) / det;
        double y = (l1[0] * l2[2] - l2[0] * l1[2]) / det;

        if (segment) {
            if (onSegment(a1x, a1y, b1x, b1y, x, y) && onSegment(a2x, a2y, b2x, b2y, x, y)) {
                return new double[] { x, y };
            } else {
                return null;
            }
        } 

        return new double[] { x, y };
    }

    boolean onSegment(double ax, double ay, double bx, double by, double x, double y) {
        return 
            Math.min(ax, bx) <= x && x <= Math.max(ax, bx) &&
            Math.min(ay, by) <= y && y <= Math.max(ay, by);
    }

    // computes the line equation for the line passing through A and B
    // the resulting equation will have the form Ux + Vy = Z
    double[] toLineEq(int ax, int ay, int bx, int by) {
        double U = by - ay;
        double V = ax - bx;
        double Z = U * ax + V * ay;
        return new double[] { U, V, Z };
    }

    // computes the distance from AB to C
    double linePointDistance(int ax, int ay, int bx, int by, int cx, int cy, boolean segment) {
        double dist = cross(ax, ay, bx, by, cx, cy) / distance(ax, ay, bx, by);

        if (segment) {
            int dot1 = dot(ax, ay, bx, by, cx, cy);
            if (dot1 > 0) {
                return distance(bx, by, cx, cy);
            }

            int dot2 = dot(bx, by, ax, ay, cx, cy);
            if (dot2 > 0) {
                return distance(ax, ay, cx, cy);
            }
        }

        return Math.abs(dist);
    }

    // computes the distance from A to B
    double distance(int ax, int ay, int bx, int by) {
        int d1 = ax - bx;
        int d2 = ay - by;
        return Math.sqrt(d1 * d1 + d2 * d2);
    }

    // order the polygon vertices using convex hull
    // the resulting points will be in counter clockwise order
    Point[] order(Point[] pts) {
        int n = pts.length;
        int p = 0;

        Arrays.sort(pts);

        int j           = 0;
        Point[] ordered = new Point[n];

        do {
            int k = -1;

            for (int i = 0; i < n; i++) {
                if (i == p) { continue; }

                if (k == -1) { 
                    k = i;
                }

                int cr = cross(pts[i].x, pts[i].y, pts[p].x, pts[p].y, pts[k].x, pts[k].y);

                if (cr < 0) {
                    k = i;
                }
            }

            ordered[j++] = pts[p];
            p            = k;
        } while (p != 0);

        assert j == n : "some points were missed: " + j + " vs " + n;
        return ordered;
    }

    // computes the dot product AB . BC
    int dot(int ax, int ay, int bx, int by, int cx, int cy) {
        int abx = bx - ax;
        int aby = by - ay;
        int bcx = cx - bx;
        int bcy = cy - by;
        return abx * bcx + aby * bcy;
    }

    // computes the norm of the cross product |AB x BC|
    int cross(int ax, int ay, int bx, int by, int cx, int cy) {
        int abx = bx - ax;
        int aby = by - ay;
        int acx = cx - ax;
        int acy = cy - ay;
        return abx * acy  - aby * acx;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    class Point implements Comparable<Point> {
        public final int x;
        public final int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int compareTo(Point o) {
            return x == o.x ? o.y - y : x - o.x;
        }

        public String toString() {
            return String.format("(%s,%s)", x, y);
        }
    }
}
