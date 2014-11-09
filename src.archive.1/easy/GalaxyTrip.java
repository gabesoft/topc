package topc.easy;

import java.util.*;
import java.io.*;

// SRM 290 Division II Level Three - 1000
// brute force, graph theory
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=5980&rd=9811
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm290
public class GalaxyTrip {
    public int[] possibleValues(String[] dependencies) {
        int n         = dependencies.length;
        int graph[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            String dep[] = dependencies[i].split("\\s+");
            for (int j = 0; j < dep.length; j++) {
                if (dep[j].length() > 0) {
                    int k       = Integer.parseInt(dep[j]);
                    graph[i][k] = 1;
                }
            }
        }


        int c    = 0;
        int cc[] = new int[n];

        boolean seen[] = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!seen[i]) {
                cc[c++] = bfs(graph, seen, i);
            }
        }


        boolean taken[] = new boolean[n + 1];

        find(cc, taken, 0);

        int t = 0;
        for (int i = 0; i < taken.length; i++) {
            if (taken[i]) {
                t++;
            }
        }

        int counts[] = new int[t];

        t = 0;
        for (int i = 0; i < taken.length; i++) {
            if (taken[i]) {
                counts[t++] = i;
            }
        }

        return counts;
    }

    private void find(int[] cc, boolean[] taken, int k) {
        if (k == cc.length || cc[k] == 0) { return; }

        find(cc, taken, k + 1);

        int x = cc[k];
        for (int y = taken.length - 1; y > -1; y--) {
            if (taken[y]) {
                taken[x + y] = true;
            }
        }
        taken[x] = true;

    }

    private int bfs(int[][] graph, boolean[] seen, int k) {
        int n   = graph.length;
        int q[] = new int[2 * n];
        int h   = n;
        int t   = n + 1;
        int cnt = 0;

        q[h]    = k;
        cnt     = 1;
        seen[k] = true;

        while (h < t) {
            int u = q[h++];

            for (int i = 0; i < n; i++) {
                if (graph[u][i] == 1 && !seen[i]) {
                    cnt++;
                    q[t++]  = i;
                    seen[i] = true;
                }
            }
        }

        return cnt;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
