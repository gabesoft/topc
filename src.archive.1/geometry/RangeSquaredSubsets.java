package topc.geometry;

import java.util.*;
import java.io.*;

// SRM 521 Division I Level Two - 500
// geometry, search
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11577&rd=14546
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+521
public class RangeSquaredSubsets {
    final int INF = 1 << 28;

    int minSide;
    int maxSide;

    public long countSubsets(int nlow, int nhigh, int[] x, int[] y) {
        minSide = nlow;
        maxSide = nhigh;

        int n = x.length;

        int[] xs = new int[n + 2];
        int[] ys = new int[n + 2];

        for (int i = 0; i < n; i++) {
            xs[i] = x[i];
            ys[i] = y[i];
        }

        xs[n]     = INF;
        xs[n + 1] = -INF;
        ys[n]     = INF;
        ys[n + 1] = -INF;

        Arrays.sort(xs);
        Arrays.sort(ys);

        HashSet<Long> seen = new HashSet<Long>();

        for (int xi = 1; xi < xs.length; xi++) {
            for (int yi = 1; yi < ys.length; yi++) {
                for (int xj = 0; xj < xs.length - 1; xj++) {
                    for (int yj = 0; yj < ys.length - 1; yj++) {
                        int x0 = xs[xi];
                        int y0 = ys[yi];
                        int x1 = xs[xj];
                        int y1 = ys[yj];

                        long mask = 0;

                        if (isNSquare(x1 - x0, y1 - y0, xs[xj + 1] - xs[xi - 1], ys[yj + 1] - ys[yi - 1])) {
                            for (int k = 0; k < n; k++) {
                                if (inside(x0, y0, x1, y1, x[k], y[k])) {
                                    mask |= (1L << k);
                                }
                            }
                            if (mask > 0) {
                                seen.add(mask);
                            }
                        }
                    }
                }
            }
        }

        return seen.size();
    }

    private boolean isNSquare(int side1, int side2, int nextSide1, int nextSide2) {
        int len = Math.max(minSide, Math.max(side1, side2));
        return len <= maxSide && len < nextSide1 && len < nextSide2;
    }

    private boolean inside(int x0, int y0, int x1, int y1, int x, int y) {
        return x0 <= x && x <= x1 && y0 <= y && y <= y1;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
