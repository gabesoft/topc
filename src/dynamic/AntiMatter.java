package topc.dynamic;

import java.util.*;
import java.io.*;
import java.text.*;

// SRM 179 Division I Level Three - 850
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=1358&rd=4715
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm179
public class AntiMatter {
  public String unstable(int[] xform) {
    int hi = 5000;
    int lo = -4999;
    boolean[] dist = new boolean[20001];
    boolean change = true;

    dist[0] = true;
    while (change) {
      change = false;

      for (int k = 0; k < dist.length; k++) {
        for (int i = 0; i < xform.length; i++) {
          for (int j = i + 1; j < xform.length; j++) {
            int delta = Math.abs(xform[i] - xform[j]);

            if (dist[k] && (k + delta) < dist.length) {
              change |= !dist[k + delta];
              dist[k + delta] = true;
            }

            if (dist[k] && (k - delta) > -1) {
              change |= !dist[k - delta];
              dist[k - delta] = true;
            }

          }
        }
      }
    }

    long res = 10000;
    for (int i = lo; i < hi + 1; i++) {
      for (int j = i + 1; j < hi + 1; j++) {
        if (dist[j - i]) { res += 2; }
      }
    }

    DecimalFormat formatter = new DecimalFormat("#.00000000");
    return formatter.format(res / 100000000.0);
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
