package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 518 Division II Level Three - 1000
// dynamic programming, simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11473&rd=14543
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+518
public class CoinReversing {
  public double expectedHeads(int N, int[] a) {
    int n = a.length;
    double[] dp = new double[n + 1];

    dp[0] = 1;
    for (int i = 1; i < n + 1; i++) {
      double p1 = N - a[i - 1];
      double p2 = a[i - 1];
      dp[i] = p1 * dp[i - 1] + p2 * (1.0 - dp[i - 1]);
      dp[i] = dp[i] / (double)N;
    }

    return dp[n] * N;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
