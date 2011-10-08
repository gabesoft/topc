package topc.dynamic;

import java.util.*;
import java.io.*;

// TCCC05 Round 1 Division I Level Two - 450
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=3509&rd=6528
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=tccc05_online_rd_1
public class ChessKnight {
  static public final int B = 8;
  double[][][] memo;

  public double probability(int x, int y, int n) {
    memo = new double[B][B][n + 1];
    return prob(x - 1, y - 1, n);
  }

  double prob(int x, int y, int n) {
    if (n == 0) { return 1; }
    if (memo[x][y][n] > 0) { return memo[x][y][n]; }
    if (memo[y][x][n] > 0) { return memo[y][x][n]; }

    double sum = 0.0;
    for (int a = -2; a <= 2; a = a + 4) {
      for (int b = -1; b <= 1; b = b + 2) {
        int x1 = x + a;
        int y1 = y + b;
        int x2 = x + b;
        int y2 = y + a;
        if (on(x1) && on(y1)) { sum += prob(x1, y1, n - 1); }
        if (on(x2) && on(y2)) { sum += prob(x2, y2, n - 1); }
      }
    }

    double res = sum / 8.0;
    memo[x][y][n] = res;
    memo[y][x][n] = res;

    return res;
  }

  boolean on(int x) {
    return x >= 0 && x < B;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
