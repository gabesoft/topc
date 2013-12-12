package topc.easy;

import java.util.*;
import java.io.*;

// SRM 272 Division II Level Three - 1000
// brute force, geometry
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=5885&rd=8069
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm272
public class VectorPolygon {
    double best;
    int[] dx;
    int[] dy;

    public double maxArea(int[] dx, int[] dy) {
        this.best = 0;
        this.dx   = dx;
        this.dy   = dy;

        Point[] pts = new Point[dx.length + 1];
        pts[0]      = new Point(0, 0);

        search(pts, 0, 0);

        return best;
    }

    private double area(Point[] pts, int last) {
        int area = 0;
        int n    = last + 1;

        for (int i = 1; i < n - 1; i++) {
            int x1    = pts[i].x - pts[0].x;
            int y1    = pts[i].y - pts[0].y;
            int x2    = pts[i + 1].x - pts[0].x;
            int y2    = pts[i + 1].y - pts[0].y;
            int cross = x1 * y2 - x2 * y1;

            area += cross;
        }

        return Math.abs(area / 2.0);
    }

    private void search(Point[] pts, int last, int used) {
        if (pts[last].x == 0 && pts[last].y == 0 && Integer.bitCount(used) > 0) {
            best = Math.max(best, area(pts, last));
        } else {
            for (int i = 0; i < dx.length; i++) {
                if (off(used, i)) {
                    Point p = new Point(pts[last].x + dx[i], pts[last].y + dy[i]);
                    pts[last + 1] = p;
                    search(pts, last + 1, used | (1 << i));
                }
            }
        }
    }

    private boolean off(int mask, int k) {
        return ((mask >> k) & 1) == 0;
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
            return String.format("%s:%s", x, y);
        }
    }
}
