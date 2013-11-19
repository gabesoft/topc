package topc.math;

import java.util.*;
import java.io.*;

// SRM 487 Division I Level One - 250
// simple math, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11157&rd=14240
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+487
public class BunnyComputer {
    int[] P;
    int K;
    public int getMaximum(int[] preference, int k) {
        int n = preference.length;
        int taken[] = new int[n];

        P = preference;
        K = k;

        return max(taken, 0);
    }

    private int max(int[] taken, int index) {
        int m = index + K + 1;

        if (m >= taken.length) { return 0; }
        if (taken[index] == 1) { return max(taken, index + 1); }

        int a = max(taken, index + 1);
        int b = P[index] + P[m];

        taken[index] = 1;
        taken[m]     = 1;

        b += max(taken, index + 1);

        taken[index] = 0;
        taken[m]     = 0;

        return Math.max(a, b);
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
