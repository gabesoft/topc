package topc.graph;

import java.util.*;
import java.io.*;

// Pilot 2 Division I Level Two - 450
// graph theory, greedy, sorting
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10654&rd=13952
// editorial: http://apps.topcoder.com/wiki/display/tc/Algorithm+Problem+Set+Analysis
public class TransportationNetwork {
    double INF = Double.MAX_VALUE / 4.0;
    double airportCost;
    int n;

    public double minCost(int[] cityX, int[] cityY, double roadCost, double airportCost) {
        this.n           = cityX.length;
        this.airportCost = airportCost;
        double dist[][]  = new double[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                dist[i][j] = roadCost * calcDist(cityX[i], cityX[j], cityY[i], cityY[j]);
                dist[j][i] = dist[i][j];
            }
        }
        
        boolean air1[] = new boolean[n];
        boolean air2[] = new boolean[n];
        air2[0]        = true;

        double r1 = mst(new int[n][n], dist, air1, 0);
        double r2 = mst(new int[n][n], dist, air2, airportCost);

        return Math.min(r1, r2);
    }

    double mst(int[][] graph, double[][] dist, boolean[] hasAirport, double seed) {
        double result = seed;

        while (true) {
            double best        = INF;
            boolean setAirport = false;
            int u              = -1;
            int v              = -1;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i != j && graph[i][j] == 0) {
                        double d1 = dist[i][j];
                        double d2 = (hasAirport[i] ? 0 : airportCost) + (hasAirport[j] ? 0 : airportCost);
                        if (Math.min(d1, d2) < best) {
                            setAirport = d2 < d1;
                            best       = Math.min(d1, d2);
                            u          = i;
                            v          = j;
                        }
                    }
                }
            }

            if (u == -1) { break; }

            if (setAirport) {
                hasAirport[u] = true;
                hasAirport[v] = true;
            }

            result += best;

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

        return result;
    }

    double calcDist(int x1, int x2, int y1, int y2) {
        return Math.sqrt(sq(x1 - x2) + sq(y1 - y2));
    }

    double sq(double x) {
        return x * x;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
