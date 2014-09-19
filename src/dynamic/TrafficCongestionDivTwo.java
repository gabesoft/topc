package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 585 Division II Level Two - 500
// dynamic programming, math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12697&rd=15697
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+585
public class TrafficCongestionDivTwo {
  long[] dp = new long[61];

  public long theMinCars(long treeHeight) {
    if (treeHeight <= 1) { return 1; }
    if (treeHeight == 2) { return 3; }
    if (dp[(int)treeHeight] > 0) { return dp[(int)treeHeight]; }

    long a = theMinCars(treeHeight - 1);
    long b = theMinCars(treeHeight - 2);

    dp[(int)treeHeight] = Math.min(2 * a, 4 * b) + 1;

    return dp[(int)treeHeight];
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
