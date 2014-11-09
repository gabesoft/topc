package topc.math;

import java.util.*;
import java.io.*;

// SRM 542 Division II Level Three - 950
// simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11929&rd=14734
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+542
public class StrangeDictionary {
  public double[] getExpectedPositions(String[] words) {
      int n        = words.length;
      double[] res = new double[n];

      char[][] v = new char[n][words[0].length()];

      for (int i = 0; i < n; i++) {
          for (int j = 0; j < v[0].length; j++) {
              v[i][j] = words[i].charAt(j);
          }
      }

      for (int i = 0; i < n; i++) {
          for (int j = i + 1; j < n; j++) {
              double diff = 0;
              double jwin = 0;

              for (int k = 0; k < v[i].length; k++) {
                  if (v[i][k] != v[j][k]) {
                      diff++;
                      jwin += v[i][k] < v[j][k] ? 1 : 0;
                  }
              }

              res[i] += (diff - jwin) / diff;
              res[j] += jwin / diff;
          }
      }

      return res;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
