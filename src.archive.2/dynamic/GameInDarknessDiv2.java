package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 588 Division II Level Three - 1000
// dynamic programming, simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12710&rd=15700
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+588
public class GameInDarknessDiv2 {
  int dr[] = new int[] { 1, -1, 0, 0 };
  int dc[] = new int[] { 0, 0, -1, 1 };
  int dp[][][];
  char M[][];
  int F[][];
  int n;
  int m;

  public String check(String[] field, String[] moves) {
    n = field.length;
    m = field[0].length();
    M = new char[n][];

    for (int i = 0; i < n; i++) {
      M[i] = field[i].toCharArray();
    }

    int ra = -1;
    int ca = -1;
    int rb = -1;
    int cb = -1;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (M[i][j] == 'A') {
          ra = i;
          ca = j;
        } else if (M[i][j] == 'B') {
          rb = i;
          cb = j;
        }
      }
    }

    String mm = join(moves);
    F = new int[mm.length() + 1][2];
    F[0][0] = ra;
    F[0][1] = ca;
    for (int i = 1; i < F.length; i++) {
      char c = mm.charAt(i - 1);
      if (c == 'U') {
        F[i][0] = F[i - 1][0] - 1;
        F[i][1] = F[i - 1][1];
      }
      if (c == 'R') {
        F[i][0] = F[i - 1][0];
        F[i][1] = F[i - 1][1] + 1;
      }
      if (c == 'L') {
        F[i][0] = F[i - 1][0];
        F[i][1] = F[i - 1][1] - 1;
      }
      if (c == 'D') {
        F[i][0] = F[i - 1][0] + 1;
        F[i][1] = F[i - 1][1];
      }
    }

    dp = new int[n][m][F.length];

    return f(rb, cb, 1) ? "Bob wins" : "Alice wins";
  }

  private boolean f(int rb, int cb, int k) {
    if (F[k - 1][0] == rb && F[k - 1][1] == cb) { return false; }
    if (k == F.length) { return true; }
    if (dp[rb][cb][k] > 0) { return dp[rb][cb][k] == 2; }

    int nra = F[k][0];
    int nca = F[k][1];

    if (nra == rb && nca == cb) { return false; }

    for (int i = 0; i < dr.length; i++) {
      int nrb = rb + dr[i];
      int ncb = cb + dc[i];

      if (canMove(nrb, ncb) && f(nrb, ncb, k + 1)) {
        dp[rb][cb][k] = 2;
        return true;
      }
    }

    dp[rb][cb][k] = 1;
    return false;
  }

  private boolean canMove(int r, int c) {
    return 0 <= r && r < n && 0 <= c && c < m && M[r][c] != '#';
  }

  String join(String[] input) {
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < input.length; i++) {
      builder.append(input[i]);
    }
    return builder.toString();
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
