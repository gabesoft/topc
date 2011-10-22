package topc.dynamic;

import java.util.*;
import java.io.*;

// TCCC05 Round 3 Division I Level Two - 500
// dynamic programming, graph theory
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=3481&rd=6530
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=tccc05_online_rd_3
public class PackageShipping {
  int N;      // citi count
  int O;      // origin
  int D;      // destination
  int T;      // max time
  int C;      // package cost
  int[][] time;
  int[][] cost;
  double[][] prob;

  public double ship(String[] routes, String origin, String destination, int maxTime, int packageCost) {
    HashMap<String, Integer> cities = readCities(routes);

    N = cities.size();
    O = cities.get(origin);
    D = cities.get(destination);
    T = maxTime;
    C = packageCost;

    readRoutes(routes, cities);
    return minCost();
  }

  double minCost() {
    PriorityQueue<Node> nodes = new PriorityQueue<Node>();
    double[][] seen = new double[N][N];

    for (int i = 0; i < N; i++) {
      Arrays.fill(seen[i], Double.MAX_VALUE);
    }

    for (int i = 0; i < N; i++) {
      if (time[O][i] == -1) { continue; }
      nodes.offer(new Node(O, i, 0, 0, 1.0));
    }

    while (nodes.size() > 0) {
      Node top = nodes.poll();

      if (top.t > T) { continue; }
      if (top.dest == D) { return top.totalCost(); }
      if (seen[top.orig][top.dest] < top.totalCost()) { continue; }

      seen[top.orig][top.dest] = top.totalCost();
      for (int i = 0; i < N; i++) {
        if (time[top.dest][i] == -1) { continue; }
        nodes.offer(new Node(top.dest, i, top.t, top.c, top.p));
      }
    }

    return Double.MAX_VALUE;
  }

  void readRoutes(String[] routes, HashMap<String, Integer> cities) {
    time = new int[N][N];
    cost = new int[N][N];
    prob = new double[N][N];

    for (int i = 0; i < N; i++) {
      Arrays.fill(time[i], -1);
    }

    for (int i = 0; i < routes.length; i++) {
      String[] route = routes[i].split("\\s+");
      int c1 = cities.get(route[0]);
      int c2 = cities.get(route[1]);
      time[c1][c2] = Integer.parseInt(route[2]);
      cost[c1][c2] = Integer.parseInt(route[3]);
      prob[c1][c2] = 1.0 - Double.parseDouble(route[4]) / 100.0;
    }
  }

  HashMap<String, Integer> readCities(String[] routes) {
    HashMap<String, Integer> cities = new HashMap<String, Integer>();
    int count = 0;
    for (int i = 0; i < routes.length; i++) {
      String[] route = routes[i].split("\\s+");
      if (cities.get(route[0]) == null) {
        cities.put(route[0], count++);
      }
      if (cities.get(route[1]) == null) {
        cities.put(route[1], count++);
      }
    }
    return cities;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }

  class Node implements Comparable<Node> {
    public final int orig;
    public final int dest;
    public final int t;
    public final int c;
    public final double p;

    public Node(int orig, int dest, int t, int c, double p) {
      this.orig = orig;
      this.dest = dest;
      this.t = time[orig][dest] + t;
      this.p = prob[orig][dest] * p;
      this.c = cost[orig][dest] + c;
    }

    public double totalCost() {
      return C * (1.0 - p) + c;
    }

    public int compareTo(Node other) {
      return Double.valueOf(totalCost()).compareTo(Double.valueOf(other.totalCost()));
    }
  }
}
