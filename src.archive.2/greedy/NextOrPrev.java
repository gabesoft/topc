package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 572 Division II Level Two - 500
// greedy, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12454&rd=15492
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+572
public class NextOrPrev {
  public int getMinimum(int nextCost, int prevCost, String start, String goal) {
    char[] sc = start.toCharArray();
    char[] gc = goal.toCharArray();

    for (int i = 0; i < sc.length; i++) {
      for (int j = i + 1; j < sc.length; j++) {
        if (sc[j] < sc[i]) {
          swap(sc, j, i);
          swap(gc, j, i);
        }
      }
    }

    int cost = 0;
    for (int i = 0; i < sc.length; i++) {
      if (i != 0 && gc[i] <= gc[i - 1]) {
        return -1;
      }
      if (sc[i] < gc[i]) {
        cost += nextCost * (gc[i] - sc[i]);
      } else {
        cost += prevCost * (sc[i] - gc[i]);
      }
    }

    return cost;
  }

  private void swap(char[] a, int i, int j) {
    char c = a[i];
    a[i] = a[j];
    a[j] = c;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
