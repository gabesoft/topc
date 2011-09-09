package topc.graph;

import java.util.*;
import java.io.*;

// SRM 236 Division I Level Three - 1000
// graph theory
// http://community.topcoder.com/stat?c=problem_statement&pm=3530&rd=6535
public class Parking {
  int[][] park;
  int[][] match;
  int[][] cars;
  int[][] spots;
  int M;
  int N;
  int C;      // number of cars
  int S;      // number of parking spots

  public int minTime(String[] parking) {
    N = parking.length;
    M = parking[0].length();
    C = 0;
    S = 0;

    park  = new int[N][M];
    cars  = new int[100][2];
    spots = new int[100][2];

    for (int i = 0; i < N; i++) {
      char[] chars = parking[i].toCharArray();
      for (int j = 0; j < M; j++) {
        switch (chars[j]) {
          case 'X': park[i][j] = -1;      break;
          case '.': park[i][j] =  0;      break;
          case 'C': park[i][j] =  1;      break;
          case 'P': park[i][j] =  2 + S;  break;
        }
        if (park[i][j] == 1) { cars[C++]  = new int[] { i, j }; }
        if (park[i][j] >= 2) { spots[S++] = new int[] { i, j }; }
      }
    }

    match = new int[C][S];
    for (int i = 0; i < C; i++) {
      computeWeights(i);
    }

    return C == 0 ? 0 : computeBest();
  }

  int computeBest() {
    int hi = 0;
    int lo = 0;
    int md = 0;
    int mc = 0;
    int best = -1;

    for (int i = 0; i < C; i++) {
      for (int j = 0; j < S; j++) {
        hi = 1 + Math.max(hi, match[i][j]);
      }
    }

    while (hi != lo && hi != lo + 1) {
      md = (hi + lo) / 2;
      mc = computeMatching(md);
      if (mc == C) {
        hi = md;
        best = md;
      } else {
        lo = md;
      }
    }

    return best;
  }

  int computeMatching(int cutoff) {
    int n = C + S + 2;
    int s = 0;
    int t = n - 1;
    List<Integer>[] graph = new IntegerList[n];

    for (int i = 0; i < n; i++) {
      graph[i] = new IntegerList();
    }

    for (int i = 0; i < C; i++) {
      graph[s].add(i + 1);
    }
    for (int i = C + 1; i < n; i++) {
      graph[i].add(t);
    }
    for (int i = 1; i < C + 1; i++) {
      for (int j = C + 1; j < C + S + 1; j++) {
        int w = match[i - 1][j - C - 1];
        if (w > 0 && w <= cutoff) {
          graph[i].add(j);
        }
      }
    }

    int matches = 0;
    Vertex node = null;
    while ((node = findPath(graph, t)) != null) {
      matches++;
      Vertex parent = node.parent;
      while (parent != null) {
        graph[parent.id].remove(Integer.valueOf(node.id));
        if (parent.id < node.id) {
          graph[node.id].add(parent.id);
        }
        node = parent;
        parent = node.parent;
      }
    }

    assert matches <= C : "invalid match count";
    return matches;
  }

  Vertex findPath(List<Integer>[] graph, int end) {
    Queue<Vertex> nodes = new LinkedList<Vertex>();
    HashSet<Integer> seen = new HashSet<Integer>();
    nodes.add(new Vertex(0, null));

    while (nodes.size() > 0) {
      Vertex top = nodes.poll();
      if(top.id == end) { return top; }
      if (seen.contains(top.id)) { continue; }

      seen.add(top.id);
      for (int v : graph[top.id]) {
        nodes.add(new Vertex(v, top));
      }
    }

    return null;
  }

  void computeWeights(int car) {
    Queue<Node> nodes = new LinkedList<Node>();
    HashSet<String> seen = new HashSet<String>();
    Node start = new Node(cars[car][0], cars[car][1], 0);
    nodes.offer(start);

    while (nodes.size() > 0) {
      Node top = nodes.poll();

      if (seen.contains(top.toString())) { continue; }
      if (top.x < 0 || top.x > N - 1 || top.y < 0 || top.y > M - 1) { continue; }
      if (park[top.x][top.y] < 0) { continue; }

      seen.add(top.toString());
      if (park[top.x][top.y] >= 2) {
        int spot = park[top.x][top.y] - 2;
        match[car][spot] = top.time;
      }

      nodes.add(new Node(top.x - 1, top.y, top.time + 1));
      nodes.add(new Node(top.x + 1, top.y, top.time + 1));
      nodes.add(new Node(top.x, top.y - 1, top.time + 1));
      nodes.add(new Node(top.x, top.y + 1, top.time + 1));
    }
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }

  class Node {
    public final int x;
    public final int y;
    public final int time;

    public Node(int x, int y, int time) {
      this.x = x;
      this.y = y;
      this.time = time;
    }

    public String toString() {
      return String.format("%s:%s", x, y);
    }
  }

  class Vertex {
    public final int id;
    public final Vertex parent;

    public Vertex(int id, Vertex parent) {
      this.id = id;
      this.parent = parent;
    }
  }

  @SuppressWarnings("serial")
  class IntegerList extends LinkedList<Integer> { }
}
