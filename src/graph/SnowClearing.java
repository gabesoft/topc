package topc.graph;

import java.util.*;
import java.io.*;

// SRM 229 Division II Level Three - 1000
// graph theory
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=3521&rd=6518
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm229
public class SnowClearing {
  int N;
  int M;
  char[][] map;
  Node[][] nodes;

  public int unreachable(String[] citymap, int row, int column) {
    N = citymap.length;
    M = citymap[0].length();
    nodes = new Node[N][M];

    map = new char[N][M];
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        map[i][j] = citymap[i].charAt(j);
      }
    }

    int r = (row - 1) * 2;
    int c = (column - 1) * 2;
    nodes[r][c] = new Node(r, c, true);
    visit(nodes[r][c], null);

    int count = 0;
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        if (nodes[i][j] != null && !nodes[i][j].garage && nodes[i][j].parent2 == null) {
          count++;
        }
      }
    }

    return count;
  }

  void visit(Node n, Node from) {
    int fx = from == null ? -1 : from.x;
    int fy = from == null ? -1 : from.y;

    if (n.x > 0 && map[n.x - 1][n.y] == '|') {
      visit(n, n.x - 2, n.y, fx, fy);
    }
    if (n.x < N - 1 && map[n.x + 1][n.y] == '|') {
      visit(n, n.x + 2, n.y, fx, fy);
    }
    if (n.y > 0 && map[n.x][n.y - 1] == '-') {
      visit(n, n.x, n.y - 2, fx, fy);
    }
    if (n.y < M - 1 && map[n.x][n.y + 1] == '-') {
      visit(n, n.x, n.y + 2, fx, fy);
    }
  }

  void visit(Node n, int x, int y, int fx, int fy) {
    if (fx == x && fy == y) { return; };

    if (nodes[x][y] == null) {
      nodes[x][y] = node(x, y, n);
      visit(nodes[x][y], n);
    } 
    else if (nodes[x][y].addParent(n)) {
      visit(nodes[x][y], n);
    }
  }

  Node node(int x, int y, Node parent) {
    Node n = new Node(x, y, false);
    n.parent1 = parent;
    return n;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }

  class Node {
    public final boolean garage;
    public final int x;
    public final int y;
    public Node parent1;
    public Node parent2;

    public Node(int x, int y, boolean garage) {
      this.x = x;
      this.y = y;
      this.garage = garage;
    }

    public boolean same(Node n) {
      return n.x == x && n.y == y;
    }

    public boolean addParent(Node p) {
      if (parent1 == null) {
        parent1 = p;
        return true;
      }

      if (!parent1.same(p) && parent2 == null) {
        parent2 = p;
        return true;
      }

      return false;
    }

    public String toString() {
      String p1 = parent1 == null ? "" : String.format("%s, %s", parent1.x, parent1.y);
      String p2 = parent2 == null ? "" : String.format("%s, %s", parent2.x, parent2.y);
      int n = 0;

      if (parent1 != null) { n++; }
      if (parent2 != null) { n++; }
      return String.format("%s (%s,%s)\t- (%s)\t:(%s)", n, x, y, p1, p2);
    }
  }
}
