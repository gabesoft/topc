package topc.easy;

import java.util.*;
import java.io.*;

// SRM 223 Division I Level One - 250
// brute force, simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=2989&rd=5869
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm223
public class QuizShow {
  public int wager(int[] scores, int wager1, int wager2) {
    int best = 0;
    int bestw = 0;

    for (int w = 0; w < scores[0] + 1; w++) {
      int curr = 0;

      for (int i = -1; i < 2; i = i + 2) {
        for (int j = -1; j < 2; j = j + 2) {
          for (int k = -1; k < 2; k = k + 2) {
            int currw = scores[0] + (w * i); 
            if (currw > scores[1] + (wager1 * j) && currw > scores[2] + (wager2 * k)) {
              curr++;
            }
          }
        }
      }

      if (curr > best) {
        best = curr;
        bestw = w;
      }
    }

    return bestw;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
