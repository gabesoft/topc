package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 523 Division I Level Two - 500
// dynamic programming, math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11616&rd=14548
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+523
public class BricksN {
  static public final long MOD = 1000000007;

  public int countStructures(int w, int h, int k) {
    long[] G = new long[w + 1];
    G[0] = 1;

    for (int i = 1; i <= w; i++) {
      for (int j = 1; j <= Math.min(k, i); j++) {
        G[i] += G[i - j];
      }
      G[i] %= MOD;
    }

    long[][] F = new long[w + 1][h + 1];
    for (int i = 0; i <= w; i++) { F[i][0] = 1; }
    for (int i = 0; i <= h; i++) { F[0][i] = 1; }

    for (int i = 1; i <= w; i++) {
      for (int j = 1; j <= h; j++) {
        F[i][j] = G[i] * F[i][j - 1] % MOD;
        for (int x = 0; x < i; x++) {
          long mul = G[x] * F[x][j - 1] % MOD;
          F[i][j] += mul * F[i - x - 1][j] % MOD;
        }
        F[i][j] %= MOD;
      }
    }

    return (int)F[w][h];
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
