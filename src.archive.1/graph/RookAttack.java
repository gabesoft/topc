package topc.graph;

import java.util.*;
import java.io.*;

// TCO '03 Semifinals 4 Division I Level Three - 1050
// graph theory
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=1931&rd=4709
// editorial: http://www.topcoder.com/tc?module=Static&d1=tournaments&d2=tco03&d3=summary&d4=room4_analysis
public class RookAttack {
  int n;
  int m;
  boolean[][] graph;

  public int howMany(int rows, int cols, String[] cutouts) {
    n = rows;
    m = cols;
    graph = new boolean[n][m];

    for (int i = 0; i < n; i++) {
      Arrays.fill(graph[i], true);
    }
    for (int i = 0; i < cutouts.length; i++) {
      String[] tokens = cutouts[i].split(",");
      for (int j = 0; j < tokens.length; j++) {
        String[] coords = tokens[j].split("\\s+");
        int r = Integer.parseInt(coords[0]);
        int c = Integer.parseInt(coords[1]);
        graph[r][c] = false;
      }
    }

    return maxMatch();
  }

  int maxMatch() {
    boolean[] seen = new boolean[n];
    int[] parent = new int[m];

    Arrays.fill(parent, -1);

    int sum = 0;
    for (int r = 0; r < n; r++) {
      Arrays.fill(seen, false);
      if (dfs(r, seen, parent)) { sum++; }
    }

    return sum;
  }

  boolean dfs(int r, boolean[] seen, int[] p) {
    seen[r] = true;

    for (int c = 0; c < m; c++) {
      if (graph[r][c]) {
        if (p[c] == -1 || (!seen[p[c]] && dfs(p[c], seen, p))) {
          p[c] = r;
          return true;
        }
      }
    }

    return false;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
