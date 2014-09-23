package topc.search;

import java.util.*;
import java.io.*;

// SRM 581 Division I Level One - 250
// simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12588&rd=15501
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+581
public class SurveillanceSystem {
  public String getContainerInfo(String containers, int[] reports, int L) {
    int n = containers.length();
    int m = n - L + 1;
    int[] sets = new int[m];
    int[] cntS = new int[n + 1];
    int[] cntR = new int[n + 1];

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < L; j++) {
        sets[i] += (containers.charAt(j + i) == 'X' ? 1 : 0);
      }
      cntS[sets[i]]++;
    }

    for (int i = 0; i < reports.length; i++) {
      cntR[reports[i]]++;
    }

    String res = "";
    for (int i = 0; i < n; i++) {
      int s = Math.max(0, i - L + 1);
      int e = Math.min(m, i + 1);
      int cnt[] = new int[n + 1];

      for (int j = s; j < e; j++) {
        cnt[sets[j]]++;
      }

      int w = 0;
      for (int j = 0; j <= n; j++) {
        int cs = cntS[j];
        int cr = cntR[j];
        int ct = cnt[j];

        if (ct == 0 || cr == 0) {
          continue;
        } else if (ct > cs - cr) {
          w = 2;
          break;
        } else {
          w = 1;
        }
      }

      if (w == 2) {
        res += "+";
      } else if (w == 1) {
        res += "?";
      } else {
        res += "-";
      }
    }

    return res;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
