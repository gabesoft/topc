package topc.search;

import java.util.*;
import java.io.*;

// SRM 469 Division II Level Three - 900
// simple search, iteration, simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10903&rd=14152
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+469
public class TheMoviesLevelThreeDivTwo {
  public int find(int[] timeJ, int[] timeB) {
      int n   = timeJ.length;
      int sum = 0;

      for (int mask = 0; mask < (1 << n) - 1; mask++) {
          if (good(mask, timeJ, timeB)) {
              sum++;
          }
      }

      return sum;
  }

  boolean good(int mask, int[] timeJ, int[] timeB) {
      return watchesAll(mask, timeJ, timeB) && watchesAll(~mask, timeB, timeJ);
  }

  boolean watchesAll(int mask, int[] time1, int[] time2) {
      int n = time1.length;
      int t = 0;

      for (int i = 0; i < n; i++) {
          if ((mask & (1 << i)) > 0) {
              t += time1[i];
          }
      }

      int t2 = 0;
      for (int i = 0; i < n; i++) {
          if ((mask & (1 << i)) == 0) {
              t2 += time2[i];
              if (t2 <= t) {
                  t += time1[i];
              } else {
                  return false;
              }
          }
      }

      return true;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
