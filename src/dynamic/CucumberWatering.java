package topc.dynamic;

import java.util.*;
import java.io.*;

// TCO12 Round 2A Division I Level Two - 450
// dynamic programming, math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11899&rd=15093
// editorial: http://apps.topcoder.com/wiki/display/tc/TCO+2012+Round+2a
public class CucumberWatering {
    long INF = 200000000000L;
    long[] y;
    long[] pmin;
    long[] pmax;
    long[][] dp;
    int n;

    public long theMin(int[] x, int K) {
        this.n = x.length;
        this.y = new long[n + 2];

        for (int i = 0; i < n; i++) {
            y[i] = x[i];
        }

        y[n]     = -INF;
        y[n + 1] = +INF;

        Arrays.sort(y);

        pmin = new long[n];
        pmax = new long[n];
        for (int i = 1; i < n; i++) {
            pmin[i - 1] = Math.min(x[i], x[i - 1]);
            pmax[i - 1] = Math.max(x[i], x[i - 1]);
        }

        this.dp = new long[52][51];
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }

        return F(0, K);
    }

    private long F(int leftTeleport, int remaining) {
        if (leftTeleport == n) { return 0; }
        if (dp[leftTeleport][remaining] > -1) { return dp[leftTeleport][remaining]; }

        long res = INF;
        if (remaining > 0) {
            for (int teleport = leftTeleport + 1; teleport <= n; teleport++) {
                res = Math.min(res, G(leftTeleport, teleport) + F(teleport, remaining - 1));
            }
        } else {
            res = Math.min(res, G(leftTeleport, n + 1));
        }

        dp[leftTeleport][remaining] = res;
        return res;
    }

    private long G(int leftTeleport, int rightTeleport) {
        long a = y[leftTeleport];
        long b = y[rightTeleport];

        long res = 0;

        for (int i = 0; i < pmin.length; i++) {
            long c = pmin[i];
            long d = pmax[i];

            if ((a <= c && c <= b) && (a <= d && d <= b)) {
                res += Math.min(d - c, Math.min(c - a, b - c) + Math.min(d - a, b - d));
            } else if (a <= c && c <= b) {
                res += Math.min(c - a, b - c);
            } else if (a <= d && d <= b) {
                res += Math.min(d - a, b - d);
            }
        }

        return res;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
