package topc.search;

import java.util.*;
import java.io.*;

// SRM 563 Division II Level One - 250
// simple search, iteration, simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12334&rd=15185
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+563
public class FoxAndHandleEasy {
  public String isPossible(String S, String T) {
    int n = S.length();
    for (int i = 0; i < n; i++) {
      String s = S.substring(0, i) + S + S.substring(i);
      if (s.equals(T)) {
        return "Yes";
      }
    }

    return "No";
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
