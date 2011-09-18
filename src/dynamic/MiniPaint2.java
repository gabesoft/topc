package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 178 Division I Level Three - 1000
// dynamic programming
// http://community.topcoder.com/stat?c=problem_statement&pm=1996&rd=4710
public class MiniPaint2 {
  static public final int S = 3010; // max strokes
  int N;  // rows
  int M;  // columns

  public int leastBad(String[] picture, int maxStrokes) {
    N = picture.length;
    M = picture[0].length();
    int[] best = new int[S];

    for (int i = 0; i < N; i++) {
      int[] row = getRow(picture[i]);
      int[] curr = new int[S];

      for (int j = 0; j < S; j++) {
        curr[j] = best[j] + M;
      }

      for (int j = 0; j < row.length; j++) {
        for (int k = j; k < S; k++) {
          curr[k] = Math.min(curr[k], best[k - j] + row[j]);
        }
      }

      best = curr;
    }

    return best[maxStrokes];
  }

  int[] getRow(String s) {
    int[][] w = new int[M + 1][M + 1];

    for (int i = 0; i < M + 1; i++) { w[i][0] = i; }

    for (int i = 1; i < M + 1; i++) {
      for (int j = 0; j < M; j++) {
        w[i][j] = w[i - 1][j] + 1;
      }

      int countB = 0;
      int countW = 0;

      for (int b = i - 1; b > -1; b--) {
        if (s.charAt(b) == 'B') {
          countB++;
        } else {
          countW++;
        }

        int countMin = Math.min(countB, countW);
        for (int k = 1; k < M + 1; k++) {
          w[i][k] = Math.min(w[i][k], w[b][k - 1] + countMin);
        }
      }
    }

    //debug("s", s);
    //debug("w[M]", w[M]);
    
    return w[M];
  }

  void debug(Object...os) {
    System.out.println(Arrays.deepToString(os));
  }
}
