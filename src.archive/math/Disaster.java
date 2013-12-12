package topc.math;

import java.util.*;
import java.io.*;

// TCCC05 Semi 1 Division I Level Three - 1000
// advanced math, dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=3563&rd=6550
// editorial: http://www.topcoder.com/tc?module=Static&d1=tournaments&d2=tccc05&d3=alg_room1_analysis
public class Disaster {
  int N;
  double B;
  double[][] graph;

  public double expected(double b, String[] roads) {
    N = roads.length;
    B = b;
    graph = new double[N][N];

    for (int i = 0; i < N; i++) {
      String[] probs = roads[i].split("\\s+");
      for (int j = 0; j < N; j++) {
        graph[i][j] = Double.parseDouble(probs[j]);
      }
    }

    double[] best = findBest();
    double exp = 0.0;
    for (int i = 1; i < N + 1; i++) {
      exp = Math.max(exp, best[i] * f(1.0 / (B + B * i), i));
    }

    return exp;
  }

  double f(double v, int exp) {
    return v * Math.pow(1.0 - B * v, exp);
  }

  double[] findBest() {
    double[][] best = new double[N][N + 1];
    best[0][0] = 1.0;

    for (int k = 1; k < N + 1; k++) {
      for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
          best[i][k] = Math.max(best[i][k], best[j][k - 1] * graph[j][i]);
        }
      }
    }

    return best[1];
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
