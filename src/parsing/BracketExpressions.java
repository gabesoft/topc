package topc.parsing;

import java.util.*;
import java.io.*;

// SRM 628 Division II Level Two - 500
// string parsing
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13243&rd=16009
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+628
public class BracketExpressions {
  public String ifPossible(String expression) {
    return valid(expression) ? "possible" : "impossible";
  }

  private boolean valid(String s) {
    if (s.length() == 0) { return true; }
    if (s.length() % 2 == 1) { return false; }

    int n = s.length();

    for (int i = 1; i < n; i++) {
      if (matches(s.charAt(0), s.charAt(i))) {
        String s1 = s.substring(1, i);
        String s2 = s.substring(i + 1, n);

        if (valid(s1) && valid(s2)) { return true; }
      }
    }

    return false;
  }

  private boolean matches(char c1, char c2) {
    if (c1 == '(' && c2 == ')') { return true; }
    if (c1 == '[' && c2 == ']') { return true; }
    if (c1 == '{' && c2 == '}') { return true; }
    if (c1 == '(' && c2 == 'X') { return true; }
    if (c1 == '[' && c2 == 'X') { return true; }
    if (c1 == '{' && c2 == 'X') { return true; }
    if (c1 == 'X' && c2 == ')') { return true; }
    if (c1 == 'X' && c2 == ']') { return true; }
    if (c1 == 'X' && c2 == '}') { return true; }
    if (c1 == 'X' && c2 == 'X') { return true; }
    return false;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
