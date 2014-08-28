package topc.easy;

import java.util.*;
import java.io.*;

// SRM 603 Division I Level One - 250
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12946&rd=15836
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+603
public class MaxMinTreeGame {
  public int findend(int[] edges, int[] costs) {
    int n = costs.length;
    int[] cnt = new int[n];

    for (int i = 0; i < edges.length; i++) {
      cnt[i + 1]++;
      cnt[edges[i]]++;
    }

    int best = 0;
    for (int i = 0; i < n; i++) {
      if (cnt[i] < 2) {
        best = Math.max(best, costs[i]);
      }
    }

    return best;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
