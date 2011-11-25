package topc.math;

import java.util.*;
import java.io.*;

// SRM 521 Division I Level Three - 1000
// advanced math, recursion
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11512&rd=14546
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+521
public class Chimney {
  long M = 1000000007L;

  public int countWays(long n) {
    long[][] mat = new long[9][9];
    mat[0][5] = 1;
    mat[1][5] = 4;  mat[1][6] = 1;
    mat[2][5] = 8;  mat[2][6] = 2;  mat[2][7] = 1;
    mat[3][5] = 4;  mat[3][6] = 1;
    mat[4][5] = 8;  mat[4][6] = 2;  mat[4][7] = 1; mat[4][8] = 1;
    mat[5][5] = 24; mat[5][6] = 6;  mat[5][7] = 2;
    mat[6][5] = 64; mat[6][6] = 16; mat[6][7] = 6; mat[6][8] = 2;
    mat[7][5] = 64; mat[7][6] = 16; mat[7][7] = 6; mat[7][8] = 2;
    mat[8][5] = 64; mat[8][6] = 16; mat[8][7] = 6; mat[8][8] = 2;
    mat = pow(mat, n);

    long[][] st0 = new long[9][1];
    st0[4][0] = 8;
    st0[5][0] = 24;
    st0[6][0] = 64;
    st0[7][0] = 64;
    st0[8][0] = 64;

    long[][] stn = prod(mat, st0);
    return (int)stn[0][0];
  }

  long[][] pow(long[][] m, long p) {
    assert p > 0 : "zero power";
    if (p == 1) { return m; }

    long[][] m2 = pow(m, p / 2);
    long[][] res = prod(m2, m2);
    return (p % 2 == 0) ? res : prod(res, m);
  }

  long[][] prod(long[][] m1, long[][] m2) {
    assert m1[0].length == m2.length : "invalid matrix dimensions";

    int m = m1.length;
    int n = m2[0].length;
    int o = m1[0].length;

    long[][] res = new long[m][n];
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        for (int k = 0; k < o; k++) {
          res[i][j] += m1[i][k] * m2[k][j];
        }
        res[i][j] = res[i][j] % M;
      }
    }

    return res;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
