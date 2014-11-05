package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 553 Division II Level Three - 1000
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11737&rd=15175
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+553
public class SafeRemoval {
  int[][] xs;
  HashMap<String, Integer> map;

  public int removeThem(int[] seq, int k) {
    int sum = 0;
    int len[] = new int[4];

    for (int s : seq) {
      sum += s;
      len[s % 4]++;
    }

    xs = new int[4][];
    for (int i = 0; i < len.length; i++) {
      xs[i] = new int[len[i]];
    }

    int[] is = new int[4];
    for (int s : seq) {
      xs[s % 4][is[s % 4]++] = s;
    }

    for (int[] x : xs) {
      Arrays.sort(x);
    }

    map = new HashMap<String, Integer>();
    return find(new int[4], k, sum);
  }

  private int find(int indx[], int k, int s) {
    if (k == 0) { return s; }

    String key = Arrays.toString(indx) + ":" + k + ":" + s;

    if (map.containsKey(key)) { return map.get(key); }

    int res = -1;

    for (int i = 0; i < indx.length; i++) {
      int j = indx[i];
      if (j < xs[i].length && (s - xs[i][j]) % 4 != 0) {
        indx[i]++;
        res = Math.max(res, find(indx, k - 1, s - xs[i][j]));
        indx[i]--;
      }
    }

    map.put(key, res);
    return res;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
