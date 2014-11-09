package topc.easy;

import java.util.*;
import java.io.*;

// SRM 331 Division II Level Three - 1000
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=7261&rd=10011
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm331
public class ChristmasTree {
  public long decorationWays(int N, int red, int green, int blue) {
    return ways(N, red, green, blue);
  }

  long ways(int n, int r, int g, int b) {
    if (r < 0 || g < 0 || b < 0) { return 0; }
    if (n == 0) { return 1; }

    long sum = 0;

    sum += level(n, 1) * ways(n - 1, r - n, g, b);
    sum += level(n, 1) * ways(n - 1, r, g - n, b);
    sum += level(n, 1) * ways(n - 1, r, g, b - n);

    if (n % 2 == 0) {
      int k = n / 2;
      sum += level(n, 2) * ways(n - 1, r - k, g - k, b);
      sum += level(n, 2) * ways(n - 1, r - k, g, b - k);
      sum += level(n, 2) * ways(n - 1, r, g - k, b - k);
    }

    if (n % 3 == 0) {
      int k = n / 3;
      sum += level(n, 3) * ways(n - 1, r - k, g - k, b - k);
    }

    return sum;
  }

  long level(int n, int c) {
    return fact(n) / (long)Math.pow(fact(n / c), c);
  }

  long fact(int n) {
    return n <= 1 ? 1 : n * fact(n - 1);
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
