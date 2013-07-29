package topc.simulation;

import java.util.*;
import java.io.*;

// SRM 173 Division II Level Three - 1000
// simulation, string manipulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=1955&rd=4670
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm173
public class Centipede {
    char [][] grid;
    int m;
    int n;

    public String[] simulate(String[] screenLayout, int timeUnits) {
        m    = screenLayout.length;
        n    = screenLayout[0].length();
        grid = new char[m][];

        for (int i = 0; i < m; i++) {
            grid[i] = screenLayout[i].toCharArray();
        }

        int k = timeUnits % getCycleLength();
        for (int i = 1; i < 11; i++) {
            trav(0, i, 1, k);
        }

        String[] output = new String[m];
        for (int i = 0; i < m; i++) {
            output[i] = new String(grid[i]);
        }

        return output;
    }

    private int trav(int row, int col, int dir, int steps) {
        if (row == m) { return 9; }

        if (steps == 0) {
            grid[row][col] = 'x';
            return 0;
        }

        if (grid[row][col + dir] == '#') {
            if (row == m - 1 || grid[row + 1][col] != '#') {
                return 1 + trav(row + 1, col, -dir, steps - 1);
            } else {
                return 1 + trav(row, col, -dir, steps - 1);
            }
        }

        return 1 + trav(row, col + dir, dir, steps - 1);
    }

    private int getCycleLength() {
        return trav(0, 10, 1, -1);
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
