package topc.easy;

import java.util.*;
import java.io.*;

// SRM 630 Division II Level Two - 500
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13376&rd=16061
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+630
public class Egalitarianism3Easy {
    public int maxCities(int n, int[] a, int[] b, int[] len) {
        int[][] graph = new int[n][n];

        for (int i = 0; i < a.length; i++) {
            graph[a[i] - 1][b[i] - 1] = len[i];
            graph[b[i] - 1][a[i] - 1] = len[i];
        }

        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == j) { continue; }

                    if (graph[i][k] != 0 && graph[k][j] != 0) {
                        if (graph[i][j] == 0) {
                            graph[i][j] = graph[i][k] + graph[k][j];
                        } else {
                            graph[i][j] = Math.min(graph[i][j], graph[i][k] + graph[k][j]);
                        }

                        graph[j][i] = graph[i][j];
                    }
                }
            }
        }

        int best = 1;
        for (int s = 3; s < (1 << n); s++) {
            if (Integer.bitCount(s) == 1) { continue; }

            HashSet<Integer> set = new HashSet<Integer>();

            for (int i = 0; i < n; i++) {
                if (!on(s, i)) { continue; }

                for (int j = i + 1; j < n; j++) {
                    if (on(s, j)) {
                        set.add(graph[i][j]);
                    }
                }
            }


            if (set.size() == 1) {
                if (Integer.bitCount(s) > best) {
                    best = Integer.bitCount(s);
                }
            }
        }

        return best;
    }

    private boolean on(int mask, int k) {
        return ((mask >> k) & 1) == 1;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
