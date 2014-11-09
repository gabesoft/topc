package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 612 Division II Level Three - 1000
// greedy, math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13042&rd=15845
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+612
public class PowersOfTwo {
  long[][] mem;

  public long count(long[] powers) {
    mem = new long[61][50];

    long[] X = new long[60];
    for (int i = 0; i < X.length; i++) {
      X[i] = count(powers, 1L << i);
    }

    for (int i = 0; i < mem.length; i++) {
      Arrays.fill(mem[i], -1);
    }

    return f(X, 0, 0);
  }

  private long f(long[] X, int k, int b) {
    if (mem[k][b] > -1) { return mem[k][b]; }

    long res = 0;

    if (k == X.length) {
      res = 1;
    } else {
      res = 0;

      int x_k = (int)X[k] + b;
      res += f(X, k + 1, x_k / 2);
      if (x_k > 0) {
        res += f(X, k + 1, (x_k - 1) / 2);
      }
    }

    mem[k][b] = res;
    return res;
  }

  private long count(long[] xs, long x) {
    long cnt = 0;
    for (int i = 0; i < xs.length; i++) {
      if (xs[i] == x) {
        cnt++;
      }
    }
    return cnt;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
