package topc.graph;

import java.util.*;
import java.io.*;

// SRM 593 Division I Level One - 250
// graph theory
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12784&rd=15705
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+593
public class HexagonalBoard {
    int dr[] = new int[] {  0, -1, -1,  0,  1,  1 };
    int dc[] = new int[] { -1,  0,  1,  1,  0, -1 };
    int n;
    int m;

    public int minColors(String[] board) {
        n = board.length;
        m = board[0].length();

        int[][] colors = new int[n][m];
        int max = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i].charAt(j) == 'X') {
                    color(board, colors, i, j);
                    max = Math.max(max, Math.min(3, colors[i][j]));
                }
            }
        }


        return max;
    }

    private void color(String[] board, int[][] colors, int row, int col) {
        if (colors[row][col] > 0) { return; }

        int color = 1;

        for (int i = 0; i < dr.length; i++) {
            int r = row + dr[i];
            int c = col + dc[i];

            if (valid(r, c) && board[r].charAt(c) == 'X' && colors[r][c] == color) {
                color++;
            }
        }

        colors[row][col] = color;

        for (int i = 0; i < dr.length; i++) {
            int r = row + dr[i];
            int c = col + dc[i];

            if (valid(r, c) && board[r].charAt(c) == 'X' && colors[r][c] == 0) {
                color(board, colors, r, c);
            }
        }
    }

    private boolean valid(int r, int c) {
        return 0 <= r && r < n && 0 <= c && c < m;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
