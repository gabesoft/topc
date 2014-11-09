package topc.easy;

import java.util.*;
import java.io.*;

// SRM 554 Division II Level One - 250
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12160&rd=15176
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+554
public class TheBrickTowerEasyDivTwo {
  public int find(int redCount, int redHeight, int blueCount, int blueHeight) {
    HashSet<Integer> set = new HashSet<Integer>();

    for (int r = 0; r < redCount + 1; r++) {
      for (int b = 0; b < blueCount + 1; b++) {
        if ((r > 0 || b > 0) && (Math.abs(r - b) <= 1)) {
          set.add(r * redHeight + b * blueHeight);
        }
      }
    }

    return set.size();
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
