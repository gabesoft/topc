package topc.easy;

import java.util.*;
import java.io.*;

// SRM 595 Division II Level One - 250
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12794&rd=15707
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+595
public class LittleElephantAndBallsAgain {
  public int getNumber(String S) {
    int r = longest(S, 'R');
    int g = longest(S, 'G');
    int b = longest(S, 'B');

    return S.length() - Math.max(r, Math.max(g, b));
  }

  private int longest(String s, char c) {
    int n = s.length();
    int best = 0;

    for (int i = 0; i < n; i++) {
      while (i < n && s.charAt(i) != c) {
        i++;
        continue;
      }

      int cnt = 0;
      while (i < n && s.charAt(i) == c) {
        i++;
        cnt++;
      }

      best = Math.max(best, cnt);
    }

    return best;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
