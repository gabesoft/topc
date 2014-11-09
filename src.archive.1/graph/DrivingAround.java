package topc.graph;

import java.util.*;
import java.io.*;

// SRM 342 Division I Level Three - 1000
// graph theory, simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=7412&rd=10666
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm342
public class DrivingAround {
  static public final long MOD = 1000003;

  public int numberOfWays(String[] adj, int start, int finish, int time) {
    int n = getVertexCount(adj);
    long[][] graph = buildGraph(adj, n);
    long[][] m = DAMatrix.pow(graph, time, MOD);
    return (int)m[start][finish];
  }

  long[][] buildGraph(String[] adj, int n) {
    long[][] graph = new long[n][n];

    int v = adj.length;
    for (int i = 0; i < adj.length; i++) {
      String row = adj[i];
      for (int j = 0; j < row.length(); j++) {
        char c = row.charAt(j);
        if (!Character.isDigit(c)) { continue; }

        int w = c - '0';
        if (w == 1) {
          graph[i][j] = 1;
        } else {
          graph[i][v] = 1;
          for (int k = 1; k < w - 1; k++) {
            graph[v][++v] = 1;
          }
          graph[v++][j] = 1;
        }
      }
    }

    return graph;
  }

  int getVertexCount(String[] adj) {
    int n = adj.length;

    for (int i = 0; i < adj.length; i++) {
      String row = adj[i];
      for (int j = 0; j < row.length(); j++) {
        char c = row.charAt(j);
        if (Character.isDigit(c)) {
          n += (c - '0') - 1;
        }
      }
    }

    return n;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}

class DAMatrix {
  public static long[][] pow(long[][] m, long k, long mod) {
    if (k == 0) { return unit(m.length); }
    if (k % 2 == 0) {
      return pow(mul(m, m, mod), k / 2, mod);
    } else {
      return mul(m, pow(m, k - 1, mod), mod);
    }
  }

  public static long[][] mul(long[][] a, long[][] b, long mod) {
    assert a[0].length == b.length : "invalid matrix dimensions";

    int n = a.length;
    int m = b[0].length;
    int u = b.length;
    long[][] c = new long[n][m];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        long sum = 0;
        for (int k = 0; k < u; k++) {
          sum += a[i][k] * b[k][j];
        }
        c[i][j] = sum % mod;
      }
    }

    return c;
  }

  public static long[][] unit(int n) {
    long[][] u = new long[n][n];
    for (int i = 0; i < n; i++) { u[i][i] = 1; }
    return u;
  }
}
