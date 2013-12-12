package topc.dynamic;

import java.util.*;
import java.io.*;

// Member SRM 468 Division II Level Three - 1000
// dynamic programming, graph theory
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10767&rd=14183
// editorial: http://apps.topcoder.com/wiki/display/tc/Algorithm+Problem+Set+Analysis
public class Gifts {
    int MAXG = 16;
    int n;
    int m;
    int g;
    int [] dx = {0, 0, 1, -1};
    int [] dy = {1, -1, 0, 0}; 

    public int maxGifts(String[] city, int T) {
        this.n          = city.length;
        this.m          = city[0].length();
        this.g          = 0;
        char [][] graph = new char[n][m];

        int x = 0;
        int y = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                graph[i][j] = city[i].charAt(j);
                if (graph[i][j] == 'G') {
                    graph[i][j] = (char)(g + '0');
                    g++;
                }
                if (graph[i][j] == 'K') {
                    x = i;
                    y = j;
                }
            }
            debug(i, graph[i]);
        }


        int [][] adj = buildAdjMatrix(graph, x, y);

        for (int i = 0; i < adj.length; i++) {
            debug(i, adj[i]);
        }


        return 0;
        //return find(graph, T);
    }

    int[][] buildAdjMatrix(char[][] graph, int sx, int sy) {
        int[][] adj = new int[g + 2][g + 2];

        Queue<Node> nodes = new LinkedList<Node>();
        boolean [][] seen = new boolean[n][m];

        nodes.offer(new Node(sx, sy, value(graph[sx][sy]), 0));

        while (nodes.size() > 0) {
            Node top = nodes.poll();

            if (seen[top.x][top.y]) { continue; }

            seen[top.x][top.y] = true;

            int time = top.time + 1;
            for (int i = 0; i < dx.length; i++) {
                int x = top.x + dx[i];
                int y = top.y + dy[i];

                if (0 <= x && x < n && 0 <= y && y < m && graph[x][y] != '#') {
                    int du = top.gifts;
                    int dv = value(graph[x][y]);

                    //debug(graph[top.x][top.y], graph[x][y], du, dv);
                    if (du > -1 && dv > -1 && du != dv) {
                        adj[du][dv] = time;
                        adj[dv][du] = time;
                    }

                    nodes.add(new Node(x, y, dv > -1 ? dv : du, dv > -1 ? 0 : time));
                }
            }
        }

        return adj;
    }

    int value(char c) {
        if (isGift(c)) {
            return c - '0';
        }
        if (c == 'K') {
            return g;
        }
        if (c == 'Q') {
            return g + 1;
        }
        return -1;
    }

    int find(char[][] graph, int lim) {
        PriorityQueue<Node> nodes = new PriorityQueue<Node>();
        nodes.offer(getStart(graph));

        boolean [][][] seen = new boolean[n][m][1 << MAXG];
        int best          = 0;

        while (nodes.size() > 0) {
            Node top  = nodes.poll();
            int gifts = countOnes(top.gifts);

            //if (graph[top.x][top.y] == '3') {
            //debug(graph[top.x][top.y], gifts, top.gifts, "s", seen[top.x][top.y][top.px][top.py], top);
            //}

            if (top.time > lim)  { continue; }
            if (seen[top.x][top.y][top.gifts]) { continue; }

            if (graph[top.x][top.y] == 'Q') { 
                best = Math.max(best, gifts);
            }

            seen[top.x][top.y][top.gifts] = true;

            int time  = top.time + gifts + 1;
            for (int i = 0; i < dx.length; i++) {
                int x = top.x + dx[i];
                int y = top.y + dy[i];

                if (0 <= x && x < n && 0 <= y && y < m && graph[x][y] != '#') {
                    char c = graph[x][y];
                    int v  = c - '0';

                    if (isGift(c) && top.canTake(v)) {
                        nodes.add(new Node(x, y, top.gifts | (1 << v), time));
                    }

                    nodes.add(new Node(x, y, top.gifts, time));
                }

            }
        }

        return best;
    }

    boolean isGift(char c) {
        return Character.isDigit(c) 
            || c == ':' 
            || c == ';' 
            || c == '<' 
            || c == '=' 
            || c == '>'
            || c == '?';
    }

    Node getStart(char[][] graph) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (graph[i][j] == 'K') {
                    return new Node(i, j, 0, 0);
                }
            }
        }
        return null;
    }

    int countOnes(int mask) {
        int n = 0;
        while (mask != 0) {
            n++;
            mask = mask & (mask - 1);
        }
        return n;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    class Node implements Comparable<Node> {
        public final int x;
        public final int y;
        public final int gifts;
        public final int time;

        public Node(int x, int y, int gifts, int time) {
            this.x      = x;
            this.y      = y;
            this.gifts  = gifts;
            this.time   = time;
        }

        public boolean canTake(int gift) {
            return ((gifts >> gift) & 1) == 0;
        }

        public int compareTo(Node other) {
            int a = countOnes(other.gifts);
            int b = countOnes(gifts);
            if (a == b) {
                return Integer.valueOf(time).compareTo(other.time);
            } else {
                return Integer.valueOf(b).compareTo(a);
            }
        }

        public String toString() {
            return String.format("(%s,%s):%s:%s", x, y, gifts, time);
        }
    }
}
