package topc.easy;

import java.util.*;

// SRM 654 Division I Level Two - 450
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13699&rd=16318
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+654
public class SuccessiveSubtraction2 {
    int INF = -0x80808080;
    int[][][] dp;

    public int[] calc(int[] a, int[] p, int[] v) {
        int[] res = new int[v.length];

        for (int i = 0; i < v.length; i++) {
            a[p[i]] = v[i];
            res[i] = max(a);
        }

        return res;
    }

    private int max(int[] a) {
        dp = new int[a.length][3][3];

        for (int[][] dp1 : dp) {
            for (int[] dp2 : dp1) {
                Arrays.fill(dp2,  -INF);
            }
        }

        return a[0] + f(a, 1, 0, 2);
    }

    private int f(int[] a, int p, int open, int rem) {
        if (p == a.length) { return 0; }
        if (dp[p][open][rem] != -INF) { return dp[p][open][rem]; }

        int r = -INF;
        int x = (open % 2 == 0) ?  - a[p] : a[p];

        if (rem > 0) {
            r = Math.max(r, x + f(a, p + 1, open + 1, rem - 1));
        }
        if (open > 0) {
            r = Math.max(r, f(a, p, open - 1, rem));
        }
        r = Math.max(r, x + f(a, p + 1, open, rem));

        dp[p][open][rem] = r;
        return r;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
