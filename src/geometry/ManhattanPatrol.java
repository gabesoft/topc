package topc.geometry;

import java.util.*;
import java.io.*;

// TCO11 Round 4 Division I Level One - 300
// geometry, search, sorting
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10721&rd=14568
// editorial: http://apps.topcoder.com/wiki/display/tc/TCO'11+Online+Round+4
public class ManhattanPatrol {
    int x[];
    int y[];

    public long countIntersections(int N, int AX, int BX, int MX, int AY, int BY, int MY) {
        x = new int[N];
        y = new int[N];

        x[0] = BX;
        y[0] = BY;

        for (int i = 1; i < N; i++) {
            x[i] = (AX * x[i - 1] + BX) % MX;
            y[i] = (AY * y[i - 1] + BY) % MY;
        }

        long count = 0;

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (j == i) { continue; }

                long loy = 0;
                long hiy = 0;

                for (int k = 0; k < N; k++) {
                    if (k == i || k == j) { continue; }

                    if (insideX(i, j, k) && !insideY(i, j, k)) {
                        if (y[k] >= Math.max(y[i], y[j])) {
                            hiy++;
                        } else {
                            loy++;
                        }
                    } 
                }

                count += loy * hiy;
            }
        }

        return count;
    }

    private boolean insideX(int a, int b, int c) {
        int xa = Math.min(x[a], x[b]);
        int xb = Math.max(x[a], x[b]);
        return xa <= x[c] && x[c] <= xb;
    }

    private boolean insideY(int a, int b, int c) {
        int ya = Math.min(y[a], y[b]);
        int yb = Math.max(y[a], y[b]);
        return ya <= y[c] && y[c] <= yb;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
