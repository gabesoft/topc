package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 555 Division II Level Three - 955
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12189&rd=15177
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+555
public class MuddyRoad2 {
  public static final int MOD = 555555555;
  int W[] = null;

  public int theCount(int N, int muddyCount) {
    W = new int[2 * N - muddyCount + 3];

    Arrays.fill(W, -1);

    int cnt[][] = new int[muddyCount + 1][N - muddyCount + 3];

    for (int s = -1; s < cnt[0].length - 1; s++) {
      cnt[0][s + 1] = even(s + 1) ? 1 : 0;
    }

    for (int x = 2; x < N; x++) {
      int curr[][] = new int[cnt.length][cnt[0].length];

      for (int s = cnt[0].length - 3; s > -2; s--) {
        curr[0][s + 1] = even(s == -1 ? -1 : s + x) ? 1 : 0;

        for (int m = 1; m < cnt.length; m++) {
          curr[m][s + 1] += cnt[m][s == -1 ? 0 : s + 2];
          curr[m][s + 1] += cnt[m - 1][even(s) ? 0 : 1];
          curr[m][s + 1] %= MOD;
        }
      }

      cnt = curr;
    }

    return cnt[muddyCount][2];
  }

  private int ways(int x) {
    if (x == 0) { return 0; }
    if (x == 1) { return 1; }
    if (W[x] > -1) { return W[x]; }

    W[x] = ways(x - 1) + ways(x - 2);
    return W[x];
  }

  private boolean even(int x) {
    return x <= 0 || ways(x) % 2 == 0;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
