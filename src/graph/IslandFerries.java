package topc.graph;

import java.util.*;

// SRM 194 Div 1 : 1000 (graph dijkstra)
public class IslandFerries {
  int F = 0;
  int I = 0;
  int N = 0;
  int[][][] graph;
  int[][] prices;
  int[] costs;

  public int[] costs(String[] ferryLegs, String[] ferryPrices) {
    F = ferryLegs.length;
    I = ferryPrices.length;
    fillStructures(ferryLegs, ferryPrices);
    countReachable();
    dijkstra();
    return costs;
  }

  void dijkstra() {
    costs = new int[I - 1];
    Arrays.fill(costs, -1);

    int count = 0;
    PriorityQueue<Node> nodes = new PriorityQueue<Node>();
    HashSet<String> seen = new HashSet<String>();

    nodes.add(new Node(0, 0));
    while (nodes.size() > 0 && count < (N - 1)) {
      Node top = nodes.poll();

      if (seen.contains(top.toString())) { continue; }
      if (top.island > 0 && costs[top.island - 1] == -1) {
        costs[top.island - 1] = top.cost;
        count++;
      }

      seen.add(top.toString());
      for (int i = 0; i < F; i++) {
        for (int j = 0; j < I; j++) {
          if (top.island != j && graph[i][top.island][j] == 1) {
            boolean added = false;
            int cost = top.cost + Math.min(top.ticket(i), prices[top.island][i]);
            for (int p = 0; p < F; p++) {
              if (p != i) {
                int pc = Math.min(top.ticket(p), prices[top.island][p]);
                for (int q = p + 1; q < F; q++) {
                  if (q != i) {
                    int qc = Math.min(top.ticket(q), prices[top.island][q]);
                    if (qc < prices[j][q]) {
                      nodes.offer(new Node(j, cost, p, pc, q, qc));
                      added = true;
                    }
                  }
                }
                if (!added && pc < prices[j][p]) {
                  added = true;
                  nodes.offer(new Node(j, cost, p, pc));
                }
              }
            }
            if (!added) {
              nodes.offer(new Node(j, cost));
            }
          }
        }
      }
    }
  }

  void countReachable() {
    N = 0;
    int[] seen = new int[I];
    Queue<Integer> nodes = new LinkedList<Integer>();
    nodes.offer(0);
    while (nodes.size() > 0) {
      int top = nodes.poll();
      if (seen[top] == 1) { continue; }
      seen[top] = 1;
      N++;
      for (int i = 0; i < F; i++) {
        for (int j = 0; j < I; j++) {
          if (j != top && graph[i][top][j] == 1) {
            nodes.offer(j);
          }
        }
      }
    }
  }

  void fillStructures(String[] ferryLegs, String[] ferryPrices) {
    graph = new int[F][I][I];
    prices = new int[I][F];

    for (int i = 0; i < F; i++) {
      String[] legs = ferryLegs[i].split(" ");
      for (int j = 0; j < legs.length; j++) {
        String[] leg = legs[j].split("-");
        int u = Integer.parseInt(leg[0]);
        int v = Integer.parseInt(leg[1]);
        graph[i][u][v] = 1;
      }
    }

    for (int i = 0; i < I; i++) {
      String[] services = ferryPrices[i].split(" ");
      for (int j = 0; j < F; j++) {
        prices[i][j] = Integer.parseInt(services[j]);
      }
    }
  }

  void debug(Object...os) {
    System.out.println(Arrays.deepToString(os));
  }

  class Node implements Comparable<Node> {
    public int island;
    public int cost;
    public Ticket ticket1;
    public Ticket ticket2;

    public Node(int island, int cost) {
      this.island = island;
      this.cost = cost;
    }

    public Node(int island, int cost, int f1, int c1) {
      this.island = island;
      this.cost = cost;
      ticket1 = new Ticket(f1, c1);
    }

    public Node(int island, int cost, int f1, int c1, int f2, int c2) {
      this.island = island;
      this.cost = cost;
      ticket1 = new Ticket(f1, c1);
      ticket2 = new Ticket(f2, c2);
    }

    public int ticket(int ferry) {
      if (ticket1 != null && ticket1.ferry == ferry) {
        return ticket1.cost;
      }
      if (ticket2 != null && ticket2.ferry == ferry) {
        return ticket2.cost;
      }
      return Integer.MAX_VALUE;
    }

    public int compareTo(Node other) {
      if (cost < other.cost) { return -1; }
      if (cost > other.cost) { return 1; }
      return 0;
    }

    public String toString() {
      return String.format("N(%s, %s, %s)", island, 
          ticket1 != null ? ticket1 : "", 
          ticket2 != null ? ticket2 : "");
    }
  }

  class Ticket {
    public int ferry;
    public int cost;

    public Ticket(int ferry, int cost) {
      this.ferry = ferry;
      this.cost = cost;
    }

    public String toString() {
      return String.format("T(%s, %s)", ferry, cost);
    }
  }
}
