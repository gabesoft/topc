package topc.search;

import java.util.*;

// SRM 539 Division II Level One - 250
// simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11858&rd=14731
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+539
public class PlatypusPaternity {
  public int maxFamily(String[] femaleCompatibility, String[] maleCompatibility, String[] siblingGroups) {
    int max = 0;
    int n = femaleCompatibility[0].length();

    for (String sib : siblingGroups) {
      boolean hasm = false;
      boolean hasf = false;

      for (String fem : femaleCompatibility) {
        boolean has = true;
        for (int i = 0; i < n; i++) {
          if (sib.charAt(i) == 'Y' && fem.charAt(i) == 'N') {
            has = false;
            break;
          }
        }
        if (has) {
          hasf = true;
          break;
        }
      }

      for (String male : maleCompatibility) {
        boolean has = true;
        for (int i = 0; i < n; i++) {
          if (sib.charAt(i) == 'Y' && male.charAt(i) == 'N') {
            has = false;
            break;
          }
        }
        if (has) {
          hasm = true;
          break;
        }
      }

      if (hasm && hasf) {
        int cnt = 2;
        for (char c : sib.toCharArray()) {
          if (c == 'Y') {
            cnt++;
          }
        }
        max = Math.max(max, cnt);
      }
    }

    return max;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
