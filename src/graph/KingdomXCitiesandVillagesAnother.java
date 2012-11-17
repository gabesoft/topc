package topc.graph;

import java.util.*;
import java.io.*;

// Member SRM 503 Division II Level Three - 900
// graph theory, greedy
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10835&rd=14432
// editorial: http://apps.topcoder.com/wiki/display/tc/Algorithm+Problem+Set+Analysis
public class KingdomXCitiesandVillagesAnother {
    double INF = Double.MAX_VALUE / 4.0;

    public double determineLength(int[] cityX, int[] cityY, int[] villageX, int[] villageY) {
        int cities      = cityX.length;
        int villages    = villageX.length;
        int n           = cities + villages;
        int graph[][]   = new int[n][n];
        double dist[][] = new double[n][n];
        double sum      = 0;

        for (int i = 0; i < n; i++) {
            for (int j = cities; j < cities + villages; j++) {
                if (i != j) {
                    int cx = i < cities ? cityX[i] : villageX[i - cities];
                    int cy = i < cities ? cityY[i] : villageY[i - cities];
                    int vx = villageX[j - cities];
                    int vy = villageY[j - cities];

                    dist[i][j] = Math.sqrt(sq(cx - vx) + sq(cy - vy));
                    dist[j][i] = dist[i][j];
                }
            }
        }

        for (int i = 0; i < cities; i++) {
            for (int j = 0; j < cities; j++) {
                graph[i][j] = 1;
            }
        }

        // find the minimum spanning tree using kruskal's algorithm
        while (true) {
            double best = INF;
            int u       = -1;
            int v       = -1;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i != j && graph[i][j] == 0 && dist[i][j] < best) {
                        best = dist[i][j];
                        u = i;
                        v = j;
                    }
                }
            }

           if (best == INF) { break; }

            sum += best;

            graph[u][v] = 1;
            graph[v][u] = 1;

            for (int k = 0; k < n; k++) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        graph[i][j] |= graph[i][k] & graph[k][j];
                    }
                }
            }
        }

        return sum;
    }

    double sq(double x) {
        return x * x;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
