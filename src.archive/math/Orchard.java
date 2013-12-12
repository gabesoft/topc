package topc.math;

import java.util.*;
import java.io.*;

// SRM 167 Division II Level Three - 900
// simple math, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=1859&rd=4640
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm167
public class Orchard {
    int[] dr = new int[] { 0, 0, -1, 1 };
    int[] dc = new int[] { 1, -1, 0, 0 };

    public int[] nextTree(String[] orchard) {
        int m = orchard.length;
        int n = orchard[0].length();

        int dist[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            Arrays.fill(dist[i], -1);
        }

        Arrays.fill(dist[0], 1);
        Arrays.fill(dist[m - 1], 1);

        for (int i = 0; i < m; i++) {
            dist[i][0] = 1;
            dist[i][n - 1] = 1;

            for (int j = 0; j < n; j++) {
                if (orchard[i].charAt(j) == 'T') {
                    dist[i][j] = 0;
                }
            }
        }

        boolean change = true;
        while (change) {
            change = false;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (dist[i][j] > -1) {
                        int d = dist[i][j] + 1;
                        for (int k = 0; k < dr.length; k++) {
                            int r = i + dr[k];
                            int c = j + dc[k];
                            if (0 <= r && r < m && 0 <= c && c < n) {
                                if(dist[r][c] == -1 || dist[r][c] > d) {
                                    dist[r][c] = d;
                                    change = true;
                                }
                            }
                        }
                    }
                }
            }
        }

        int r = 0;
        int c = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dist[i][j] > dist[r][c]) {
                    r = i;
                    c = j;
                }
            }
        }

        return new int[] { r + 1, c + 1 };
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
