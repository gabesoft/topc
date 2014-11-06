package topc.math;

import java.util.*;
import java.io.*;

// SRM 551 Division II Level Three - 950
// advanced math, dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12138&rd=15173
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+551
public class ColorfulCupcakesDivTwo {
  public static final long MOD = 1000000007L;
  long[][][][][] dp;

  public int countArrangements(String cupcakes) {
    int A = 0;
    int B = 0;
    int C = 0;

    for (char c : cupcakes.toCharArray()) {
      if (c == 'A') {
        A++;
      } else if (c == 'B') {
        B++;
      } else if (c == 'C') {
        C++;
      }
    }

    dp = new long[A + 1][B + 1][C + 1][4][4];

    for (long[][][][] d1 : dp) {
      for (long[][][] d2 : d1) {
        for (long[][] d3 : d2) {
          for (long[] d4 : d3) {
            Arrays.fill(d4, -1);
          }
        }
      }
    }

    return (int)count(A, B, C, 0, 0);
  }

  private long count(int a, int b, int c, int first, int last) {
    int sum = a + b + c;
    if (sum == 0) { return 1; }
    if (sum == 1) {
      if (a > 0 && first != 1 && last != 1) {
        return count(a - 1, b, c, first, 1);
      } else if (b > 0 && first != 2 && last != 2) {
        return count(a, b - 1, c, first, 2);
      } else if (c > 0 && first != 3 && last != 3) {
        return count(a, b, c - 1, first, 3);
      } else {
        return 0;
      }
    }
    if (dp[a][b][c][first][last] > -1) { return dp[a][b][c][first][last]; }

    long cnt = 0;
    if (a > 0 && last != 1) {
      cnt += count(a - 1, b, c, first == 0 ? 1 : first, 1);
    }
    if (b > 0 && last != 2) {
      cnt += count(a, b - 1, c, first == 0 ? 2 : first, 2);
    }
    if (c > 0 && last != 3) {
      cnt += count(a, b, c - 1, first == 0 ? 3 : first, 3);
    }

    cnt %= MOD;

    dp[a][b][c][first][last] = cnt;
    return cnt;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
