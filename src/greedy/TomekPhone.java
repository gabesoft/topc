package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 560 Division I Level One - 250
// greedy, sorting
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12296&rd=15182
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+560
public class TomekPhone {
  public int minKeystrokes(int[] frequencies, int[] keySizes) {
    Arrays.sort(frequencies);

    int n = frequencies.length;
    int m = keySizes.length;
    int depth[] = new int[m];

    int p = 0;
    int cnt = 0;

    for (int i = n - 1; i > -1; i--) {
      int c = 0;

      while (keySizes[p] == 0 && c <= m) {
        p += 1;
        p %= m;
        c++;
      }

      if (keySizes[p] == 0) {
        return -1;
      }

      keySizes[p]--;
      depth[p]++;

      cnt += frequencies[i] * depth[p];
      p += 1;
      p %= m;
    }

    return cnt;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
