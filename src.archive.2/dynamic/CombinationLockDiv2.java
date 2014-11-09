package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 607 Division II Level Three - 1000
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12969&rd=15840
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+607
public class CombinationLockDiv2 {
  int dp[][][];
  int n;
  int d[];

  public int minimumMoves(String s, String t) {
    n = s.length();
    d = new int[n];

    for (int i = 0; i < n; i++) {
      if (s.charAt(i) >= t.charAt(i)) {
        d[i] = s.charAt(i) - t.charAt(i);
      } else {
        d[i] = s.charAt(i) + 10 - t.charAt(i);
      }
    }

    dp = new int[n][451][2];

    for (int i = 0; i < dp.length; i++) {
      for (int j = 0; j < dp[i].length; j++) {
        Arrays.fill(dp[i][j], -1);
      }
    }

    return rec(0, 0, 0);
  }

  private int rec(int p, int x, int up) {
    if (p == n) { return 0; }
    if (dp[p][x][up] > -1) { return dp[p][x][up]; }

    int res = 1000000000;

    for (int nu = 0; nu <= 1; nu++) {
      for (int y = 0;  y <= 450; y++) {
        if (nu == 0) {
          if ((d[p] + 9 * y) % 10 != 0) { continue; }
        } else {
          if ((d[p] + y) % 10 != 0) { continue; }
        }

        int z = 0;
        if (nu != up) {
          z = y;
        } else {
          z = Math.max(y - x, 0);
        }

        res = Math.min(res, z + rec(p + 1, y, nu));
      }
    }

    dp[p][x][up] = res;
    return res;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
