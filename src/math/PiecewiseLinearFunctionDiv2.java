package topc.math;

import java.util.*;
import java.io.*;

// SRM 586 Division II Level Two - 500
// simple math, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12698&rd=15698
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+586
public class PiecewiseLinearFunctionDiv2 {
  public int[] countSolutions(int[] Y, int[] query) {
    int n = Y.length;
    int[] cnt = new int[query.length];

    for (int i = 0; i < query.length; i++) {
      int prev = Y[0];

      for (int j = 1; j < n; j++) {
        int a = prev;
        int b = Y[j];

        if (a == b && query[i] == a) {
          cnt[i] = -1;
          break;
        }

        if ((query[i] != prev || j == 1) && Math.min(a, b) <= query[i] && query[i] <= Math.max(a, b)) {
          cnt[i]++;
        }

        prev = b;
      }
    }

    return cnt;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
