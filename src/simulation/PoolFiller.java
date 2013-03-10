package topc.simulation;

import java.util.*;
import java.io.*;

// SRM 326 Division II Level Three - 1000
// simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=6731&rd=10006
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm326
public class PoolFiller {
    int [] dc = {0, 0, 1, -1};
    int [] dr = {1, -1, 0, 0};

    public int getCapacity(String[] layout) {
        int n         = layout.length;
        int m         = layout[0].length();
        int wallh[][] = new int[n][m];
        int level[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                wallh[i][j] = layout[i].charAt(j) - '0';
                level[i][j] = 9;
            }
        }

        while (flowOut(wallh, level));

        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sum += (level[i][j] - wallh[i][j]);
            }
        }

        return sum;
    }

    private boolean flowOut(int[][] wallh, int[][] level) {
        boolean change = false;
        int n = wallh.length;
        int m = wallh[0].length;

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < m; c++) {
                int lowest = getLowest(level, r, c);
                int newlv  = Math.max(wallh[r][c], lowest);

                if (newlv != level[r][c]) {
                    level[r][c] = newlv;
                    change      = true;
                }
            }
        }

        return change;
    }

    private int getLowest(int[][] level, int r, int c) {
        int lowest = 9;
        for (int i = 0; i < dr.length; i++) {
            int nr = r + dr[i];
            int nc = c + dc[i];
            lowest = Math.min(lowest, getLevel(level, nr, nc));
        }
        return lowest;
    }

    private int getLevel(int[][] level, int r, int c) {
        if (0 <= r && r < level.length && 0 <= c && c < level[0].length) {
            return level[r][c];
        } else {
            return 0;
        }
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
