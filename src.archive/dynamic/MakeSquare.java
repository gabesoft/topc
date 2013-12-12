package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 497 Division II Level Three - 1000
// dynamic programming, string manipulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=8681&rd=14426
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+497
public class MakeSquare {
  public int minChanges(String S) {
    int n = S.length();

    int best = n;
    for (int i = 1; i < n; i++) {
      String s1 = " " + S.substring(0, i);
      String s2 = " " + S.substring(i, n);
      best = Math.min(best, changes(s1, s2));
    }

    return best;
  }

  int changes(String s1, String s2) {
    int n1 = s1.length();
    int n2 = s2.length();
    int[][] dp = new int[n1][n2];

    for (int i = 0; i < n1; i++) {
      dp[i][0] = i;
    }
    for (int i = 0; i < n2; i++) {
      dp[0][i] = i;
    }

    for (int i = 1; i < n1; i++) {
      for (int j = 1; j < n2; j++) {
        int del = dp[i - 1][j] + delete(s1.charAt(i));
        int ins = dp[i][j - 1] + delete(s2.charAt(j));

        dp[i][j] = dp[i - 1][j - 1] + match(s1.charAt(i), s2.charAt(j));
        dp[i][j] = Math.min(dp[i][j], del);
        dp[i][j] = Math.min(dp[i][j], ins);
      }
    }

    return dp[n1 - 1][n2 - 1];
  }

  int match(char c1, char c2) {
    return c1 == c2 ? 0 : 1;
  }

  int delete(int c) {
    return 1;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
