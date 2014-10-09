package topc.easy;

import java.util.*;
import java.io.*;

// SRM 563 Division II Level Two - 550
// brute force, simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12332&rd=15185
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+563
public class CoinsGameEasy {
    int dx[] = new int[] { 1, -1, 0, 0 };
    int dy[] = new int[] { 0, 0, -1, 1 };

    public int minimalSteps(String[] board) {
        int n = board.length;
        int m = board[0].length();
        int r1 = -1;
        int c1 = -1;
        int r2 = -1;
        int c2 = -1;

        for (int i = 0; i < n && r2 == -1; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i].charAt(j) == 'o') {
                    if (r1 == -1) {
                        r1 = i;
                        c1 = j;
                    } else {
                        r2 = i;
                        c2 = j;
                        break;
                    }
                }
            }
        }

        int best = 1000;
        boolean seen[][][][] = new boolean[n][m][n][m];
        Queue<Integer> Q = new LinkedList<Integer>();

        Q.offer(r1);
        Q.offer(c1);
        Q.offer(r2);
        Q.offer(c2);
        Q.offer(0);

        while (Q.size() > 0) {
            int x1 = Q.poll();
            int y1 = Q.poll();
            int x2 = Q.poll();
            int y2 = Q.poll();
            int steps = Q.poll();


            if (x1 == x2 && y1 == y2) { continue; }
            if (steps > 10) { continue; }
            if (out(x1, y1, n, m) && out(x2, y2, n, m)) { continue; }

            if (out(x1, y1, n, m) || out(x2, y2, n, m)) {
                best = Math.min(best, steps);
                continue;
            }

            if (seen[x1][y1][x2][y2]) { continue; }

            seen[x1][y1][x2][y2] = true;

            for (int i = 0; i < dx.length; i++) {
                int nx1 = x1 + dx[i];
                int ny1 = y1 + dy[i];
                int nx2 = x2 + dx[i];
                int ny2 = y2 + dy[i];

                if (!out(nx1, ny1, n, m) && board[nx1].charAt(ny1) == '#') {
                    nx1 = x1;
                    ny1 = y1;
                }
                if (!out(nx2, ny2, n, m) && board[nx2].charAt(ny2) == '#') {
                    nx2 = x2;
                    ny2 = y2;
                }

                if (nx1 != x1 || ny1 != y1 || nx2 != x2 || ny2 != y2) {
                    Q.offer(nx1);
                    Q.offer(ny1);
                    Q.offer(nx2);
                    Q.offer(ny2);
                    Q.offer(steps + 1);
                }
            }
        }

        return best == 1000 ? -1 : best;
    }

    private boolean out(int r, int c, int n, int m) {
        return !(0 <= r && r < n && 0 <= c && c < m);
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
