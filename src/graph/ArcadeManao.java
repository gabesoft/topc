package topc.graph;

import java.util.*;
import java.io.*;

// SRM 576 Division I Level One - 256
// graph theory, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12504&rd=15496
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+576
public class ArcadeManao {
    int INF = 49;
    int h = 0;
    int w = 0;

    public int shortestLadder(String[] level, int coinRow, int coinColumn) {
        //return solve1(level, coinRow, coinColumn);
        return solve2(level, coinRow, coinColumn);
    }

    private int solve2(String[] level, int coinRow, int coinColumn) {
        h = level.length;
        w = level[0].length();

        for (int L = 0; L < INF; L++) {
            boolean seen[][] = new boolean[h][w];

            dfs(level, seen, h - 1, 0, L);
            if (seen[coinRow - 1][coinColumn - 1]) {
                return L;
            }
        }

        return INF;
    }

    private void dfs(String[] level, boolean[][] seen, int i, int j, int L) {
        if (seen[i][j]) { return; }

        seen[i][j] = true;

        if (j > 0 && level[i].charAt(j - 1) == 'X') {
            dfs(level, seen, i, j - 1, L);
        }
        if (j < w - 1 && level[i].charAt(j + 1) == 'X') {
            dfs(level, seen, i, j + 1, L);
        }
        for (int y = 0; y < h; y++) {
            if (Math.abs(y - i) <= L && level[y].charAt(j) == 'X') {
                dfs(level, seen, y, j, L);
            }
        }
    }

    private int solve1(String[] level, int coinRow, int coinColumn) {
        char grid[][] = new char[level.length][level[0].length()];

        char k    = '0';
        char last = '.';
        int coin  = -1;
        int start = -1;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (i == coinRow - 1 && j == coinColumn - 1) {
                    coin = k - '0';
                }

                char c = level[i].charAt(j);
                if (c == 'X') {
                    grid[i][j] = k;
                    start = k - '0';
                }
                if (c == '.') {
                    grid[i][j] = c;
                    if (last == 'X') { k++; }
                }
                last = c;
            }

            if (last == 'X') { k++; }
        }

        int n = (int)(k - '0') + 1;
        int graph[][] = new int[n][n];

        for (int i1 = 0; i1 < grid.length; i1++) {
            for (int j1 = 0; j1 < grid[0].length; j1++) {
                for (int i2 = i1 + 1; i2 < grid.length; i2++) {
                    for (int j2 = 0; j2 < grid[0].length; j2++) {
                        if (j1 == j2 && grid[i1][j1] != '.' && grid[i2][j2] != '.') {
                            int u = (int)(grid[i1][j1] - '0');
                            int v = (int)(grid[i2][j2] - '0');

                            graph[u][v] = i2 - i1;
                            graph[v][u] = i2 - i1;
                        }
                    }
                }
            }
        }

        int[][] seen = new int[n][grid.length];
        for (int i = 0; i < n; i++) {
            Arrays.fill(seen[i], -1);
        }

        return dfs(graph, seen, start, coin, 0);
    }

    private int dfs(int[][] graph, int[][] seen, int start, int end, int len) {
        if (start == end) { return len; }
        if (seen[start][len] == -2) return INF;
        if (seen[start][len] > -1) return seen[start][len];

        seen[start][len] = -2;

        int best = INF;
        for (int i = 0; i < graph.length; i++) {
            if (graph[start][i] > 0) {
                best = Math.min(best, dfs(graph, seen, i, end, Math.max(graph[start][i], len)));
            }
        }

        seen[start][len] = best;
        return best;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
