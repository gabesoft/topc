package topc.search;

import java.util.*;
import java.io.*;

// SRM 604 Division II Level One - 250
// simple search, iteration, string manipulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12953&rd=15837
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+604
public class FoxAndWord {
  public int howManyPairs(String[] words) {
    int n = words.length;

    int c = 0;
    for (int i = 0; i < n - 1; i++) {
      for (int j = i + 1; j < n; j++) {
        if (check(words[i], words[j])) {
          c++;
        }
      }
    }

    return c;
  }

  private boolean check(String x, String y) {
    if (x.length() != y.length()) { return false; }
    if (x.length() < 2) { return false; }

    int n = x.length();
    for (int i = 1; i < n; i++) {
      String s1 = x.substring(0, i);
      String s2 = x.substring(i, n);
      String z = s2 + s1;

      if (z.compareTo(y) == 0) {
        return true;
      }
    }

    return false;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
