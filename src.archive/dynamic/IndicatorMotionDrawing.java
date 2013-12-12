package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 298 Division II Level Three - 1000
// dynamic programming, graph theory, simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=6183&rd=9819
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm298
public class IndicatorMotionDrawing {
    int INF  = Integer.MAX_VALUE / 4;
    int[] dx = new int[] { -1, 1, 0, 0 };
    int[] dy = new int[] { 0, 0, -1, 1 };

    public int getMinSteps(String[] desiredState, char startState) {
        char[][] state = new char[desiredState.length][desiredState[0].length()];

        for (int i = 0; i < state.length; i++) {
            for (int j = 0; j < state[0].length; j++) {
                state[i][j] = desiredState[i].charAt(j);
            }
        }

        int res = bfs(state, startState);
        return res == INF ? -1 : res;
    }

    int bfs(char[][] dest, char start) {
        int n = dest.length;
        int m = dest[0].length;

        int k = 0;
        int mask = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (dest[i][j] != ' ') {
                    mask |= 1 << (i * m + j);
                }
            }
        }

        PriorityQueue<Node> nodes = new PriorityQueue<Node>();
        boolean[][][] seen        = new boolean[n][m][1 << 12]; // state: pos + completed (mask)

        nodes.add(new Node(0, 0, rotate(start, dest[0][0]), 1, dest[0][0]));
        while (nodes.size() > 0) {
            Node top = nodes.poll();

            if (top.completed == mask) { return top.cost; }
            if (seen[top.x][top.y][top.completed]) { continue; }
            if (dest[top.x][top.y] == ' ') { continue; }

            seen[top.x][top.y][top.completed] = true;           

            for (int i = 0; i < dx.length ; i++) {
                int x = top.x + dx[i];
                int y = top.y + dy[i];

                if (0 <= x && x < n && 0 <= y && y < m) {
                    int cost      = top.cost + rotate(top.c, dest[x][y]) + 1;
                    int completed = top.completed | (1 << (x * m + y));
                    nodes.offer(new Node(x, y, cost, completed, dest[x][y]));
                }
            }
        }

        return INF;
    }

    int rotate(char from, char to) {
        return from == to ? 0 : 1;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    class Node implements Comparable<Node> {
        public final int x;
        public final int y;
        public final int cost;
        public final int completed;
        public final char c;

        public Node(int x, int y, int cost, int completed, char c) {
            this.x = x;
            this.y = y;
            this.cost = cost;
            this.completed = completed;
            this.c = c;
        }

        public int compareTo(Node other) {
            return Integer.valueOf(cost).compareTo(other.cost);
        }
    }
}
