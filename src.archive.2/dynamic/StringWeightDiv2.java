package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 586 Division II Level Three - 1000
// dynamic programming, string manipulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12695&rd=15698
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+586
public class StringWeightDiv2 {
  public static final int MOD = 1000000009;
  long dp[][] = null;

  public int countMinimums(int L) {
    dp = new long[27][L + 1];

    for (int i = 0; i < dp.length; i++) {
      Arrays.fill(dp[i], -1);
    }

    long res = 1;
    if (L <= 26) {
      for (int i = 0; i < L; i++) {
        res *= (26 - i);
        res %= MOD;
      }
    } else {
      res = run(26, L);
    }

    return (int)res;
  }

  private long run(int a, int L) {
    if (dp[a][L] > -1) { return dp[a][L]; }
    if (L == 0) { return a == 0 ? 1 : 0; }
    if (a == 1) { return 1; }

    long res = 0;
    for (int i = 1; i <= L; i++) {
      res += (a * run(a - 1, L - i));
      res %= MOD;
    }

    dp[a][L] = res;
    return res;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
