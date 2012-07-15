package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 363 Division II Level Three - 1000
// dynamic programming, math, string parsing
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=7884&rd=10777
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm363
public class CrazyComponents {
    boolean [][] dep;
    double [][] memo;
    int [] inc;
    int [] exp;
    int n;

    public double expectedProfit(int k, String[] components, int[] income, int[] expense) {
        n    = components.length;
        dep  = new boolean[n][n];
        inc  = income;
        exp  = expense;
        memo = new double[1 << n][k + 1];

        for (int i = 0; i < memo.length; i++) {
            Arrays.fill(memo[i], -2.0);
        }

        for (int i = 0; i < n; i++) {
            String [] c = components[i].split(" ");
            for (int j = 0; j < c.length; j++) {
                if (c[j].length() > 0) {
                    int d = Integer.parseInt(c[j]);
                    dep[i][d] = true;
                }
            }
        }

        return rec(0, k);
    }

    double rec(int installed, int k) {
        if (k == 0) { return 0.0; }
        if (memo[installed][k] > -1.0) { return memo[installed][k]; }

        double prob = 1.0 / n;
        double best = 0;

        for (int i = 0; i < n; i++) {
            boolean canInstall = true;
            for (int j = 0; j < n; j++) {
                if (dep[i][j]) {
                    canInstall &= (((installed >> j) & 1) == 1);
                }
            }

            double skip = rec(installed, k - 1);

            if (canInstall) {
                double pick = (inc[i] - exp[i]) + rec(installed | (1 << i), k - 1);

                best += Math.max(pick, skip);
            } else {
                best += skip;
            }
        }

        memo[installed][k] = prob * best;
        return memo[installed][k];
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
