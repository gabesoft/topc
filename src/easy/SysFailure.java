package topc.easy;

import java.util.*;
import java.io.*;

// SRM 292 Division II Level Three - 1000
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=4513&rd=9813
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm292
public class SysFailure {
    int [] dr = { 0,  0, 1, -1, 1, -1,  1, -1 };
    int [] dc = { 1, -1, 0,  0, 1, -1, -1,  1 }; 

    public int critical(int n, String[] state) {
        int grid[][] = new int[state.length][state[0].length()];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = state[i].charAt(j) - '0';
            }
        }

        if (!ok(grid, n)) { return -1; }

        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    grid[i][j] = 0;
                    if (!ok(grid, n)) {
                        count++;
                    }
                    grid[i][j] = 1;
                }
            }
        }

        return count;
    }

    private boolean ok(int[][] grid, int k) {
        boolean seen[][] = new boolean[grid.length][grid[0].length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1 && !seen[i][j]) {
                    if (bfs(grid, seen, i, j, k)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    private boolean bfs(int[][] grid, boolean[][] seen, int u, int v, int k) {
        int n = grid.length;
        int m = grid[0].length;

        Queue<Integer> row = new LinkedList<Integer>();
        Queue<Integer> col = new LinkedList<Integer>();

        row.offer(u);
        col.offer(v);

        int cnt    = 1;
        seen[u][v] = true;

        while (row.size() > 0) {
            int r = row.poll();
            int c = col.poll();

            for (int i = 0; i < dr.length; i++) {
                int nr = r + dr[i];
                int nc = c + dc[i];

                if (0 <= nr && nr < n && 0 <= nc && nc < m) {
                    if (grid[nr][nc] == 1 && !seen[nr][nc]) {
                        seen[nr][nc] = true;
                        row.offer(nr);
                        col.offer(nc);
                        cnt++;
                    }
                }
            }
        }

        return cnt >= k;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
