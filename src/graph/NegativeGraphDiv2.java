package topc.graph;

import java.util.*;
import java.io.*;

// SRM 626 Division II Level Three - 1000
// graph theory
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13247&rd=15859
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+626
public class NegativeGraphDiv2 {
    private final int INF = 1000000000;

    public long findMin(int N, int[] s, int[] t, int[] weight, int charges) {
        int[][] dist = new int[N][N];

        for (int i = 0; i < N; i++) {
            Arrays.fill(dist[i], INF);
            dist[i][i] = 0;
        }

        for (int i = 0; i < weight.length; i++) {
            int u = s[i] - 1;
            int v = t[i] - 1;
            int w = weight[i];
            dist[u][v] = Math.min(dist[u][v], w);
        }

        // Floyd-Warshall
        for (int k = 0; k < N; k++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                }
            }
        }

        int[][] xdist = new int[charges + 1][N];

        // base case (O,u) to (O, N)
        for (int i = 0; i < N; i++) {
            xdist[0][i] = dist[i][N - 1];
        }

        // recursive case (k, u) to (0, N)
        for (int k = 1; k <= charges; k++) {
            for (int i = 0; i < N; i++) {
                xdist[k][i] = xdist[k - 1][i];

                for (int j = 0; j < weight.length; j++) {
                    int u = s[j] - 1;
                    int v = t[j] - 1;
                    int w = -weight[j];

                    xdist[k][i] = Math.min(xdist[k][i], dist[i][u] + w + xdist[k - 1][v]);
                }
            }
        }

        return xdist[charges][0];
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
