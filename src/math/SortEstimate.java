package topc.math;

import java.util.*;
import java.io.*;

// SRM 230 Division I Level One - 300
// math, search
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=3561&rd=6519
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm230
public class SortEstimate {
  public double howMany(int c, int time) {
    double lo = 1.0;
    double hi = 10.0e8;

    double n = (double)time / c;
    int count = 0;
    while (count++ < 500) {
      double mid = lo + (hi - lo) / 2.0;
      if (mid * Math.log(mid) / Math.log(2.0) > n) {
        hi = mid;
      } else {
        lo = mid;
      }
    }

    return lo;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
