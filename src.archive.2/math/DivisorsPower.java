package topc.math;

import java.util.*;
import java.io.*;

// SRM 628 Division I Level One - 250
// simple math, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13241&rd=16009
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+628
public class DivisorsPower {
  private long max;

  public long findArgument(long n) {
    this.max = n;
    long lim = Math.min((long)Math.sqrt(n), 999999999);

    for (long i = 2; i <= lim; i++) {
      if (i * i * i > n) {
        i = lim;
      }
      if (n % i == 0) {
        long k = divpow(i);
        if (k == n) {
          return i;
        }
      }
    }

    return -1L;
  }

  private long divpow(long n) {
    long r = n * n;
    for (long i = 2; i * i <= n; i++) {
      if (n % i == 0) {
        if (i * i == n) {
          r *= n;
        } else {
          r *= n;
          r *= n;
        }
        if (r > max) {
          return -1;
        }
      }
    }
    return r;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
