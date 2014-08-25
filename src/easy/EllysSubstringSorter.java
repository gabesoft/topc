package topc.easy;

import java.util.*;
import java.io.*;

// SRM 606 Division II Level One - 250
// brute force, sorting, string manipulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12977&rd=15839
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+606
public class EllysSubstringSorter {
  public String getMin(String S, int L) {
    char[] chars = S.toCharArray();

    String best = S;
    int n = S.length();
    for (int i = 0; i <= (n - L); i++) {
      char[] c = chars.clone();
      Arrays.sort(c, i, i + L);
      String s = new String(c);
      if (s.compareTo(best) < 0) {
        best = s;
      }
    }

    return best;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
