package topc.search;

import java.util.*;
import java.io.*;

// SRM 609 Division II Level One - 250
// simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13004&rd=15842
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+609
public class MagicalStringDiv2 {
  public int minimalMoves(String S) {
    int n = S.length();
    int c = 0;
    for (int i = 0; i < n; i++) {
      if (i < n / 2 && S.charAt(i) == '<') {
        c++;
      }
      if (i >= n / 2 && S.charAt(i) == '>') {
        c++;
      }
    }
    return c;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
