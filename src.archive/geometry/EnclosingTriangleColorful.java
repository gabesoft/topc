package topc.geometry;

import java.util.*;
import java.io.*;

// SRM 585 Division II Level Three - 1000
// geometry
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12694&rd=15697
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+585
public class EnclosingTriangleColorful {
    int[] x;
    int[] y;
    int[] px;
    int[] py;
    int[] nextSide;
    boolean[][] canSegment;

    public int getNumber(int m, int[] x, int[] y) {
        int n = 4 * (m - 1);

        this.x  = x;
        this.y  = y;
        this.px = new int[n];
        this.py = new int[n];

        this.nextSide = new int[n];

        int t = 0;
        for (int s = 0; s < 4; s++) {
            for (int i = 1; i < m; i++) {
                int ox[] = new int[] { 0, i, m, m - i };
                int oy[] = new int[] { i, m, m - i, 0 };

                px[t] = ox[s];
                py[t] = oy[s];

                nextSide[t++] = (s + 1) * (m - 1);
            }
        }

        this.canSegment = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = nextSide[i]; j < n; j++) {
                canSegment[i][j] = validSegment(i, j);
                canSegment[j][i] = validSegment(j, i);
            }
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = nextSide[i]; j < n; j++) {
                for (int k = nextSide[j]; k < n; k++) {
                    if (canSegment[i][j] && canSegment[j][k] && canSegment[k][i]) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    private boolean clockwiseOrColinear(long x0, long y0, long x1, long y1, long x2, long y2) {
        x0 -= x2;
        y0 -= y2;
        x1 -= x2;
        y1 -= y2;
        return x0 * y1 - x1 * y0 <= 0;
    }

    private boolean validSegment(int i, int j) {
        for (int k = 0; k < x.length; k++) {
            if (!clockwiseOrColinear(px[i], py[i], px[j], py[j], x[k], y[k])) {
                return false;
            }
        }
        return true;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
