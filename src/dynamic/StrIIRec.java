package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 545 Division I Level One - 275
// dynamic programming, greedy, search
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12025&rd=14737
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+545
public class StrIIRec {
  public String recovstr(int n, int minInv, String minStr) {
    String letters = "";

    for (int i = 0; i < n; i++) {
      letters += (char)('a' + i);
    }

    return rec(letters, minInv, minStr);
  }

  private String rec(String letters, int minInv, String minStr) {
    if (letters.length() == 0) { return ""; }

    int n = letters.length();
    for (int i = 0; i < n; i++) {
      if (minStr.length() > 0 && minStr.charAt(0) > letters.charAt(i)) {
        continue;
      }

      int ninv = Math.max(minInv - i, 0);
      int nn = letters.length() - 1;

      if (nn * (nn - 1) / 2 >= ninv) {
        String nletters = letters.substring(0, i) + letters.substring(i + 1);
        String nminStr = "";

        if (minStr.length() > 0 && minStr.charAt(0) == letters.charAt(i)) {
          nminStr = minStr.substring(1);
        }

        return letters.charAt(i) + rec(nletters, ninv, nminStr);
      }
    }

    return "";
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
