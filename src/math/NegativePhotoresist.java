package topc.math;

import java.util.*;
import java.io.*;

// SRM 210 Division I Level Three - 1000
// graph theory, math, search, string parsing
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=2946&rd=5856
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm210
public class NegativePhotoresist {
  boolean[][] A;
  double[] X;
  double[] Y;
  int N;

  public double minimumTilt(String[] pinConnections, int limit) {
    N = pinConnections.length;
    A = new boolean[N][N];
    X = new double[N];
    Y = new double[N];

    for (int i = 0; i < N; i++) {
      String[] tokens = pinConnections[i].split("\\s+");
      String[] coords = tokens[0].split(",");

      X[i] = Double.parseDouble(coords[0]);
      Y[i] = Double.parseDouble(coords[1]);

      for (int j = 1; j < tokens.length; j++) {
        int k = Integer.parseInt(tokens[j]);
        A[i][k] = true;
        A[k][i] = true;
      }
    }

    double lo = 0.0;
    double hi = Math.PI / 2.0;

    int count = 0;
    while (count++ < 50) {
      double mid = lo + (hi - lo) / 2.0;
      double[] y = calcY(mid);
      double[][] adj = calcAdj(X, y);
      double len = calcShortestPaths(adj);
      if (len < limit) {
        hi = mid;
      } else {
        lo = mid;
      }
    }

    return lo;
  }

  double[] calcY(double theta) {
    double[] y = new double[N];
    for (int i = 0; i < N; i++) {
      y[i] = Math.cos(theta) * Y[i];
    }
    return y;
  }

  double[][] calcAdj(double[] x, double[] y) {
    double[][] adj = new double[N][N];
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        if (A[i][j]) {
          double dx = x[i] - x[j];
          double dy = y[i] - y[j];
          adj[i][j] = Math.sqrt(dx * dx + dy * dy);
        } else {
          adj[i][j] = Double.MAX_VALUE / 2.0;
        }
      }
    }
    return adj;
  }

  double calcShortestPaths(double[][] adj) {
    for (int k = 0; k < N; k++) {
      for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
          if (i != j) {
            adj[i][j] = Math.min(adj[i][j], adj[i][k] + adj[k][j]);
          }
        }
      }
    }

    double sum = 0;
    for (int i = 0; i < N; i++) {
      for (int j = i + 1; j < N; j++) {
        if (adj[i][j] < Double.MAX_VALUE / 2.0 - 10.0) {
          sum += adj[i][j];
        }
      }
    }

    return sum;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
