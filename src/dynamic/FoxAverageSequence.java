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
    //this.memo = new long[seq.length][40 * seq.length][40 + 1][];

    //for (int i = 0; i < memo.length; i++) {
    //for (int j = 0; j < memo[0].length; j++) {
    //for (int k = 0; k < memo[0][0].length; k++) {
    //memo[i][j][k] = new long[] { -1, -1 };
    //}
    //}
    //}

    //debug(getCountDP());

    return (int)getCountDP();
  }

  long getCountDP() {
    int maxl = 40 + 1;
    int maxs = 1;
    //int n = seq.length;

    for (int i = 0; i < seq.length; i++) {
      maxs += (seq[i] == -1) ? 40 : seq[i];
    }

    long[][][][] dp = new long[seq.length][maxs][maxl][2];

    // k = 0
    int from  = (seq[0] == -1) ? 0 : seq[0];
    int to    = (seq[0] == -1) ? maxl : seq[0] + 1;
    for (int last = from; last < to; last++) {
      dp[0][last][last][1] = 1;
    }

    // k > 0
    for (int k = 1; k < dp.length; k++) {
      for (int sum = 0; sum < maxs; sum++) {
        from  = (seq[k] == -1) ? 0 : seq[k];
        to    = (seq[k] == -1) ? maxl : seq[k] + 1;
        for (int last = from; last < to; last++) {
          if (last > (sum - last) / k) { break; }

          for (int prev = 0; prev < last + 1; prev++) {
            dp[k][sum][last][1] += dp[k - 1][sum - last][prev][0];
            dp[k][sum][last][1] += dp[k - 1][sum - last][prev][1];
            dp[k][sum][last][1] %= MOD;
          }

          for (int prev = last + 1; prev < maxl; prev++) {
            dp[k][sum][last][0] += dp[k - 1][sum - last][prev][1];
            dp[k][sum][last][1] %= MOD;
          }
        }
      }
    }

    long res = 0;
    for (int sum = 0; sum < maxs; sum++) {
      for (int last = 0; last < maxl; last++) {
        res += dp[seq.length - 1][sum][last][0];
        res += dp[seq.length - 1][sum][last][1];
        res %= MOD;
      }
    }

    return res;
  }

  long getCount() {
    if (seq[0] > -1) {
      return getCount(1, seq[0], seq[0], 1);
    } else {
      long res = 0;
      for (int i = 0; i < 41; i++) {
        res += getCount(1, i, i, 1) % MOD;
        res %= MOD;
      }
      return res;
    }
  }

  long getCount(int k, int sum, int last, int lt) {
    if (k >= seq.length) { return 1; }
    if (memo[k][sum][last][lt] > -1) { return memo[k][sum][last][lt]; }

    int avg = sum / k;
    memo[k][sum][last][lt] = 0;

    if (seq[k] > -1) {

      int i = seq[k];
      if (i <= avg && (lt == 1 || i >= last)) {
        memo[k][sum][last][lt] = getCount(k + 1, sum + i, i, (i < last) ? 0 : 1) % MOD;
      }  

    } else {

      int start = (lt == 1) ? 0 : last;
      for (int i = start; i < avg + 1; i++) {
        memo[k][sum][last][lt] += getCount(k + 1, sum + i, i, (i < last) ? 0 : 1) % MOD;
        memo[k][sum][last][lt] %= MOD;
      }

    }

    return memo[k][sum][last][lt];
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
