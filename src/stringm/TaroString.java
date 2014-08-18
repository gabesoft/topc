package topc.stringm;

import java.util.*;
import java.io.*;

// SRM 613 Division II Level One - 250
// string manipulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13006&rd=15846
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+613
public class TaroString {
  public String getAnswer(String S) {
    int cnt[] = new int[3];
    int idx[] = new int[3];

    int n = S.length();
    for (int i = 0; i < n; i++) {
      if (S.charAt(i) == 'C') {
        cnt[0]++;
        idx[0] = i;
      }
      if (S.charAt(i) == 'A') {
        cnt[1]++;
        idx[1] = i;
      }
      if (S.charAt(i) == 'T') {
        cnt[2]++;
        idx[2] = i;
      }
    }

    return (cnt[0] == 1 && cnt[1] == 1 && cnt[2] == 1 && idx[0] < idx[1] && idx[1] < idx[2]) ? "Possible" : "Impossible";
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
