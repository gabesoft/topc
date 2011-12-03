package topc.math;

import java.util.*;
import java.io.*;

// SRM 216 Division I Level Three - 1000
// advanced math, dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=2987&rd=5862
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm216
public class Roxor {
  int[] grundy;
  int[] cache;

  public int[] play(int[] piles) {
    int n  = piles.length;
    grundy = new int[n];
    cache  = new int[(1 << n) + 1];

    Arrays.fill(cache, -1);

    for (int i = 0; i < n; i++) {
      grundy[i] = getGrundy(1 << i, n);
    }
    
    int state = 0;
    for (int i = n - 1; i > -1; i--) {
      state = state << 1;
      state = state | (piles[i] % 2);
    }

    if (!win(state, n)) { return new int[] {}; }

    for (int i = 0; i < n; i++) {
      if (piles[i] == 0) { continue; }
      for (int j = i + 1; j < n; j++) {
        for (int k = j; k < n; k++) {
          int next = state ^ (1 << i) ^ (1 << j) ^ (1 << k);
          if (!win(next, n)) {
            return new int[] { i, j, k };
          }
        }
      }
    }

    return null;
  }

  boolean win(int state, int n) {
    int xor = 0;
    for (int i = 0; i < n; i++) {
      xor ^= (state >> i & 1) * grundy[i];
    }
    return xor != 0;
  }

  int getGrundy(int state, int n) {
    if (cache[state] > -1) { return cache[state]; }

    HashSet<Integer> set = new HashSet<Integer>();

    for (int i = 0; i < n; i++) {
      if ((state >> i & 1) == 0) { continue; }
      for (int j = i + 1; j < n; j++) {
        for (int k = j; k < n; k++) {
          int next = state ^ (1 << i) ^ (1 << j) ^ (1 << k);
          set.add(getGrundy(next, n));
        }
      }
    }

    int res = 0;
    while (set.contains(res)) { res++; }

    cache[state] = res;
    return res;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
