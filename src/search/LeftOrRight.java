package topc.search;

import java.util.*;
import java.io.*;

// SRM 538 Division II Level One - 300
// simple search, iteration, simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11738&rd=14729
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+538
public class LeftOrRight {
  public int maxDistance(String program) {
    String p1 = program.replace("?", "L");
    String p2 = program.replace("?", "R");
    return Math.max(dist(p1), dist(p2));
  }

  private int dist(String str) {
    int min = 0;
    int max = 0;
    int cur = 0;

    for (char s : str.toCharArray()) {
      if (s == 'L') {
        cur--;
      } else {
        cur++;
      }
      min = Math.min(min, cur);
      max = Math.max(max, cur);
    }

    return Math.max(max, -min);
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
