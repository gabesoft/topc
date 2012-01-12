package topc.sorting;

import java.util.*;
import java.io.*;

// SRM 371 Division I Level Two - 500
// sorting
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=7726&rd=10787
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm371
public class ChessMatchup {
  int[] us;
  int[] them;
  int[][] memo;

  public int maximumScore(int[] us, int[] them) {
    Arrays.sort(us);
    Arrays.sort(them);

    int n = us.length;
    this.us = us;
    this.them = them;
    this.memo = new int[n][n];

    for (int i = 0; i < n; i++) {
      Arrays.fill(memo[i], -1);
    }

    return getScore(n - 1, n - 1);
  }

  int getScore(int i, int j) {
    if (i < 0 || j < 0) { return 0; }
    if (memo[i][j] > -1) { return memo[i][j]; }

    if (us[i] < them[j]) {
      memo[i][j] = getScore(i, j - 1);
    }
    else if (us[i] == them[j]) {
      memo[i][j] = Math.max(getScore(i - 1, j - 1) + 1, getScore(i, j - 1));
    } else {
      memo[i][j] = getScore(i - 1, j - 1) + 2;
    }

    return memo[i][j];
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
