package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 627 Division II Level Three - 1000
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13256&rd=16008
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+627
public class BubbleSortWithReversals {
  public int getMinSwaps(int[] A, int K) {
    int[][] F = new int[51][51];
    int n = A.length;

    for (int x = n - 1; x >= 0; x--) {
      for (int k = 0; k <= K; k++) {
        int[] B = first(A, x);
        F[x][k] = countSwaps(B, x) + F[x + 1][k];

        if (k >= 1) {
          for (int y = x + 1; y < n; y++) {
            B = first(A, y);
            reverse(B, x, y);
            F[x][k] = Math.min(F[x][k], countSwaps(B, x) + F[y + 1][k - 1]);
          }
        }
      }
    }

    return F[0][K];
  }

  private void reverse(int[] A, int s, int e) {
    while (s < e) {
      swap(A, s, e);
      s++;
      e--;
    }
  }

  private int[] first(int[] A, int x) {
    int[] B = new int[x + 1];
    for (int i = 0; i <= x; i++) {
      B[i] = A[i];
    }
    return B;
  }

  private int countSwaps(int[] A, int x) {
    int n = A.length;
    int c = 0;

    for (int i = x; i < n; i++) {
      for (int j = 0; j < i; j++) {
        if (A[j] > A[i]) {
          c++;
        }
      }
    }

    return c;
  }

  private void swap(int[] A, int i, int j) {
    int temp = A[i];
    A[i] = A[j];
    A[j] = temp;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
