package topc.dynamic;

import java.util.*;
import java.io.*;

// TCO14 Round 2A Division I Level One - 250
// dynamic programming, greedy
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13174&rd=15978
// editorial: http://apps.topcoder.com/wiki/display/tc/TCO+2014+Round+2a
public class SixteenBricks {
  int[] factors = { -4, -4, -2, -2, -2, -2, 0, 0, 4, 4, 4, 4, 4, 4, 4, 4 };

  public int maximumSurface(int[] height) {
    Arrays.sort(height);

    int res = 16;

    for (int i = 0; i < 16; i++) {
      res += factors[i] * height[i];
    }

    return res;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
