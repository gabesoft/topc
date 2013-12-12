package topc.easy;

import java.util.*;
import java.io.*;

// SRM 218 Division I Level Two - 650
// brute force, recursion
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=3057&rd=5864
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm218
public class Reconstruct {
  int n;
  int[][] dst;
  int[][] pts;

  public String[] findPoints(String[] dists) {
    n = dists.length;
    dst = new int[n][n];

    for (int i = 0; i < n; i++) {
      String[] nums = dists[i].split("\\s+");
      for (int j = 0; j < nums.length; j++) {
        dst[i][j] = Integer.parseInt(nums[j]);
      }
    }

    this.pts = null;
    int[][] pts = new int[n][];

    pts[0] = new int[] { 0, 0, 0 };

    for (int x = 0; x < 32; x++) {
      for (int y = 0; y < 32; y++) {
        for (int z = 0; z < 32; z++) {

          if (find(pts, new int[] { x, y, z }, 1)) {
            String[] res = new String[n];
            for (int i = 0; i < n; i++) {
              int[] pt = this.pts[i];
              res[i] = String.format("%s %s %s", pt[0], pt[1], pt[2]);
            }
            return res;
          }

        }
      }
    }

    return new String[] { };
  }

  boolean find(int[][] pts, int[] pt, int next) {
    if (next == n) {
      this.pts = pts;
      return true;
    }

    for (int i = 0; i < next; i++) {
      if (dist(pts[i], pt) != dst[next][i]) { return false; };
    }

    pts[next] = pt;

    for (int x = -31; x < 32; x++) {
      for (int y = -31; y < 32; y++) {
        for (int z = -31; z < 32; z++) {
          if (find(pts, new int[] { x, y, z }, next + 1)) { return true; }
        }
      }
    }

    return false;
  }

  int dist(int[] p1, int[] p2) {
    int d = 0;
    for (int i = 0; i < p1.length; i++) {
      d += (p1[i] - p2[i]) * (p1[i] - p2[i]);
    }
    return d;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
