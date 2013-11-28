package topc.math;

import java.util.*;
import java.io.*;

// SRM 477 Division I Level One - 250
// simple math, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10874&rd=14157
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+477
public class Islands {
    int n;
    int m;

    int[][] drow = new int [][] {
        new int[] { 0, 0,  1, -1, 1, -1 },
        new int[] { 0, 1, -1,  1, 0, -1 }
    };
    int[][] dcol = new int [][] {
        new int[] { -1, 1, -1, -1, 0, 0 },
        new int[] { -1, 0,  0,  1, 1, 1 }
    };

    public int beachLength(String[] kingdom) {
        n = kingdom.length;
        m = kingdom[0].length();

        int c = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (kingdom[i].charAt(j) == '#') {
                    c += beach(kingdom, i, j);
                }
            }
        }
        return c;
    }

    private int beach(String[] kingdom, int row, int col) {
        int dr[] = drow[row % 2];
        int dc[] = dcol[row % 2];

        int cnt = 0;
        for (int i = 0; i < dr.length; i++) {
            int r = row + dr[i];
            int c = col + dc[i];
            if (valid(r, c) && kingdom[r].charAt(c) == '.') {
                cnt++;
            }
        }

        return cnt;
    }

    private boolean valid(int r, int c) {
        return 0 <= r && r < n && 0 <= c && c < m;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
