package topc.easy;

import java.util.*;
import java.io.*;

// SRM 606 Division II Level Three - 1000
// brute force, recursion, search
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12394&rd=15839
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+606
public class EllysCandyGame {
  int n;
  int[] S;

  public String getWinner(int[] sweets) {
    n = sweets.length;
    S = sweets;

    int m = 0;
    for (int i = 0; i < n; i++) {
      if (sweets[i] == 0) {
        m |= (1 << i);
      }
    }

    long w = run(1, m);

    if (w > 0) { return "Elly"; }
    if (w < 0) { return "Kris"; }

    return "Draw";
  }

  private long run(long t, int mask) {
    if (mask == (1 << n) - 1) { return 0; }

    long best = (t > 0) ? Integer.MIN_VALUE : Integer.MAX_VALUE;
    for (int i = 0; i < n; i++) {
      if (off(mask, i)) {

        dbl(i);
        long next = t * S[i] + run(t * -1, mask | (1 << i));
        hlf(i);

        best = (t > 0) ? Math.max(best, next) : Math.min(best, next);
      }
    }

    return best;
  }

  private void dbl(int k) {
    if (k + 1 < n) {
      S[k + 1] *= 2;
    }
    if (k - 1 > -1) {
      S[k - 1] *= 2;
    }
  }

  private void hlf(int k) {
    if (k + 1 < n) {
      S[k + 1] /= 2;
    }
    if (k - 1 > -1) {
      S[k - 1] /= 2;
    }
  }

  private boolean off(int mask, int k) {
    return ((mask >> k) & 1) == 0;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
