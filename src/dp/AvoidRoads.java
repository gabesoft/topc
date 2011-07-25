package topc.dp;

import java.util.*;

// 2003 TCO Semi 4 Div 1 : 250 (dynamic programming)
public class AvoidRoads {
  HashSet<Integer> avoid;

  public long numWays(int width, int height, String[] bad) {
    int rows = height + 1;
    int cols = width + 1;
    long[][] grid = new long[rows][cols];
    avoid = readBad(bad);

    grid[0][0] = 1;

    for (int i = 1; i < rows; i++) {
      grid[i][0] = skip(i, 0) && skip(i-1, 0) ? 0L : grid[i-1][0];
    }
    for (int i = 1; i < cols; i++) {
      grid[0][i] = skip(0, i) && skip(0, i-1) ? 0L : grid[0][i-1];
    }
    for (int i = 1; i < rows; i++) {
      for (int j = 1; j < cols; j++) {
        long a = skip(i, j) && skip(i-1, j) ? 0L : grid[i-1][j];
        long b = skip(i, j) && skip(i, j-1) ? 0L : grid[i][j-1];
        grid[i][j] = a + b;
      }
    }

    return grid[rows-1][cols-1];
  }

  boolean skip(int i, int j) {
    return avoid.contains(encode(i, j));
  }

  HashSet<Integer> readBad(String[] bad) {
    HashSet<Integer> avoid = new HashSet<Integer>();
    for (int i = 0; i < bad.length; i++) {
      String[] pts = bad[i].split(" ");
      avoid.add(encode(Integer.parseInt(pts[0]), Integer.parseInt(pts[1])));
      avoid.add(encode(Integer.parseInt(pts[2]), Integer.parseInt(pts[3])));
    }
    return avoid;
  }

  static int encode(int i, int j) {
    return (i << 8) | j;
  }

  static int[] decode(int x) {
    return new int[] { (x & (255 << 8)) >> 8, x & 255 };
  }

  void debug(Object...os) {
    System.out.println(Arrays.deepToString(os));
  }
}
