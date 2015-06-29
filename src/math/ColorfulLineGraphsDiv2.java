package topc.math;

import java.util.*;
import java.io.*;

// SRM 661 Division II Level Three - 950
// advanced math, math, simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13842&rd=16464
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+661
public class ColorfulLineGraphsDiv2 {
    int MOD = 1000000007;
    int dp[][][];
    int N;
    int K;

    public int countWays(int N, int K) {
        this.N = N;
        this.K = K;

        this.dp = new int[101][101][101];

        for (int[][] d2 : dp) {
            for (int[] d1 : d2) {
                Arrays.fill(d1, -1);
            }
        }

        return f(0, 0, 0);
    }

    private int f(int a, int b, int c) {
        if (dp[a][b][c] != -1) { return dp[a][b][c]; }
        if (a + b + c == N) { return 1; }

        int res = 0;
        long p, q;

        p = 1 + b + c;
        q = f(a + 1, b, c);
        res += (int)((p * q) % MOD);
        res %= MOD;

        if (K >= 2) {
            p = 1 + a + c;
            q = f(a, b + 1, c);
            res += (int)((p * q) % MOD);
            res %= MOD;
        }

        if (K >= 3) {
            p = 1 + a + b;
            q = f(a, b, c + 1);
            res += (int)((p * q) % MOD);
            res %= MOD;
        }

        dp[a][b][c] = res;
        return res;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
