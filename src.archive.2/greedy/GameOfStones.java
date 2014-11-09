package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 636 Division II Level One - 250
// greedy, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13480&rd=16079
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+636
public class GameOfStones {
  public int count(int[] stones) {
    Arrays.sort(stones);

    int n = stones.length;
    int cnt = 0;

    while (true) {
      if (stones[0] == stones[n - 1]) {
        return cnt;
      }
      if (stones[n - 1] - stones[0] < 4) {
        return -1;
      }

      stones[0] += 2;
      stones[n - 1] -= 2;
      cnt++;

      Arrays.sort(stones);
    }
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
