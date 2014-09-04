package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 595 Division II Level Three - 1000
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12623&rd=15707
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+595
public class LittleElephantAndXor {
  public static final int MAX = 30;
  long[][][][] dp;
  int[] dA;
  int[] dB;
  int[] dC;

  public long getNumber(int A, int B, int C) {
    dp = new long[MAX + 1][2][2][2];
    dA = digits(A);
    dB = digits(B);
    dC = digits(C);

    for (int i = 0; i < dp.length; i++) {
      for (int j = 0; j < dp[i].length; j++) {
        for (int k = 0; k < dp[i][j].length; k++) {
          Arrays.fill(dp[i][j][k], -1);
        }
      }
    }

    return rec(MAX, 1, 1, 1);
  }

  private long rec(int t, int eqA, int eqB, int eqC) {
    if (dp[t][eqA][eqB][eqC] > -1) { return dp[t][eqA][eqB][eqC]; }
    if (t == 0) { return 1; }

    long res = 0;

    for (int x = 0; x < 2; x++) {
      for (int y = 0; y < 2; y++) {
        int z = x ^ y;

        if (valid(eqA, x, dA[t - 1]) && valid(eqB, y, dB[t - 1]) && valid(eqC, z, dC[t - 1])) {
          res += rec(t - 1,
              next(eqA, x, dA[t - 1]),
              next(eqB, y, dB[t - 1]),
              next(eqC, z, dC[t - 1]));
        }
      }
    }

    dp[t][eqA][eqB][eqC] = res;
    return res;
  }

  private int next(int eq, int x, int d) {
    return (eq == 1 && x == d) ? 1 : 0;
  }

  private boolean valid(int eq, int x, int d) {
    return eq == 0 || x <= d;
  }

  private int[] digits(int D) {
    int[] d = new int[MAX];
    for (int i = 0;  i < MAX; i++) {
      d[i] = (D & (1 << i)) != 0 ? 1 : 0;
    }
    return d;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
