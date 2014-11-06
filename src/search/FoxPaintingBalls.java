package topc.search;

import java.util.*;
import java.io.*;

// SRM 552 Division I Level One - 250
// simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12146&rd=15174
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+552
public class FoxPaintingBalls {
  public long theMax(long R, long G, long B, long N) {

    long sum = R + G + B;
    long mod = N % 3;
    long min = Math.min(R, Math.min(G, B));
    long x = (N * (N + 1) / 2) / 3L;

    if (N == 1) { return sum; }
    if (mod == 0 || mod == 2) { return min / x; }

    long l = 0;
    long r = sum;
    long m = 0;

    while (l <= r) {
      m = (l + r) / 2;
      if (min / x >= m && sum - 3 * x * m >= m) {
        l = m + 1;
      } else {
        r = m - 1;
      }
    }

    return l - 1;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
