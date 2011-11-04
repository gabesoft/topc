package topc.math;

import java.util.*;
import java.io.*;

// TCCC05 Semi 1 Division I Level Three - 1000
// advanced math, dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=3563&rd=6550
// editorial: http://www.topcoder.com/tc?module=Static&d1=tournaments&d2=tccc05&d3=alg_room1_analysis
public class Disaster2 {
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
      this.maxe = prob * f(1.0 / (B + B * coef), coef);
    }

    public int compareTo(Node other) {
      return Double.valueOf(other.maxe).compareTo(Double.valueOf(maxe));
    }
  }
}
