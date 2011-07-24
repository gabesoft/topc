package topc.dp;

import java.util.*;

// 2003 TCCC Semifinals 3 (dynamic programming)
public class ZigZag {
  public int longestZigZag(int[] seq) {
    int n = seq.length;
    int[] longest = new int[n];
    int[] diff = new int[n];

    longest[0] = 1;
    diff[0] = seq[0];
    if (n > 1) {
      longest[1] = 2;
      diff[1] = seq[1] - seq[0];
    }

    for (int i = 2; i < n; i++) {
      int curr = seq[i] - seq[i-1];
      diff[i] = curr != 0 ? curr : diff[i-1];
      longest[i] = curr * diff[i-1] < 0 ? longest[i-1] + 1 : longest[i-1];
    }

    return longest[n-1];
  }

  void debug(Object...os) {
    System.out.println(Arrays.deepToString(os));
  }

}
