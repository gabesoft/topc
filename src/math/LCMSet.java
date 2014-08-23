package topc.math;

import java.util.*;
import java.io.*;

// SRM 611 Division I Level One - 250
// math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12918&rd=15844
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+611
public class LCMSet {
  public String equal(int[] A, int[] B) {
    return eq(compress(A), compress(B)) ? "Equal" : "Not equal";
  }

  private boolean eq(ArrayList<Integer> a, ArrayList<Integer> b) {
    if (a.size() != b.size()) { return false; }

    for (int i = 0; i < a.size(); i++) {
      if (a.get(i).compareTo(b.get(i)) != 0) {
        return false;
      }
    }

    return true;
  }

  private ArrayList<Integer> compress(int[] xs) {
    Arrays.sort(xs);

    ArrayList<Integer> ys = new ArrayList<Integer>();
    ys.add(xs[0]);

    for (int x : xs) {
      if (!include(ys, x)) {
        ys.add(x);
      }
    }

    return ys;
  }

  private boolean include(ArrayList<Integer> S, long x) {
    ArrayList<Integer> xs = new ArrayList<Integer>();

    for (int i = 0; i < S.size(); i++) {
      if (x % S.get(i) == 0) {
        xs.add(S.get(i));
      }
    }

    if (xs.size() == 0) { return false; }

    long l = xs.get(0);

    for (int i = 1; i < xs.size(); i++) {
      l = lcm(l, xs.get(i));
    }

    return l == x;
  }

  private long gcd(long x, long y) {
    while (x != 0) {
      long z = x;
      x = y % x;
      y = z;
    }
    return y;
  }

  private long lcm(long x, long y) {
    return x * (y / gcd(x, y));
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
