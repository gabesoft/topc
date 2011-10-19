package topc.easy;

import java.util.*;
import java.io.*;

// SRM 184 Division I Level Two - 500
// brute force, dynamic programming, recursion
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=2299&rd=4740
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm184
public class BagOfDevouring {
  public double expectedYield(int[] values, int[] weights) {
    return exp(values, weights);
  }

  double exp(int[] values, int[] weights) {
    if (values.length == 0) { return 0.0; }

    double best = 0.0;
    for (int i = 0; i < values.length; i++) {
      double curr = exp(values, weights, i);
      best = Math.max(best, curr);
    }

    return best;
  }

  double exp(int[] values, int[] weights, int best) {
    debug(best, values, weights);

    int bestValue = values[best];
    int[] v = remove(values, best);
    int[] w = remove(weights, best);

    int wsum = sumArray(w);
    double pnone = 1.0;
    double edev = 0.0;
    for (int i = 0; i < v.length; i++) {
      double pdev = (double)w[i] / (wsum + 100.0);
      pnone -= pdev;
      edev += pdev * exp(remove(v, i), remove(w, i));
    }

    double enone = pnone * exp(v, w);

    return bestValue + edev + enone;
  }

  int[] remove(int[] arr, int index) {
    int[] res = new int[arr.length - 1];
    int j = 0;
    for (int i = 0; i < arr.length; i++) {
      if (i != index) {
        res[j++] = arr[i];
      }
    }
    return res;
  }

  int findBest(int[] values, int[] weights) {
    int best = 0;
    for (int i = 0; i < values.length; i++) {
      boolean better =  (values[i] > values[best]) || (values[i] == values[best] && weights[i] < weights[best]);
      if (better) { best = i; }
    }
    return best;
  }

  int sumArray(int[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) { sum += arr[i]; }
    return sum;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
