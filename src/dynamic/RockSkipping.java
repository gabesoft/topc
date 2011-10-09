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

    int[] lake = new int[n];
    for (int i = 0; i < n; i++) {
      lake[i] = pads.charAt(i % pads.length()) == 'X' ? 0 : 1;
    }

    int maxd = 1;
    double[] probs = new double[n];
    probs[0] = 1.0;
    for (int i = 0; i < maxDist; i++) {

      int dist = maxDist - i;
      double pskip = 1.0 / dist;
      double[] curr = new double[n];
      for (int j = i; j < maxd; j++) {
        if (probs[j] == 0.0) { continue; }

        for (int k = j + 1; k < j + dist + 1; k++) {
          curr[k] += lake[k] * pskip * probs[j];
        }
      }

      maxd += dist;
      probs = curr;
    }

    double prob = 0.0;
    for (int i = 0; i < n; i++) {
      prob += probs[i];
    }

    return prob * 100;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
