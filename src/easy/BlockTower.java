package topc.easy;

import java.util.*;
import java.io.*;

// SRM 559 Division II Level One - 250
// brute force, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12200&rd=15181
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+559
public class BlockTower {
  int n = 0;
  int bh[] = null;

  public int getTallest(int[] blockHeights) {
    n = blockHeights.length;
    bh = blockHeights;
    return count(0, false);
  }

  private int count(int k, boolean prevOdd) {
    if (k >= n) { return 0; }

    if (bh[k] % 2 == 0) {
      return prevOdd ? count(k + 1, true) : bh[k] + count(k + 1, false);
    } else if (prevOdd) {
      return bh[k] + count(k + 1, true);
    } else {
      return Math.max(count(k + 1, false), bh[k] + count(k + 1, true));
    }
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
