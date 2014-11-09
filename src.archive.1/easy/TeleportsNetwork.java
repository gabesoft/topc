package topc.easy;

import java.util.*;
import java.io.*;

// SRM 409 Division II Level Three - 1000
// brute force, graph theory
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=9830&rd=12181
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm409
public class TeleportsNetwork {
    public int distribute(int teleportCount, int[] citiesX, int[] citiesY) {
        int n             = citiesX.length;
        boolean graph[][] = new boolean[n][n];

        for (int i = 1; i < n; i++) {
            int x = citiesX[i];
            int y = citiesY[i];
            long d = dist(x, y, citiesX[0], citiesY[0]);
            ArrayList<Point> pts = new ArrayList<Point>();

            for (int j = 0; j < n; j++) {
                long dp = dist(citiesX[j], citiesY[j], citiesX[0], citiesY[0]);
                if (i != j && dp < d) {
                    pts.add(new Point(j, dist(x, y, citiesX[j], citiesY[j]), citiesX[j], citiesY[j]));
                }
            }

            Collections.sort(pts);

            int k = pts.get(0).i;

            graph[i][k] = true;
            graph[k][i] = true;
        }

        return find(graph, new boolean[n], 0, teleportCount);
    }

    int find(boolean[][] graph, boolean[] ports, int v, int k) {
        if (k == 0) { return inconvenience(graph, ports); }

        int best = Integer.MAX_VALUE / 4;

        for (int i = v + 1; i < ports.length; i++) {
            if (ports[i]) { continue; }

            ports[i] = true;
            best = Math.min(best, find(graph, ports, i, k - 1));
            ports[i] = false;
        }

        return best;
    }

    int inconvenience(boolean[][] graph, boolean[] ports) {
        int max = 0;
        for (int i = 0; i < graph.length; i++) {
            max = Math.max(max, bfs(graph, ports, i));
        }
        return max;
    }

    int bfs(boolean[][] graph, boolean[] ports, int v) {
        Queue<Integer> pts = new LinkedList<Integer>();
        boolean seen[]     = new boolean[graph.length];

        pts.offer(v);
        pts.offer(0);

        while (pts.size() > 0) {
            int u = pts.poll();
            int d = pts.poll();

            if (u == 0 || ports[u]) { return d; }
            if (seen[u]) { continue; }

            seen[u] = true;

            for (int i = 0; i < graph[u].length; i++) {
                if (graph[u][i]) {
                    pts.offer(i);
                    pts.offer(d + 1);
                }
            }
        }

        return -1;
    }

    long dist(int x1, int y1, int x2, int y2) {
        return sq(x1 - x2) + sq(y1 - y2);
    }

    long sq(long n) {
        return n * n;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    class Point implements Comparable<Point> {
        public final int i;
        public final long d;
        public final int x;
        public final int y;

        public Point(int i, long d, int x, int y) {
            this.i = i;
            this.d = d;
            this.x = x;
            this.y = y;
        }

        public int compareTo(Point other) {
            if (d != other.d) {
                return Long.valueOf(d).compareTo(other.d);
            }
            if (x != other.x) {
                return Integer.valueOf(x).compareTo(other.x);
            }
            return Integer.valueOf(y).compareTo(other.y);
        }
    }
}
