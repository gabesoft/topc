package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 527 Division I Level Three - 1050
// dynamic programming, math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11155&rd=14552
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+527
public class P8XCoinChange {
  static public final long MOD = 1000003;

  public int solve(long coins_sum, long[] values) {
    int n = values.length;
    long[][][] step = new long[n][][];

    step[0] = Matrix.unit(n);
    for (int i = 1; i < n; i++) {
      long div = values[i] / values[i - 1];
      step[i] = Matrix.mul(initMatrix(n, i), Matrix.pow(step[i - 1], div, MOD), MOD);
    }

    long[][] total = Matrix.unit(n);
    for (int i = n - 1; i >= 0; i--) {
      long length = coins_sum / values[i];
      coins_sum %= values[i];
      total = Matrix.mul(Matrix.pow(step[i], length, MOD), total, MOD);
    }

    long res = 0;
    for (int i = 0; i < n; i++) {
      res += total[0][i];
    }

    return (int)(res % MOD);
  }

  long[][] initMatrix(int n, int start) {
    long[][] m = Matrix.unit(n);
    for (int i = 0; i < start; i++) { m[i][start] = 1; }
    return m;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}

class Matrix {
  public static long[][] pow(long[][] m, long k, long mod) {
    if (k == 0) { return unit(m.length); }
    if (k % 2 == 0) {
      return pow(mul(m, m, mod), k / 2, mod);
    } else {
      return mul(m, pow(m, k - 1, mod), mod);
    }
  }

  public static long[][] mul(long[][] a, long[][] b, long mod) {
    int n = a.length;
    long[][] c = new long[n][n];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        long sum = 0;
        for (int k = 0; k < n; k++) {
          sum += a[i][k] * b[k][j];
        }
        c[i][j] = sum % mod;
      }
    }

    return c;
  }

  public static long[][] unit(int n) {
    long[][] u = new long[n][n];
    for (int i = 0; i < n; i++) { u[i][i] = 1; }
    return u;
  }
}
