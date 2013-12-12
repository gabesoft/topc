package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 345 Division II Level Three - 1000
// dynamic programming, graph theory
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=6763&rd=10669
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm345
public class BikeRiding {
    int n;
    int end;
    long[] memo;
    boolean[] cycle;
    boolean[][] graph;

    public int countRoutes(String[] paths, int[] startPoints, int endPoint, int k) {
        n   = paths.length;
        end = endPoint;

        graph = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                graph[i][j] = paths[i].charAt(j) == '1';
            }
        }

        cycle = new boolean[n];
        memo  = new long[n];

        Arrays.fill(memo, -1);

        long count = 0;
        for (int i = 0; i < startPoints.length; i++) {
            count += countRoutes(new boolean[n], startPoints[i]);
        }

        if (memo[end] == -1) { return 0; }

        for (int i = 0; i < n; i++) {
            if (memo[i] > 0 && cycle[i]) {
                return -1;
            }
        }

        return count > k ? -1 : (int)count;
    }

    long countRoutes(boolean[] mark, int v) {
        if (memo[v] > -1) { return memo[v]; }

        mark[v] = true;

        long count = (v == end) ? 1 : 0;
        for (int i = 0; i < n; i++) {
            if (graph[v][i]) {
                if (mark[i]) {
                    cycle[i] = true;
                } else {
                    count += countRoutes(mark, i);
                }
            }
        }

        mark[v] = false;
        memo[v] = count;

        return memo[v];
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
