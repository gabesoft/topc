package topc.math;

import java.util.*;
import java.io.*;

// SRM 611 Division II Level Two - 500
// math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13040&rd=15844
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+611
public class LCMSetEasy {
  public String include(int[] S, int x) {
    ArrayList<Integer> xs = new ArrayList<Integer>();

    for (int i = 0; i < S.length; i++) {
      if (x % S[i] == 0) {
        xs.add(S[i]);
      }
    }

    if (xs.size() == 0) { return "Impossible"; }

    int l = xs.get(0);

    for (int i = 1; i < xs.size(); i++) {
      l = lcm(l, xs.get(i));
    }

    return l == x ? "Possible" : "Impossible";
  }

  private int gcd(int x, int y) {
    while (x != 0) {
      int z = x;
      x = y % x;
      y = z;
    }
    return y;
  }

  private int lcm(int x, int y) {
    return x * (y / gcd(x, y));
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
