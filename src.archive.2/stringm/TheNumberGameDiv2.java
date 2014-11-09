package topc.stringm;

import java.util.*;
import java.io.*;
import java.text.*;

// SRM 574 Division II Level Two - 500
// string manipulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12485&rd=15494
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+574
public class TheNumberGameDiv2 {
  public int minimumMoves(int A, int B) {
    String sa = Integer.toString(A);
    String sb = Integer.toString(B);

    return count(sa, sb);
  }

  private int count(String a, String b) {
    if (a.length() == 0) {
      return -1;
    }

    if (!a.contains(b) && !reverse(a).contains(b)) {
      return -1;
    }

    if (a.startsWith(b)) {
      return a.length() - b.length();
    }

    if (reverse(a).contains(b)) {
      return 1 + a.length() - b.length();
    } else {
      return 2 + a.length() - b.length();
    }
  }

  private String reverse(String a) {
    return new StringBuilder(a).reverse().toString();
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
