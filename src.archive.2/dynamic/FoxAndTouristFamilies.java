package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 561 Division II Level Three - 1000
// dynamic programming, graph theory, math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11811&rd=15183
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+561
public class FoxAndTouristFamilies {
  int A[] = null;
  int B[] = null;

  public double expectedLength(int[] A, int[] B, int[] f) {
    this.A = A;
    this.B = B;

    int n = A.length + 1;
    double E = 0;

    for (int i = 0; i < A.length; i++) {
      double p = 1;

      for (int j = 0; j < f.length; j++) {
        double x = dfs(f[j], -1, i, false);
        p *= (x / (n - 1));
      }

      E += p;
    }

    return E;
  }

  private int dfs(int x, int parent, int road, boolean through) {
    int total = through ? 1 : 0;

    for (int i = 0; i < A.length; i++) {
      if (A[i] == x || B[i] == x) {
        int y = A[i] == x ? B[i] : A[i];
        if (y != parent) {
          boolean nthrough = through || i == road;
          total += dfs(y, x, road, nthrough);
        }
      }
    }

    return total;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
