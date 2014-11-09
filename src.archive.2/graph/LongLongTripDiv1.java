package topc.graph;

import java.util.*;
import java.io.*;

// SRM 615 Division I Level Two - 550
// graph theory, math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13090&rd=15848
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+615
public class LongLongTripDiv1 {
    private long INF = 2000000000000000000L;
    private long dist[][];

    public String isAble(int N, int[] A, int[] B, int[] D, long T) {
        int d = 10001;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0 || B[i] == 0) {
                d = Math.min(d, D[i]);
            }
        }

        if (d > 10000) { return "Impossible"; }

        dist = new long[20000][50];
        for (int i = 0; i < dist.length; i++) {
            Arrays.fill(dist[i], INF);
        }

        PriorityQueue<Node> Q = new PriorityQueue<Node>();

        dist[0][0] = 0;
        Q.offer(new Node(0, 0, 0));

        while (Q.size() > 0) {
            Node top = Q.poll();

            if (dist[top.m][top.v] < top.x) {
                continue;
            }

            long x = dist[top.m][top.v];
            int u = top.v;

            for (int i = 0; i < B.length; i++) {
                int v = -1;
                if (A[i] == u) {
                    v = B[i];
                }
                if (B[i] == u) {
                    v = A[i];
                }
                if (v != -1) {
                    int m = (top.m + D[i]) % (2 * d);
                    long nx = x + D[i];

                    if (nx < dist[m][v]) {
                        dist[m][v] = nx;
                        Q.offer(new Node(nx, m, v));
                    }
                }
            }
        }

        return (dist[(int)(T % (2 * d))][N - 1] <= T) ? "Possible" : "Impossible";
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    public class Node implements Comparable<Node> {
        public int m;
        public int v;
        public long x;

        public Node(long x, int m, int v) {
            this.x = x;
            this.m = m;
            this.v = v;
        }

        public int compareTo(Node o) {
            //if (x == o.x && m == o.m) {
            //return v - o.v;
            //}
            //if (x == o.x) {
            //return m - o.m;
            //}
            return Long.valueOf(x).compareTo(o.x);
        }
    }
}
