package topc.graph;

import java.util.*;
import java.io.*;

// SRM 278 Division I Level Three - 1000
// graph theory
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=5921&rd=8075
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm278
public class UnitsMoving {
  int n;
  double max;

  public double bestTime(String[] start, String[] finish) {
    n = start.length;

    double[][] graph = buildGraph(start, finish);
    double lo = 0.0;
    double hi = max;

    int count = 0;
    while (count++ < 50) {
      double mid = lo + (hi - lo) / 2.0;
      if (perfectMatch(graph, mid)) {
        hi = mid;
      } else {
        lo = mid;
      }
    }

    return lo;
  }

  boolean perfectMatch(double[][] graph, double cutoff) {
    int s = 2 * n;
    int t = 2 * n + 1;
    boolean[][] augmented = new boolean[t + 1][t + 1];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (graph[i][j] <= cutoff) {
          augmented[i][j + n] = true;
        }
      }
      augmented[s][i]     = true;
      augmented[i + n][t] = true;
    }

    return maxFlow(augmented, 2 * n, 2 * n + 1) == n;
  }

  int maxFlow(boolean[][] graph, int s, int t) {
    int flow = 0;
    int[][] capacity = new int[graph.length][graph.length];

    for (int i = 0; i < capacity.length; i++) {
      for (int j = 0; j < capacity[i].length; j++) {
        if (graph[i][j]) { capacity[i][j] = 1; }
      }
    }

    while (true) {
      int path = bfs(graph, s, t, capacity);
      if (path == 0) { break; }
      flow += path;
    }

    return flow;
  }

  int bfs(boolean[][] graph, int s, int t, int[][] capacity) {
    Queue<Integer> nodes = new LinkedList<Integer>();
    boolean done = false;
    boolean[] seen = new boolean[graph.length];
    int[] parent = new int[graph.length];

    Arrays.fill(parent, -1);

    nodes.offer(s);
    seen[s] = true;
    while (nodes.size() > 0 && !done) {
      int top = nodes.poll();
      for (int i = 0; i < graph[top].length; i++) {
        if (!seen[i] && graph[top][i] && capacity[top][i] > 0) {
          nodes.offer(i);
          seen[i] = true;
          parent[i] = top;
          if (i == t) {
            done = true;
            break;
          }
        }
      }
    }

    int node = t;
    int path = Integer.MAX_VALUE;
    while (parent[node] > -1) {
      int prev = parent[node];
      path = Math.min(path, capacity[prev][node]);
      node = prev;
    }

    node = t;
    while (parent[node] > -1) {
      int prev = parent[node];
      capacity[prev][node] -= path;
      capacity[node][prev] += path;
      if (capacity[node][prev] > 0) {
        graph[node][prev] = true;
      }
      node = prev;
    }

    return path > 1 ? 0 : 1;
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
    max = 0.0;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        double dx = st[i][0] - en[j][0];
        double dy = st[i][1] - en[j][1];
        double dist = Math.sqrt(dx * dx + dy * dy);
        graph[i][j] = dist / st[i][2];
        max = Math.max(max, graph[i][j]);
      }
    }

    return graph;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
