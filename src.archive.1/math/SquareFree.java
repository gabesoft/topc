package topc.math;

import java.util.*;
import java.io.*;

// SRM 190 Division I Level Three - 1000
// advanced math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=2342&rd=4770
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm190
public class SquareFree {
  public int getNumber(int n) {
    int[] m = moebius();
    double[][] mx = new double[m.length][2];

    for (int i = 1; i < m.length; i++) {
      mx[i][0] = m[i];
      mx[i][1] = 1.0 / (i * i);
    }

    long hi = 2 * n;
    long lo = n;
    long md = (hi + lo) / 2;

    int q = squareFreeUpTo(mx, md);
    while (lo < hi) {
      if (q < n) {
        lo = md + 1;
      } else {
        hi = md;  
      }
      md = (hi + lo) / 2;
      q = squareFreeUpTo(mx, md);
    }

    return (int)md;
  }

  int squareFreeUpTo(double[][] m, long n) {
    int sum = 0;
    for (int i = 1; i * i <= n; i++) {
      sum += m[i][0] * (int)(n * m[i][1]);
    }
    return sum;
  }

  int[] moebius() {
    int[] data = new int[1 << 16];
    data[1] = 2;

    int p = 2;
    int i = p + p;

    while (i < data.length) {
      int j = 2;

      while (i < data.length) {
        if (j == p) {
          j = 0;
          data[i] = 3;
        } else {
          int x = data[i];
          if (x == 1) { data[i] = 2; } 
          if (x == 2 || x == 0) { data[i] = 1; }
        }
        i += p;
        j += 1;
      }

      p++;
      while (data[p] != 0) { p++; }
      i = p + p;
    }

    for (i = 0; i < data.length; i++) {
      int x = data[i];
      if (x == 3) {
        data[i] = 0;
      } else if (x == 2) {
        data[i] = 1;
      } else {
        data[i] = -1;
      }
    }

    return data;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
