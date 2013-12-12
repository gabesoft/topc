package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 517 Division II Level Three - 1000
// dynamic programming, sorting
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11536&rd=14542
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+517
public class CuttingGrass {
  public int theMin(int[] init, int[] grow, int H) {
    int n     = init.length;
    Item[] items = new Item[n];

    for (int i = 0; i < n; i++) {
      items[i] = new Item(init[i], grow[i], i);
    }

    Arrays.sort(items, new GrowCompare());

    int[][] dp = new int[n + 1][n + 1];
    for (int t = 1; t < n + 1; t++) {
      for (int i = 1; i < n + 1; i++) {
        dp[t][i] = Math.max(
            dp[t - 1][i - 1] + items[i - 1].init + t * items[i - 1].grow, 
            dp[t][i - 1]);
      }
    }

    for (int i = 0; i < n + 1; i++) {
      int v = sum(init) + i * sum(grow) - H;
      if (dp[i][n] >= v) { return i; }
    }

    return -1;
  }

  int sum(int[] a) {
    int s = 0;
    for (int i = 0; i < a.length; i++) { s += a[i]; }
    return s;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }

  class GrowCompare implements Comparator<Item> {
    public int compare(Item a, Item b) {
      return Integer.valueOf(a.grow).compareTo(b.grow);
    }
  }

  class Item {
    public final int init;
    public final int grow;

    public Item(int init, int grow, int indx) {
      this.init = init;
      this.grow = grow;
    }
  }
}
