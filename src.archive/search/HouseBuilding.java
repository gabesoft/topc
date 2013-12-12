package topc.search;

import java.util.*;
import java.io.*;

// TCO13 Round 1A Division I Level One - 250
// simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12396&rd=15571
// editorial: http://apps.topcoder.com/wiki/display/tc/TCO+2013+Round+1a
public class HouseBuilding {
    int n;
    int m;

    public int getMinimum(String[] area) {
        n = area.length;
        m = area[0].length();

        int[][] data = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                data[i][j] = area[i].charAt(j) - '0';
            }
        }

        int best = 30000;
        for (int i = 0; i < 9; i++) {
            best = Math.min(best, diff(data, i));
        }

        return best;
    }

    private int diff(int[][] data, int min) {
        int max = min + 1;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int x  = data[i][j];
                sum   += Math.min(Math.abs(x - min), Math.abs(x - max));
            }
        }

        return sum;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
