package topc.search;

import java.util.*;
import java.io.*;

// SRM 596 Division II Level One - 250
// simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12836&rd=15708
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+596
public class FoxAndSightseeing {
  public int getMin(int[] position) {
    int n = position.length;

    int best = Integer.MAX_VALUE;
    for (int skip = 1; skip < n - 1; skip++) {
      int dist = 0;
      int last = 0;
      for (int i = 1; i < n; i++) {
        if (i != skip) {
          dist += Math.abs(position[i] - position[last]);
          last = i;
        }

      }

      best = Math.min(best, dist);
    }

    return best;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
