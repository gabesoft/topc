package topc.easy;

import java.util.*;
import java.io.*;

// SRM 590 Division II Level Two - 500
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12743&rd=15702
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+590
public class FoxAndGo {
    int dx[] = new int[] { 0, 0, -1, 1 };
    int dy[] = new int[] { -1, 1, 0, 0 };
    boolean[][] seen;
    int[] white;
    int[] empty;
    int n;
    String[] board;

    public int maxKill(String[] board) {
        this.board = board;
        this.n     = board.length;

        int best = getCount();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i].charAt(j) == '.') {
                    String prev = board[i];
                    board[i]    = board[i].substring(0, j) + 'x' + board[i].substring(j + 1);
                    best        = Math.max(best, getCount());
                    board[i]    = prev;
                }
            }
        }

        return best;
    }

    private int getCount() {
        this.seen  = new boolean[n][n];
        this.white = new int[n * n];
        this.empty = new int[n * n];

        int id = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i].charAt(j) == 'o') {
                    whiteDFS(i, j, id++);
                }
            }
        }

        int count = 0;
        for (int i = 1; i < white.length; i++) {
            if (empty[i] == 0) {
                count += white[i];
            }
        }

        return count;
    }

    private void whiteDFS(int r, int c, int id) {
        if (!inBounds(r, c)) { return; }
        if (board[r].charAt(c) == '.') {
            empty[id]++;
            return;
        }
        if (seen[r][c]) { return; }

        seen[r][c] = true;
        if (board[r].charAt(c) == 'o') {
            white[id]++;
            for (int k = 0; k < dx.length; k++) {
                whiteDFS(r + dx[k], c + dy[k], id);
            }
        }
    }

    private boolean inBounds(int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < n;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
