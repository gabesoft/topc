package topc.search;

import java.util.*;
import java.io.*;

// SRM 322 Division II Level Three - 1000
// search
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=6800&rd=10002
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm322
public class BattleshipChecker {
    int n;
    int m;
    int[] dr1 = new int[] { -1, 1,  0, 0 };
    int[] dc1 = new int[] {  0, 0, -1, 1 };
    int[] dr2 = new int[] { -1, 1, -1, 1 };
    int[] dc2 = new int[] { 1, -1, -1, 1 };

    public String checkBoard(String[] board) {
        n = board.length;
        m = board[0].length();

        char bn[][] = new char[n][m];
        char bt[][] = new char[m][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                bn[i][j] = board[i].charAt(j);
                bt[j][i] = bn[i][j];
            }
        }

        return valid(bn) ? String.format("ACCEPTED, %s POINTS", value(bn, bt)) : "REJECTED";
    }

    private int value(char[][] bn, char[][] bt) {
        int v = 0;

        for (int i = 0; i < bn.length; i++) {
            if (free(bn[i])) { v++; }
        }
        for (int i = 0; i < bt.length; i++) {
            if (free(bt[i])) { v++; }
        }

        return v;
    }

    private boolean free(char[] row) {
        for (int i = 0; i < row.length; i++) {
            if (row[i] == 'X') {
                return false;
            }
        }
        return true;
    }

    private boolean valid(char[][] board) {
        int count[]      = new int[] { 0, 4, 3, 2, 1 };
        boolean seen[][] = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!seen[i][j] && board[i][j] == 'X') {
                    int c = dfs(board, seen, i, j);
                    if (c == -1 || c > 4) {
                        return false;
                    } else {
                        count[c]--;
                    }
                }
            }
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                return false;
            }
        }

        return true;
    }

    private int dfs(char[][] board, boolean[][] seen, int r, int c) {
        if (seen[r][c] || board[r][c] != 'X') { return 0; }

        seen[r][c] = true;

        int count = 1;

        // check diagonals
        for (int i = 0; i < dr2.length; i++) {
            int nr = r + dr2[i];
            int nc = c + dc2[i];
            if (on(nr, nc) && board[nr][nc] == 'X') {
                return -1;
            }
        }

        for (int i = 0; i < dr1.length; i++) {
            int nr = r + dr1[i];
            int nc = c + dc1[i];
            if (on(nr, nc)) {
                int next = dfs(board, seen, nr, nc);
                if (next == -1) {
                    return -1;
                } else {
                    count += next;
                }
            }
        }

        return count;
    }

    private boolean on(int r, int c) {
        return 0 <= r && r < n && 0 <= c && c < m;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
