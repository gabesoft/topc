package topc.easy;

import java.util.*;
import java.io.*;

// SRM 606 Division I Level One - 250
// brute force, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12975&rd=15839
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+606
public class EllysNumberGuessing {
  public int getNumber(int[] guesses, int[] answers) {
    int opts[] = new int[] { guesses[0] + answers[0], guesses[0] - answers[0] };
    int res = -2;

    for (int x : opts) {
      boolean valid = (1 <= x && x <= 1000000000);

      for (int i = 0; i < guesses.length; i++) {
        valid &= Math.abs(guesses[i] - x) == answers[i];
      }

      if (valid) {
        if (res != -2) {
          res = -1;
        } else {
          res = x;
        }
      }
    }

    return res;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
