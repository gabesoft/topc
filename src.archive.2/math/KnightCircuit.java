package topc.math;

import java.util.*;
import java.io.*;

// SRM 564 Division II Level Three - 1050
// simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10966&rd=15186
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+564
public class KnightCircuit {
  public long maxSize(int w, int h, int a, int b) {
    int g = gcd(a, b);
    if (g != 1) {
      return maxSize(1 + (w - 1) / g, 1 + (h - 1) / g, a / g, b / g);
    }

    if (w <= 20 || h <= 20) {
      return bfs(w, h, a, b);
    }

    if ((a + b) % 2 == 1) {
      return w + (long)h;
    } else {
      return (1 + w * (long)h) / 2;
    }
  }

  private long bfs(int w, int h, int a, int b) {
    int dx[] = new int[] { a, a, -a, -a, b, b, -b, -b };
    int dy[] = new int[] { b, -b, b, -b, a, -a, a, -a };
    boolean visited[][] = new boolean[w][h];

    int best = 1;
    for (int i = 0; i < w; i++) {
      for (int j = 0; j < h; j++) {
        if (!visited[i][j]) {
          Queue<Integer> q = new LinkedList<Integer>();
          q.offer(i);
          q.offer(j);

          visited[i][j] = true;

          int size = 0;

          while (q.size() > 0) {
            int x = q.poll();
            int y = q.poll();

            size++;
            for (int k = 0; k < dx.length; k++) {
              int nx = x + dx[k];
              int ny = y + dy[k];

              if (nx >= 0 && nx < w && ny >= 0 && ny < h) {
                if (!visited[nx][ny]) {
                  visited[nx][ny] = true;
                  q.offer(nx);
                  q.offer(ny);
                }
              }
            }
          }

          best = Math.max(best, size);
        }
      }
    }

    return best;
  }

  private int gcd(int a, int b) {
    while (a > 0) {
      int c = a;
      a = b % a;
      b = c;
    }
    return b;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
