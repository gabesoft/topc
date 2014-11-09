package topc.easy;

import java.util.*;
import java.io.*;

// SRM 601 Division II Level Two - 500
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12859&rd=15713
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+601
public class WinterAndCandies {
  public int getNumber(int[] type) {
    int tc[] = new int[51];
    for (int i = 0; i < type.length; i++) {
      tc[type[i]]++;
    }

    int sum = 0;

    for (int k = 1; k < 51; k++) {
      int prod = 1;
      for (int i = 1; i <= k; i++) {
        prod *= tc[i];
      }
      sum += prod;
    }

    return sum;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
