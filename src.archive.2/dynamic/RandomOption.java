package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 562 Division II Level Three - 900
// dynamic programming, graph theory
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12315&rd=15184
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+562
public class RandomOption {
    int n = 0;
    boolean banned[][] = null;
    boolean solved[][] = null;
    double mem[][] = null;

    public double getProbability(int keyCount, int[] badLane1, int[] badLane2) {
        n = keyCount;
        banned = new boolean[15][15];
        solved = new boolean[1 << 14][15];
        mem = new double[1 << 14][15];

        for (int i = 0; i < badLane1.length; i++) {
            banned[badLane1[i]][badLane2[i]] = true;
            banned[badLane2[i]][badLane1[i]] = true;
        }

        return rec((1 << n) - 1, n);
    }

    private double rec(int mask, int last) {
        if (solved[mask][last]) { return mem[mask][last]; }

        double res = 0;
        int t = 0;

        for (int x = 0; x < n; x++) {
            if ((mask & (1 << x)) != 0) {
                if (!banned[last][x]) {
                    int nmask = mask - (1 << x);
                    res += rec(nmask, x);
                }
                t++;
            }
        }

        if (t == 0) {
            res = 1.0;
        } else {
            res = (res / t);
        }

        mem[mask][last] = res;
        solved[mask][last] = true;

        return res;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
