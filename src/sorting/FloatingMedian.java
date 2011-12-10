package topc.sorting;

import java.util.*;
import java.io.*;

// SRM 310 Division I Level Two - 500
// sorting
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=6551&rd=9990
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm310
public class FloatingMedian {
  int M = 65536;
  int R = 17;
  int[][] tree;

  public long sumOfMedians(int seed, int mul, int add, int N, int K) {
    long[] nums = new long[N + 1];

    tree = new int[R][M];
    nums[0] = (int)seed;
    for (int i = 1; i < N + 1; i++) {
      nums[i] = (nums[i - 1] * mul + add) % M;
    }

    long sum = 0L;
    for (int i = 0; i < N; i++) {
      insert((int)nums[i]);
      if (i >= K) {
        remove((int)nums[i - K]);
      }
      if (i >= K - 1) {
        sum += kth((K + 1) / 2);
      }
    }

    return sum;
  }

  void insert(int x) {
    for (int i = 0; i < R; i++) {
      tree[i][x]++;
      x /= 2;
    }
  }

  void remove(int x) {
    for (int i = 0; i < R; i++) {
      tree[i][x]--;
      x /= 2;
    }
  }

  long kth(int k) {
    int a = 0;
    for(int b = 16; b >= 0; b--) {
      a *= 2;
      if (tree[b][a] < k) {
        k -= tree[b][a];
        a++;
      }
    }
    return a;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
