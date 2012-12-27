package topc.math;

import java.util.*;
import java.io.*;

// SRM 417 Division II Level Three - 1000
// math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=9944&rd=13508
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm417
public class TripleJump {
    int lower = 0;
    int upper = 0;

    public double[] getProbabilities(int lower, int upper, int first, int[] opponents) {
        this.lower = lower;
        this.upper = upper;

        int n = opponents.length;

        for (int i = 0; i < n; i++) {
            opponents[i] = Math.max(0, opponents[i] - first);
        }

        Arrays.sort(opponents);

        double ans[] = new double[n + 1];

        ans[0] = prob(opponents[n - 1]);
        ans[n] = 1.0 - prob(opponents[0]);

        for (int i = 1; i < n; i++) {
            ans[i] = prob(opponents[n - i - 1]) - prob(opponents[n - (i - 1) - 1]);
        }

        return ans;
    }

    double prob(int z) {
        if (z <= 2 * lower) { return 1.0; }
        if (z >  2 * upper) { return 0.0; }

        if (2 * lower < z && z <= upper + lower) {
            return 1.0 - sq(z - 2 * lower) / (2 * sq(upper - lower));
        }

        if (upper + lower < z && z <= 2.0 * upper) {
            return sq(2 * upper - z) / (2.0 * sq(upper - lower));
        }

        assert false : "malfunction";
        return 0.0;
    }

    double sq(int n) {
        return n * n;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
