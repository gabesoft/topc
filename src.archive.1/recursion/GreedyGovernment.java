package topc.recursion;

import java.util.*;
import java.io.*;

// SRM 275 Division II Level Three - 1000
// graph theory, recursion, search, string manipulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=5910&rd=8072
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm275
public class GreedyGovernment {
    int n;
    public double maxAverageCost(String[] tolls, int tollHike) {
        n = tolls.length;

        int graph[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                char c = tolls[i].charAt(j);
                graph[i][j] = c == 'X' ? 0 : c - '0';
            }
        }

        double best = 0.0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (graph[i][j] > 0) {
                    graph[i][j] += tollHike;
                    best = Math.max(best, averageCost(graph));
                    graph[i][j] -= tollHike;
                }
            }
        }

        return best;
    }

    private double averageCost(int[][] graph) {
        int node[]  = new int[5000 * n * n];
        int costs[] = new int[5000 * n * n];
        int seen[]  = new int[5000 * n * n];

        double paths = 0;
        double cost  = 0;

        int h = 0;
        int t = 1;

        node[h]  = 0;
        costs[h] = 0;
        seen[h]  = 1;
        while (h < t) {
            int p = node[h];
            int c = costs[h];
            int s = seen[h];
            h++;

            if (p == n - 1) {
                paths++;
                cost += c;
                continue;
            }

            for (int i = 0; i < n; i++) {
                if (graph[p][i] > 0 && ((s >> i) & 1) == 0) {
                    node[t]  = i;
                    costs[t] = c + graph[p][i];
                    seen[t]  = s | (1 << i);
                    t++;
                }
            }
        }

        return paths == 0 ? 0 : cost / paths;
    }

    private double averageCostSlow(int[][] graph) {
        Queue<Node> nodes = new LinkedList<Node>();

        double paths = 0;
        double cost  = 0;

        nodes.add(new Node(0, 0));
        while (nodes.size() > 0) {
            Node top = nodes.poll();

            if (top.pos == n - 1) {
                paths++;
                cost += top.cost;
                continue;
            }

            for (int i = 0; i < n; i++) {
                if (graph[top.pos][i] > 0 && !top.seen(i)) {
                    nodes.add(top.next(graph[top.pos][i], i));
                }
            }
        }

        return paths == 0 ? 0 : cost / paths;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    public class Node {
        public final int cost;
        public final int pos;
        private int seen;

        public Node(int cost, int pos) {
            this.cost = cost;
            this.seen = 1 << pos;
            this.pos  = pos;
        }

        public boolean seen(int pos) {
            return ((seen >> pos) & 1) == 1;
        }

        public Node next(int cost, int pos) {
            Node res = new Node(cost + this.cost, pos);
            res.seen = seen | (1 << pos);
            return res;
        }
    }
}
