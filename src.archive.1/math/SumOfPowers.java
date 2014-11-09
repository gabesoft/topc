package topc.math;

import java.util.*;
import java.io.*;

// SRM 397 Division I Level Two - 500
// advanced math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=8725&rd=12169
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm397
public class SumOfPowers {
  static public final long MOD = 1000000007;

  public int value(int n, int k) {
    long[][] bc = Util.binomialCoefficient(k, MOD);
    long[][] m  = new long[k + 2][k + 2];

    m[0][0] = 1;
    for (int i = 1; i < k + 2; i++) {
      m[0][i] = bc[k][i - 1];
    }

    for (int i = 1; i < k + 2; i++) {
      for (int j = i; j < k + 2; j++) {
        m[i][j] = bc[k - i + 1][j - i];
      }
    }

    m = Matrix.pow(m, n - 1, MOD);

    long[][] v = new long[k + 2][1];
    for (int i = 0; i < k + 2; i++) {
      v[i][0] = 1;
    }

    long[][] r = Matrix.mul(m, v, MOD);
    return (int)r[0][0];
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}

class Util {
  public static long[][] binomialCoefficient(int n, long mod) {
    long[][] bc = new long[n + 1][n + 1];
    if (mod == 1) { return bc; }

    for (int i = 0; i < n + 1; i++) {
      bc[i][0] = 1;
      for (int j = 1; j < i + 1; j++) {
        bc[i][j] = bc[i - 1][j - 1] + bc[i - 1][j];
        bc[i][j] = (bc[i][j] >= mod) ? (bc[i][j] - mod) : bc[i][j];
      }
    }

    return bc;
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
    assert a[0].length == b.length : "invalid matrix dimensions";

    int n = a.length;
    int m = b[0].length;
    long[][] c = new long[n][m];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        long sum = 0;
        for (int k = 0; k < n; k++) {
          sum += a[i][k] * b[k][j] % mod;
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
