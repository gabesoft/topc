package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 400 Division II Level Three - 1000
// greedy, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=8778&rd=12172
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm400
public class LightedPanels {
    final int INF = Integer.MAX_VALUE / 4;

    int n    = 0;
    int m    = 0;
    int dx[] = new int[] { 0, 0, 0, 1, -1, 1, -1, 1, -1 };
    int dy[] = new int[] { 0, 1, -1, 0, 0, -1, -1, 1, 1 };

    public int minTouch(String[] board) {
        n = board.length;
        m = board[0].length();

        int graph[] = new int[n];

        for (int i = 0; i < n; i++) {
            String row = board[i];
            for (int j = 0; j < row.length(); j++) {
                if (row.charAt(j) == '.') {
                    graph[i] = on(graph[i], j);
                }
            }
        }

        int best = INF;
        for (int i = 0; i < (1 << (n + m - 1)); i++) {
            int next[] = touch(graph, i);
            best       = Math.min(best, Integer.bitCount(i) + find(next));
        }

        return best == INF ? -1 : best;
    }

    int find(int[] graph) {
        int count = 0;

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (isOn(graph[i - 1], j - 1)) {
                    toggle(graph, i, j);
                    count++;
                }
            }
        }

        return done(graph) ? count : INF;
    }

    boolean done(int[] graph) {
        for (int i = 0; i < graph.length; i++) {
            if (graph[i] != 0) { return false; }
        }
        return true;
    }

    int[] touch(int[] graph, int mask) {
        int next[] = graph.clone();

        for (int i = 0; i < m; i++) {
            if (isOn(mask, i)) {
                toggle(next, 0, i);
            }
        }

        for (int i = 1; i < n; i++) {
            if (isOn(mask, m + i - 1)) {
                toggle(next, i, 0);
            }
        }

        return next;
    }

    void toggle(int[] graph, int r, int c) {
        for (int i = 0; i < dx.length; i++) {
            int nr = r + dx[i];
            int nc = c + dy[i];

            if (0 <= nr && nr < n && 0 <= nc && nc < m) {
                graph[nr] = toggle(graph[nr], nc);
            }
        }
    }

    boolean isOn(int n, int bit) {
        return ((n >> bit) & 1) == 1;
    }

    int on(int n, int bit) {
        return n | (1 << bit);
    }

    int off(int n, int bit) {
        return n & ~(1 << bit);
    }

    int toggle(int n, int bit) {
        return n ^ (1 << bit);
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
