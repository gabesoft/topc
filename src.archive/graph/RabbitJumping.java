package topc.graph;

import java.util.*;
import java.io.*;

// SRM 475 Division II Level Three - 1000
// graph theory
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10882&rd=14156
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+475
public class RabbitJumping {
    final int INF = 1001001001;

    public int getMinimum(int[] holes, int largeJump) {
        if (largeJump % 2 == 0) { return -1; }

        int n  = holes.length / 2;
        int nn = (n + 1) * 2;

        int as[]  = new int[n + 1];
        int bs[]  = new int[n + 1];
        int d[][] = new int[nn][nn];

        as[0] = -INF;
        bs[n] = INF * 2;

        for (int i = 1; i < n + 1; i++) {
            as[i] = holes[i * 2 - 1] + 1;
        }
        for (int i = 0; i < n; i++) {
            bs[i] = holes[i * 2] - 1;
        }
        for (int i = 0; i < nn; i++) {
            for (int j = 0; j < nn; j++) {
                d[i][j] = (i != j) ? INF : 0;
            }
        }
        for (int i = 0; i < n + 1; i++) {
            for (int j = i; j < n + 1; j++) {
                int a = Math.max(as[i], as[j] - largeJump);
                int b = Math.min(bs[i], bs[j] - largeJump);

                if (a < b) {
                    d[i * 2 + 0][j * 2 + 1] = d[j * 2 + 1][i * 2 + 0] = 1;
                    d[i * 2 + 1][j * 2 + 0] = d[j * 2 + 0][i * 2 + 1] = 1;
                } else if (a == b) {
                    int s = a & 1;
                    int t = s ^ 1;
                    d[i * 2 + s][j * 2 + t] = d[j * 2 + t][i * 2 + s] = 1;
                }
            }
        }

        for (int k = 0; k < nn; k++) {
            for (int i = 0; i < nn; i++) {
                for (int j = 0; j < nn; j++) {
                    if (d[i][j] > d[i][k] + d[k][j]) {
                        d[i][j] = d[i][k] + d[k][j];
                    }
                }
            }
        }

        return d[0][nn - 1] >= INF ? -1 : d[0][nn - 1];
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
