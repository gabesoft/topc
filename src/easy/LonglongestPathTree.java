package topc.easy;

import java.util.*;
import java.io.*;

// SRM 635 Division II Level Three - 1000
// brute force, graph theory
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13416&rd=16078
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+635
public class LonglongestPathTree {
    int n = 0;
    Edge[] edges = null;
    int[][] graph = null;
    long[][] costs = null;

    public long getLength(int[] A, int[] B, int[] L) {
        n = A.length;
        edges = new Edge[n];

        int[] cnt = new int[n + 1];
        for (int i = 0; i < n; i++) {
            edges[i] = new Edge(A[i], B[i], L[i]);
            cnt[A[i]]++;
            cnt[B[i]]++;
        }

        graph = new int[n + 1][];
        costs = new long[n + 1][n + 1];
        for (int i = 0; i < cnt.length; i++) {
            graph[i] = new int[cnt[i]];
        }

        int[] indx = new int[n + 1];
        for (Edge e : edges) {
            graph[e.u][indx[e.u]++] = e.v;
            graph[e.v][indx[e.v]++] = e.u;
            costs[e.u][e.v] = e.cost;
            costs[e.v][e.u] = e.cost;
        }

        long best = 0;
        for (int i = 0; i < n; i++) {
            long c1 = dist(edges[i].u, i);
            long c2 = dist(edges[i].v, i);

            best = Math.max(best, c1 + c2 + edges[i].cost);
        }

        return best;
    }

    private long[] dfs(boolean[] seen, int node, int skip) {
        if (seen[node]) { return new long[] { node, 0 }; }

        seen[node] = true;

        Edge e = edges[skip];
        long n = node;
        long best = 0;

        for (int i = 0; i < graph[node].length; i++) {
            if (node == e.u && graph[node][i] == e.v) {
                continue;
            }
            if (node == e.v && graph[node][i] == e.u) {
                continue;
            }
            if (seen[graph[node][i]]) {
                continue;
            }

            long[] next = dfs(seen, graph[node][i], skip);
            long ecost = costs[node][graph[node][i]];

            if (next != null && next[1] + ecost > best) {
                best = next[1] + ecost;
                n = next[0];
            }
        }

        return new long[] { n, best };
    }

    private long dist(int node, int skip) {
        long[] d1 = dfs(new boolean[n + 1], node, skip);
        long[] d2 = dfs(new boolean[n + 1], (int)d1[0], skip);
        return d2[1];
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    public class Edge {
        public int u;
        public int v;
        public long cost;

        public Edge (int u, int v, long cost) {
            this.u = u;
            this.v = v;
            this.cost = cost;
        }
    }
}
