package topc.graph;

import java.util.*;
import java.io.*;

// SRM 186 Division II Level Three - 1000
// graph theory, search, string parsing
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=2410&rd=4750
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm186
public class LumberjackHack {
    int dr[] = new int[] { 0, 0, 1, -1 };
    int dc[] = new int[] { 1, -1, 0, 0 };
    int n; // rows
    int m; // cols;
    int G[][];

    public int timeToShore(String[] riverMap) {
        n = riverMap.length;
        m = riverMap[0].length();
        G = new int[n][m];

        int r = -1;
        int c = -1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                char x = riverMap[i].charAt(j);
                if (x == '.') { G[i][j] = 1; }
                if (x == '|') { G[i][j] = 2; }
                if (x == '+') {
                    G[i][j] = 3;
                    r = i;
                    c = j;
                }
            }
        }

        return dijkstra(r, c);
    }

    private int dijkstra(int row, int col) {
        PriorityQueue<Node> nodes = new PriorityQueue<Node>();
        boolean[][] seen = new boolean[n][m];

        nodes.offer(new Node(row, col, 0, true));
        while (nodes.size() > 0) {
            Node top = nodes.poll();

            if (top.c == 0 || top.c == m - 1) { return top.time; }
            if (seen[top.r][top.c]) { continue; }

            seen[top.r][top.c] = true;

            for (int i = 0; i < dr.length; i++) {
                int r = top.r + dr[i];
                int c = top.c + dc[i];

                if (valid(r, c) && (top.dry || G[r][c] > 1)) {
                    int t = (G[r][c] == 1) ? 3 : (dr[i] == 0 ? 2 : 1);
                    nodes.offer(new Node(r, c, top.time + t, top.dry && G[r][c] > 1));
                }
            }
        }

        return -1;
    }

    private boolean valid(int r, int c) {
        return 0 <= r && r < n && 0 <= c && c < m;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    public class Node implements Comparable<Node> {
        public final boolean dry;
        public final int time;
        public final int r;
        public final int c;

        public Node(int r, int c, int t, boolean dry) {
            this.r    = r;
            this.c    = c;
            this.time = t;
            this.dry  = dry;
        }

        public int compareTo(Node o) {
            return time - o.time;
        }

        public String toString() {
            return String.format("(%s,%s):%s%s", r, c, time, dry ? "d" : "w");
        }
    }
}
