package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 562 Division II Level Three - 900
// dynamic programming, graph theory
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12315&rd=15184
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+562
public class RandomOption {
    int n;
    boolean banned[][];
    double memo[][];

    public double getProbability(int keyCount, int[] badLane1, int[] badLane2) {
        n      = keyCount;
        banned = new boolean[15][15];
        memo   = new double[1 << 14][15];

        for (int i = 0; i < memo.length; i++) {
            Arrays.fill(memo[i], -2.0);
        }

        for (int i = 0; i < badLane1.length; i++) {
            banned[badLane1[i]][badLane2[i]] = true;
            banned[badLane2[i]][badLane1[i]] = true;
        }

        return solve((1 << n) - 1, n);
    }

    double solve(int mask, int last) {
        if (memo[mask][last] > -1.0) { return memo[mask][last]; }

        double res = 0;
        int t      = 0;

        for (int i = 0; i < n; i++) {
            if (on(mask, i)) {
                if (!banned[last][i]) {
                    int next = mask - (1 << i);
                    res += solve(next, i);
                }
                t++;
            }
        }

        res = (t == 0) ? 1.0 : (res / t);

        memo[mask][last] = res;
        return res;
    }

    boolean on(int mask, int k) {
        return ((mask >> k) & 1) == 1;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
