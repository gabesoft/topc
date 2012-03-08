package topc.graph;

import java.util.*;
import java.io.*;

// SRM 477 Division I Level Two - 500
// graph theory, simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10766&rd=14157
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+477
public class PythTriplets {
  public int findMax(String[] stick) {
    int[] sticks  = extract(stick);
    int[][] graph = buildGraph(sticks);

    partition(graph);

    return maxMatch(graph);
  }

  void partition(int[][] graph) {
    int n          = graph.length;
    boolean[] seen = new boolean[n];
    boolean[] setA = new boolean[n];

    for (int i = 0; i < n; i++) {
      dfs(i, true, graph, seen, setA);
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (graph[i][j] == 0) { continue; }
        if (setA[i]) {
          graph[j][i] = 0;
        } else {
          graph[i][j] = 0;
        }
      }
    }
  }

  void dfs(int v, boolean on, int[][] graph, boolean[] seen, boolean[] mark) {
    if (seen[v]) { return; }

    seen[v] = true;
    mark[v] = on;

    for (int u = 0; u < graph[v].length; u++) {
      if (graph[v][u] == 1) {
        dfs(u, !on, graph, seen, mark);
      }
    }
  }

  int maxMatch(int[][] graph) {
    int n         = graph.length;
    int[] parents = new int[n];

    Arrays.fill(parents, -1);

    int sum = 0;
    for (int i = 0; i < n; i++) {
      int[] visited = new int[n];
      sum += findMatch(i, graph, visited, parents) ? 1 : 0;
    }

    return sum;
  }

  boolean findMatch(int v, int[][] graph, int[] visited, int[] parents) {
    if (v == -1) { return true; }

    for (int u = 0; u < graph[v].length; u++) {
      if (graph[v][u] == 0 || visited[u] == 1) { continue; };

      visited[u] = 1;
      if (findMatch(parents[u], graph, visited, parents)) {
        parents[u] = v;
        return true;
      }
    }

    return false;
  }

  int[][] buildGraph(int[] sticks) {
    int n         = sticks.length;
    int[][] graph = new int[n][n];

    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        if (triple(sticks[i], sticks[j])) {
          graph[i][j] = 1;
          graph[j][i] = 1;
        }
      }
    }

    return graph;
  }

  boolean triple(long x, long y) {
    if (gcd(x, y) != 1) { return false; }

    long xx = x * x;
    long yy = y * y;
    long z  = (long)Math.sqrt(xx + yy);

    return xx + yy == z * z;
  }

  public int gcd(long a, long b) {
    return b == 0 ? (int)a : gcd(b, a % b);
  }

  int[] extract(String[] data) {
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < data.length; i++) {
      builder.append(data[i]);
    }

    String[] pieces = builder.toString().split("\\s+");
    int[] nums = new int[pieces.length];
    for (int i = 0; i < nums.length; i++) {
      nums[i] = Integer.parseInt(pieces[i]);
    }

    return nums;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
