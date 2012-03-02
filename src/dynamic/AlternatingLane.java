package topc.dynamic;

import java.util.*;
import java.io.*;

// Member SRM 494 Division I Level Two - 500
// dynamic programming, math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11309&rd=14423
// editorial: http://apps.topcoder.com/wiki/display/tc/Algorithm+Problem+Set+Analysis
public class AlternatingLane {
  int n;
  int [] low;
  int [] high;
  double[][][] memo;

  public double expectedBeauty(int[] low, int[] high) {
    this.n    = low.length;
    this.low  = low;
    this.high = high;

    this.memo = new double[n][90][90];

    double e  = exp(0, 0, 0);

    debug("e", e);

    return e;
  }

  double exp(int a1, int a2, int i) {
    if (i == n) { return a1 == 0 ? 0 : Math.abs(a1 - a2); }

    int lo = low[i];
    int hi = high[i];
    int b  = a1 == 0 ? 0 : Math.abs(a1 - a2);

    double p = 1.0 / (hi - lo + 1);
    double s = (hi - lo + 1) * p * b;

    for (int a = lo; a < hi + 1; a++) {
      s += p * exp(a2, a, i + 1);
    }

    return s;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
