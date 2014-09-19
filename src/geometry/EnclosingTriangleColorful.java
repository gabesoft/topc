package topc.geometry;

import java.util.*;
import java.io.*;

// SRM 585 Division II Level Three - 1000
// geometry
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12694&rd=15697
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+585
public class EnclosingTriangleColorful {
  public static final int MAX = 1196;
  int px[] = null;
  int py[] = null;
  int nextSide[] = null;
  boolean canSegment[][] = null;
  int x[] = null;
  int y[] = null;

  public int getNumber(int m, int[] x, int[] y) {
    this.x = x;
    this.y = y;

    px = new int[MAX];
    py = new int[MAX];
    nextSide = new int[MAX];
    canSegment = new boolean[MAX][MAX];

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

    for (int i = 0; i < t; i++) {
      for (int j = nextSide[i]; j < t; j++) {
        canSegment[i][j] = validSegment(i, j);
        canSegment[j][i] = validSegment(j, i);
      }
    }

    int res = 0;
    for (int i = 0; i < t; i++) {
      for (int j = nextSide[i]; j < t; j++) {
        for (int k = nextSide[j]; k < t; k++) {
          if (canSegment[i][j] && canSegment[j][k] && canSegment[k][i]) {
            res++;
          }
        }
      }
    }

    return res;
  }

  private boolean validSegment(int i, int j) {
    boolean valid = true;
    for (int k = 0; k < x.length; k++) {
      valid &= (clockwiseOrColinear(px[i], py[i], px[j], py[j], x[k], y[k]));
    }
    return valid;
  }

  private boolean clockwiseOrColinear(long x0, long y0, long x1, long y1, long x2, long y2) {
    x0 -= x2;
    y0 -= y2;
    x1 -= x2;
    y1 -= y2;
    long s = x0 * y1 - x1 * y0;
    return s <= 0;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
