package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 591 Division II Level Three - 1000
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12750&rd=15703
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+591
public class YetAnotherTwoTeamsProblem {
  public static final int MAX = 1560000;

  public long count(int[] skill) {
    long[] dp = new long[MAX];

    Arrays.sort(skill);
    int n = skill.length;
    int A = 0;

    for (int i = 0; i < n; i++) {
      A += skill[i];
    }

    for (int t = 0; t <= n; t++) {
      for (int s = 0; s < MAX; s++) {
        if (t == 0) {
          dp[s] = s > A / 2.0 ? 1 : 0;
        } else {
          if (s < A / 2.0) {
            dp[s] += dp[s + skill[t  - 1]];
          }
        }
      }
    }

    return dp[0];
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
