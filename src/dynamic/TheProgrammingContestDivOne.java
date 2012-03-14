package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 502 Division I Level Two - 500
// dynamic programming, greedy
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11357&rd=14431
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+502
public class TheProgrammingContestDivOne {
  int n;
  int T;
  int[][] memo;
  Item[] items;

  public int find(int T, int[] maxPoints, int[] pointsPerMinute, int[] requiredTime) {
    this.T = T;
    this.n = maxPoints.length;
    this.items = new Item[n];
    this.memo = new int[n][T + 1];

    for (int i = 0; i < n; i++) {
      Arrays.fill(memo[i], -1);
    }

    for (int i = 0; i < n; i++) {
      items[i] = new Item(maxPoints[i], pointsPerMinute[i], requiredTime[i]);
    }

    Arrays.sort(items, new ItemCompare());

    return solve(0,0);
  }

  int solve(int k, int t) {
    if (k == n    ) { return 0; }
    if (t >= T + 1) { return 0; }
    if (memo[k][t] > -1) { return memo[k][t]; }

    long tk = items[k].req;
    long wk = items[k].max - (t + tk) * items[k].ppm;

    long res = 0;
    if (tk + t <= T) {
      res = Math.max(wk + solve(k + 1, (int)(t + tk)), solve(k + 1, t));
    } else {
      res = solve(k + 1, t);
    }

    memo[k][t] = (int)res;
    return (int)res;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }

  class ItemCompare implements Comparator<Item> {
    public int compare(Item a, Item b) {
      long x = a.req * a.ppm + (a.req + b.req) * b.ppm;
      long y = b.req * b.ppm + (a.req + b.req) * a.ppm;
      return Long.valueOf(x).compareTo(y);
    }
  }

  class Item {
    public final long ppm;
    public final long req;
    public final long max;

    public Item(long max, long ppm, long req) {
      this.max = max;
      this.ppm = ppm;
      this.req = req;
    }
  }
}
