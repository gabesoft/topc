package topc.graph;

import java.util.*;
import java.io.*;

// SRM 583 Division II Level Three - 900
// graph theory, greedy, search
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12556&rd=15503
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+583
public class GameOnABoard {
  int dx[] = new int[] { 0, 0, -1, 1 };
  int dy[] = new int[] { 1, -1, 0, 0 };

  public int optimalChoice(String[] cost) {
    int n = cost.length;
    int m = cost[0].length();
    int best = 1 << 30;

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        best = Math.min(best, maxCost(cost, i, j));
      }
    }

    return best;
  }

  private int maxCost(String[] G, int row, int col) {
    int n = G.length;
    int m = G[0].length();
    int best = 0;
    PriorityQueue<Node> Q = new PriorityQueue<Node>();
    boolean seen[][] = new boolean[n][m];

    Q.offer(new Node(row, col, G[row].charAt(col) - '0'));

    while (Q.size() > 0) {
      Node top = Q.poll();

      if (seen[top.row][top.col]) { continue; }
      best = Math.max(best, top.cost);
      seen[top.row][top.col] = true;

      for (int i = 0; i < dx.length; i++) {
        int r = top.row + dx[i];
        int c = top.col + dy[i];

        if (0 <= r && r < n && 0 <= c && c < m) {
          Q.offer(new Node(r, c, top.cost + (G[r].charAt(c) - '0')));
        }
      }
    }

    return best;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }

  public class Node implements Comparable<Node>  {
    public int row;
    public int col;
    public int cost;

    public Node (int row, int col, int cost) {
      this.row = row;
      this.col = col;
      this.cost = cost;
    }

    public int compareTo(Node o) {
      return cost - o.cost;
    }
  }
}
