package topc.search;

import java.util.*;
import java.io.*;

// SRM 277 Division II Level Three - 1000
// search, sorting
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=4823&rd=8074
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm277
public class UnionOfIntervals {
  public int nthElement(int[] lowerBound, int[] upperBound, int n) {
    long lo = -2000000000L;
    long hi =  2000000001L;

    while (lo < hi) {
      long mid = lo + (hi - lo + 1) / 2;
      long k = count(lowerBound, upperBound, mid);
      if (k > n) {
        hi = mid - 1;
      } else {
        lo = mid;
      }
    }

    return (int)lo;
  }

  long count(int[] lb, int[] ub, long n) {
    long sum = 0;

    for (int i = 0; i < lb.length; i++) {
      if (lb[i] < n && n <= ub[i]) {
        sum += n - lb[i];
      }
      else if (lb[i] < n) {
        sum += ub[i] - lb[i] + 1;
      }
    }

    return sum;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
