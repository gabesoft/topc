package topc.easy;

import java.util.*;
import java.io.*;

// SRM 623 Division I Level One - 300
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13209&rd=15856
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+623
public class UniformBoard {
  int[][][] total;

  public int getBoard(String[] board, int K) {
    int w = board.length;
    int h = board[0].length();

    char[] chars = new char[] { '.', 'A', 'P' };

    total = new int[chars.length][][];

    for (int k = 0; k < chars.length; k++) {
      int[][] t = new int[w + 1][h + 1];

      for (int i = 1; i <= w; i++) {
        for (int j = 1; j <= h; j++) {
          int x = board[i - 1].charAt(j - 1) == chars[k] ? 1 : 0;
          t[i][j] = x + t[i - 1][j] + t[i][j - 1] - t[i - 1][j - 1];
        }
      }

      total[k] = t;
    }

    int A = rect(1, 0, w, 0, h);
    int E = rect(0, 0, w, 0, h);

    int res = 0;

    for (int x0 = 0; x0 < w; x0++) {
      for (int y0 = 0; y0 < h; y0++) {
        for (int x1 = x0 + 1; x1 <= w; x1++) {
          for (int y1 = y0 + 1; y1 <= h; y1++) {

            int area  = (y1 - y0) * (x1 - x0);
            int empty = rect(0, x0, x1, y0, y1);
            int pear  = rect(2, x0, x1, y0, y1);

            if ((A >= area) && (pear == 0 || E > 0)) {
              if (empty + 2 * pear <= K) {
                res = Math.max(res, area);
              }
            }
          }
        }
      }
    }

    return res;
  }

  private int rect(int ch, int x0, int x1, int y0, int y1) {
    int[][] t = total[ch];
    return t[x1][y1] - t[x0][y1] - t[x1][y0] + t[x0][y0];
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
