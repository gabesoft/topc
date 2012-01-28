package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 526.5 Division II Level Three - 1000
// dynamic programming, greedy, sorting
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11674&rd=14762
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+526.5
public class MagicNaming {
  int[][] cache;
  String name;

  public int maxReindeers(String magicName) {
    name  = magicName;
    cache = new int[magicName.length()][magicName.length()];
    return getCount(0, 0);
  }

  int getCount(int index, int prev) {
    if (index == name.length()) { return 0; }
    if (cache[index][prev] > 0) { return cache[index][prev]; }

    String p = name.substring(prev, index);
    String s = name.substring(index, name.length());

    int best = 1;
    for (int i = index + 1; i < name.length(); i++) {
      if (name.charAt(i) < name.charAt(index)) { continue; }

      String s1 = name.substring(index, i);
      String s2 = name.substring(i, name.length());

      boolean c1 = p.compareTo(s1) <= 0 || (p + s1).compareTo(s1 + p) < 0;
      boolean c2 = s.compareTo(s2 + s1) <= 0;

      if (c1 && c2) { best = Math.max(best, 1 + getCount(i, index)); }
    }

    cache[index][prev] = best;
    return best;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
