package topc.easy;

import java.util.*;
import java.io.*;

// SRM 169 Division I Level Two - 500
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=1901&rd=4650
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm169
public class FairWorkload {
  int n;
  int[] data;

  public int getMostWork(int[] folders, int workers) {
    data = folders;
    n = data.length;
    return partition(0, workers);
  }

  int partition(int s, int k) {
    if (k > n - s + 1) { return -1; }
    if (k == 1) { 
      int sum = 0;
      for (int i = s; i < n; i++) {
        sum += data[i];
      }
      return sum;
    }

    int best = Integer.MAX_VALUE;
    int sum = 0;
    int rest = 0;
    for (int i = s; i < n; i++) {
      sum += data[i];
      rest = partition(i + 1, k - 1);
      if (rest == -1) { break; }
      best = Math.min(best, Math.max(sum, rest));
    }

    return best;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
