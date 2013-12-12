package topc.dynamic;

import java.util.*;
import java.io.*;
import java.math.*;

// SRM 517 Division I Level Two - 600
// dynamic programming, math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11537&rd=14542
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+517
public class AdjacentSwaps {
  static public final long MOD = 1000000007;

  public int theCount(int[] p) {
    int n = p.length;

    long[][] T = new long[n][n];
    long[][] C = binomialCoefficient(n, MOD);
    int[] b = new int[n];
    int[] c = new int[n];

    for (int i = 0; i < n; i++) { T[i][i] = 1; }

    for (int i = n - 1; i > -1; i--) {
      for (int j = i; j < n; j++) {
        if (i == j) {
          T[i][j] = 1;
        } else {
          for (int k = i; k < j + 1; k++) { b[k] = p[k]; }
          Arrays.sort(b, i, j + 1);

          for (int k = i; k < j; k++) {
            for (int q = 0; q < n; q++) { c[q] = 0; }
            for (int q = i; q < k; q++) { c[b[q]] = 1; }
            c[b[k + 1]] = 1;

            boolean ok = true;
            for (int q = i; q < k + 1; q++) { 
              if (c[p[q]] == 0) {
                ok = false;
                break;
              }
            }

            if (ok) {
              long prod = 1;
              prod *= T[i][k] * T[k + 1][j] % MOD;
              prod *= C[j - i - 1][k - i] % MOD;
              prod %= MOD;
              T[i][j] += prod;
              T[i][j] %= MOD;
            }
          }
        }
      }
    }

    return (int)T[0][n - 1];
  }

  public static long[][] binomialCoefficient(long n, long mod) {
    long[][] bc = new long[(int)n + 1][(int)n + 1];
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

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
