package topc.graph;

import java.util.*;
import java.io.*;

// SRM 477 Division I Level Two - 500
// graph theory, simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10766&rd=14157
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+477
public class PythTriplets {
  public int findMax(String[] stick) {
    int[] sticks = extract(stick);
    debug("sticks", sticks);

    int[][] graph = buildGraph(sticks);
    partition(graph);

    //for (int i = 0; i < graph.length; i++) {
      //debug(i, graph[i]);
    //}

    int count = maxMatch(graph);
    debug("count", count);

    return count;
  }

  void partition(int[][] graph) {
    int n = graph.length;
    boolean[] seen = new boolean[n];
    boolean[] setA = new boolean[n];
    boolean[] setB = new boolean[n];

    for (int i = 0; i < n; i++) {
      dfs(i, true, graph, seen, setA, setB);
    }

    // TODO: remove set B
    //debug("setA", setA);
    //debug("setB", setB);

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (graph[i][j] == 1) {
          if (setA[i]) {
            graph[j][i] = 0;
          } else {
            graph[i][j] = 0;
          }
        }
      }
    }

  }

  void dfs(int v, boolean setA, int[][] graph, boolean[] seen, boolean[] A, boolean[] B) {
    if (seen[v]) { return; }
    //debug("dfs", v, setA);

    seen[v] = true;
    if (setA) {
      A[v] = true;
    } else {
      B[v] = true;
    }

    for (int u = 0; u < graph[v].length; u++) {
      if (graph[v][u] == 1) {
        dfs(u, !setA, graph, seen, A, B);
      }
    }
  }

  int maxMatch(int[][] graph) {
    int n         = graph.length;
    int sum       = 0;
    int[] visited = new int[n];
    int[] parents = new int[n];

    Arrays.fill(parents, -1);

    for (int i = 0; i < n; i++) {
      //if (visited[i] == 1) { continue; }
      //Arrays.fill(parents, -1);

      visited = new int[n];
      boolean match = findMatch(i, graph, visited, parents);
      //debug("match", i, match, parents);
      sum += match ? 1 : 0;
    }

    //for (int i = 0; i < parents.length; i++) {
      //sum += parents[i] > -1 ? 1 : 0;
    //}

    //for (int i = 0; i < parents.length; i++) {
      //if (parents[i] == -1) { continue; }
      //debug("parent", i, "=", parents[i]);
    //}
    //debug("parents", parents);
    //debug("visited", visited);

    return sum;
  }

  boolean findMatch(int v, int[][] graph, int[] visited, int[] parents) {
    if (v == -1) { return true; }
    //if (parents[v] > -1) { return false; }
    //if (visited[v] == 1) { return false; }

    //visited[v] = 1;
    //if (!findMatch(parents[v], graph, visited, parents)) {
    //return false;
    //}

    //if (parents[v] > -1) {
    //return false;
    //}
    //assert parents[v] == -1 : "the parent of " + v + " is " + parents[v];

    for (int u = 0; u < graph[v].length; u++) {
      //debug("v", v, u, graph[v][u], visited[u], parents[u]);
      if (graph[v][u] == 0) { continue; };
      if (visited[u] == 1)  { continue; }
      //if (parents[v] == u) { continue; }
      //if (parents[u] > -1) { continue; }

      visited[u] = 1;
      if (findMatch(parents[u], graph, visited, parents)) {
        parents[u] = v;
        //parents[v] = -1;
        //visited[v] = 0;
        return true;
      }
    }

    return false;
  }

  int[][] buildGraph(int[] sticks) {
    int n = sticks.length;
    int[][] graph = new int[n][n];

    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        if (triple(sticks[i], sticks[j])) {
          debug("triple", i, j, sticks[i], sticks[j]);
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
    if (b == 0) { 
      return (int)a;
    } else {
      return gcd(b, a % b);
    }
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
