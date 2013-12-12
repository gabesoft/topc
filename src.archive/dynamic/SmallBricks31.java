package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 523 Division II Level Three - 1000
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11549&rd=14548
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+523
public class SmallBricks31 {
  static final long MOD = 1000000007L;
  int w;
  long[][] memo;

  public int countWays(int w, int h) {
    this.w = w;
    this.memo = new long[h + 1][1 << w];

    for (int i = 0; i < h + 1; i++) { Arrays.fill(memo[i], -1); }
    return (int)ways(h, (1 << w) - 1);
  }

  long ways(int h, int prevRow) {
    if (h == 0) { return 1; }
    if (memo[h][prevRow] > -1) { return memo[h][prevRow]; }
    memo[h][prevRow] = backtrack(h, prevRow, 0, 0);
    return memo[h][prevRow];
  }

  long backtrack(int h, int prevRow, int x, int currRow) {
    if (x == w) { return ways(h - 1, currRow); }

    boolean b1 = (prevRow >> x & 1) == 1;
    boolean b2 = (prevRow >> (x + 1) & 1) == 1;
    boolean b3 = (prevRow >> (x + 2) & 1) == 1;

    // no brick
    long res = backtrack(h, prevRow, x + 1, currRow);
    
    // 1x1x1 brick
    if (b1) {
      res += backtrack(h, prevRow, x + 1, currRow | (1 << x));
    }

    // 1x1x2 brick
    if (b1 && b2) {
      res += backtrack(h, prevRow, x + 2, currRow | (1 << x) | (1 << (x + 1)));
    }

    // 1x1x3 brick
    if (b1 && b3) {
      res += backtrack(h, prevRow, x + 3, currRow | (1 << x) | (1 << (x + 1)) | (1 << (x + 2)));
    }

    return res % MOD;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
