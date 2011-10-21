package topc.easy;

import java.util.*;
import java.io.*;

// SRM 184 Division I Level Two - 500
// brute force, dynamic programming, recursion
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=2299&rd=4740
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm184
public class BagOfDevouring {
  double[][] memo;
  int N;
  int[] values; 
  int[] weights;

  public double expectedYield(int[] values, int[] weights) {
    this.N = values.length;
    this.memo = new double[(1 << N) + 1][N + 1];
    this.values = values;
    this.weights = weights;

    for (int i = 0; i < memo.length; i++) {
      Arrays.fill(memo[i], -1.0);
    }

    return exp(0);
  }

  double exp(int items) {
    if (memo[items][N] > -1.0) { return memo[items][N]; }
    if (items == (1 << N) - 1) { return 0.0; };

    double best = 0.0;
    for (int i = 0; i < N; i++) {
      if ((items >> i & 1) == 0) {
        double curr = exp(items | (1 << i), i);
        best = Math.max(best, curr);
      }
    }

    memo[items][N] = best;
    return best;
  }

  double exp(int items, int item) {
    if (memo[items][item] > -1.0) { return memo[items][item]; }

    int wsum = 0;
    for (int i = 0; i < N; i++) {
      if ((items >> i & 1) == 0) { wsum += weights[i]; }
    }

    double pnone = 1.0;
    double edev = 0.0;
    for (int i = 0; i < N; i++) {
      if ((items >> i & 1) == 0) {
        double pdev = (double)weights[i] / (wsum + 100.0);
        pnone -= pdev;
        edev += pdev * exp(items | (1 << i));
      }
    }

    double enone = pnone * exp(items);

    double res = values[item] + edev + enone;
    memo[items][item] = res;  

    return res;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
