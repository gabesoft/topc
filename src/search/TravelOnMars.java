package topc.search;

import java.util.*;
import java.io.*;

// SRM 583 Division I Level One - 250
// search
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12608&rd=15503
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+583
public class TravelOnMars {
    public int minTimes(int[] range, int startCity, int endCity) {
        int n = range.length;
        int graph[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int r = 0; r < Math.min(range[i] + 1, n); r++) {
                graph[i][(i + r) % n] = 1;
                graph[i][(n + i - r) % n] = 1;
            }
        }

        return bfs(graph, startCity, endCity);
    }

    private int bfs(int[][] graph, int start, int end) {
        int n          = graph.length;
        int queue[]    = new int[n * n];
        int len[]      = new int[n * n];
        boolean seen[] = new boolean[n];

        int h = 0;
        int t = 0;

        queue[t++] = start;
        while (h < t) {
            int u = queue[h];
            int l = len[h++];

            if (u == end) { return l; }
            if (seen[u]) { continue; }

            seen[u] = true;
            for (int i = 0; i < n; i++) {
                if (graph[u][i] == 1) {
                    queue[t] = i;
                    len[t++] = l + 1;
                }
            }
        }

        return -1;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
