package topc.math;

import java.util.*;
import java.io.*;

// SRM 649 Division II Level Two - 500
// simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13659&rd=16313
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+649
public class CartInSupermarketEasy {
    int[][] f;
    public int calc(int N, int K) {
        f = new int[N + 1][K + 1];
        for (int[] x : f) {
            Arrays.fill(x, -1);
        }
        return dp(N, K);
    }

    private int dp(int n, int k) {
        if (f[n][k] != -1) { return f[n][k]; }
        if (n == 0) { return 0; }

        int r = dp(n - 1, k) + 1;

        if (k > 0) {
            for (int x = 1; x < n; x++) {
                for (int y = 0; y < k; y++) {
                   r = Math.min(r, Math.max(dp(x, y), dp(n - x, k - 1 - y)) + 1);
                }
            }
        }

        f[n][k] = r;
        return r;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
