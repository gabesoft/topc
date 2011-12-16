package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 189 Division I Level Two - 600
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=2369&rd=4765
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm189
public class ScheduleResources {
  int[] A;
  int[] B;
  int[][] memo;
  int N;

  public int schedule(int[] A, int[] B) {
    this.A = A;
    this.B = B;
    this.N = A.length;
    this.memo = new int[(1 << N) + 1][];
    //return solve(0)[1];
    return solve();
  }

  int solve() {
    int[] asum = new int[1 << N];
    int[] best = new int[1 << N];
    Arrays.fill(best, Integer.MAX_VALUE);

    best[0] = 0;
    for (int i = 0; i < best.length; i++) {
      for (int j = 0; j < N; j++) {
        if ((i >> j & 1) == 0) {
          asum[i | 1 << j] = asum[i] + A[j];
          best[i | 1 << j] = Math.min(best[i | 1 << j], Math.max(asum[i | 1 << j], best[i]) + B[j]);
        }
      }
    }

    return best[best.length - 1];
  }

  int[] solve(int selected) {
    if (selected == (1 << (N + 1)) - 1) { return new int[] {}; }
    if (memo[selected] != null) { return memo[selected]; }

    int best = Integer.MAX_VALUE;
    int besta = 0;
    int bestb = 0;

    for (int i = 0; i < N; i++) {
      if ((selected >> i & 1) == 1) { continue; }
      int[] rest = solve(selected | (1 << i));

      int a = rest[0];
      int b = rest[1];
      int x = A[i];
      int y = B[i];

      int ba = a + x;
      int bb = b + y + Math.max(0, x - (b - a));

      if (ba + bb < best) {
        best = ba + bb;
        besta = ba;
        bestb = bb;
      }
    }

    memo[selected] = new int[] {besta, bestb};
    return memo[selected];
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
