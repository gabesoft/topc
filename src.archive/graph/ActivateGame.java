package topc.graph;

import java.util.*;
import java.io.*;

// SRM 470 Division II Level Three - 1000
// graph theory, greedy
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10750&rd=14153
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+470
public class ActivateGame {
    int [] dx = {0, 0, 1, -1};
    int [] dy = {1, -1, 0, 0}; 

    public int findMaxScore(String[] grid) {
        int n = grid.length;
        int m = grid[0].length();

        int[][] board = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                board[i][j] = value(grid, i, j);
            }
        }

        int sum = 0;
        int cnt = 0;
        boolean active[][] = new boolean[n][m];

        active[0][0] = true;
        cnt++;

        while (cnt < n * m) {
            int best = 0;
            int r    = -1;
            int c    = -1;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (active[i][j]) {
                        for (int k = 0; k < 4; k++) {
                            int u = i + dx[k];
                            int v = j + dy[k];

                            if (0 <= u && u < n && 0 <= v && v < m && !active[u][v]) {
                                int curr = Math.abs(board[i][j] - board[u][v]);
                                if (curr >= best) {
                                    best = curr;
                                    r = u;
                                    c = v;
                                }
                            }
                        }
                    }
                }
            }

            sum += best;
            active[r][c] = true;
            cnt++;
        }

        return sum;
    }

    int value(String[] grid, int i, int j) {
        char c = grid[i].charAt(j);
        if (Character.isDigit(c)) {
            return c - '0';
        }
        if (Character.isLowerCase(c)) {
            return c - 'a' + 10;
        }
        return c - 'A' + 36;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
