package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 339 Division II Level Three - 1000
// dynamic programming, search, string parsing
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=7423&rd=10663
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm339
public class OnTime {
    int N;
    int T;
    int[][][] graph;
    int[][][] depart;
    int[][][] arrive;
    int[][] n;

    public int minCost(int N, int T, String[] buses) {
        this.N = N;
        this.T = T;

        this.graph  = new int[N][N][50];
        this.depart = new int[N][N][50];
        this.arrive = new int[N][N][50];

        n = new int[N][N];
        for (int i = 0; i < buses.length; i++) {
            String[] parts = buses[i].split(" ");
            int a          = Integer.parseInt(parts[0]);
            int b          = Integer.parseInt(parts[1]);
            int departure  = Integer.parseInt(parts[2]);
            int time       = Integer.parseInt(parts[3]);
            int cost       = Integer.parseInt(parts[4]);

            int idx           = n[a][b];
            graph[a][b][idx]  = cost;
            depart[a][b][idx] = departure;  
            arrive[a][b][idx] = departure + time;  
            n[a][b]++;
        }

        return cost();
    }

    int cost() {
        Queue<Node> nodes = new PriorityQueue<Node>();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < n[0][i]; j++) {
                if (graph[0][i][j] > 0) {
                    nodes.offer(new Node(i, arrive[0][i][j], graph[0][i][j]));
                }
            }
        }

        while (nodes.size() > 0) {
            Node top = nodes.poll();
            int stop = top.stop;
            int cost = top.cost;
            int time = top.time;

            if (time > T) { continue; }
            if (stop == N - 1) { return cost; }

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < n[stop][i]; j++) {
                    if (graph[stop][i][j] > 0 && depart[stop][i][j] > time) {
                        nodes.offer(new Node(i, arrive[stop][i][j], cost + graph[stop][i][j]));
                    }
                }
            }
        }

        return -1;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    class Node implements Comparable<Node> {
        public final int stop;
        public final int cost;
        public final int time;

        public Node(int stop, int time, int cost) {
            this.stop = stop;
            this.time = time;
            this.cost = cost;
        }

        public int compareTo(Node other) {
            return Integer.valueOf(cost).compareTo(other.cost);
        }

        public String toString() {
            return String.format("%s:%s:%s", stop, time, cost);
        }
    }
}
