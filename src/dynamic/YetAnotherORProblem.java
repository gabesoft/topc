package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 508 Division I Level Two - 500
// dynamic programming, math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11379&rd=14437
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+508
public class YetAnotherORProblem {
  static public final long MOD = 1000000009;
  long[][] memo;
  long[] R;
  int N;

  public int countSequences(long[] R) {
    this.R = R;
    this.N = R.length;
    this.memo = new long[64][1 << N];
    long res = count(63, (1 << N) - 1);
    return (int)res;
  }

  long count(int t, int eq) {
    if (t == 0) { return 1; }
    if (memo[t][eq] > 0) { return memo[t][eq]; }

    long sum = 0;
    int p = t - 1;

    // all zeros
    int next = 0;
    for (int i = 0; i < N; i++) {
      if ((eq >> i & 1) == 1 && (R[i] >> p & 1) == 0) {
        next = next | (1 << i);
      }
    }
    sum += count(t - 1, next);

    // put a one where possible
    for (int i = 0; i < N; i++) {
      if ((eq >> i & 1) == 1 && (R[i] >> p & 1) == 0) { continue; } 

      next = 0;
      if ((eq >> i & 1) == 1) {
        next = next | (1 << i);
      }

      for (int j = 0; j < N; j++) {
        if (j == i) { continue; }
        if ((eq >> j & 1) == 1 && (R[j] >> p & 1) == 0) {
          next = next | (1 << j);
        }
      }

      sum += count(t - 1, next);
    }

    memo[t][eq] = sum % MOD;
    return memo[t][eq];
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
