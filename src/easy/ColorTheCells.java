package topc.easy;

import java.util.*;
import java.io.*;

// SRM 582 Division II Level Three - 1000
// brute force, simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12581&rd=15502
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+582
public class ColorTheCells {
  int n;
  int best = 1 << 30;
  int T[] = null;
  int time[] = null;
  int dp[][] = null;

  public int minimalTime(int[] dryingTime) {
    n = dryingTime.length;
    T = dryingTime;
    time = new int[n];

    dp = new int[1 << n][n];
    for (int[] d : dp) {
      Arrays.fill(d, 1 << 30);
    }

    search(0, 0, 0);

    return best;
  }

  private void search(int pos, int done, int t) {
    if (done == (1 << n) - 1) {
      best = Math.min(best, t);
      return;
    }
    if (t >= best) { return; }
    if (dp[done][pos] < t) { return; }

    dp[done][pos] = t;

    if (pos + 1 < n) {
      int d = 1 << (pos + 1);
      if ((done & d) == 0) {
        time[pos + 1] = t + 1 + T[pos + 1];
        search(pos, done | d, t + 1);
        time[pos + 1] = 0;
        search(pos + 1, done, t + 1);
      } else {
        if (time[pos + 1] <= t) {
          search(pos + 1, done, t + 1);
        } else {
          search(pos + 1, done, time[pos + 1] + 1);
        }
      }
    }

    if (pos - 1 >= 0) {
      int d = 1 << (pos - 1);
      if ((done & d) == 0) {
        time[pos - 1] = t + 1 + T[pos - 1];
        search(pos, done | d, t + 1);
        time[pos - 1] = 0;
        search(pos - 1, done, t + 1);
      } else {
        if (time[pos - 1] <= t) {
          search(pos - 1, done, t + 1);
        } else {
          search(pos - 1, done, time[pos - 1] + 1);
        }
      }
    }
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
