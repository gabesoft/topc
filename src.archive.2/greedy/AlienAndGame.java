package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 605 Division II Level Two - 500
// brute force, greedy, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12821&rd=15838
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+605
public class AlienAndGame {
  public int getNumber(String[] board) {
    int n = board.length;
    int m = board[0].length();
    boolean[][] B = new boolean[n][m];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        B[i][j] = board[i].charAt(j) == 'B';
      }
    }

    int best = 1;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        int sk = Math.min(n - i - 1, m - j - 1);
        for (int k = sk; k > 0; k--) {
          if (valid(B, i, j, i + k, j + k)) {
            best = Math.max(best, (k + 1) * (k + 1));
            break;
          }
        }
      }
    }

    return best;
  }

  private boolean valid(boolean[][] B, int tr, int tc, int br, int bc) {
    for (int r = tr; r <= br; r++) {
      for (int c = tc + 1; c <= bc; c++) {
        if (B[r][c] != B[r][tc]) {
          return false;
        }
      }
    }

    return true;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
