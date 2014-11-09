package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 563 Division II Level Three - 1000
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12333&rd=15185
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+563
public class SpellCardsEasy {
  int level[] = null;
  int damage[] = null;
  int n = 0;
  int mem[][] = null;

  public int maxDamage(int[] level, int[] damage) {
    this.level = level;
    this.damage = damage;
    this.n = level.length;
    this.mem = new int[n][n];

    for (int[] m : mem) {
      Arrays.fill(m, -1);
    }

    return max(0, 0);
  }

  private int max(int index, int left) {
    if (left < 0 || left > n - index) { return -1; }
    if (index == n) { return 0; }
    if (mem[index][left] > -1) { return mem[index][left]; }

    int best = max(index + 1, Math.max(0, left - 1));
    int available = n - index - 1;
    int required = level[index] - 1;

    for (int i = available - left; i >= required; i--) {
      int next = max(index + 1, left + i);
      if (next > -1) {
        best = Math.max(best, damage[index] + next);
      }
    }

    mem[index][left] = best;
    return best;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
