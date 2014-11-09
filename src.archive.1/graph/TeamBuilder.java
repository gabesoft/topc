package topc.graph;

import java.util.*;
import java.io.*;

// SRM 184 Division II Level Three - 1000
// graph theory
// http://community.topcoder.com/stat?c=problem_statement&pm=2356&rd=4740
public class TeamBuilder {
  public int[] specialLocations(String[] paths) {
    int n = paths.length;
    int[][] graph = new int[n][n];

    for (int i = 0; i < n; i++) {
      char[] row = paths[i].toCharArray();
      for (int j = 0; j < n; j++) {
        graph[i][j] = row[j] - '0';
      }
    }

    boolean[][] adj = new boolean[n][n];
    for (int k = 0; k < n; k++) {
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
          if (i != j) {
            adj[i][j] |= graph[i][j] == 1;
            adj[i][j] |= adj[i][k] && adj[k][j];
          }
        }
      }
    }

    int[] res = new int[2];
    for (int i = 0; i < n; i++) {
      int countOut = 0;
      int countIn = 0;
      for (int j = 0; j < n; j++) {
        if (adj[i][j]) { countOut++; }
        if (adj[j][i]) { countIn++; }
      }
      if (countOut == n - 1) { res[0]++; }
      if (countIn == n - 1) { res[1]++; }
    }

    return res;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
