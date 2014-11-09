package topc.dynamic;

import java.util.*;
import java.io.*;

// Member SRM 478 Division II Level Three - 1000
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10562&rd=14187
// editorial: http://apps.topcoder.com/wiki/display/tc/Algorithm+Problem+Set+Analysis
public class RandomAppleEasy {
  public double theRed(int[] red, int[] green) {
    int n    = red.length;

    int rtot = 1;
    int gtot = 1;

    for (int i = 0; i < n; i++) {
      rtot += red[i];
      gtot += green[i];
    }

    long[][] sets = new long[rtot][gtot];
    for (int box = 0; box < n; box++) {

      long[][] temp = new long[rtot][];
      for (int i = 0; i < rtot; i++) {
        temp[i] = sets[i].clone();
      }

      int rbox = red[box];
      int gbox = green[box];

      for (int r = 0; r < rtot - rbox; r++) {
        for (int g = 0; g < gtot - gbox; g++) {
          temp[r + rbox][g + gbox] += sets[r][g];
        }
      }

      temp[rbox][gbox] += 1;
      sets = temp;
    }

    double stot = 0;
    double prob = 0;
    for (int r = 1; r < rtot; r++) {
      for (int g = 0; g < gtot; g++) {
        stot += sets[r][g];
        prob += sets[r][g] * ((double)r / (r + g));
      }
    }

    return prob / stot;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
