package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 178 Division I Level Three - 1000
// dynamic programming
// http://community.topcoder.com/stat?c=problem_statement&pm=1996&rd=4710
public class MiniPaint {
  int[][] pic;
  int N;
  int M;

  public int leastBad(String[] picture, int maxStrokes) {
    N = picture.length;
    M = picture[0].length();
    pic = new int[N][M];

    for (int i = 0; i < N; i++) {
      String row = picture[i];
      char prev = row.charAt(0);
      int count = 1;
      int index = 0;
      for (int j = 1; j < M; j++) {
        char curr = row.charAt(j);
        if (prev != curr) {
          pic[i][index++] = count;
          prev = curr;
          count = 0;
        } else {
          count++;
        }
      }
      pic[i][index] = count;
    }
    
    debug("pic", pic);
    return 0;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
