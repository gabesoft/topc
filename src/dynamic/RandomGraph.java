package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 620 Division II Level Three - 1000
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13143&rd=15853
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+620
public class RandomGraph {
    boolean[][][] solved;
    double[][][] dp;
    double p;

    public double probability(int n, int p) {
        this.p = p / 1000.0;
        this.solved = new boolean[51][26][18];
        this.dp = new double[51][26][18];
        return 1.0 - f(n, 0, 0, 0);
    }

    private double f(int r, int a, int b, int c) {
        if (!solved[a][b][c]) {
            double res = 0.0;

            if (r == 0) {
                res = 1.0;
            } else {
                solved[a][b][c] = true;

                int bad = 0;
                res = 0.0;

                bad = a + 2 * b + 3 * c;
                res += Math.pow(1.0 - p, bad) * f(r - 1, a + 1, b, c);

                if (a > 0) {
                    bad = 2 * b + 3 * c;
                    res += Math.pow(1.0 - p, bad) * a * p * Math.pow(1.0 - p, a - 1) * f(r - 1, a - 1, b + 1, c);
                }

                if (a > 1) {
                    bad = 2 * b + 3 * c;
                    res += Math.pow(1.0 - p, bad) * (a * (a - 1) / 2.0) * (p * p) * Math.pow(1.0 - p, a - 2) * f(r - 1, a - 2, b, c + 1);
                }

                if (b > 0) {
                    bad = a + 3 * c;
                    res += Math.pow(1.0 - p, bad) * (2 * b) * p * Math.pow(1.0 - p, 2 * b - 1) * f(r - 1, a, b - 1, c + 1);
                    res += Math.pow(1.0 - p, bad) * b * (p * p) * Math.pow(1.0 - p, 2 * b - 2) * f(r - 1, a, b - 1, c + 1);
                }
            }

            dp[a][b][c] = res;
        }

        return dp[a][b][c];
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
