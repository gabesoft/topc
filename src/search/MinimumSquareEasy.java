package topc.search;

import java.util.*;
import java.io.*;

// SRM 614 Division II Level Two - 500
// simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12982&rd=15847
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+614
public class MinimumSquareEasy {
    public long minArea(int[] x, int[] y) {
        int n = x.length;

        long best = Long.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                best = Math.min(best, area(x, y, i, j));
            }
        }

        return best;
    }

    private long area(int[] x, int[] y, int u, int v) {
        int lx = -1;
        int hx = -1;
        int ly = -1;
        int hy = -1;

        for (int i = 0; i < x.length; i++) {
            if (i != u && i != v) {
                if (lx == -1 || x[lx] > x[i]) {
                    lx = i;
                }
                if (ly == -1 || y[ly] > y[i]) {
                    ly = i;
                }
                if (hx == -1 || x[hx] < x[i]) {
                    hx = i;
                }
                if (hy == -1 || y[hy] < y[i]) {
                    hy = i;
                }
            }
        }

        long side = Math.max(2 + (x[hx] - x[lx]), 2 + (y[hy] - y[ly]));
        return side * side;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
