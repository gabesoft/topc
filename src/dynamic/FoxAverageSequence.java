package topc.dynamic;

import java.util.*;
import java.io.*;

// Member SRM 501 Division I Level Two - 500
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11340&rd=14430
// editorial: http://apps.topcoder.com/wiki/display/tc/Algorithm+Problem+Set+Analysis
public class FoxAverageSequence {
  static public final long MOD = 1000000007;
  int[] seq;
  long[][][][] memo;

  public int theCount(int[] seq) {
    this.seq = seq;
    this.memo = new long[seq.length][40 * seq.length][40 + 1][];
    for (int i = 0; i < memo.length; i++) {
      for (int j = 0; j < memo[0].length; j++) {
        for (int k = 0; k < memo[0][0].length; k++) {
          memo[i][j][k] = new long[] { -1, -1 };
        }
      }
    }
    return (int)getCount();
  }

  long getCount() {
    if (seq[0] > -1) {
      return getCount(1, seq[0], seq[0], 1);
    } else {
      long res = 0;
      for (int i = 0; i < 41; i++) {
        long cnt = getCount(1, i, i, 1);
        res += cnt % MOD;
        res %= MOD;
      }
      return res;
    }
  }

  long getCount(int k, int sum, int last, int lt) {
    if (k >= seq.length) { return 1; }
    if (memo[k][sum][last][lt] > -1) { return memo[k][sum][last][lt]; }

    int avg = sum / k;
    if (seq[k] > -1) {
      if (seq[k] > avg) { return 0; }
      if (lt == 1 || (lt == 0 && seq[k] >= last)) {
        int nextlt = lt == 0 ? 1 : (seq[k] < last) ? 0 : 1;
        memo[k][sum][last][lt] = getCount(k + 1, sum + seq[k], seq[k], nextlt) % MOD;
        return memo[k][sum][last][lt];
      } else {
        return 0;
      }
    }

    memo[k][sum][last][lt] = 0;
    if (lt == 1) {
      for (int i = 0; i < last; i++) {
        memo[k][sum][last][lt] += getCount(k + 1, sum + i, i, 0) % MOD;
        memo[k][sum][last][lt] %= MOD;
      }
    }
    for (int i = last; i < avg + 1; i++) {
      memo[k][sum][last][lt] += getCount(k + 1, sum + i, i, 1) % MOD;
      memo[k][sum][last][lt] %= MOD;
    }

    return memo[k][sum][last][lt];
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
