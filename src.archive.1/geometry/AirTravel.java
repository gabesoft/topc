package topc.geometry;

import java.util.*;
import java.io.*;

// SRM 241 Division II Level Three - 1000
// advanced math, geometry, graph theory, search
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=4501&rd=7216
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm241
public class AirTravel {
    double R = 4000;
    public double shortestTrip(int[] latitude, int[] longitude, String[] canTravel, int origin, int destination) {
        int n           = latitude.length;
        double dist[][] = new double[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(dist[i], -2);
            String parts[] = canTravel[i].split("\\s+");

            for (int j = 0; j < parts.length; j++) {
                int k = Integer.parseInt(parts[j]);
                dist[i][k] = dist(latitude[i], longitude[i], latitude[k], longitude[k]);
            }
        }

        return bfs(dist, origin, destination);
    }

    private double bfs(double graph[][], int start, int end) {
        int n = graph.length;

        Queue<Node> nodes = new PriorityQueue<Node>();
        boolean seen[]    = new boolean[n];

        nodes.offer(new Node(start, 0));
        while (nodes.size() > 0) {
            Node t = nodes.poll();

            if (t.index == end) { return t.len; }
            if (seen[t.index]) { continue; }

            seen[t.index] = true;

            for (int i = 0; i < n; i++) {
                if (graph[t.index][i] > -1) {
                    nodes.offer(new Node(i, t.len + graph[t.index][i]));
                }
            }
        }

        return -1;
    }

    private double dist(int lat1, int lon1, int lat2, int lon2) {
        double slat1 = Math.sin(rad(lat1));
        double slat2 = Math.sin(rad(lat2));
        double clat1 = Math.cos(rad(lat1));
        double clat2 = Math.cos(rad(lat2));
        double clon  = Math.cos(rad(lon1) - rad(lon2));
        return R * Math.acos(slat1 * slat2 + clat1 * clat2 * clon);
    }

    private double rad(double deg) {
        return deg * Math.PI / 180.0;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    public class Node implements Comparable<Node> {
        public final double len;
        public final int index;

        public Node(int i, double l) {
            index = i;
            len   = l;
        }

        public int compareTo(Node o) {
            return Double.valueOf(len).compareTo(o.len);
        }
    }
}
