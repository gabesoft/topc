package topc.geometry;

import java.util.*;
import java.io.*;

// SRM 187 Division II Level Three - 1000
// geometry
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=2384&rd=4755
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm187
public class PointInPolygon {
    double EPS = 10e-15;

    public String testPoint(String[] vertices, int testPointX, int testPointY) {
        int n   = vertices.length;
        int x[] = new int[n];
        int y[] = new int[n];

        for (int i = 0; i < n; i++) {
            String parts[] = vertices[i].split(" ");
            x[i] = Integer.parseInt(parts[0]);
            y[i] = Integer.parseInt(parts[1]);
        }

        int count = 0;

        int x2 = (int)(Math.random() * 1000 + 1000.0);
        int y2 = (int)(Math.random() * 1000 + 1000.0);

        for (int i = 0; i < n; i++) {
            int ax = x[i];
            int ay = y[i];
            int bx = x[(i + 1) % n];
            int by = y[(i + 1) % n];

            if (linePointDistance(ax, ay, bx, by, testPointX, testPointY, true) <= EPS) { return "BOUNDARY"; }
            if (intersection(ax, ay, bx, by, testPointX, testPointY, x2, y2, true) != null) { count++; }
        }

        return (count % 2 == 0) ? "EXTERIOR" : "INTERIOR";
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

    // computes the cross product AB x BC
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

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
