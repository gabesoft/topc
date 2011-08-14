package topc.graph;

import java.util.*;

// SRM 211 Div 1 : 500 (graph dfs)
public class GrafixMask {
  public int[] sortedAreas(String[] rectangles) {
    int[][] grid = new int[400][600];
    for (int i = 0; i < rectangles.length; i++) {
      String[] rect = rectangles[i].split(" ");
      int topRow = Integer.parseInt(rect[0]);
      int topCol = Integer.parseInt(rect[1]);
      int btmRow = Integer.parseInt(rect[2]);
      int btmCol = Integer.parseInt(rect[3]);
      for (int j = topRow; j < btmRow + 1; j++) {
        for (int k = topCol; k < btmCol + 1; k++) {
          grid[j][k] = 1;
        }
      }
    }

    ArrayList<Integer> results = new ArrayList<Integer>();
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[0].length; j++) {
        int area = fillArea(i, j, grid);
        if (area > 0) {
          results.add(area);
        }
      }
    }

    int[] ans = new int[results.size()];
    for (int i = 0; i < results.size(); i++) {
      ans[i] = results.get(i).intValue();
    }
    Arrays.sort(ans);

    return ans;
  }

  int fillArea(int x, int y, int[][] grid) {
    if (grid[x][y] == 1) { return 0; }

    int area = 0;
    Stack<Node> nodes = new Stack<Node>();
    nodes.push(node(x, y));

    while (nodes.size() > 0) {
      Node n = nodes.pop();
      if (n.x < 0 || n.x > 399) { continue; }
      if (n.y < 0 || n.y > 599) { continue; }
      if (grid[n.x][n.y] == 1) { continue; }
      grid[n.x][n.y] = 1;

      area++;
      nodes.push(node(n.x + 1, n.y));
      nodes.push(node(n.x - 1, n.y));
      nodes.push(node(n.x, n.y + 1));
      nodes.push(node(n.x, n.y - 1));
    }

    return area;
  }

  Node node(int x, int y) {
    return new Node(x, y);
  }

  void debug(Object...os) {
    System.out.println(Arrays.deepToString(os));
  }

  class Node {
    public int x = 0;
    public int y = 0;

    public Node(int x, int y) {
      this.x = x;
      this.y = y;
    }
  }
}
