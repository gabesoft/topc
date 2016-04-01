package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 686 Division II Level Two - 500
// greedy
// statement: https://community.topcoder.com/stat?c=problem_statement&pm=14213&rd=16690
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+686
public class SegmentsAndPoints {
    public String isPossible(int[] p, int[] l, int[] r) {
        int n = p.length;
        int[][] G = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (l[i] <= p[j] && p[j] <= r[i]) {
                    G[i][j] = 1;
                }
            }
        }

        int[] match = new int[n];
        Arrays.fill(match, -1);

        int matchCount = 0;
        for (int u = 0; u < n; u++) {
            boolean seen[] = new boolean[n];

            if (dfs(G, u, seen, match)) {
                matchCount++;
            }
        }

        return n == matchCount ? "Possible" : "Impossible";
    }

    private boolean dfs(int[][] G, int u, boolean[] seen,  int[] match) {
        for (int v = 0; v < G[0].length; v++) {
            if (G[u][v] == 1 && !seen[v]) {
                seen[v] = true;

                if (match[v] < 0 || dfs(G, match[v], seen, match)) {
                    match[v] = u;
                    return true;
                }
            }
        }

        return false;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
