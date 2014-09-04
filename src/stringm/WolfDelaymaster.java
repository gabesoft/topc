package topc.stringm;

import java.util.*;
import java.io.*;

// SRM 593 Division II Level Two - 500
// string manipulation, string parsing
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12778&rd=15705
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+593
public class WolfDelaymaster {
  public String check(String str) {
    Stack<Character> stack = new Stack<Character>();
    int n = str.length();

    while (str != null && str.length() > 0) {
      if (str.charAt(0) == 'w') {
        str = parse(str);
      }
      if (str != null && str.length() > 0 && str.charAt(0) != 'w') {
        break;
      }
    }

    return (str == null || str.length() > 0) ? "INVALID" : "VALID";
  }

  private String parse(String s) {
    int n = s.length();
    int w = 0;

    for (int i = 0; i < n; i++) {
      if (s.charAt(i) == 'w') {
        w++;
      } else {
        break;
      }
    }

    if (w == 0) { return null; }

    for (int i = 0; i < w; i++) {
      int o = i + w;
      int l = i + 2 * w;
      int f = i + 3 * w;

      if (o >= n || s.charAt(o) != 'o') { return null; }
      if (l >= n || s.charAt(l) != 'l') { return null; }
      if (f >= n || s.charAt(f) != 'f') { return null; }
    }

    return s.substring(w * 4);
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
