package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 622 Division I Level One - 250
// dynamic programming, graph theory
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13193&rd=15855
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+622
public class BuildingRoutes {
    public static final int INF = 1000000000;
    public int build(String[] dist, int T) {
        int n = dist.length;
        int[][] roadcount = new int[n][n];
        int[][] mindist = new int[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(mindist[i], INF);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mindist[i][j] = dist[i].charAt(j) - '0';
            }
        }

        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    mindist[i][j] = Math.min(mindist[i][j], mindist[i][k] + mindist[k][j]);
                }
            }
        }

        for (int a = 0; a < n; a++) {
            for (int b = 0; b < n; b++) {
                for (int x = 0; x < n; x++) {
                    for (int y = 0; y < n; y++) {
                        if (x != y && a != b) {
                            if (mindist[a][x] + (dist[x].charAt(y) - '0') + mindist[y][b] == mindist[a][b]) {
                                roadcount[x][y]++;
                            }
                        }
                    }
                }
            }
        }

        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (roadcount[i][j] >= T) {
                    res += dist[i].charAt(j) - '0';
                }
            }
        }

        return res;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
