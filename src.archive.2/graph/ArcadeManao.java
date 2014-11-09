package topc.graph;

import java.util.*;
import java.io.*;

// SRM 576 Division I Level One - 256
// graph theory, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12504&rd=15496
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+576
public class ArcadeManao {
    String[] L;
    public int shortestLadder(String[] level, int coinRow, int coinColumn) {
        L = level;

        coinRow = coinRow - 1;
        coinColumn = coinColumn - 1;

        for (int l = 0; l < level.length; l++) {
            if (can(coinRow, coinColumn, l)) {
                return l;
            }
        }

        return -1;
    }

    private boolean can(int row, int col, int l) {
        int n = L.length;
        int m = L[0].length();
        Queue<Integer> Q = new LinkedList<Integer>();
        boolean[][] seen = new boolean[n][m];

        Q.offer(n - 1);
        Q.offer(0);

        while (Q.size() > 0) {
            int r = Q.poll();
            int c = Q.poll();

            if (r == row && c == col) { return true; }
            if (seen[r][c]) { continue; }

            seen[r][c] = true;

            int nr;
            int nc;

            nr = r;
            nc = c - 1;

            if (valid(r, c - 1)) {
                Q.offer(r);
                Q.offer(c - 1);
            }

            if (valid(r, c + 1)) {
                Q.offer(r);
                Q.offer(c + 1);
            }

            for (int i = 1; i <= l; i++) {
                if (valid(r + i, c)) {
                    Q.offer(r + i);
                    Q.offer(c);
                }
                if (valid(r - i, c)) {
                    Q.offer(r - i);
                    Q.offer(c);
                }
            }
        }

        return false;
    }

    private boolean valid(int r, int c) {
        if (0 <= r && r < L.length && 0 <= c && c < L[0].length()) {
            return L[r].charAt(c) == 'X';
        } else {
            return false;
        }
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
