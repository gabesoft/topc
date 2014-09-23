package topc.easy;

import java.util.*;
import java.io.*;

// SRM 581 Division II Level One - 250
// brute force, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12589&rd=15501
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+581
public class BlackAndWhiteSolitaire {
  public int minimumTurns(String cardFront) {
    int n = cardFront.length();
    int a = 0;
    int b = 0;

    for (int i = 0; i < n; i++) {
      if (i % 2 == 0) {
        a += cardFront.charAt(i) == 'B' ? 0 : 1;
        b += cardFront.charAt(i) == 'B' ? 1 : 0;
      } else {
        a += cardFront.charAt(i) == 'W' ? 0 : 1;
        b += cardFront.charAt(i) == 'W' ? 1 : 0;
      }
    }

    return Math.min(a, b);
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
