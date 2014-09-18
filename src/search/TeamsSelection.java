package topc.search;

import java.util.*;
import java.io.*;

// SRM 586 Division II Level One - 250
// simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12696&rd=15698
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+586
public class TeamsSelection {
  public String simulate(int[] preference1, int[] preference2) {
    int n = preference1.length;
    char[] team = new char[n];
    boolean[] taken = new boolean[n];

    int[][] pref = new int[2][];
    pref[0] = preference1;
    pref[1] = preference2;

    int c = 0;
    for (int i = 0; i < n; i++) {
      int[] p = pref[i % 2];
      int k = 0;
      while (taken[p[k] - 1]) {
        k++;
      }

      taken[p[k] - 1] = true;
      team[p[k] - 1] = (char)((i % 2 + 1) + '0');
    }

    return new String(team);
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
