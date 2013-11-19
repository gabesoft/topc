package topc.math;

import java.util.*;
import java.io.*;

// SRM 488 Division I Level One - 250
// simple math, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11193&rd=14241
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+488
public class TheBoredomDivOne {
    double[][][] memo;
    final int lim = 1500;

    public double find(int n, int m) {
        memo = new double[n + m + 1][m + 1][lim + 1];

        for (int i = 0; i < memo.length; i++) {
            for (int j = 0; j < memo[i].length; j++) {
                Arrays.fill(memo[i][j], -2.0);
            }
        }

        return rec(n, m, 0);
    }

    private double rec(int n, int m, int h) {
        if (m == 0) { return h; }
        if (h >= lim) { return 0; }
        if (memo[n][m][h] > -1.0) { return memo[n][m][h]; }

        h++;
        double tot = (n + m) * (n + m - 1);
        double pn  = (n * (n - 1)) / tot;
        double pm  = (m * (m - 1)) / tot;
        double a   = 0;
        double b   = 0;
        double c   = 0;

        // 2 from n
        if (n > 1) {
            a = pn * rec(n, m, h);
        }

        // 2 from m
        if (m > 1) {
            b = pm * rec(n + 2, m - 2, h);
        }

        // 1 from both
        if (n > 0 && m > 0) {
            c = (1 - (pn + pm)) * rec(n + 1, m - 1, h);
        }

        memo[n][m][h - 1] = a + b + c;

        return memo[n][m][h - 1];
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
