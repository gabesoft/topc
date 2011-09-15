package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 178 Division I Level Three - 1000
// dynamic programming
// http://community.topcoder.com/stat?c=problem_statement&pm=1996&rd=4710
public class MiniPaint {
  byte[][] pic;
  byte[][][] paint;
  int N;
  int M;

  public int leastBad(String[] picture, int maxStrokes) {
    N = picture.length;
    M = picture[0].length();
    pic = new byte[N][M + 1];

    for (int i = 0; i < N; i++) {
      String row = picture[i];
      char prev = row.charAt(0);
      int count = 1;
      int index = 0;
      for (int j = 1; j < M; j++) {
        char curr = row.charAt(j);
        if (prev != curr) {
          pic[i][index++] = (byte)count;
          prev = curr;
          count = 1;
        } else {
          count++;
        }
      }
      pic[i][index++] = (byte)count;

      // strokes needed to paint entire row
      pic[i][M] = (byte)index;    
    }

    computeStrokes();

    // TODO: remove debug code below
    for (int i = 0; i < N; i++) {
      debug("pic[i]", pic[i]);
      for (int k = 0; k < pic[i][M]; k++) {
        debug("\tk", k, paint[i][0][k]);
      }
    }

    return 0;
  }

  void computeStrokes() {
    paint = new byte[N][M][M];

    for (int i = 0; i < N; i++) {
      byte strokes = pic[i][M];
      byte[][] row = paint[i];

      for (int j = strokes - 1; j > -1; j--) {
        for (int k = 0; k < strokes; k++) {

          if (j == strokes - 1) {
            row[j][k] = pic[i][j];
          } else {
            byte prev = k == 0 ? 0 : row[j + 1][k - 1];
            row[j][k] = (byte)Math.max(pic[i][j] + prev, row[j + 1][k]);

            if (j == strokes - 2) { continue; }
            row[j][k] = (byte)Math.max(row[j][k], pic[i][j] + row[j + 2][k]);
          }
        }
      }

      assert row[0][strokes - 1] == M : "compute strokes malfunction";
    }
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
