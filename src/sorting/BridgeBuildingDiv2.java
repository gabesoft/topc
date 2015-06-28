package topc.sorting;

import java.util.*;
import java.io.*;

// SRM 661 Division II Level Two - 500
// sorting
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13546&rd=16464
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+661
public class BridgeBuildingDiv2 {
    int INF = 1000000;

    public int minDiameter(int[] a, int[] b, int K) {
        int res = INF;
        int n = a.length + 1;

        for (int mask = 0; mask < (1 << n); mask++) {
            if (Integer.bitCount(mask) == K) {
                int[][] dist = new int[2 * n][2 * n];
                for (int[] d : dist) {
                    Arrays.fill(d, INF);
                }

                for (int i = 0; i < n; i++) {
                    if ((mask & (1 << i)) != 0) {
                        dist[i][i + n] = 0;
                        dist[i + n][i] = 0;
                    }
                }

                for (int i = 0; i < n - 1; i++) {
                    dist[i][i + 1] = a[i];
                    dist[i + 1][i] = a[i];
                }

                for (int i = 0; i < n - 1; i++) {
                    dist[i + n][i + n + 1] = b[i];
                    dist[i + n + 1][i + n] = b[i];
                }

                for (int k = 0; k < 2 * n; k++) {
                    for (int i = 0; i < 2 * n; i++) {
                        for (int j = 0; j < 2 * n; j++) {
                            dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                        }
                    }
                }

                int max = 0;
                for (int i = 0; i < 2 * n; i++) {
                    for (int j = i + 1; j < 2 * n; j++) {
                        max = Math.max(max, dist[i][j]);
                    }
                }

                res = Math.min(res, max);
            }
        }

        return res;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
