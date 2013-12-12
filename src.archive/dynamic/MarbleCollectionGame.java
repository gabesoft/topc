package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 391 Division II Level Three - 1050
// dynamic programming, graph theory
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=8488&rd=11125
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm391
public class MarbleCollectionGame {
    char [][] grid;
    boolean [][][][] adj;
    int [][] mark;
    boolean [] seen;
    int [] memo;

    public int collectMarble(String[] board) {
        int n = board.length;
        int m = board[0].length();

        adj = new boolean[n][m][n][m];

        grid = new char[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = board[i].charAt(j);
            }
        }

        mark = new int[n][m];

        group();

        seen = new boolean[n * m];
        memo = new int[n * m];

        return rec(mark[0][0]);
    }

    int rec(int cell) {
        if (seen[cell]) { return memo[cell]; }

        seen[cell] = true;

        int sum = 0;
        int t   = 0;

        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (mark[r][c] == cell) {
                    if (Character.isDigit(grid[r][c])) {
                        t += grid[r][c] - '0';
                    }
                    if (enter(r + 1, c) && mark[r + 1][c] != cell) {
                        sum = Math.max(sum, rec(mark[r + 1][c]));
                    }
                    if (enter(r, c + 1) && mark[r][c + 1] != cell) {
                        sum = Math.max(sum, rec(mark[r][c + 1]));
                    }
                    if (grid[r][c] == 'U' && enter(r - 1, c) && mark[r - 1][c] != cell) {
                        sum = Math.max(sum, rec(mark[r - 1][c]));
                    }
                    if (grid[r][c] == 'L' && enter(r, c - 1) && mark[r][c - 1] != cell) {
                        sum = Math.max(sum, rec(mark[r][c - 1]));
                    }
                }
            }
        }

        sum += t;
        memo[cell] = sum;
        return sum;
    }

    void group() {
        int g = 0;

        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                bfs(r, c);
            }
        }

        for (int i = 0; i < mark.length; i++) {
            Arrays.fill(mark[i], -1);
        }

        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (mark[r][c] > -1) { continue; }
                mark[r][c] = g++;

                for (int r1 = 0; r1 < grid.length; r1++) {
                    for (int c1 = 0; c1 < grid[0].length; c1++) {
                        if (adj[r][c][r1][c1] && adj[r1][c1][r][c]) {
                            mark[r1][c1] = mark[r][c];
                        }
                    }
                }
            }
        }
    }

    boolean enter(int r, int c) {
        return r >= 0 && r < grid.length && c >= 0 && c < grid[0].length;
    }

    void bfs(int r, int c) {
        adj[r][c][r][c] = true;
        Queue<Integer> qr = new LinkedList<Integer>();
        Queue<Integer> qc = new LinkedList<Integer>();

        qr.offer(r);
        qc.offer(c);

        while (qr.size() > 0) {
            int r1 = qr.poll();
            int c1 = qc.poll();

            if (enter(r1 + 1, c1) && !adj[r][c][r1 + 1][c1]) {
                adj[r][c][r1 + 1][c1] = true;
                qr.offer(r1 + 1);
                qc.offer(c1);
            }
            if (enter(r1, c1 + 1) && !adj[r][c][r1][c1 + 1]) {
                adj[r][c][r1][c1 + 1] = true;
                qr.offer(r1);
                qc.offer(c1 + 1);
            }
            if (grid[r1][c1] == 'U' && enter(r1 - 1, c1) && !adj[r][c][r1 - 1][c1]) {
                adj[r][c][r1 - 1][c1] = true;
                qr.offer(r1 - 1);
                qc.offer(c1);
            }
            if (grid[r1][c1] == 'L' && enter(r1, c1 - 1) && !adj[r][c][r1][c1 - 1]) {
                adj[r][c][r1][c1 - 1] = true;
                qr.offer(r1);
                qc.offer(c1 - 1);
            }
        }
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
