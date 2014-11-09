package topc.graph;

import java.util.*;

// SRM 156 Div 1 : 1000 (graph dfs)
public class PathFinding {
  static public final int A = 1;
  static public final int B = 2;
  static public final int X = 3;
  int[][] game;
  int[][][][] seen;
  int m, n;

  public int minTurns(String[] board) {
    m = board.length;
    n = board[0].length();
    game = new int[m][n];
    seen = new int[20][20][20][20];

    int xa = 0, ya = 0, xb = 0, yb = 0;
    for (int i = 0; i < m; i++) {
      char[] items = board[i].toCharArray();
      for (int j = 0; j < n; j++) {
        switch (items[j]) {
          case 'X':
            game[i][j] = X;
            break;
          case 'A':
            game[i][j] = A;
            xa = i;
            ya = j;
            break;
          case 'B':
            game[i][j] = B;
            xb = i;
            ya = j;
            break;
        }
      }
    }

    Queue<Node> nodes = new LinkedList<Node>();
    Node start = node(xa, ya, xb, yb, 0);
    nodes.offer(start);

    while (nodes.size() > 0) {
      Node top = nodes.poll();

      // out of bounds
      if (outside(top.xa, top.ya) || outside(top.xb, top.yb)) {
        continue;
      }
      // already visited
      if (seen[top.xa][top.ya][top.xb][top.yb] == 1) {
        continue;
      }
      // on X
      if (game[top.xa][top.ya] == X || game[top.xb][top.yb] == X) {
        continue;
      }
      // on each other
      if (top.xa == top.xb && top.ya == top.yb) {
        continue;
      }
      // termination condition
      if (swapped(top, start)) {
        return top.count;
      }

      seen[top.xa][top.ya][top.xb][top.yb] = 1;

      for (int dxa = -1; dxa < 2; dxa++) {
        for (int dya = -1; dya < 2; dya++) {
          for (int dxb = -1; dxb < 2; dxb++) {
            for (int dyb = -1; dyb < 2; dyb++) {
              Node next = node(top.xa + dxa, top.ya + dya, top.xb + dxb, top.yb + dyb, top.count + 1);
              if (swapped(top, next)) { continue; }
              nodes.offer(next);
            }
          }
        }
      }
    }

    return -1;
  }

  boolean swapped(Node a, Node b) {
    return a.xa == b.xb && a.ya == b.yb && a.xb == b.xa && a.yb == b.ya;
  }

  boolean outside(int x, int y) {
    return x < 0 || x >= m || y < 0 || y >= n;
  }

  Node node(int xa, int ya, int xb, int yb, int count) {
    return new Node(xa, ya, xb, yb, count);
  }

  class Node {
    public int xa;
    public int ya;
    public int xb;
    public int yb;
    public int count;

    public Node(int xa, int ya, int xb, int yb, int count) {
      this.xa = xa;
      this.ya = ya;
      this.xb = xb;
      this.yb = yb;
      this.count = count;
    }
  }
}
