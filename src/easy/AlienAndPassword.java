package topc.easy;

import java.util.*;
import java.io.*;

// SRM 605 Division II Level One - 250
// brute force, string manipulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12950&rd=15838
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+605
public class AlienAndPassword {
  public int getNumber(String S) {
    HashSet<String> set = new HashSet<String>();

    int n = S.length();
    for (int i = 0; i < n; i++) {
      String s = S.substring(0, i) + S.substring(i + 1, n);
      set.add(s);
    }

    return set.size();
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
