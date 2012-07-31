package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 335 Division II Level Three - 1000
// dynamic programming, math, sorting
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=7363&rd=10659
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm335
public class MinimumVariancePartition {
    double INF = Double.MAX_VALUE / 4;
    int[] nums;
    int n;
    double[][] memo;

    public double minDev(int[] mixedSamples, int k) {
        n    = mixedSamples.length;
        nums = mixedSamples;
        memo = new double[n][k + 1];

        for (int i = 0; i < n; i++) {
            Arrays.fill(memo[i], -2.0);
        }

        Arrays.sort(nums);

        return dev(0, k);
    }

    double dev(int idx, int k) {
        if (k == 1) { return var(idx, n); }
        if (memo[idx][k] > -1.0) { return memo[idx][k]; }

        double best = INF;
        for (int i = idx + 1; i <= (n - k) + 1; i++) {
            best = Math.min(best, var(idx, i) + dev(i, k - 1));
        }

        memo[idx][k] = best;
        return best;
    }

    double var(int start, int end) {
        double mean = 0;
        for (int i = start; i < end; i++) {
            mean += nums[i];
        }

        mean /= (end - start);

        double v = 0;
        for (int i = start; i < end; i++) {
            v += square(nums[i] - mean);
        }

        return v / (end - start);
    }

    double square(double x) {
        return x * x;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
