package topc.graph;

import java.util.*;
import java.io.*;

// SRM 210 Division II Level Three - 1000
// graph theory, recursion, sorting
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=2932&rd=5856
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm210
public class TopographicalImage {
  int n;           
  int m;           
  int[][] graph;   
  boolean[][] seen;

  public int[] calcPeakAreas(String[] topoData) {
    n       = topoData.length;
    m       = topoData[0].length();
    graph   = new int[n][m];
    seen    = new boolean[n][m];

    Point[] points  = new Point[n * m];
    int pts = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        int h = topoData[i].charAt(j) - '!';
        points[pts++] = new Point(i, j, h);
        graph[i][j] = h;
      }
    }

    Arrays.sort(points);

    ArrayList<Integer> peaks = new ArrayList<Integer>();
    for (int i = 0; i < points.length; i++) {
      int p = peak(points[i]);
      if (p > 0) { peaks.add(p); }
    }

    int[] res = new int[peaks.size()];
    for (int i = 0; i < res.length; i++) {
      res[i] = peaks.get(i);
    }

    return res;
  }

  int peak(Point start) {
    if (seen[start.x][start.y]) { return 0; }

    Queue<Point> points = new LinkedList<Point>();
    int sum = 0;

    points.offer(start);
    while (points.size() > 0) {
      Point top = points.poll();
      if (seen[top.x][top.y]) { continue; }

      seen[top.x][top.y] = true;
      sum++;

      for (int i = -1; i < 2; i++) {
        for (int j = -1; j < 2; j++) {
          int x = top.x + i;
          int y = top.y + j;
          if (x < 0 || x > n - 1 || y < 0 || y > m - 1 || graph[x][y] > top.h ) { continue; }
          points.offer(new Point(x, y, graph[x][y]));
        }
      }
    }

    return sum;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }

  class Point implements Comparable<Point> {
    public final int x;
    public final int y;
    public final int h;

    public Point(int x, int y, int h) {
      this.x = x;
      this.y = y;
      this.h = h;
    }

    public String toString() {
      return String.format("%s:%s:%s", x, y, h);
    }

    public int compareTo(Point other) {
      if (h != other.h) {
        return Integer.valueOf(other.h).compareTo(h);
      }
      if (x != other.x) {
        return Integer.valueOf(x).compareTo(other.x);
      }
      return Integer.valueOf(y).compareTo(other.y);
    }
  }
}
