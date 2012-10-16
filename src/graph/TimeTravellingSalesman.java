package topc.graph;

import java.util.*;
import java.io.*;

// SRM 492 Division II Level Three - 1000
// graph theory
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11049&rd=14245
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+492
public class TimeTravellingSalesman {
    public long determineCost(int N, String[] roads) {
        int graph[][]  = new int[N][N];
        String all     = join(roads);
        String[] costs = all.split(" ");

        for (int i = 0; i < N; i++) {
            Arrays.fill(graph[i], -1);
        }

        for (int i = 0; i < costs.length; i++) {
            String[] parts = costs[i].split(",");
            int u = Integer.parseInt(parts[0]);
            int v = Integer.parseInt(parts[1]);
            int c = Integer.parseInt(parts[2]);

            graph[u][v] = c;
            graph[v][u] = c;
        }

        long seen[] = new long[N];
        Queue<Node> nodes = new PriorityQueue<Node>();

        Arrays.fill(seen, -1);

        nodes.offer(new Node(0, 0));
        while (nodes.size() > 0) {
            Node top = nodes.poll();
            int v    = top.v;

            if (seen[v] == -1) {
                seen[v] = top.cost;
                for (int i = 0; i < N; i++) {
                    if (i != v && graph[v][i] > -1) {
                        nodes.offer(new Node(i, graph[v][i]));
                    }
                }
            }
        }

        long cost = 0;
        for (int i = 0; i < N; i++) {
            if (seen[i] == -1) {
                return -1;
            }
            cost += seen[i];
        }

        return cost;
    }

    String join(String[] input) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < input.length; i++) {
            builder.append(input[i]);
        }
        return builder.toString();
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    class Node implements Comparable<Node> {
        public final int v;
        public final long cost;

        public Node(int v, long cost) {
            this.v    = v;
            this.cost = cost;
        }

        public int compareTo(Node other) {
            return Long.valueOf(cost).compareTo(other.cost);
        }
    }
}
