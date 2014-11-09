package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 572 Division II Level Three - 1000
// dynamic programming, simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12384&rd=15492
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+572
public class DistinctRemainders {
  public static final int MOD = 1000000007;
  long N;
  int M;
  long mem[][][];

  public int howMany(long N, int M) {
    this.N = N;
    this.M = M;
    mem = new long[((M - 1) * M) / 2 + 1][M + 1][M + 1];
    return (int)rec(0, 0, 0);
  }

  private long rec(int modSum, int K, int x) {
    if (mem[modSum][K][x] > 0) { return mem[modSum][K][x] - 1; }

    long res = 0;

    if (x == M && K >= 1 && (modSum % M) == (N % M) && N - modSum >= 0) {
      long Q = (N - modSum) / M;
      long r = K;
      for (int i = 1; i <= K - 1; i++) {
        r = (r * ((K - i + Q + MOD) % MOD)) % MOD;
      }
      res = (res + r) % MOD;
    } else if (x < M) {
      res = rec(modSum + x, K + 1, x + 1);
      res += rec(modSum, K, x + 1);
      res %= MOD;
    } 

    mem[modSum][K][x] = res + 1;

    return mem[modSum][K][x] - 1;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
