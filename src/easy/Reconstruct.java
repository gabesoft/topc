package topc.easy;

import java.util.*;
import java.io.*;

// SRM 218 Division I Level Two - 650
// brute force, recursion
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=3057&rd=5864
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm218
public class Reconstruct {
  int n;
  int[][] dist;
  int[][][] triple;
  int[][] points;

  public String[] findPoints(String[] dists) {
    n = dists.length;
    dist = new int[n][n];
    for (int i = 0; i < n; i++) {
      String[] nums = dists[i].split("\\s+");
      for (int j = 0; j < nums.length; j++) {
        dist[i][j] = Integer.parseInt(nums[j]);
      }
    }

    triple = new int[1001][72][];
    int[] counts = new int[1001];
    for (int i = 0; i < 32; i++) {
      for (int j = 0; j < 32; j++) {
        for (int k = 0; k < 32; k++) {
          int v = i * i + j * j + k * k;
          if (v <= 1000) {
            int[] t = { i, j, k };
            triple[v][counts[v]++] = t;
          }
        }
      }
    }

    this.points = null;
    int[][] points = new int[n][];
    int d = dist[1][0];

    points[0] = new int[] { 0, 0, 0 };
    for (int i = 0; i < triple[d].length; i++) {
      if (triple[d][i] == null) { break; }
      points[1] = triple[d][i];
      if (find(points, 2)) { break; }
    }

    if (this.points == null) {
      return new String[] { };
    }

    String[] res = new String[n];
    for (int i = 0; i < n; i++) {
      int[] point = this.points[i];
      res[i] = String.format("%s %s %s", point[0], point[1], point[2]);
    }

    return res;
  }

  boolean find(int[][] points, int next) {
    if (next == n) {
      this.points = points;
      return true;
    }

    int[][] trial = getPoints(dist[next][0]);
    for (int i = 0; i < trial.length; i++) {
      int[] point = trial[i];
      boolean ok = true;

      for (int j = 1; j < next; j++) {
        if (!hasDist(points[j], point, dist[next][j])) {
          ok = false;
          break;
        }
      }

      if (ok) {
        points[next] = point;
        if (find(points, next + 1)) { return true; }
      }
    }

    return false;
  }

  int[][] getPoints(int dist) {
    List<Point> points = new ArrayList<Point>();

    for (int i = 0; i < triple[dist].length; i++) {
      if (triple[dist][i] == null) { break; }
      int[] vals = triple[dist][i];
      for (int a = -1; a < 2; a += 2) {
        for (int b = -1; b < 2; b += 2) {
          for (int c = -1; c < 2; c += 2) {
            points.add(new Point(a * vals[0], b * vals[1], c * vals[2]));
          }
        }
      }
    }

    Collections.sort(points);
    int[][] res = new int[points.size()][];

    for (int i = 0; i < res.length; i++) {
      res[i] = points.get(i).toArray();
    }

    return res;
  }

  boolean hasDist(int[] p1, int[] p2, int dist) {
    int d = 0;
    for (int i = 0; i < p1.length; i++) {
      d += (p1[i] - p2[i]) * (p1[i] - p2[i]);
    }
    return d == dist;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }

  class Point implements Comparable<Point> {
    public final int x;
    public final int y;
    public final int z;

    public Point(int x, int y, int z) {
      this.x = x;
      this.y = y;
      this.z = z;
    }

    public int[] toArray() {
      return new int[] { x, y, z };
    }

    public int compareTo(Point other) {
      if (x != other.x) { return Integer.valueOf(x).compareTo(other.x); }
      if (y != other.y) { return Integer.valueOf(y).compareTo(other.y); }
      if (z != other.z) { return Integer.valueOf(z).compareTo(other.z); }
      return 0;
    }
  }
}
