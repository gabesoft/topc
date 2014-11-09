package topc.easy;

import java.util.*;
import java.io.*;

// SRM 611 Division II Level One - 250
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13038&rd=15844
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+611
public class InterestingNumber {
  public String isInteresting(String x) {
    boolean ok = true;

    for (int i = 0; i < 10; i++) {
      int cnt = 0;
      int btw = 0;
      boolean started = false;

      for (int j = 0; j < x.length(); j++) {

        if (x.charAt(j) - '0' == i) {
          cnt++;
          started = !started;
        }

        if (x.charAt(j) - '0' != i && started) {
          btw++;
        }
      }

      ok &= (cnt == 0 || (cnt == 2 && btw == i));
    }

    return ok ? "Interesting" : "Not interesting";
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
