package topc.easy;

import java.util.*;
import java.io.*;

// SRM 593 Division I Level Two - 450
// brute force, dynamic programming, simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12779&rd=15705
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+593
public class MayTheBestPetWin {
  int n;
  int t;
  int s;
  int[] A;
  int[] B;
  int[][] dp;

  public int calc(int[] A, int[] B) {
    this.n = A.length;
    this.A = A;
    this.B = B;

    t = 0;
    s = 0;
    for (int i = 0; i < n; i++) {
      t += B[i];
      s += A[i];
    }

    dp = new int[n][t + 1];
    for (int i = 0; i < dp.length; i++) {
      Arrays.fill(dp[i], -1);
    }

    return f(0, 0);
  }

  private int f(int k, int x) {
    if (x > t) { return Integer.MAX_VALUE; }
    if (k == n) { return Math.max(t - x, x - s); }
    if (dp[k][t - x] > -1) { return dp[k][t - x]; }

    dp[k][t - x] = Math.min(f(k + 1, x), f(k + 1, x + (A[k] + B[k])));
    return dp[k][t - x];
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
