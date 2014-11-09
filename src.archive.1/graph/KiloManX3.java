package topc.graph;

import java.util.*;

// SRM 181 Div 1 : 1000 (graph dijkstra)
public class KiloManX3 {
  boolean[] seen;

  public int leastShots(String[] damageChart, int[] bossHealth) {
    int n = damageChart.length;
    seen = new boolean[1 << n];
    PriorityQueue<Node> nodes = new PriorityQueue<Node>();
    nodes.offer(new Node(0, 0));

    while (nodes.size() > 0) {
      Node top = nodes.poll();
      if (seen[top.weight]) { continue; }
      seen[top.weight] = true;
      if (top.weight == (1 << n) - 1) {
        return top.cost;
      }

      for (int i = 0; i < n; i++) {
        if (((top.weight >> i) & 1) == 1) { continue; }

        int best = bossHealth[i];
        for (int j = 0; j < n; j++) {
          if (i == j) { continue; }
          int damage = damageChart[j].charAt(i) - '0';
          if (((top.weight >> j) & 1) == 1 && damage != 0) {
            int shots = ceilDiv(bossHealth[i], damage);
            best = Math.min(best, shots);
          }
        }

        nodes.add(new Node(top.weight | (1 << i), top.cost + best));
      }
    }

    return 0;
  }

  int ceilDiv(int a, int b) {
    int res = a / b;
    if (a % b != 0) { res++; }
    assert res == (a + b - 1) / b : "div check failed";
    return res;
  }

  class Node implements Comparable<Node>{
    public int weight;
    public int cost;

    public Node(int weight, int cost) {
      this.weight = weight;
      this.cost = cost;
    }

    public int compareTo(Node other) {
      return Integer.valueOf(cost).compareTo(Integer.valueOf(other.cost));
    }
  }
}
