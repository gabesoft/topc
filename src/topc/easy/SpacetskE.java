package topc.easy;

import java.util.*;

// SRM 545 Division II Level Three - 1000
// brute force, math, search
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12030&rd=14737
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+545
public class SpacetskE {
  public static final int MOD = 1000000007;

  public int countsets(int L, int H, int K) {
    if (K == 1) {
      return (L + 1) * (H + 1);
    }

    int C[][] = new int[300][300];
    for (int i = 0; i < C.length; i++) {
      C[i][0] = 1;
      for (int j = 1; j <= i; j++) {
        C[i][j] = (C[i - 1][j - 1] + C[i - 1][j]) % MOD;
      }
    }

    int res = 0;
    for (int x0 = 0; x0 <= L; x0++) {
      for (int dx = -L; dx <= L; dx++) {
        for (int dy = 1; dy <= H; dy++) {
          if (gcd(dx, dy) != 1) { continue; }

          int t = 0;
          int x = x0;
          int y = 0;
          while (x >= 0 && x <= L && y <= H) {
            t++;
            x += dx;
            y += dy;
          }

          res = (res + C[t][K]) % MOD;
        }
      }
    }

    return res;
  }

  private int gcd(int a, int b) {
    a = Math.abs(a);
    b = Math.abs(b);
    while (b != 0) {
      int c = b;
      b = a % b;
      a = c;
    }
    return a;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
