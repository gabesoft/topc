package topc.dynamic;

import java.util.*;
import java.io.*;

// Member SRM 494 Division I Level Two - 500
// dynamic programming, math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11309&rd=14423
// editorial: http://apps.topcoder.com/wiki/display/tc/Algorithm+Problem+Set+Analysis
public class AlternatingLane {
  public double expectedBeauty(int[] low, int[] high) {
    int n = low.length;

    int max = high[0];
    for (int i = 0; i < n; i++) {
      max = Math.max(max, high[i]);
    }

    long[] sums = new long[max + 2];
    for (int i = 2; i < sums.length; i++) {
      sums[i] = sums[i - 1] + (i - 1);
    }

    double prev   = 0;
    for (int i = 1; i < n; i++) {

      double p1 = 1.0 / (high[i - 1] - low[i - 1] + 1);
      double p2 = 1.0 / (high[i] - low[i] + 1);
      double p  = p1 * p2;

      double curr = 0;

      for (int a = low[i]; a < high[i] + 1; a++) {
        long lo = low[i - 1];
        long hi = high[i - 1];
        int l  = 0;
        int r  = 0;

        if (lo <= a && a <= hi) {
          l = (int)(a - lo);
          r = (int)(hi - a);
        }
        else if (a > hi) {
          l = (int)(hi - lo + 1);
        }
        else if (a < lo) {
          r = (int)(hi - lo + 1);
        }

        long addl = sums[l];
        long addr = (l > 0 || a == lo) ? (sums[l + 1 + r] - sums[l + 1]) : sums[r];

        curr += p * l * a;
        curr -= p * r * a;

        curr -= p * (l * lo + addl);
        curr += p * (r * lo + addr);

        curr += p2 * prev;
      }

      prev = curr;
    }

    return prev;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
