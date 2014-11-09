package topc.graph;

import java.util.*;
import java.io.*;

// SRM 341 Division I Level Two - 550
// graph theory, search
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=7512&rd=10665
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm341
public class LandAndSea {
    int [] dx = { 0, 0, 1, -1 };
    int [] dy = { 1, -1, 0, 0 }; 
    int [] dr = { 0,  0, 1, -1, 1, -1,  1, -1 };
    int [] dc = { 1, -1, 0,  0, 1, -1, -1,  1 }; 

    public int[] howManyIslands(String[] seaMap) {
        int n = seaMap.length;
        int m = seaMap[0].length();

        int graph[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                graph[i][j] = seaMap[i].charAt(j) == 'x' ? -1 : -2;
            }
        }

        int id = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (graph[i][j] == -1) {
                    markIsland(graph, i, j, id++);
                }
            }
        }

        if (id == 0) { return new int[0]; }

        int map[][] = new int[n + 2][m + 2];
        Arrays.fill(map[0], -1);
        Arrays.fill(map[n + 1], -1);

        for (int i = 0; i < map.length; i++) {
            map[i][0]     = -1;
            map[i][m + 1] = -1;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                map[i + 1][j + 1] = graph[i][j];
            }
        }

        int islands[] = new int[id];
        for (int i = 0; i < id; i++) {
            islands[i] = outerIsland(map, i);
        }

        int levels[]   = new int[id];
        int maxl       = 0;
        boolean change = true;

        while (change) {
            change = false;

            for (int i = 0; i < id; i++) {
                for (int j = 0; j < id; j++) {
                    if (islands[j] == i) {
                        int l = Math.max(levels[i], levels[j] + 1);
                        if (l > levels[i]) {
                            change    = true;
                            levels[i] = l;
                            maxl      = Math.max(maxl, l);
                        }
                    }
                }
            }
        }

        int res[] = new int[maxl + 1];
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < levels.length; j++) {
                if (levels[j] == i) {
                    res[i]++;
                }
            }
        }

        return res;
    }

    void findIsland(int[][] graph, Queue<Integer> rows, Queue<Integer> cols, int island) {
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[0].length; j++) {
                if (graph[i][j] == island) {
                    rows.offer(i);
                    cols.offer(j);
                    return;
                }
            }
        }
    }

    int outerIsland(int[][] graph, int island) {
        int n = graph.length;
        int m = graph[0].length;

        Queue<Integer> rows = new LinkedList<Integer>();
        Queue<Integer> cols = new LinkedList<Integer>();
        boolean seen[][]    = new boolean[n][m];
        int outer           = 100;

        findIsland(graph, rows, cols, island);

        while (rows.size() > 0) {
            int r = rows.poll();
            int c = cols.poll();

            if (graph[r][c] != island && graph[r][c] > -2) {
                outer = Math.min(outer, graph[r][c]);
                continue;
            }

            if (seen[r][c]) { continue; }

            seen[r][c] = true;

            for (int i = 0; i < dx.length; i++) {
                int nr = r + dx[i];
                int nc = c + dy[i];

                if (graph[nr][nc] != island) {
                    rows.offer(nr);
                    cols.offer(nc);
                }
            }
        }

        return outer;
    }

    void markIsland(int[][] graph, int row, int col, int id) {
        int n = graph.length;
        int m = graph[0].length;

        Queue<Integer> rows = new LinkedList<Integer>();
        Queue<Integer> cols = new LinkedList<Integer>();
        boolean seen[][]    = new boolean[n][m];

        rows.offer(row);
        cols.offer(col);

        while (rows.size() > 0) {
            int r = rows.poll();
            int c = cols.poll();

            graph[r][c] = id;

            if (seen[r][c]) { continue; }

            seen[r][c] = true;

            for (int i = 0; i < dr.length; i++) {
                int nr = r + dr[i];
                int nc = c + dc[i];

                if (0 <= nr && nr < n && 0 <= nc && nc < m && graph[nr][nc] == -1) {
                    rows.offer(nr);
                    cols.offer(nc);
                }
            }
        }
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
