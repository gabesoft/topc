package topc.graph;

import java.util.*;

// 2002 TCI Semi 2 : 550 (graph dfs)
public class Escape {
  static public final int N = 501;
  int[][] game;
  int[][] cost;

  public int lowest(String[] harmful, String[] deadly) {
    game = new int[N][N];
    cost = new int[N][N];

    fill(harmful, 1);
    fill(deadly, -1);

    for (int i = 0; i < N; i++) {
      Arrays.fill(cost[i], Integer.MAX_VALUE);
    }

    Node start = new Node(0, 0, 0);
    Queue<Node> nodes = new LinkedList<Node>();
    nodes.offer(start);

    while (nodes.size() > 0) {
      Node top = nodes.poll();

      if (top.outside()) { continue; }
      if (top != start && top.onDeadly()) { continue; }
      if (top.cost >= cost[top.x][top.y]) { continue; }

      int x = top.x;
      int y = top.y;
      cost[x][y] = top.cost;
      nodes.offer(top.create(1, 0));
      nodes.offer(top.create(-1, 0));
      nodes.offer(top.create(0, 1));
      nodes.offer(top.create(0, -1));
    }

    int res = cost[N - 1][N - 1];
    return res == Integer.MAX_VALUE ? -1 : res;
  }

  void fill(String[] regions, int value) {
    for (int i = 0; i < regions.length; i++) {
      if (regions[i].length() == 0) { continue; }
      String[] coords = regions[i].split(" ");
      int x1 = Integer.parseInt(coords[0]);
      int y1 = Integer.parseInt(coords[1]);
      int x2 = Integer.parseInt(coords[2]);
      int y2 = Integer.parseInt(coords[3]);
      for (int x = Math.min(x1, x2); x <= Math.max(x1, x2); x++) {
        for (int y = Math.min(y1, y2); y <= Math.max(y1, y2); y++) {
          game[x][y] = value;
        }
      }
    }
  }

  void debug(Object...os) {
    System.out.println(Arrays.deepToString(os));
  }

  class Node {
    public int x;
    public int y;
    public int cost;

    public Node(int x, int y, int cost) {
      this.x = x;
      this.y = y;
      this.cost = cost;
    }

    public boolean outside() {
      return x < 0 || y < 0 || x >= N || y >= N;
    }

    public boolean onDeadly() {
      return game[x][y] == -1;
    }

    public Node create(int dx, int dy) {
      Node n = new Node(x + dx, y + dy, cost);
      if (!n.outside()) {
        n.cost += game[n.x][n.y];
      }
      return n;
    }
  }
}
