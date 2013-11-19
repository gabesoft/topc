package topc.math;

import java.util.*;
import java.io.*;

// SRM 488 Division I Level One - 250
// simple math, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11193&rd=14241
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+488
public class TheBoredomDivOne {
    double[] memo;
    int t;

    public double find(int n, int m) {
        t    = n + m;
        memo = new double[m + 1];

        Arrays.fill(memo, -2.0);

        return rec(m);
    }

    private double rec(int m) {
        if (m == 0) { return 0; }
        if (memo[m] > -1.0) { return memo[m]; }

        int n = t - m;

        double all = t * (t - 1);
        double p0  = n * (n - 1) / all;
        double p2  = m * (m - 1) / all;
        double p1  = 1 - (p0 + p2);
        double b   = 0;
        double c   = 0;

        if (m > 1) {
            b = p2 * rec(m - 2);
        }

        if (n > 0 && m > 0) {
            c = p1 * rec(m - 1);
        }

        memo[m] = (1 + b + c) / (1 - p0);

        return memo[m];
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
