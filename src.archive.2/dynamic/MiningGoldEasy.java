package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 610 Division II Level Three - 1000
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12931&rd=15843
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+610
public class MiningGoldEasy {
  int[][][] dp;
  int[] ER;
  int[] EC;
  int N;
  int M;

  public int GetMaximumGold(int N, int M, int[] event_i, int[] event_j) {
    this.N = N;
    this.M = M;
    this.ER = event_i;
    this.EC = event_j;
    this.dp = new int[50][50][51];

    for (int i = 0; i < dp.length; i++) {
      for (int j = 0; j < dp[i].length; j++) {
        Arrays.fill(dp[i][j], -1);
      }
    }

    int best = 0;
    for (int a = 0; a < ER.length; a++) {
      for (int b = 0; b < EC.length; b++) {
        best = Math.max(best, f(a, b, 0));
      }
    }

    return best;
  }

  private int f(int a, int b, int d) {
    if (dp[a][b][d] > -1) { return dp[a][b][d]; }
    if (d == ER.length) { return 0; }

    int v = N + M - Math.abs(ER[a] - ER[d]) - Math.abs(EC[b] - EC[d]);
    int best = 0;

    for (int na = 0; na < ER.length; na++) {
      best = Math.max(best, v + f(na, b, d + 1));
    }

    for (int nb = 0; nb < EC.length; nb++) {
      best = Math.max(best, v + f(a, nb, d + 1));
    }

    dp[a][b][d] = best;

    return best;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
