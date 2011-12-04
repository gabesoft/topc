package topc.easy;

import java.util.*;
import java.io.*;

// SRM 331 Division II Level Three - 1000
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=7261&rd=10011
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm331
public class ChristmasTree {
  final int[][] W = new int[][] { new int[] { 0 },
    new int[] { 1 },
    new int[] { 1, 2 },
    new int[] { 1, 3 },
    new int[] { 1, 2, 4 },
    new int[] { 1, 5 },
    new int[] { 1, 2, 3, 6 },
    new int[] { 1, 7 },
    new int[] { 1, 2, 4, 8 },
    new int[] { 1, 3, 9 },
    new int[] { 1, 2, 5, 10 },
  };

  public long decorationWays(int N, int red, int green, int blue) {
    return ways(N, new int[] { red, green, blue });
  }

  long ways(int n, int[] rgb) {
    long sum = 0;
    for (int i = 0; i < W[n].length; i++) {
      sum += ways(n, W[n][i], rgb);
    }
    return sum;
  }

  long ways(int n, int k, int[] rgb) {
    if (k == 0) { return 1; }

    long sum = 0;
    int c = n / k;

    if (c == 1) {
      for (int i = 0; i < rgb.length; i++) {
        if (rgb[i] >= k) {
          int[] next = rgb.clone();
          next[i] -= k;
          sum += ways(n - 1, next);
        }
      }
    }
    else if (c == 2) {
      for (int i = 0; i < rgb.length; i++) {
        for (int j = i + 1; j < rgb.length; j++) {
          if (i != j && rgb[i] >= k && rgb[j] >= k) {
            int[] next = rgb.clone();
            next[i] -= k;
            next[j] -= k;
            sum += ways(n - 1, next);
          }
        }
      }
    }
    else if (c == 3) {
      if (rgb[0] >= k && rgb[1] >= k && rgb[2] >= k) {
        int[] next = rgb.clone();
        for (int i = 0; i < rgb.length; i++) { next[i] -= k; }
        sum += ways(n - 1, next);
      }
    }

    return fact(n) / (long)Math.pow(fact(k), c) * sum;
  }

  long fact(int n) {
    return n <= 1 ? 1 : n * fact(n - 1);
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
