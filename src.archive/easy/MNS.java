package topc.easy;

import java.util.*;
import java.io.*;

// SRM 148 Division I Level Two - 450
// brute force, recursion, search
// http://community.topcoder.com/stat?c=problem_statement&pm=1744&rd=4545
public class MNS {
  int N;  // number of elements
  int S;  // solution count

  public int combos(int[] numbers) {
    N = numbers.length;
    Arrays.sort(numbers);
    backtrack(new int[N], numbers, new boolean[N], -1);
    return S;
  }

  void backtrack(int[] a, int[] data, boolean[] used, int k) {
    if (k == N - 1) {
      process(a);
    } else {
      k = k + 1;
      int last = -1;
      for (int i = 0; i < N; i++) {
        if (!used[i] && data[i] != last) {
          boolean[] next = used.clone();
          next[i] = true;
          a[k] = data[i];
          last = data[i];
          backtrack(a, data, next, k);
        }
      }
    }
  }

  void process(int[] a) {
    boolean magic = true;

    int sum = a[0] + a[3] + a[6];

    magic &= sum == a[1] + a[4] + a[7];
    magic &= sum == a[2] + a[5] + a[8];

    magic &= sum == a[0] + a[1] + a[2];
    magic &= sum == a[3] + a[4] + a[5];
    magic &= sum == a[6] + a[7] + a[8];

    if (magic) { S++; }
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
