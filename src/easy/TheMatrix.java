package topc.easy;

import java.util.*;
import java.io.*;

// SRM 610 Division I Level One - 250
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13035&rd=15843
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+610
public class TheMatrix {
  public int MaxArea(String[] board) {
    boolean[][] B = new boolean[board.length][board[0].length()];

    for (int i = 0; i < B.length; i++) {
      for (int j = 0; j < B[0].length; j++) {
        B[i][j] = board[i].charAt(j) == '1';
      }
    }

    int best = 1;

    for (int i = 0; i < B.length; i++) {
      for (int j = 0; j < B[i].length; j++) {
        best = Math.max(best, area(B, i, j));
      }
    }

    return best;
  }

  private int area(boolean[][] B, int r, int c) {
    int n = B.length;
    int m = B[0].length;

    int best = 1;
    int wmax = m + 1;

    for (int i = r; i < n; i++) {
      int h = i - r + 1;
      int wcur = 0;

      if (i > r && B[i][c] == B[i - 1][c]) {
        break;
      }

      for (int j = c; j < m; j++) {
        int w = j - c + 1;

        if ((j > c && B[i][j] == B[i][j - 1]) || (w > wmax)) {
          break;
        }

        wcur = w;
      }

      best = Math.max(best, wcur * h);
      wmax = Math.min(wcur, wmax);
    }

    return best;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
