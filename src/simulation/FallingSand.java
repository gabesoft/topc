package topc.simulation;

import java.util.*;
import java.io.*;

// SRM 661 Division II Level One - 250
// simulation, sorting
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13768&rd=16464
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+661
public class FallingSand {
    public String[] simulate(String[] board) {
        int n = board.length;
        int m = board[0].length();

        char[][] grid = new char[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = board[i].charAt(j);
            }
        }

        boolean change = true;
        while (change) {
            change = false;

            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < m; j++) {
                    if (grid[i][j] == 'o' && grid[i + 1][j] == '.') {
                        change = true;
                        grid[i + 1][j] = 'o';
                        grid[i][j] = '.';
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            board[i] = new String(grid[i]);
        }

        return board;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
