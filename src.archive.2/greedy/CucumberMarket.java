package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 562 Division II Level One - 250
// brute force, greedy, search, sorting
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12319&rd=15184
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+562
public class CucumberMarket {
  public String check(int[] price, int budget, int k) {
    int n = price.length;

    for (int i = 1; i < 1 << n; i++) {
      if (Integer.bitCount(i) == k) {
        int sum = 0;
        for (int j = 0; j < n; j++) {
          if (((i >> j) & 1) == 1) {
            sum += price[j];
          }
        }
        if (sum > budget) {
          return "NO";
        }
      }
    }

    return "YES";
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
