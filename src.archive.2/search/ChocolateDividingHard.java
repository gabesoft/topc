package topc.search;

import java.util.*;
import java.io.*;

// SRM 636 Division II Level Three - 1000
// search
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13388&rd=16079
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+636
public class ChocolateDividingHard {
  int n = 0;
  int m = 0;
  int acc[][] = null;

  public int findBest(String[] chocolate) {
    n = chocolate.length;
    m = chocolate[0].length();

    acc = new int[76][76];

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= m; j++) {
        int x = chocolate[i - 1].charAt(j - 1) - '0';
        acc[i][j] = x + acc[i - 1][j] + acc[i][j - 1] - acc[i - 1][j - 1];
      }
    }

    int lo = 0;
    int hi = 9 * 2500 + 1;
    while (lo + 1 < hi) {
      int ha = lo + (hi - lo) / 2;
      if (isPossible(ha)) {
        lo = ha;
      } else {
        hi = ha;
      }
    }

    return lo;
  }

  private boolean allAtLeast(int[] y, int left, int right, int r) {
    for (int j = 0; j < 4; j++) {
      int s = acc[y[j+1]][left+right] - acc[y[j+1]][left] - acc[y[j]][left+right] + acc[y[j]][left];
      if (s < r) {
        return false;
      }
    }

    return true;
  }

  private boolean isPossible(int r) {
    for (int y1 = 1; y1 < n; y1++) {
      for (int y2 = y1 + 1; y2 < n; y2++) {
        for (int y3 = y2 + 1; y3 < n; y3++) {
          int[] y = new int[] { 0, y1, y2, y3, n };
          int left = 0;

          for (int i = 0; (i < 3) && (left < m); i++) {
            int lo = 0;
            int hi = m - left;

            while (lo + 1 < hi) {
              int right = lo + (hi - lo) / 2;
              if (allAtLeast(y, left, right, r)) {
                hi = right;
              } else {
                lo = right;
              }
            }

            left += hi;
          }

          if (left < m) {
            if (allAtLeast(y, left, m - left, r)) {
              return true;
            }
          }
        }
      }
    }

    return false;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
