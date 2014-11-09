package topc.graph;

import java.util.*;

// 2003 TCCC Round 1 : 500 (graph dfs)
public class Marketing {
  static public final int N = 64;
  int n;
  int[][] graph;
  int[] color;

  public long howMany(String[] compete) {
    n = compete.length;
    graph = new int[N][N];
    color = new int[N];

    for (int i = 0; i < n; i++) {
      String[] adj = compete[i].split(" ");
      for (int j = 0; j < adj.length; j++) {
        if (adj[j].length() > 0) {
          int u = Integer.parseInt(adj[j]);
          graph[i][u] = graph[u][i] = 1;
        }
      }
    }

    int ncc = 0;
    for (int i = 0; i < n; i++) {
      if (color[i] == 0) {
        ncc++;
        if (!dfs(i, 1)) { return -1; }
      }
    }

    return 1 << ncc;
  }

  boolean dfs(int x, int c) {
    if (color[x] != 0) {
      return color[x] == c;
    }

    color[x] = c;
    boolean res = true;
    for (int i = 0; i < n; i++) {
      if (graph[x][i] == 1) {
        res &= dfs(i, 3 - c);
      }
    }

    return res;
  }

  void debug(Object...os) {
    System.out.println(Arrays.deepToString(os));
  }
}
