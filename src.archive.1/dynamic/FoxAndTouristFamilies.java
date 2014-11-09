package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 561 Division II Level Three - 1000
// dynamic programming, graph theory, math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11811&rd=15183
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+561
public class FoxAndTouristFamilies {
    int n;
    int m;

    public double expectedLength(int[] A, int[] B, int[] f) {
        n = A.length;
        m = f.length;

        double roads[][] = new double[m][n];
        int graph[][]    = new int[n + 1][n + 1];

        for (int i = 0; i < n + 1; i++) {
            Arrays.fill(graph[i], -1);
        }

        for (int i = 0; i < n; i++) {
            int a = A[i];
            int b = B[i];

            graph[a][b] = i;
            graph[b][a] = i;
        }

        for (int i = 0; i < m; i++) {
            int c1 = f[i];
            for (int c2 = 0; c2 < n + 1; c2++) {
                int[] r = travel(graph, roads, c1, c2);
                for (int j = 0; j < r.length; j++) {
                    roads[i][r[j]] += 1.0 / n;
                }
            }
        }

        double exp = 0.0;
        for (int i = 0; i < n; i++) {
            double p = 1.0;
            for (int j = 0; j < m; j++) {
                p *= roads[j][i];
            }
            exp += p;
        }

        return exp;
    }

    int[] travel(int[][] graph, double[][] roads, int c1, int c2) {
        Queue<Node> queue = new LinkedList<Node>();
        boolean seen[]    = new boolean[graph.length];

        queue.offer(new Node(c1));

        while (queue.size() > 0) {
            Node top = queue.poll();
            int c    = top.c;

            if (c == c2) { return top.getRoads(); }
            if (seen[c]) { continue; }

            seen[c] = true;

            for (int i = 0; i < graph[c].length; i++) {
                if (graph[c][i] > -1) {
                    queue.add(top.next(i, graph[c][i]));
                }
            }
        }

        return null;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    class Node {
        public final int c;
        int[] roads;
        int r;

        public Node(int c) {
            this.c = c;
            this.r = 0;
            this.roads = new int[n];
        }

        public int[] getRoads() {
            int res[] = new int[r];
            for (int i = 0; i < r; i++) {
                res[i] = roads[i];
            }
            return res;
        }

        public Node next(int c, int road) {
            Node node            = new Node(c);
            node.roads           = roads.clone();
            node.r               = r;
            node.roads[node.r++] = road;
            return node;
        }
    }
}
