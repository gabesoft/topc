package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 566 Division II Level Two - 500
// greedy
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12355&rd=15486
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+566
public class PenguinPals {
  public int findMaximumMatching(String colors) {
    int cnt = 0;
    boolean found = true;

    while (found) {
      found = false;
      for (int i = 1; i < colors.length(); i++) {
        if (colors.charAt(i) == colors.charAt(i - 1)) {
          colors = colors.substring(0, i - 1) + colors.substring(i + 1);
          cnt++;
          found = true;
          break;
        }
      }
    }

    cnt += (colors.length() - 1) / 2;

    return cnt;
}

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
