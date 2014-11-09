package topc.easy;

import java.util.*;
import java.io.*;

// SRM 574 Division II Level Three - 1000
// brute force, geometry
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12478&rd=15494
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+574
public class PolygonTraversal2 {
  int N = 0;
  boolean visited[];
  int points[];

  public int count(int N, int[] points) {
    this.N = N;
    this.visited = new boolean[N + 1];
    this.points = new int[N];

    for (int i = 0; i < points.length; i++) {
      visited[points[i]] = true;
      this.points[i] = points[i];
    }

    return rec(points.length);
  }

  private int rec(int t) {
    if (t == N) { return cross(points[t - 1], points[0], t) ? 1 : 0; }

    int res = 0;

    for (int i = 1; i <= N; i++) {
      if (!visited[i] && cross(points[t - 1], i, t)) {
        visited[i] = true;
        points[t] = i;
        res += rec(t + 1);
        visited[i] = false;
      }
    }

    return res;
  }

  private boolean cross(int x, int y, int t) {
    if (x > y) {
      int temp = x;
      x = y;
      y = temp;
    }

    boolean good = false;

    for (int i = 0; i + 1 < t; i++) {
      if (points[i] == x || points[i + 1] == x) { continue; }
      if (points[i] == y || points[i + 1] == y) { continue; }

      boolean p1 = x < points[i] && points[i] < y;
      boolean p2 = x < points[i + 1] && points[i + 1] < y;

      good |= (p1 != p2);
    }

    return good;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
