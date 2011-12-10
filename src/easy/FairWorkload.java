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

    assert partition(0, workers) == binarySearch(workers) : "inconsistent results";
    return partition(0, workers);
  }
  
  int binarySearch(int k) {
    int lo = max(data);
    int hi = sum(data);

    while (lo < hi) {
      int x = lo + (hi - lo) / 2;

      int req = 1;
      int cur = 0;

      for (int i = 0; i < n; i++) {
        if (cur  + data[i] <= x) {
          cur += data[i];
        } else {
          req++;
          cur = data[i];
        }
      }

      if (req <= k) {
        hi = x;
      } else {
        lo = x + 1;
      }
    }

    return lo;
  }

  int max(int[] input) {
    int s = 0;
    for (int i = 0; i < input.length; i++) { s = Math.max(s, input[i]); }
    return s;
  }

  int sum(int[] input) {
    int s = 0;
    for (int i = 0; i < input.length; i++) { s += input[i]; }
    return s;
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
