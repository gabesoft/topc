package topc.search;

import java.util.*;
import java.io.*;

// TCO14 Round 2C Division I Level One - 300
// greedy, simple search, iteration, string manipulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12516&rd=16016
// editorial: http://apps.topcoder.com/wiki/display/tc/TCO+2014+Round+2c
public class SubstringReversal {
  public int[] solve(String S) {
    char[] chars = S.toCharArray();
    char[] sorted = chars.clone();

    Arrays.sort(sorted);
    int n = chars.length;
    int x = 0;
    int y = 0;

    for (int i = 0; i < n; i++) {
      if (chars[i] == sorted[i]) { continue; }

      x = i;
      String best = S;

      for (int j = i + 1; j < n; j++) {
        if (chars[j] == sorted[i]) {
          if (y == -1) {
            y = j;
          } else {
            String str = reverse(chars.clone(), x, j);

            if (str.compareTo(best) < 0) {
              best = str;
              y = j;
            }
          }
        }
      }

      break;
    }

    return new int[] { x, y };
  }

  private String reverse(char[] chars, int x, int y) {
    int l = (y - x) / 2;
    for (int i = 0; i <= l; i++) {
      char c = chars[x + i];
      chars[x + i] = chars[y - i];
      chars[y - i] = c;
    }
    return new String(chars);
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
