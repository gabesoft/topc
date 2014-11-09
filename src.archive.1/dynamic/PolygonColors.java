package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 406 Division II Level Three - 1000
// dynamic programming, math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=8801&rd=12178
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm406
public class PolygonColors {
    final long MOD = 100000007L;
    int N          = 0;

    boolean[][] ok;
    boolean[][][] got;
    long[][][] dp;

    public int getWays(int N, int[] colors) {
        this.N   = N;
        this.ok  = new boolean[N][N];
        this.got = new boolean[N][N][N];
        this.dp  = new long[N][N][N];

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                ok[i][j] = ok[j][i] = (colors[i] != colors[j]);
                if (i + 1 == j && !ok[i][j]) {
                    return 0;
                }
            }
        }

        if (!ok[0][N - 1]) { return 0; }

        return (int)solve(0, N - 1, 0);
    }

    long solve(int low, int high, int upper) {
        if (low + 1 >= high) { return 1; }
        if (got[low][high][upper]) { return dp[low][high][upper]; }

        got[low][high][upper] = true;

        long ret = solve(low + 1, high, 1);
        for (int i = low + 2; i < high + upper; i++) {
            if(ok[low][i]) {
                ret += solve(low, i, 0) * solve(i, high, 1);
            }
        }

        ret %= MOD;
        return dp[low][high][upper] = ret;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
