package topc.math;

import java.util.*;
import java.io.*;

// SRM 604 Division I Level One - 250
// math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12917&rd=15837
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+604
public class PowerOfThree {
  public String ableToGet(int x, int y) {
    x = Math.abs(x);
    y = Math.abs(y);

    while (x != 0 || y != 0) {
      if (x % 3 == 0 && y  % 3 != 0) {
        if (y % 3 == 2) {
          y = (y + 1) / 3;
        } else {
          y = (y - 1) / 3;
        }
        x /= 3;
      } else if (y % 3 == 0 && x % 3 != 0) {
        if (x % 3 == 2) {
          x = (x + 1) / 3;
        } else {
          x = (x - 1) / 3;
        }
        y /= 3;
      } else {
        return "Impossible";
      }
    }

    return "Possible";
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
