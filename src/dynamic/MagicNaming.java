package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 526.5 Division II Level Three - 1000
// dynamic programming, greedy, sorting
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11674&rd=14762
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+526.5
public class MagicNaming {
  public int maxReindeers(String magicName) {
    String s = magicName;
    int n = magicName.length();
    int[] dp = new int[n];

    for (int i = n - 1; i > -1; i--) {
      dp[i] = 1;

      for (int j = i + 1; j < n; j++) {
        if (s.charAt(i) > s.charAt(j)) { continue; }

        String s1 = s.substring(i, j);
        String s2 = s.substring(j, n);
        if ((s1 + s2).compareTo(s2 + s1) > 0) { continue; }

        dp[i] = Math.max(dp[i], 1 + dp[j]);
      }
    }

    return dp[0];
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
