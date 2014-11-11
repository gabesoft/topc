package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 547 Division II Level Two - 500
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12075&rd=14739
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+547
public class PillarsDivTwo {
    int w = 0;
    int height[] = null;
    int n = 0;
    double[][] dp;

    public double maximalLength(int[] height, int w) {
        this.w = w;
        this.n = height.length;
        this.height = height;

        this.dp = new double[101][n];
        for (double[] d : dp) {
            Arrays.fill(d, -2);
        }

        double a = max(1, 1);
        double b = max(height[0], 1);

        return Math.max(a, b);
    }

    private double max(int prev, int k) {
        if (k == n) { return 0; }
        if (dp[prev][k] > -1) { return dp[prev][k]; }

        double a = len(prev, 1) + max(1, k + 1);
        double b = len(prev, height[k]) + max(height[k], k + 1);

        dp[prev][k] = Math.max(a, b);
        return dp[prev][k];
    }

    private double len(double x, double y) {
        return Math.sqrt(w * w + (x - y) * (x - y));
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
