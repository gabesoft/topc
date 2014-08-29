package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 602 Division I Level One - 250
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12924&rd=15820
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+602
public class TypoCoderDiv1 {
    final int BROWN = 2200;

    int n;
    int D[];
    int memo[][];

    public int getmax(int[] D, int X) {
      this.memo = new int[D.length][BROWN + 1];
      this.D = D;

      for (int i = 0; i < memo.length; i++) {
        Arrays.fill(memo[i], -1);
      }

      return maxChanges(0, X);
    }

    private int maxChanges(int k, int score) {
      if (k == D.length) { return 0; }
      if (k == D.length - 1) { return (score < BROWN && score + D[k] >= BROWN) ? 1 : 0; }
      if (memo[k][score] > -1) { return memo[k][score]; }

      int a = maxChanges(k + 1, Math.max(0, Math.max(0, score - D[k])));
      int b = 0;

      if (score + D[k] < BROWN) {
        b = maxChanges(k + 1, score + D[k]);
      } else if (score + D[k] - D[k + 1] < BROWN) {
        b = 2 + maxChanges(k + 2, Math.max(0, score + D[k] - D[k + 1]));
      }

      memo[k][score] = Math.max(a, b);
      return memo[k][score];
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
