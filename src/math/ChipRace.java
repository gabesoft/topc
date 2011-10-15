package topc.math;

import java.util.*;
import java.io.*;

// SRM 199 Division I Level Two - 500
// advanced math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=2436&rd=5074
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm199
public class ChipRace {
  public double[] chances(int[] chips) {
    int s = arraySum(chips);
    int c = (int)Math.round(s / 5.0);
    return rec(chips, c);
  }

  double[] rec(int[] chips, int c) {
    int n = chips.length;
    double prob[] = new double[n];

    if (c == 0) { return prob; }

    int s = arraySum(chips);
    for (int i = 0; i < n; i++) {
      if (chips[i] == 0) { continue; }

      double p = (double)chips[i] / s;
      prob[i] += p;

      int[] next = chips.clone();
      next[i] = 0;

      double[] prec = rec(next, c - 1);
      for (int j = 0; j < n; j++) {
        prob[j] += p * prec[j];
      }
    }

    return prob;
  }

  int arraySum(int[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) { sum += arr[i]; }
    return sum;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
