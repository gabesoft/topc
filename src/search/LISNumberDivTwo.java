package topc.search;

import java.util.*;
import java.io.*;

// SRM 585 Division II Level One - 250
// simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12446&rd=15697
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+585
public class LISNumberDivTwo {
  public int calculate(int[] seq) {
    int cnt = 1;
    for (int i = 1; i < seq.length; i++) {
      if (seq[i] <= seq[i - 1]) {
        cnt++;
      }
    }
    return cnt;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
