package topc.easy;

import java.util.*;
import java.io.*;

// SRM 613 Division I Level One - 250
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13005&rd=15846
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+613
public class TaroFriends {
  public int getNumber(int[] coordinates, int X) {
    Arrays.sort(coordinates);

    int best = calc(coordinates, X, -1);

    for (int i = 0; i < coordinates.length; i++) {
      best = Math.min(best, calc(coordinates, X, i));
    }

    return best;
  }

  private int calc(int[] C, int X, int k) {
    int min = 1000000000;
    int max = -1000000000;

    for (int i = 0; i < C.length; i++) {
      int v = C[i];
      if (i <= k) {
        v += X;
      } else {
        v -= X;
      }

      min = Math.min(min, v);
      max = Math.max(max, v);
    }

    return max - min;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
