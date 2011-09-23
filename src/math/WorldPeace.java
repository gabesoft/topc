package topc.math;

import java.util.*;
import java.io.*;

// SRM 204 Division I Level Three - 1000
// advanced math, math, sorting
// http://community.topcoder.com/stat?c=problem_statement&pm=2420&rd=5850
public class WorldPeace {
  public long numGroups(int k, int[] countries) {
    long groups = 0;
    int n = countries.length;
    int m = n - k;

    Arrays.sort(countries);
    while (countries[m] > 0) {
      int increment = (countries[m] + 999) / 1000;

      for (int i = m; i < n; i++) {
        countries[i] = countries[i] - increment;
      }
      groups += increment;

      Arrays.sort(countries);
    }

    return groups;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
