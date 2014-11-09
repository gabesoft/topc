package topc.graph;

import java.util.*;
import java.io.*;

// SRM 356 Division II Level Three - 1000
// graph theory, sorting, string parsing
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=7921&rd=10765
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm356
public class RoadReconstruction {
  int cityCount;
  Edge[][] graph;

  public String selectReconstruction(String[] roads) {
    HashMap<String, Integer> cities = new HashMap<String, Integer>();
    List<Edge> edges = new ArrayList<Edge>();

    graph = new Edge[50][50]; 
    cityCount = 0;

    for (int i = 0; i < roads.length; i++) {
      String[] parts = roads[i].split("\\s+");
      String city1 = parts[1];
      String city2 = parts[2];
      if (!cities.containsKey(city1)) { cities.put(city1, cityCount++); }
      if (!cities.containsKey(city2)) { cities.put(city2, cityCount++); }

      int c1 = cities.get(city1);
      int c2 = cities.get(city2);
      Edge edge = new Edge(parts.length == 4 ? Integer.parseInt(parts[3]) : 0, parts[0]);

      edges.add(edge);
      if (graph[c1][c2] == null || graph[c1][c2].compareTo(edge) > 0) {
        graph[c1][c2] = edge;
        graph[c2][c1] = edge;
      }
    }

    Collections.sort(edges);

    int weight = 10;
    for (Edge e : edges) {
      if (e.cost > 0) { e.cost = weight++; }
    }

    int[] mst = mstPrim();

    return computeResults(mst);
  }

  int[] mstPrim() {
    boolean[] intree  = new boolean[cityCount];
    int[] costs       = new int[cityCount];
    int[] parents     = new int[cityCount];
    int start         = 0;
    int v             = start;

    Arrays.fill(costs, 1001);
    Arrays.fill(parents, -1);

    costs[v] = 0;

    while (!intree[v]) {
      intree[v] = true;

      for (int u = 0; u < cityCount; u++) {
        if (!intree[u] && graph[v][u] != null) {
          Edge edge = graph[v][u]; 
          if (costs[u] > edge.cost) {
            costs[u] = edge.cost;
            parents[u] = v;
          }
        }
      }

      v = 0;
      int cost = 1001;
      for (int i = 0; i < cityCount; i++) {
        if (!intree[i] && cost > costs[i]) {
          cost = costs[i];
          v = i;
        }
      }
    }

    return parents;
  }

  String computeResults(int[] mst) {
    int start          = 0;
    boolean connected  = true;
    List<String> roads = new ArrayList<String>();

    for (int i = 0; i < cityCount; i++) {
      if (i == start) { continue; }
      if (mst[i] == -1) { 
        connected = false;
        break; 
      }

      Edge edge = graph[mst[i]][i];
      if (edge.cost > 0) {
        roads.add(edge.name);
      }
    }

    if (!connected) { return "IMPOSSIBLE"; }
    if (roads.size() == 0) { return ""; }

    Collections.sort(roads);

    StringBuilder builder = new StringBuilder();
    builder.append(roads.get(0));
    for (int i = 1; i < roads.size(); i++) {
      builder.append(" ");
      builder.append(roads.get(i));
    }

    return builder.toString();
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }

  class Edge implements Comparable<Edge> {
    public final String name;
    public int cost;

    public Edge(int cost, String name) {
      this.cost = cost;
      this.name = name;
    }

    public int compareTo(Edge other) {
      if (cost == other.cost) {
        return name.compareTo(other.name);
      } else {
        return Integer.valueOf(cost).compareTo(other.cost);
      }
    }
  }
}
