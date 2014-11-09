package topc.search;

import java.util.*;
import java.io.*;

// SRM 551 Division II Level One - 250
// simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12136&rd=15173
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+551
public class ColorfulBricks {
  public int countLayouts(String bricks) {
    HashSet<Character> set = new HashSet<Character>();

    for (char c : bricks.toCharArray()) {
      set.add(c);
    }

    if (set.size() == 1) {
      return 1;
    }
    if (set.size() == 2) {
      return 2;
    }

    return 0;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
