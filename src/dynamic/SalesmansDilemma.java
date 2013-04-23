package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 270 Division I Level Two - 600
// dynamic programming, graph theory
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=4755&rd=8067
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm270
public class SalesmansDilemma {
    int INF = Integer.MAX_VALUE / 4;

    public String bestRoute(int towns, int origin, int destination, String[] travelCosts, int[] profits) {
        int graph[][]     = new int[towns][towns];
        boolean edges[][] = new boolean[towns][towns];

        for (int i = 0; i < travelCosts.length; i++) {
            String parts[] = travelCosts[i].split("\\s+");
            int u = Integer.parseInt(parts[0]);
            int v = Integer.parseInt(parts[1]);
            int c = Integer.parseInt(parts[2]);
            int w = c - profits[v];
            graph[u][v] = edges[u][v] ? Math.min(graph[u][v], w) : w;
            edges[u][v] = true;
        }

        boolean[] reachable = allReachable(edges, origin);

        if (!reachable[destination]) { return "IMPOSSIBLE"; }

        int[] path = shortestPath(graph, edges, reachable, origin, destination);
        int best   = path[0];
        int cycle  = path[1];

        if (cycle != -1) { return "ENDLESS PROFIT"; }
        if (best == INF) { return "IMPOSSIBLE"; }

        return String.format("BEST PROFIT: %s", -(best - profits[origin]));
    }

    private boolean[] allReachable(boolean[][] graph, int s) {
        int n = graph.length;

        Queue<Integer> V = new LinkedList<Integer>();
        boolean[] seen   = new boolean[n];

        V.offer(s);
        while (V.size() > 0) {
            int u = V.poll();
            if (seen[u]) { continue; }

            seen[u] = true;
            for (int i = 0; i < n; i++) {
                if (graph[u][i]) {
                    V.offer(i);
                }
            }
        }

        return seen;
    }

    private int[] shortestPath(int[][] graph, boolean[][] edges, boolean[] reachable, int s, int t) {
        int n   = graph.length;
        int M[] = new int[n];
        int F[] = new int[n];
        int c   = -1;

        Arrays.fill(F, -1);
        Arrays.fill(M, INF);
        M[t] = 0;

        for (int e = 1; e < n + 1; e++) {
            boolean done = true;
            for (int v = 0; v < n; v++) {
                for (int u = 0; u < n; u++) {
                    if (edges[v][u] && M[u] != INF) {
                        int next = graph[v][u] + M[u];
                        if (M[v] > next) {
                            M[v] = next;
                            F[v] = u;
                            if (c == -1 && reachable[v] && cycle(F, v)) {
                                c = v;
                            }
                            done = false;
                        }
                    }
                }
            }
            if (done)    { break; }
            if (c != -1) { break; }
        }

        return new int[] { M[s], c };
    }

    private boolean cycle(int[] first, int v) {
        int u = first[v];
        while (first[u] != -1) {
            if(first[u] == v) { return true; }
            u = first[u];
        }
        return false;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
