package topc.dynamic;

import java.util.*;
import java.io.*;

// TCCC '04 Round 1 Division I Level Three - 1000
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=1954&rd=5006
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=tccc04_online_rd_1
public class RockSkipping {
  public double probability(String pads, int maxDist) {
    int n = maxDist * (maxDist + 1) / 2 + 1;

    int[] p = new int[n];
    for (int i = 0; i < n; i++) {
      p[i] = pads.charAt(i % pads.length()) == 'X' ? 0 : 1;
    }

    int lim = 1;
    double[] w = new double[n];

    w[0] = 1.0;
    for (int i = 0; i < maxDist; i++) {

      int dist = maxDist - i;
      double s = 1.0 / dist;
      double[] c = new double[n];

      for (int j = 0; j < lim; j++) {
        if (w[j] == 0.0) { continue; }
        for (int k = j + 1; k < j + dist + 1; k++) {
          c[k] += p[k] * s * w[j];
        }
      }

      lim += dist;
      w = c;
    }

    double prob = 0.0;
    for (int i = 0; i < n; i++) {
      prob += w[i];
    }

    return prob * 100;
  }

  int sum(double[] arr) {
    int res = 0;
    for (int i = 0; i < arr.length; i++) {
      res += arr[i] == 0.0 ? 0 : 1;
    }
    return res;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
