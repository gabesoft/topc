package topc.graph;

import java.util.*;
import java.io.*;

// SRM 198 Division I Level Two - 500
// graph theory
// http://community.topcoder.com/stat?c=problem_statement&pm=2449&rd=5073
public class DungeonEscape {
  public int exitTime(String[] up, String[] down, String[] east, String[] west, int startLevel, int startEasting) {
    int n = up.length;
    int m = up[0].length();
    int[][] u = new int[n][m];
    int[][] d = new int[n][m];
    int[][] e = new int[n][m];
    int[][] w = new int[n][m];

    for (int i = 0; i < n; i++) {
      char[] uc = up[i].toCharArray();
      char[] dc = down[i].toCharArray();
      char[] ec = east[i].toCharArray();
      char[] wc = west[i].toCharArray();
      for (int j = 0; j < m; j++) {
        u[i][j] = uc[j] == 'x' ? -1 : uc[j] - '0';
        d[i][j] = dc[j] == 'x' ? -1 : dc[j] - '0';
        e[i][j] = ec[j] == 'x' ? -1 : ec[j] - '0';
        w[i][j] = wc[j] == 'x' ? -1 : wc[j] - '0';
      }
    }

    int[][] seen = new int[n][m];
    for (int i = 0; i < n; i++) {
      Arrays.fill(seen[i], -1);
    }

    PriorityQueue<Node> nodes = new PriorityQueue<Node>();
    Node start = new Node(startLevel, startEasting, 0);
    nodes.offer(start);

    while (nodes.size() > 0) {
      Node top = nodes.poll();

      if (top.x < 0) { return top.time; }
      if (top.y < 0 || top.x > n - 1 || top.y > m - 1) { continue; }
      if (seen[top.x][top.y] > -1) { continue; }
      if (top.time >= m*(n - top.x)) { continue; }

      seen[top.x][top.y] = top.time;
      if (u[top.x][top.y] > -1) {
        nodes.offer(new Node(top.x - 1, top.y, top.time + u[top.x][top.y]));
      }
      if (d[top.x][top.y] > -1) {
        nodes.offer(new Node(top.x + 1, top.y, top.time + d[top.x][top.y]));
      }
      if (w[top.x][top.y] > -1) {
        nodes.offer(new Node(top.x, top.y - 1, top.time + w[top.x][top.y]));
      }
      if (e[top.x][top.y] > -1) {
        nodes.offer(new Node(top.x, top.y + 1, top.time + e[top.x][top.y]));
      }
    }

    return -1;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }

  class Node implements Comparable<Node> {
    public final int x;
    public final int y;
    public final int time;

    public Node(int x, int y, int time) {
      this.x = x;
      this.y = y;
      this.time = time;
    }

    public int compareTo(Node other) {
      return Integer.valueOf(time).compareTo(Integer.valueOf(other.time));
    }
  }
}
