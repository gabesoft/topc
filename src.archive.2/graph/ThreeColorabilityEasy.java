package topc.graph;

import java.util.*;
import java.io.*;

// SRM 587 Division II Level Three - 1000
// graph theory
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12699&rd=15699
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+587
public class ThreeColorabilityEasy {
  public String isColorable(String[] cells) {
    int n = cells.length;
    int m = cells[0].length();

    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < m - 1; j++) {
        char c1 = cells[i].charAt(j);
        char c2 = cells[i].charAt(j + 1);
        char c3 = cells[i + 1].charAt(j);
        char c4 = cells[i + 1].charAt(j + 1);

        int eq = 0;

        if (c1 == c2) { eq++; }
        if (c1 == c3) { eq++; }
        if (c1 == c4) { eq++; }

        if (eq == 2 || eq == 0) { return "No"; }
      }
    }

    return "Yes";
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
