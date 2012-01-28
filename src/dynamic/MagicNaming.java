package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 526.5 Division II Level Three - 1000
// dynamic programming, greedy, sorting
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11674&rd=14762
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+526.5
public class MagicNaming {
  HashMap<String, Integer> cache;

  public int maxReindeers(String magicName) {
    cache = new HashMap<String, Integer>();
    return getCount(magicName, "");
  }

  int getCount(String s, String prev) {
    if (s.length() == 0) { return 0; }

    String key = s + prev;
    if (cache.containsKey(key)) { return cache.get(key); }

    String s1 = "";
    String s2 = "";
    int best = 1;
    int curr = 0;
    for (int i = 1; i < s.length(); i++) {
      if (s.charAt(i) < s.charAt(0)) { continue; }
      s1 = s.substring(0, i);
      s2 = s.substring(i, s.length());
      boolean c2 = s.compareTo(s2 + s1) <= 0;
      boolean c1 = c2 && (prev.compareTo(s1) <= 0 || (prev + s1).compareTo(s1 + prev) < 0);

      if (c1 && c2) {
        curr = 1 + getCount(s2, s1);
        best = Math.max(best, curr);
      }
    }

    cache.put(key, best);
    return best;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
