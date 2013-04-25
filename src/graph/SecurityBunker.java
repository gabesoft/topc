package topc.graph;

import java.util.*;
import java.io.*;

// SRM 269 Division I Level Two - 500
// graph theory
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=4650&rd=8002
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm269
public class SecurityBunker {
    public double chooseBomb(String[] field) {
        int n = field.length;
        int m = field[0].length();

        int s = 101;
        int b = 0;
        int o = s;

        int grid[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                char c = field[i].charAt(j);
                if (c == '?') {
                    grid[i][j] = o++;
                } else if (c == '*') {
                    grid[i][j] = b++;
                } else {
                    grid[i][j] = -1;
                }
            }
        }

        int graph[][] = new int[o][o];
        for (int x1 = 0; x1 < n; x1++) {
            for (int y1 = 0; y1 < m; y1++) {
                if (grid[x1][y1] == -1) { continue; }

                for (int x2 = 0; x2 < n; x2++) {
                    for (int y2 = 0; y2 < m; y2++) {
                        if (grid[x2][y2] == -1) { continue; }

                        int o1   = grid[x1][y1];
                        int o2   = grid[x2][y2];
                        int dist = sq(x1 - x2) + sq(y1 - y2);

                        graph[o1][o2] = dist;
                        graph[o2][o1] = dist;
                    }
                }
            }
        }

        for (int k = 0; k < s; k++) {
            for (int i = 0; i < s; i++) {
                for (int j = 0; j < o; j++) {
                    if (graph[i][k] > 0 && graph[k][j] > 0) {
                        graph[i][j] = Math.min(graph[i][j], Math.max(graph[i][k], graph[k][j]));
                    }
                }
            }
        }

        int best = 0;
        for (int i = 0; i < s; i++) {
            for (int j = s; j < o; j++) {
                best = Math.max(best, graph[i][j]);
            }
        }


        return Math.sqrt(best);
    }

    private int sq(int k) {
        return k * k;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
