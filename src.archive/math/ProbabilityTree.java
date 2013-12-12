package topc.math;

import java.util.*;
import java.io.*;

// SRM 174 Division II Level Three - 1000
// math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=2234&rd=4675
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm174
public class ProbabilityTree {
  int n;
  double[] prob;
  String[] tree;

  public int[] getOdds(String[] tree, int lowerBound, int upperBound) {
    this.tree = tree;

    n = tree.length;
    prob = new double[n];

    Arrays.fill(prob, -1.0);

    for (int i = 0; i < n; i++) { rec(i); }

    int[] res = new int[n];
    int count = 0;
    double lo = lowerBound / 100.0;
    double hi = upperBound / 100.0;
    for (int i = 0; i < n; i++) {
      if (lo < prob[i] && prob[i] < hi) {
        res[count++] = i;
      }
    }

    int[] out = new int[count];
    System.arraycopy(res, 0, out, 0, count);

    return out;
  }

  void rec(int i) {
    if (prob[i] > -1.0) { return; }

    if (i == 0) {
      prob[i] = Double.parseDouble(tree[i]) / 100.0;
    } else {
      String[] tokens = tree[i].split("\\s+");
      int parent  = Integer.parseInt(tokens[0]);
      double p    = Double.parseDouble(tokens[1]) / 100.0;
      double np   = Double.parseDouble(tokens[2]) / 100.0;

      rec(parent);
      prob[i] = p * prob[parent] + np * (1.0 - prob[parent]);
    }
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
