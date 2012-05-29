package topc.graph;

import java.util.*;
import java.io.*;

// SRM 464 Division I Level Two - 550
// graph theory
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10739&rd=14149
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+464
public class ColorfulDecoration {
    public int getMaximum(int[] xa, int[] ya, int[] xb, int[] yb) {
        int n  = xa.length;
        int nn = 2 * n;
        int lo = 0;
        int hi = Integer.MAX_VALUE / 2;

        while (lo + 1 < hi) {
            int size = lo + (hi - lo) / 2;

            boolean[][] graph = new boolean[nn][nn];

            for (int i = 0; i < nn; i++) {
                for (int j = 0; j < nn; j++) {
                    if (i % n != j % n) {
                        int k  = j < n ? j + n : j - n;
                        int x1 = i < n ? xa[i] : xb[i - n];
                        int y1 = i < n ? ya[i] : yb[i - n];
                        int x2 = j < n ? xa[j] : xb[j - n];
                        int y2 = j < n ? ya[j] : yb[j - n];

                        graph[i][k] = (Math.abs(x1 - x2) < size) && (Math.abs(y1 - y2) < size);
                    }
                }
            }

            for (int i = 0; i < nn; i++) {
                graph[i][i] = true;
            }

            for (int k = 0; k < nn; k++) {
                for (int i = 0; i < nn; i++) {
                    for (int j = 0; j < nn; j++) {
                        if (graph[i][k] && graph[k][j]) {
                            graph[i][j] = true;
                        }
                    }
                }
            }

            boolean sat = true;
            for (int i = 0; i < n; i++) {
                if (graph[i][i + n] && graph[i + n][i]) {
                    sat = false;
                }
            }

            if (sat) {
                lo = size;
            } else {
                hi = size;
            }
        }

        return lo;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
