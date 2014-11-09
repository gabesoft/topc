package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 612 Division II Level One - 250
// greedy, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13043&rd=15845
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+612
public class LeftAndRightHandedDiv2 {
  public int count(String S) {
    int cnt = 0;

    for (int i = 1; i < S.length(); i++) {
      if (S.charAt(i - 1) == 'R' && S.charAt(i) == 'L') {
        cnt++;
      }
    }

    return cnt;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
