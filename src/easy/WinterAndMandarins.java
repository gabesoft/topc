package topc.easy;

import java.util.*;
import java.io.*;

// SRM 601 Division II Level One - 250
// brute force, greedy
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12858&rd=15713
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+601
public class WinterAndMandarins {
  public int getNumber(int[] bags, int K) {
    Arrays.sort(bags);
    int best = Integer.MAX_VALUE;

    for (int i = 0; i + K - 1 < bags.length; i++) {
      best = Math.min(best, bags[i + K - 1] - bags[i]);
    }

    return best;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
