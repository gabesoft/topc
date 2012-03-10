package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 502 Division II Level Three - 1000
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11352&rd=14431
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+502
public class TheCowDivTwo {
  final long MOD = 1000000007L;

  public int find(int N, int K) {
    long[][][] dp = new long[2][K + 1][N];

    for (int n = N; n > -1; n--) {
      for (int k = 0; k < K + 1; k++) {
        for (int s = 0; s < N; s++) {
          if (k == 0) {
            if (s == 0) {
              dp[n % 2][k][s] = 1;
            } else {
              dp[n % 2][k][s] = 0;
            }
          } else if (n == N) {
            dp[n % 2][k][s] = 0;
          } else {
            dp[n % 2][k][s]  = dp[(n + 1) % 2][k - 1][(s - n + N) % N];
            dp[n % 2][k][s] += dp[(n + 1) % 2][k][s];
            dp[n % 2][k][s] %= MOD;
          }
        }
      }
    }

    return (int)dp[0][K][0];
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
