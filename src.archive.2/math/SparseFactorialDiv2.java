package topc.math;

import java.util.*;
import java.io.*;

// SRM 596 Division II Level Three - 1000
// math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12838&rd=15708
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+596
public class SparseFactorialDiv2 {
  public long getCount(long lo, long hi, long divisor) {
    return getCount(hi + 1, divisor) - getCount(lo, divisor);
  }

  private long getCount(long t, long divisor) {
    long res = 0;
    long bestK[] = new long[(int)divisor];

    Arrays.fill(bestK, -1);

    long k = 0;
    while (k * k < t - 1) {
      if (bestK[(int)(k * k % divisor)] == -1) {
        bestK[(int)(k * k % divisor)] = k;
      }
      k++;
    }

    for (long a = 0; a < divisor; a++) {
      if (bestK[(int)a] != -1) {
        long bK = bestK[(int)a];

        long lowerBound = bK * bK + 1;
        long upperBound = t;

        res += countMods(upperBound, divisor, a) - countMods(lowerBound, divisor, a);
      }
    }

    return res;
  }

  private long countMods(long upperBound, long divisor, long a) {
    if (upperBound % divisor > a) {
      return upperBound / divisor + 1;
    } else {
      return upperBound / divisor;
    }
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
