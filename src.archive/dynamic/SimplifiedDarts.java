package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 318 Division II Level Three - 1000
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=6685&rd=9998
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm318
public class SimplifiedDarts {
    double P1;
    double P2;
    double[][] memo;

    public double tryToWin(int W, int N, int P1, int P2) {
        this.P1 = P1 / 100.0;
        this.P2 = P2 / 100.0;
        this.memo = new double[N + 1][W + 1];

        for (int i = 0; i < memo.length; i++) {
            Arrays.fill(memo[i], -2.0);
        }

        return rec(N, W) * 100;
    }

    double rec(int n, int w) {
        if (w <= 0) { return 1.0; }
        if (n <= 0) { return 0.0; }
        if (memo[n][w] > -1.0) { return memo[n][w]; }

        double res = 0.0;

        res = Math.max(res, P1 * rec(n - 1, w - 2) + (1 - P1) * rec(n - 1, w));
        res = Math.max(res, P2 * rec(n - 1, w - 3) + (1 - P2) * rec(n - 1, w));

        memo[n][w] = res;
        return res;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
