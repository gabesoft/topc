package topc.easy;

import java.util.*;
import java.io.*;

// SRM 593 Division II Level One - 250
// brute force, string manipulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12780&rd=15705
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+593
public class RaiseThisBarn {
  public int calc(String str) {
    int n = str.length();
    int k = 0;

    for (int i = 0; i < n; i++) {
      if (str.charAt(i) == 'c') {
        k++;
      }
    }

    if (k % 2 == 1) { return 0; }

    int m = 0;
    int r = 0;
    for (int i = 0; i < n - 1; i++) {
      if (str.charAt(i) == 'c') {
        m++;
      }
      if (m == k / 2) {
        r++;
      }
    }

    return r;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
