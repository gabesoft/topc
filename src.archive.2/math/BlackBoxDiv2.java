package topc.math;

import java.util.*;
import java.io.*;

// SRM 602 Division II Level Three - 1000
// math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12929&rd=15820
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+602
public class BlackBoxDiv2 {
  public static final int MOD = 1000000007;

  public int count(String front, String side) {
    int w = 0;
    int h = 0;

    for (char ch : front.toCharArray()) {
      w += (ch == 'B' ? 1 : 0);
    }

    for (char ch : side.toCharArray()) {
      h += (ch == 'B' ? 1 : 0);
    }

    int[][] C = new int[51][51];
    for (int i = 0; i < C.length; i++) {
      C[i][0] = 1;
      for (int j = 1; j <= i; j++) {
        C[i][j] = (C[i - 1][j] + C[i - 1][j - 1]) % MOD;
      }
    }

    long[][] dp = new long[w + 1][h + 1];

    for (int x = 0; x <= w; x++) {
      for (int y = 0; y <= h; y++) {
        if (x == 0) {
          dp[x][y] = (y == 0 ? 1 : 0);
        } else {
          dp[x][y] = 0;
          for (int r = 0; r <= h - y; r++) {
            for (int s = 0; s <= y; s++) {
              if (r + s >= 1) {
                long p = C[y][s];
                p = (p * C[h - y][r]) % MOD;
                dp[x][y] += (p * dp[x - 1][y - s]) % MOD;
              }
            }
          }

          dp[x][y] %= MOD;
        }
      }
    }

    return (int)dp[w][h];
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
