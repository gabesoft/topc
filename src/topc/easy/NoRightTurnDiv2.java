package topc.easy;

import java.util.*;

// SRM 652 Division II Level Three - 1000
// brute force, geometry
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13644&rd=16316
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+652
public class NoRightTurnDiv2 {
    public int[] findPath(int[] x, int[] y) {
        int n = x.length;
        int init = 0;

        for (int i = 1; i < n; i++) {
            if (x[i] < x[init] || (x[i] == x[init] && y[i] < y[init])) {
               init = i;
            }
        }

        int[] pts = new int[n];
        for (int i = 0; i < n; i++) {
            pts[i] = i;
        }

        swap(pts, 0, init);

        for (int r = 1; r < n; r++) {
            int pick =  - 1;

            for (int s = r; s < n; s++) {
                boolean bad = false;

                for (int t = r; t < n; t++) {
                    if (t != s) {
                        int i = pts[r - 1];
                        int j = pts[s];
                        int k = pts[t];

                        if (clockwise(x[i], y[i], x[j], y[j], x[k], y[k])) {
                            bad = true;
                        }
                    }
                }

                if (!bad) {
                    pick = s;
                }
            }

            swap(pts, r, pick);
        }

        return pts;
    }

    private boolean clockwise(long x1, long y1, long x2, long y2, long x3, long y3) {
        long area = (x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1);
        return area < 0;
    }

    private void swap(int[] c, int i, int j) {
        int t = c[i];
        c[i]  = c[j];
        c[j]  = t;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
