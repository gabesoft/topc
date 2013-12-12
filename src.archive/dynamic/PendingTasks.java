package topc.dynamic;

import java.util.*;
import java.io.*;

// TCHS SRM 8 Division I Level Three - 1000
// dynamic programming, graph theory
// statement: http://community.topcoder.com/tc?module=HSProblemStatement&pm=6066&rd=10060
// editorial: http://apps.topcoder.com/wiki/display/tc/Algorithm+Problem+Set+Analysis
public class PendingTasks {
  public int latestProcess(int[] supertasks) {
    int n = supertasks.length;

    int[] T = new int[n]; // max tasks that can be run before task i
    int[] I = new int[n]; // max tasks that can be run before task i without activating i
    int[] A = new int[n]; // all tasks below i

    for (int i = 0; i < n; i++) {
      int[] sons = new int[n];
      int l = 0;
      int s = 0;

      for (int j = 0; j < i; j++) {
        if (supertasks[j] == i) { 
          sons[l++] = j;
          s += I[j];
          A[i] += A[j] + 1;
        }
      }

      if (l == 0) { continue; }

      if (l == 1) {
        T[i] = A[sons[0]] + 1;
        I[i] = A[sons[0]] + 1;
      } else {
        for (int j = 0; j < l; j++) {
          for (int k = j + 1; k < l; k++) {
            int s1 = sons[j];
            int s2 = sons[k];
            int si = s - I[s1] - I[s2];

            int t1  = A[s1] + T[s2] + si;
            int t2  = A[s2] + T[s1] + si;
            if (t1 > T[i]) { T[i] = t1; }
            if (t2 > T[i]) { T[i] = t2; }

            int i1  = A[s1] + I[s2] + si;
            int i2  = A[s2] + I[s1] + si;
            if (i1 > I[i]) { I[i] = i1; }
            if (i2 > I[i]) { I[i] = i2; }
          }
        }

        T[i] += 2;
        I[i] += 1;
      }
    }

    return T[n - 1];
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
