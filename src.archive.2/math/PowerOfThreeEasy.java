package topc.math;

import java.util.*;
import java.io.*;

// SRM 604 Division II Level Two - 500
// math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12952&rd=15837
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+604
public class PowerOfThreeEasy {
  public String ableToGet(int x, int y) {
    return able(x, y, 1) ? "Possible" : "Impossible";
  }

  private boolean able(int x, int y, int s) {
    if (x == 0 && y == 0) { return true; }
    if (x < 0 || y < 0) { return false; }

    return able(x - s, y, s * 3) || able(x, y - s, s * 3);
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
