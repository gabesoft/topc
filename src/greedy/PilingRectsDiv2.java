package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 602 Division II Level Two - 500
// greedy, search
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12928&rd=15820
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+602
public class PilingRectsDiv2 {
  public int getmax(int[] X, int[] Y, int limit) {
    int mx = -1;

    for (int w = 1; w <= limit && limit / w <= limit; w++) {
      int h = (limit + w - 1) / w;
      int r = 0;
      for (int i = 0; i < X.length; i++) {
        if ((X[i] >= w && Y[i] >= h) || (Y[i] >= w && X[i] >= h)) {
          r++;
        }
      }

      if (r > 0) {
        mx = Math.max(mx, r);
      }
    }

    return mx;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
