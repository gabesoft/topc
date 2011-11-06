package topc.easy;

import java.util.*;
import java.io.*;

// SRM 216 Division I Level Two - 500
// brute force, simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=2986&rd=5862
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm216
public class Refactoring {
  public int refactor(int n) {
    return count(n, 2);
  }

  int count(int n, int factor) {
    int res = 0;
    for (int i = factor; i * i <= n; i++) {
      if (n % i == 0) {
        res += count(n / i, i) + 1;
      }
    }
    return res;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
