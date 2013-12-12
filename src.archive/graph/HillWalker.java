package topc.graph;

import java.util.*;
import java.io.*;

// SRM 383 Division II Level Three - 1000
// graph theory
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=8383&rd=10806
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm383
public class HillWalker {
    int threshold  = 0;
    int timeToDark = 0;
    int n          = 0;
    int m          = 0;
    int best       = 0;
    int grid[][]   = null;
    int[] dx       = { 0, 0, -1, 1 };
    int[] dy       = { -1, 1, 0, 0 };

    public int highestPoint(String[] landscape, int threshold, int timeToDark) {
        this.threshold  = threshold;
        this.timeToDark = timeToDark;
        this.n          = landscape.length;
        this.m          = landscape[0].length();
        this.grid       = new int[n][m];

        for (int i = 0; i < n; i++) {
            String s = landscape[i];
            for (int j = 0; j < m; j++) {
                grid[i][j] = value(s.charAt(j));
            }
        }

        best = 0;
        bfs(0, 0, 0, 0);

        return Math.max(best, grid[0][0]);
    }

    void bfs(int row, int col, int alt, int cost) {
        Queue<Node> nodes = new PriorityQueue<Node>();
        boolean seen[][]  = new boolean[n][m];

        nodes.offer(new Node(row, col, alt, cost));
        while (nodes.size() > 0) {
            Node top = nodes.poll();

            if (top.row == 0 && top.col == 0) {
                best = Math.max(best, top.alt);
            } else if (row == 0 && col == 0) {
                bfs(top.row, top.col, top.alt, top.cost);
            }

            if (seen[top.row][top.col]) {
                continue;
            }

            seen[top.row][top.col] = true;

            for (int i = 0; i < dx.length; i++) {
                int r = top.row + dx[i];
                int c = top.col + dy[i];

                if (canGo(top.row, top.col, r, c)) {
                    int time = top.cost + getCost(top.row, top.col, r, c);
                    if (time <= timeToDark) {
                        nodes.offer(new Node(r, c, Math.max(top.alt, grid[r][c]), time));
                    }
                }
            }
        }
    }

    boolean canGo(int fr, int fc, int tr, int tc) {
        if (tr < 0 || tr >= n) { return false; }
        if (tc < 0 || tc >= m) { return false; }
        if (Math.abs(grid[tr][tc] - grid[fr][fc]) > threshold) { return false; }
        return true;
    }

    int getCost(int fr, int fc, int tr, int tc) {
        if (grid[fr][fc] >= grid[tr][tc]) { return 1; }

        int dx = grid[tr][tc] - grid[fr][fc];
        return dx * dx;
    }

    int value(char c) {
        return c <= 'Z' ? c - 'A' : c - 'a' + 26;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    class Node implements Comparable<Node> {
        public final int row;
        public final int col;
        public final int alt;
        public final int cost;

        public Node(int row, int col, int alt, int cost) {
            this.row  = row;
            this.col  = col;
            this.alt  = alt;
            this.cost = cost;
        }

        public int compareTo(Node other) {
            return cost - other.cost;
        }
    }
}
