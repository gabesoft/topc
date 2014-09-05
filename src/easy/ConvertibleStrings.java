package topc.easy;

import java.util.*;
import java.io.*;

// SRM 591 Division II Level Two - 500
// brute force, string manipulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12754&rd=15703
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+591
public class ConvertibleStrings {
  int minCost;
  char p[];
  String A;
  String B;

  public int leastRemovals(String A, String B) {
    this.A = A;
    this.B = B;
    this.minCost = A.length();
    this.p = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I' };

    rec(0);

    return minCost;
  }

  private void rec(int x) {
    if (x == 9) {
      ratePermutation();
    } else {
      for (int i = x; i < p.length; i++) {
        swap(x, i);
        rec(x + 1);
        swap(x, i);
      }
    }
  }

  private void ratePermutation() {
    int dif = 0;
    for (int i = 0; i < A.length(); i++) {
      if (p[(int)(A.charAt(i) - 'A')] != B.charAt(i)) {
        dif++;
      }
    }
    minCost = Math.min(minCost, dif);
  }

  private void swap(int i, int j) {
    char t = p[i];
    p[i] = p[j];
    p[j] = t;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
