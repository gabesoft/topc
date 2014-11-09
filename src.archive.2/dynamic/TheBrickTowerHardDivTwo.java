package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 554 Division II Level Three - 1000
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12164&rd=15176
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+554
public class TheBrickTowerHardDivTwo {
  public static final int MOD = 1234567891;
  int adj1[] = null;
  int adj2[][] = null;
  long dp[][][] = null;
  int K;

  public int find(int C, int K, int H) {
    int n = C * C * C * C + 1;

    this.K = K;
    this.adj1 = new int[n];
    this.adj2 = new int[n][n];

    int[][][] lvl = new int[n][2][2];

    int l = 1;
    for (int b1 = 1; b1 <= C; b1++) {
      for (int b2 = 1; b2 <= C; b2++) {
        for (int b3 = 1; b3 <= C; b3++) {
          for (int b4 = 1; b4 <= C; b4++) {
            lvl[l][0][0] = b1;
            lvl[l][0][1] = b2;
            lvl[l][1][0] = b3;
            lvl[l][1][1] = b4;
            l++;
          }
        }
      }
    }

    for (int i = 1; i < lvl.length; i++) {
      int[][] lv = lvl[i];
      adj1[i] += (lv[0][0] == lv[0][1] ? 1 : 0);
      adj1[i] += (lv[0][0] == lv[1][0] ? 1 : 0);
      adj1[i] += (lv[1][1] == lv[0][1] ? 1 : 0);
      adj1[i] += (lv[1][1] == lv[1][0] ? 1 : 0);
    }

    for (int i = 1; i < lvl.length; i++) {
      for (int j = 1; j < lvl.length; j++) {
        int[][] lv1 = lvl[i];
        int[][] lv2 = lvl[j];

        adj2[i][j] += (lv1[0][0] == lv2[0][0] ? 1 : 0);
        adj2[i][j] += (lv1[0][1] == lv2[0][1] ? 1 : 0);
        adj2[i][j] += (lv1[1][0] == lv2[1][0] ? 1 : 0);
        adj2[i][j] += (lv1[1][1] == lv2[1][1] ? 1 : 0);
      }
    }

    dp = new long[n][K + 1][H + 1];
    for (long[][] d1 : dp) {
      for (long[] d2 : d1) {
        Arrays.fill(d2, -1);
      }
    }

    long cnt = 0;
    for (int i = 1; i <= H; i++) {
      cnt += count(0, 0, i);
      cnt %= MOD;
    }

    return (int)cnt;
  }

  private long count(int last, int adj, int h) {
    if (adj > K) { return 0; }
    if (h == 0) { return 1; }
    if (dp[last][adj][h] > -1) { return dp[last][adj][h]; }

    long cnt = 0;
    for (int i = 1; i < adj1.length; i++) {
      cnt += count(i, adj + adj1[i] + adj2[last][i], h - 1);
    }

    cnt %= MOD;
    dp[last][adj][h] = cnt;
    return cnt;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
