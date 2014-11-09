package topc.easy;

import java.util.*;
import java.io.*;

// SRM 623 Division II Level One - 250
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13208&rd=15856
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+623
public class CatchTheBeatEasy {
  public String ableToCatchAll(int[] x, int[] y) {
    sort(x, y);

    int pos  = 0;
    int time = 0;
    int n    = x.length;

    for (int i = 0; i < n; i++) {
      if (Math.abs(x[i] - pos) > y[i] - time) {
        return "Not able to catch";
      } else {
        time += (y[i] - time);
        pos   = x[i];
      }
    }

    return "Able to catch";
  }

  private void sort(int[] a, int[] b) {
    int n = b.length;

    for (int x = 0; x < n; x++) {
      for (int y = 0; y < n - 1; y++) {
        if (b[y] > b[y + 1]) {
          swap(b, y, y + 1);
          swap(a, y, y + 1);
        }
      }
    }
  }

  private void swap(int[] a, int i, int j) {
    int t = a[i];
    a[i] = a[j];
    a[j] = t;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
