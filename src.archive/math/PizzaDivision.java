package topc.math;

import java.util.*;
import java.io.*;

// SRM 312 Division II Level Three - 1000
// geometry, simple math, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=6493&rd=9992
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm312
public class PizzaDivision {
    int n;
    Point pts[];

    public int howMany(String[] toppings) {
        if (toppings.length == 1) { return  toppings[0] == "0 0" ? -1 : 1; }

        n   = toppings.length;
        pts = new Point[n];

        for (int i = 0; i < n; i++) {
            String point[] = toppings[i].split("\\s+");

            int x  = Integer.parseInt(point[0]);
            int y  = Integer.parseInt(point[1]);
            pts[i] = new Point(x, y);
        }

        int count     = 0;
        Point lines[] = new Point[5];
        Point v       = null;

        for (int i = 0; i < n; i++) {
            if (pts[i].x == 0 && pts[i].y == 0) {
                continue;
            }

            for (int j = 0; j < n; j++) {
                v = perpendicular(pts[i], pts[j]);
                if (beautiful(v) && newLine(lines, v, count)) {
                    lines[count++] = v;
                }
            }
        }

        return count;
    }

    private Point perpendicular(Point a, Point b) {
        Point p = new Point(a.x + b.x, a.y + b.y);
        return (p.x == 0 && p.y == 0) ? new Point(a.y, -a.x) : p;
    }

    private boolean newLine(Point[] lines, Point p1, int len) {
        for (int i = 0; i < len; i++) {
            Point p2 = lines[i];
            int cross = p1.x * p2.y - p1.y * p2.x;
            if (cross == 0) {
                return false;
            }
        }
        return true;
    }

    private boolean beautiful(Point v) {
        for (int i = 0; i < n; i++) {
            boolean found = false;
            for (int j = 0; j < n; j++) {
                if (mirror(v, pts[i], pts[j])) {
                    found = true;
                    break;
                }
            }
            if (!found) { return false; }
        }
        return true;
    }

    private boolean mirror(Point v, Point a, Point b) {
        int cross = v.x * (a.y + b.y) - v.y * (a.x + b.x);
        int dot   = v.x * (b.x - a.x) + v.y * (b.y - a.y);
        return cross == 0 && dot == 0;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    public class Point {
        public final int x;
        public final int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public String toString() {
            return String.format("%s,%s", x, y);
        }
    }
}
