package topc.search;

import java.util.*;
import java.io.*;

// SRM 574 Division II Level One - 250
// simple search, iteration, string parsing
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12479&rd=15494
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+574
public class CityMap {
  public String getLegend(String[] cityMap, int[] POIs) {
    int[] cnt = new int[26];

    for (String s : cityMap) {
      for (char c : s.toCharArray()) {
        if (c != '.') {
          cnt[c - 'A']++;
        }
      }
    }

    char[] p = new char[POIs.length];
    for (int i = 0; i < cnt.length; i++) {
      if (cnt[i] > 0) {
        for (int j = 0; j < POIs.length; j++) {
          if (POIs[j] == cnt[i]) {
            p[j] = (char)(i + 'A');
          }
        }
      }
    }

    return new String(p);
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
