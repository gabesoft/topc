package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 408 Division II Level Three - 1000
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=9754&rd=12180
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm408
public class MarblesInABag {
    double [][] memo;

    public double getProbability(int redCount, int blueCount) {
        memo = new double[redCount + 1][(blueCount / 2) + 1];
        for (int i = 0; i < memo.length; i++) {
            Arrays.fill(memo[i], -2.0);
        }
        return rec(redCount, blueCount);
    }

    double rec(int r, int b) {
        if (b <= 0 || r > b) { return 0.0; }
        if (r == 0) { return 1.0; }

        int bi = b >> 1;
        if (memo[r][bi] > -1.0) { return memo[r][bi]; }

        double c = r + b;
        double p = (r / c) * rec(r - 1, b - 1) + (b / c) * rec(r, b - 2);

        memo[r][bi] = p;
        return p;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
