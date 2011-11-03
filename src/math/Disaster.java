package topc.math;

import java.util.*;
import java.io.*;

// TCCC05 Semi 1 Division I Level Three - 1000
// advanced math, dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=3563&rd=6550
// editorial: http://www.topcoder.com/tc?module=Static&d1=tournaments&d2=tccc05&d3=alg_room1_analysis
public class Disaster {
  static public final double T = 3.0e-8;      // accuracy tolerance
  static public final double R = 0.61803399;
  static public final double C = 1.0 - R;
  static public final int S = 0;              // start village
  static public final int E = 1;              // end village
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

    return findBestRoad().maxe;
  }

  double findMax(int exp) {
    double xa = 0.0;
    double xc = 1.0 / B;
    double xb = 0.5 * (xa + xc);

    if (exp == 0) { return xc; }

    assert f(xb, exp) > f(xa, exp) : "malfunction: xa " + exp;
    assert f(xb, exp) > f(xc, exp) : "malfunction: xc " + exp;

    double[] x = new double[4];
    x[0] = xa;
    x[3] = xc;

    if (Math.abs(xc - xb) > Math.abs(xb - xa)) {
      x[1] = xb;
      x[2] = xb + C * (xc - xb);
    } else {
      x[1] = xb - C * (xb - xa);
      x[2] = xb;
    }

    double[] y = new double[2];
    y[0] = f(x[1], exp);
    y[1] = f(x[2], exp);
    while (Math.abs(x[3] - x[0]) > T * (x[1] + x[2])) {
      if (y[1] > y[0]) {
        x[0] = x[1];
        x[1] = x[2];
        x[2] = R * x[2] + C * x[3];
        y[0] = y[1];
        y[1] = f(x[2], exp);
      } else {
        x[3] = x[2];
        x[2] = x[1];
        x[1] = R * x[1] + C * x[0];
        y[1] = y[0];
        y[0] = f(x[1], exp);
      }
    }

    return y[0] > y[1] ? y[0] : y[1];
  }

  double f(double v, int exp) {
    return v * Math.pow(1.0 - B * v, exp);
  }

  Node findBestRoad() {
    PriorityQueue<Node> nodes = new PriorityQueue<Node>();
    nodes.offer(new Node(S, 0, 1.0));

    double[] seen = new double[N];
    Arrays.fill(seen, -1.0);

    while (nodes.size() > 0) {
      Node top = nodes.poll();

      if (top.village == E) { return top; }

      seen[top.village] = top.prob;
      for (int i = 0; i < N; i++) {
        if (i != top.village) {
          double next = top.prob * graph[top.village][i];
          if (seen[i] < next) { 
            nodes.offer(new Node(i, top.coef + 1, next));
          }
        }
      }
    }

    return null;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }

  class Node implements Comparable<Node> {
    public final double prob;
    public final double maxe;
    public final int coef;
    public final int village;

    public Node(int village, int coef, double prob) {
      this.prob = prob;
      this.coef = coef;
      this.village = village;
      this.maxe = findMax(coef) * prob;
    }

    public int compareTo(Node other) {
      return Double.valueOf(other.maxe).compareTo(Double.valueOf(maxe));
    }
  }
}
