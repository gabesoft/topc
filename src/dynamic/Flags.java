package topc.dynamic;

import java.util.*;
import java.io.*;
import java.math.*;

// SRM 147 Division I Level Three - 1000
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=1206&rd=4540
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm147
public class Flags {
  double[][] M;   // colors matrix
  int N;          // number of colors
  int C;          // number of colors that can be followed by others

  public long numStripes(String numFlags, String[] forbidden) {
    N = forbidden.length;
    initMatrix(forbidden);
    
    C = 0;
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        C += M[i][j]; 
      }
    }

    long n = Long.parseLong(numFlags);
    long lo = 0L;
    long hi = n;

    while (lo < hi) {
      long mid = (hi + lo) / 2L;
      long flags = countFlags(mid);

      if (flags == n) { return mid; }
      if (flags > n) {
        hi = mid;
      } else {
        lo = mid + 1;
      }
    }

    return lo;
  }

  long countFlags(long stripes) {
    if (stripes == 0) { return 0; }
    if (stripes == 1) { return N; }

    if (C <= N) {
      return N + (stripes - 1) * C;
    } else {
      if (stripes >= 1000) { return Long.MAX_VALUE; }

      long[][] dp = new long[(int)stripes][N];
      Arrays.fill(dp[0], 1);

      BigInteger sum = BigInteger.valueOf(N);
      for (int i = 1; i < dp.length; i++) {
        for (int j = 0; j < N; j++) {
          for (int k = 0; k < N; k++) {
            dp[i][j] += dp[i - 1][k] * M[j][k];
          }
          sum = sum.add(BigInteger.valueOf(dp[i][j]));
        }
      }

      return sum.longValue() < 0 ? (long)sum.doubleValue() : sum.longValue();
    }
  }

  void initMatrix(String[] forbidden) {
    M = new double[N][N];

    for (int i = 0; i < N; i++) {
      Arrays.fill(M[i], 1);
    }

    for (int i = 0; i < N; i++) {
      String[] nums = forbidden[i].split("\\s+");
      for (int j = 0; j < nums.length; j++) {
        int k = Integer.parseInt(nums[j]);
        M[i][k] = 0;
      }
    }
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
