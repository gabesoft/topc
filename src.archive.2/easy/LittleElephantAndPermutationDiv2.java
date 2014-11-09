package topc.easy;

import java.util.*;
import java.io.*;

// SRM 592 Division II Level Two - 500
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12759&rd=15704
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+592
public class LittleElephantAndPermutationDiv2 {
  long total;

  public long getNumber(int N, int K) {
    int A[] = new int[N];
    for (int i = 1; i <= N; i++) {
      A[i - 1] = i;
    }

    total = 0;
    rec(0, A, K, 0);

    for (int i = 1; i <= N; i++) {
      total *= i;
    }

    return total;
  }

  // generate all permutations and process
  private void rec(int p, int[] A, int K, int magic) {
    if (p == A.length) {
      if (magic >= K) {
        total++;
      }
    } else {
      for (int i = p; i < A.length; i++) {
        swap(A, i, p);

        int x = Math.max(p + 1, A[p]);
        rec(p + 1, A, K, magic + x);

        swap(A, i, p);
      }
    }
  }

  private void swap(int[] a, int i, int j) {
    int t = a[i];
    a[i] = a[j];
    a[j] = t;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
