package topc.graph;

import java.util.*;

// 2003 TCCC Semi 4 : 275 (graph dfs)
public class Circuits {
  static public final int N = 64;
  int[][] graph;
  int[] state;
  int max;

  public int howLong(String[] connects, String[] costs) {
    graph = new int[N][N];
    state = new int[N];

    for (int i = 0; i < N; i++) {
      Arrays.fill(graph[i], -1);
    }

    for (int i = 0; i < connects.length; i++) {
      if (connects[i].length() > 0) {
        String[] sons = connects[i].split(" ");
        String[] cost = costs[i].split(" ");
        for (int j = 0; j < sons.length; j++) {
          int son = Integer.parseInt(sons[j]);
          int w = Integer.parseInt(cost[j]);
          graph[i][son] = w;
        }
      }
    }

    max = 0;
    for (int i = 0; i < connects.length; i++) {
      if (state[i] == 0) {
        dfs(i, 0);
      }
    }

    return max;
  }

  void dfs(int x, int len) {
    max = Math.max(max, len);
    if (state[x] > len) { return; }

    state[x] = len;
    for (int i = 0; i < N; i++) {
      if (graph[x][i] > -1) {
        dfs(i, len + graph[x][i]);
      }
    }
  }

  void debug(Object...os) {
    System.out.println(Arrays.deepToString(os));
  }
}
