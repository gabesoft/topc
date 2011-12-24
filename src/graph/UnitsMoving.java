package topc.graph;

import java.util.*;
import java.io.*;

// SRM 278 Division I Level Three - 1000
// graph theory
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=5921&rd=8075
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm278
public class UnitsMoving {
  int n;

  public double bestTime(String[] start, String[] finish) {
    n = start.length;

    double[][] graph = buildGraph(start, finish);
    double lo = 0;
    double hi = 10000;

    boolean[] seen = new boolean[n];
    int[] parent = new int[n];

    int count = 0;
    while (count++ < 50) {
      double mid = lo + (hi - lo) / 2.0;
      boolean match = true;

      Arrays.fill(parent, -1);

      for (int i = 0; i < n; i++) {
        Arrays.fill(seen, false);
        if (!dfs(i, mid, graph, seen, parent)) {
          match = false; 
          break;
        }
      }

      if (match) {
        hi = mid;
      } else {
        lo = mid;
      }
    }

    return lo;
  }

  boolean dfs(int i, double cutoff, double[][] graph, boolean[] seen, int[] parent) {
    seen[i] = true;

    for (int j = 0; j < n; j++) {
      if (graph[i][j] <= cutoff) {
        boolean found = parent[j] == -1;
        found = found || (!seen[parent[j]] && dfs(parent[j], cutoff, graph, seen, parent));
        if (found) {
          parent[j] = i;
          return true;
        }
      }
    }

    return false;
  }

  double[][] buildGraph(String[] start, String[] finish) {
    int[][] st = new int[n][3];
    int[][] en = new int[n][2];

    for (int i = 0; i < n; i++) {
      String[] stokens = start[i].split("\\s+");
      st[i][0] = Integer.parseInt(stokens[0]);
      st[i][1] = Integer.parseInt(stokens[1]);
      st[i][2] = Integer.parseInt(stokens[2]);

      String[] ftokens = finish[i].split("\\s+");
      en[i][0] = Integer.parseInt(ftokens[0]);
      en[i][1] = Integer.parseInt(ftokens[1]);
    }

    double[][] graph = new double[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        double dx = st[i][0] - en[j][0];
        double dy = st[i][1] - en[j][1];
        double dist = Math.sqrt(dx * dx + dy * dy);
        graph[i][j] = dist / st[i][2];
      }
    }

    return graph;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
