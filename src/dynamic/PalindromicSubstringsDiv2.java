package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 607 Division II Level Two - 500
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12967&rd=15840
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+607
public class PalindromicSubstringsDiv2 {
  int dp[][];

  public int count(String[] S1, String[] S2) {
    String s = join(S1) + join(S2);
    char[] chars = s.toCharArray();
    int n = s.length();
    int c = 0;

    dp = new int[n + 1][n + 1];

    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j <= n; j++) {
        if (pali(chars, i, j)) {
          c++;
        }
      }
    }

    return c;
  }

  private boolean pali(char[] s, int a, int b) {
    if (dp[a][b] > 0) { return dp[a][b] == 1; }
    if (b - a <= 1) { return true; }

    boolean res = false;
    if (s[a] == s[b - 1]) {
      res = pali(s, a + 1, b - 1);
    }

    dp[a][b] = res ? 1 : 2;
    return res;
  }

  String join(String[] input) {
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < input.length; i++) {
      builder.append(input[i]);
    }
    return builder.toString();
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
