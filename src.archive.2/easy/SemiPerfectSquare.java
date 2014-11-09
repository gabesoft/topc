package topc.easy;

import java.util.*;
import java.io.*;

// SRM 582 Division II Level One - 250
// brute force, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12580&rd=15502
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+582
public class SemiPerfectSquare {
  public String check(int N) {
    for (int i = 1; i * i <= N; i++) {
      int x = i * i;
      if (N % x == 0 && (N / x) < i) {
        return "Yes";
      }
    }

    return "No";
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
