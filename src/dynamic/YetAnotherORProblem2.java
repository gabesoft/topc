package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 508 Division II Level Three - 1000
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11435&rd=14437
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+508
public class YetAnotherORProblem2 {
  static public final long MOD = 1000000009;
  long[][] memo;
  int N;
  int R;

  public int countSequences(int N, int R) {
    this.N = N;
    this.R = R;
    this.memo = new long[31][N + 1];
    long res = count(30, N);
    return (int)res;
  }

  long count(int t, int eq) {
    if (t == 0) { return 1; }
    if (memo[t][eq] > 0) { return memo[t][eq]; }

    long res = 0;
    if (eq == N) {
      if ((R >> (t - 1) & 1) == 1) {
        res += count(t - 1, 0);
        res += count(t - 1, 1) * N;
      } else {
        res += count(t - 1, eq);
      }
    } else if (eq == 1) {
      if ((R >> (t - 1) & 1) == 1) {
        res += count(t - 1, 0);
        res += count(t - 1, 1);
        res += count(t - 1, 0) * (N - 1);
      } else {
        res += count(t - 1, 1);
        res += count(t - 1, 1) * (N - 1);
      }
    } else {
      res += count(t - 1, 0);
      res += count(t - 1, 0) * N;
    }

    memo[t][eq] = res % MOD;
    return memo[t][eq];
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
