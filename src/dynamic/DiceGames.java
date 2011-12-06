package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 349 Division I Level Two - 500
// dynamic programming, math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=7601&rd=10673
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm349
public class DiceGames {
  public long countFormations(int[] sides) {
    Arrays.sort(sides);

    int n = sides.length;
    long[] rate = new long[sides[n - 1]];
    long[] dp = new long[n];

    Arrays.fill(rate, 1);
    dp[n - 1] = sides[n - 1];

    for (int i = n - 2; i > -1; i--) {
      long[] temp = new long[sides[i]];
      long value = dp[i + 1];
      for (int j = 0; j < sides[i]; j++) {
        dp[i]   += value;
        temp[j]  = value;
        value   -= rate[j];
      }
      rate = temp;
    }

    return dp[0];
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
