package topc.graph;

import java.util.*;
import java.io.*;

// SRM 462 Division II Level Three - 1000
// graph theory
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10594&rd=14147
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+462
public class SteeplechaseTrack {
    int best;
    int N;

    public int maxComplexity(String[] fences, String[] tracks, int N) {
        this.N = N;

        int n         = fences.length;
        int[][] graph = new int[n + 2][n + 2];
        int[] f       = new int[n + 2];

        for (int i = 0; i < graph.length; i++) {
            Arrays.fill(graph[i], -1);
        }

        for (int i = 0; i < n; i++) {
            int j = fences[i].charAt(0) - '0';
            int s = fences[i].charAt(1) - '0';
            int e = fences[i].charAt(2) - '0';

            if (s > 0) {
                graph[0][i + 1] = s;
            }
            if (e > 0) {
                graph[i + 1][n + 1] = e;
            }
            f[i + 1] = j;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int v = tracks[i].charAt(j) - '0';
                if (v > 0) {
                    graph[i + 1][j + 1] = v;
                }
            }
        }

        int[] cur = graph[0];
        int[] max = graph[0].clone();

        for (int k = 0; k < N; k++) {
            for (int i = 0; i < n + 2; i++) {
                for (int j = 0; j < n + 2; j++) {
                    if (cur[i] > 0 && graph[i][j] > 0) {
                        max[j] = Math.max(max[j], cur[i] + f[i] + graph[i][j]);
                    }
                }
            }
            cur = max.clone();
        }

        return max[n + 1];
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
