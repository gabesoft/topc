package topc.graph;

import java.util.*;
import java.io.*;

// SRM 628 Division II Level Three - 1000
// graph theory, recursion, simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13242&rd=16009
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+628
public class InvariantSets {
  public long countSets(int[] f) {
    int n = f.length;

    boolean[][] adj = new boolean[n][n];
    for (int i = 0; i < n; i++) {
      adj[i][f[i]] = true;
    }

    for (int k = 0; k < n; k++) {
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
          adj[i][j] = adj[i][j] || (adj[i][k] && adj[k][j]);
        }
      }
    }

    int t = 0;

    int[] comp = new int[n];
    Arrays.fill(comp, -1);

    for (int i = 0; i < n; i++) {
      if (comp[i] == -1) {
        dfs(adj, comp, i, t++);
      }
    }

    int[] parent = new int[t];
    Arrays.fill(parent, -1);

    for (int i = 0; i < n; i++) {
      if (comp[i] != comp[f[i]]) {
        parent[comp[i]] = comp[f[i]];
      }
    }

    long[] dp = new long[t];
    Arrays.fill(dp, -1);

    long res = 1;
    for (int i = 0; i < t; i++) {
      if (parent[i] == -1) {
        res *= countWays(dp, parent, i);
      }
    }

    return res;
  }

  private long countWays(long[] dp, int[] parent, int x) {
    if (dp[x] == -1) {
      dp[x] = 1;
      for (int y = 0; y < dp.length; y++) {
        if (parent[y] == x) {
          dp[x] *= countWays(dp, parent, y);
        }
      }
      dp[x]++;
    }
    return dp[x];
  }

  private void dfs(boolean[][] adj, int[] comp, int x, int c) {
    if (comp[x] == -1) {
      comp[x] = c;
      for (int i = 0; i < adj.length; i++) {
        if (adj[i][x] && adj[x][i]) {
          dfs(adj, comp, i, c);
        }
      }
    }
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
