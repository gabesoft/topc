package topc.easy;

import java.util.*;
import java.io.*;

// SRM 584 Division II Level One - 250
// brute force, string manipulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12643&rd=15696
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+584
public class TopFox {
  public int possibleHandles(String familyName, String givenName) {
    HashSet<String> set = new HashSet<String>();

    int n = familyName.length();
    int m = givenName.length();
    
    for (int i = 1; i <= n; i++) {
      String s1 = familyName.substring(0, i);
      for (int j = 1; j <= m; j++) {
        String s2 = givenName.substring(0, j);
        set.add(s1 + s2);
      }
    }

    return set.size();
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
