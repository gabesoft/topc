package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 548 Division II Level Three - 1000
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11869&rd=15170
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+548
public class KingdomAndPassword {
  long INF = Long.MAX_VALUE;
  int n = 0;
  int restricted[] = null;
  int digits[] = null;
  long old[][] = null;
  long base[] = null;
  long dp[][] = null;

  public long newPassword(long oldPassword, int[] restrictedDigits) {
    ArrayList<Integer> dg = new ArrayList<Integer>();

    long x = oldPassword;
    while (x > 0) {
      dg.add((int)(x % 10));
      x /= 10;
    }

    restricted = restrictedDigits;
    n = dg.size();
    digits = new int[n];

    for (int i = 0; i < n; i++) {
      digits[i] = dg.get(n - i - 1);
    }

    old = new long[2][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= i; j++) {
        old[0][i] *= 10;
        old[0][i] += digits[j];
      }
      for (int j = i; j < n; j++) {
        old[1][i] *= 10;
        old[1][i] += digits[j];
      }
    }

    base = new long[n];
    for (int k = 0; k < n; k++) {
      base[k] = 1;
      for (int i = k + 1; i < n; i++) {
        base[k] *= 10;
      }
    }

    dp = new long[1 << n][2];
    for (long[] d2 : dp) {
      Arrays.fill(d2, -2);
    }

    long r1 = find(0, 1);
    long r2 = find(0, 0);

    if (Math.abs(oldPassword - r1) < Math.abs(oldPassword - r2)) {
      return r1;
    }
    if (Math.abs(oldPassword - r2) < Math.abs(oldPassword - r1)) {
      return r2;
    }

    return Math.min(r1, r2);
  }

  private long find(int taken, int dir) {
    int k = dir == 0 ? n - Integer.bitCount(taken) - 1 : Integer.bitCount(taken);

    if (k == -1) { return 0; }
    if (k == n) { return 0; }
    if (dp[taken][dir] > -2) { return dp[taken][dir]; }

    long best = INF;
    long rest = -1;

    for (int i = 0; i < n; i++) {
      if (on(taken, i) || restricted[k] == digits[i]) {
        continue;
      }

      long next = find(taken | (1 << i), dir);

      if (next == -1) {
        continue;
      }

      long curr = dir == 0 ? next * 10 + digits[i] : digits[i] * base[k] + next;
      long d = Math.abs(old[dir][k] - curr);

      if (d < best ) {
        best = d;
        rest = curr;
      }
      if (d == best && curr < rest) {
        rest = curr;
      }
    }

    dp[taken][dir] = rest;
    return rest;
  }

  private boolean on(int mask, int k) {
    return ((mask >> k) & 1) == 1;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
