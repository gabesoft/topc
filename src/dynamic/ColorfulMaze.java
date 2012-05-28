package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 464 Division I Level Three - 1000
// dynamic programming, graph theory
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10741&rd=14149
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+464
public class ColorfulMaze {
    final int EMPTY = 7;

    int[] mover = new int[] { -1, 0, 1, 0 };
    int[] movec = new int[] { 0, -1, 0, 1 };

    int n;
    int m;

    double[] trap;
    double[][][][] memo;
    char[][] maze;

    public double getProbability(String[] maze, int[] trap) {
        this.n    = maze.length;
        this.m    = maze[0].length();
        this.maze = new char[n][m];
        this.trap = new double[7];
        this.memo = new double[8][1 << 7][n][m];

        for (int i = 0; i < trap.length; i++) {
            this.trap[i] = trap[i] / 100.0;
        }

        for (int i = 0; i < memo.length; i++) {
            for (int j = 0; j < memo[0].length; j++) {
                for (int k = 0; k < n; k++) {
                    Arrays.fill(memo[i][j][k], -2);
                }
            }
        }

        int sr = -1;
        int sc = -1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                this.maze[i][j] = maze[i].charAt(j);

                if (this.maze[i][j] == '$') {
                    sr = i;
                    sc = j;
                    this.maze[i][j] = '.';
                }
            }
        }

        return dp(sr, sc, EMPTY, 0);
    }

    double dp(int r, int c, int d, int s) {
        if (memo[d][s][r][c] > -1.0) { return memo[d][s][r][c]; }

        char p     = maze[r][c];
        int v      = p - 'A';
        double res = 0.0;

        if (v == d) {
            for (int i = 0; i < mover.length; i++) {
                int rr = r + mover[i];
                int cc = c + movec[i];

                if (rr < 0 || rr > n - 1) { continue; }
                if (cc < 0 || cc > m - 1) { continue; }

                char pp = maze[rr][cc];
                int vv  = pp - 'A';

                if (pp == '#' || pp == d + 'A') { continue; }
                if (pp == '!') { return 1.0; }

                if ('A' <= pp && pp <= 'G' && (((s >> vv) & 1) == 0)) {
                    res = Math.max(res, (1.0 - trap[vv]) * dp(rr, cc, d, s | (1 << vv)));
                } else {
                    res = Math.max(res, dp(rr, cc, d, s));
                }
            }
        } else {
            List<Pt> border  = new ArrayList<Pt>();
            List<Pt> safe    = new ArrayList<Pt>();
            boolean[][] seen = new boolean[n][m];
            boolean exit     = false;

            safe.add(new Pt(r, c));
            for (int q = 0; q < safe.size(); q++) {
                Pt point = safe.get(q);

                for (int i = 0; i < mover.length; i++) {
                    int rr = point.r + mover[i];
                    int cc = point.c + movec[i];

                    if (rr < 0 || rr > n - 1) { continue; }
                    if (cc < 0 || cc > m - 1) { continue; }

                    char pp = maze[rr][cc];
                    int vv  = pp - 'A';

                    if (pp == '#' || pp == d + 'A') { continue; }
                    if (pp == '!') { exit = true; }

                    if (seen[rr][cc]) { continue; }
                    seen[rr][cc] = true;

                    if ('A' <= pp && pp <= 'G' && (((s >> vv) & 1) == 0)) {
                        border.add(new Pt(rr, cc));
                    } else {
                        safe.add(new Pt(rr, cc));
                    }
                }
            }

            if (exit) { return 1.0; }

            for (Pt point : border) {
                int rr = point.r;
                int cc = point.c;

                char pp = maze[rr][cc];
                int vv  = pp - 'A';

                double p1 = (1.0 - trap[vv]) * dp(rr, cc , d, s | (1 << vv));
                double p2 = (d == EMPTY) ? trap[vv] * dp(rr, cc, vv, s) : 0.0;

                res = Math.max(res, p1 + p2);
            }

            for (Pt point : safe) {
                memo[d][s][point.r][point.c] = res;
            }
        }

        memo[d][s][r][c] = res;
        return res;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    class Pt {
        public final int r;
        public final int c;

        public Pt(int r, int c) {
            this.r = r;
            this.c = c;
        }

        public String toString() {
            return String.format("%s,%s", r, c);
        }
    }
}
