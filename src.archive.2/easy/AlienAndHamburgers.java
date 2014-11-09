package topc.easy;

import java.util.*;
import java.io.*;

// SRM 605 Division I Level One - 250
// brute force, greedy, sorting
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12948&rd=15838
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+605
public class AlienAndHamburgers {
  public int getNumber(int[] type, int[] taste) {
    HashSet<Integer> set = new HashSet<Integer>();
    int n = type.length;
    H[] hs = new H[n];

    for (int i = 0; i < n; i++) {
      hs[i] = new H(type[i], taste[i]);
    }

    Arrays.sort(hs);

    int a = 0;
    for (int i = 0; i < n; i++) {
      if (hs[i].taste >= 0) {
        a += hs[i].taste;
        set.add(hs[i].type);
      }
    }

    int best = set.size() * a;
    for (int i = 0; i < n; i++) {
      if (hs[i].taste < 0 && !set.contains(hs[i].type)) {
        if (best < (set.size() + 1) * (a + hs[i].taste)) {
          a += hs[i].taste;
          set.add(hs[i].type);
          best = set.size() * a;
        }
      }
    }

    return best;
  }

  public class H implements Comparable<H> {
    public int type;
    public int taste;

    public H(int ty, int ts) {
      type = ty;
      taste = ts;
    }

    public int compareTo(H o) {
      return o.taste - taste;
    }
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
