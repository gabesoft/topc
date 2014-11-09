package topc.easy;

import java.util.*;
import java.io.*;

// SRM 554 Division II Level Two - 500
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12162&rd=15176
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+554
public class TheBrickTowerMediumDivTwo {
  int[] p;
  int[] r;
  int[] h;
  int n = 0;
  int dist = 0;

  public int[] find(int[] heights) {
    n = heights.length;
    p = new int[n];
    h = heights;
    dist = 1 << 30;

    for (int i = 0; i < n; i++) {
      p[i] = i;
    }

    perm(0);

    return r;
  }

  private void calc() {
    int d = 0;
    for (int i = 1; i < n; i++) {
      d += Math.max(h[p[i - 1]], h[p[i]]);
    }
    if (d < dist) {
      dist = d;
      r = p.clone();
    }
    if (d == dist && Arrays.toString(r).compareTo(Arrays.toString(p)) > 0) {
      r = p.clone();
    }
  }

  private void perm(int x) {
    if (x == n) {
      calc();
    } else {
      for (int i = x; x < n; x++) {
        swap(i, x);
        perm(i + 1);
        swap(i, x);
      }
    }
  }

  private void swap(int i, int j) {
    int t = p[i];
    p[i] = p[j];
    p[j] = t;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
