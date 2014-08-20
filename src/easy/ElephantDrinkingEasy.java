package topc.easy;

import java.util.*;
import java.io.*;

// SRM 611 Division II Level Three - 1000
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13039&rd=15844
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+611
public class ElephantDrinkingEasy {
  int[] D;
  int[] C;
  int[] R;

  public int maxElephants(String[] map) {
    int best = 0;
    int n = map.length;
    int l = 1 << (4 * n);

    D = new int[l];
    C = new int[l];
    R = new int[l];

    Arrays.fill(C, -1);
    Arrays.fill(R, -1);

    for (int i = 0; i < l; i++) {
      if (0 <= i && i < n) {
        C[i] = i;
        D[i] = 1;
      }
      if (n <= i && i < 2 * n) {
        R[i] = i - n;
        D[i] = -1;
      }
      if (2 * n <= i && i < 3 * n) {
        C[i] = i - 2 * n;
        D[i] = -1;
      }
      if (3 * n <= i && i < 4 * n) {
        R[i] = i - 3 * n;
        D[i] = 1;
      }
    }

    for (int i = 1; i < l; i++) {
      int curr = Integer.bitCount(i);
      if (curr > best && can(map, i)) {
        best = curr;
      }
    }

    return best;
  }

  private boolean can(String[] map, int e) {
    int n = map.length;
    int l = 4 * n;

    int used = 0;
    for (int i = 0; i < l; i++) {
      if (off(e, i)) { continue; }

      if (0 <= i && i < n || 2 * n <= i && i < 3 * n) {
        used = col(map, used, i);
      } else {
        used = row(map, used, i);
      }

      if (used == -1) {
        return false;
      }
    }

    return true;
  }

  private int col(String[] map, int used, int e) {
    int c = C[e];
    int d = D[e];
    int n = map[0].length();
    int s = d > 0 ? 0 : n - 1;

    for (int i = s; (d > 0 && i < n) || (d < 0 && i >= 0); i += d) {
      int k = c + i * n;

      if (map[i].charAt(c) == 'Y') {
        return off(used, k) ? (used | (1 << k)) : -1;
      }
      if (off(used, k)) {
        used |= (1 << k);
      } else {
        return -1;
      }
    }

    return -1;
  }

  private int row(String[] map, int used, int e) {
    int r = R[e];
    int d = D[e];
    int n = map.length;
    int s = d > 0 ? 0 : n - 1;

    for (int i = s; (d > 0 && i < n) || (d < 0 && i >= 0); i += d) {
      int k = i + r * n;

      if (map[r].charAt(i) == 'Y') {
        return off(used, k) ? (used | (1 << k)) : -1;
      }
      if (off(used, i + r * n)) {
        used |= (1 << k);
      } else {
        return -1;
      }
    }

    return -1;
  }

  private boolean on(int mask, int k) {
    return ((mask >> k) & 1) == 1;
  }

  private boolean off(int mask, int k) {
    return !on(mask, k);
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
