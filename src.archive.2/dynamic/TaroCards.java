package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 613 Division II Level Three - 1000
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13015&rd=15846
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+613
public class TaroCards {
  long dp[][][];
  int n;
  int K;
  int first[];
  int second[];

  public long getNumber(int[] first, int[] second, int K) {
    dp = new long[1024][51][41];

    for (int i = 0; i < dp.length; i++) {
      for (int j = 0; j < dp[i].length; j++) {
        Arrays.fill(dp[i][j], -1);
      }
    }

    this.first = first;
    this.second = second;
    this.K = K;
    this.n = first.length;

    return f(0, 0, 0);
  }

  private long f(int i, int mask, int r) {
    if (dp[mask][i][r] > -1) { return dp[mask][i][r]; }

    long res = 0;

    if (i == n) {
      res = Integer.bitCount(mask) + r <= K ? 1 : 0;
    } else {
      res = f(i + 1, mask, r);

      int[] o = new int[] { first[i], second[i] };
      int nmask = mask;
      int nr = r;

      for (int c : o) {
        if (c <= 10) {
          nmask |= (1 << (c - 1));
        } else {
          nr++;
        }
      }

      res += f(i + 1, nmask, nr);
    }

    dp[mask][i][r] = res;

    return res;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
