package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 532 Division I Level Two - 450
// dynamic programming, graph theory
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11767&rd=14725
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+532
public class DengklekBuildingRoads {
    long MOD = 1000000007L;

    public int numWays(int N, int M, int K) {
        long[][][][] dp = new long[N + 1][M + 1][K + 1][1 << (K + 1)];
        dp[N][M][0][0] = 1;

        for (int i = N - 1; i > -1; i--) {
            for (int j = M; j >= 0; j--) {
                for (int mask = 0; mask < 1 << (K + 1); mask++) {
                    if ((mask & (1 << K))  == 0) {
                        dp[i][j][K][mask] = dp[i + 1][j][0][mask << 1];
                    }
                }
                for (int k = K - 1; k >= 0; k--) {
                    for (int mask = 0; mask < 1 << (K + 1); mask++) {
                        dp[i][j][k][mask] = dp[i][j][k + 1][mask];

                        if (i - k - 1 >= 0 && j + 1 <= M) {
                            dp[i][j][k][mask] += dp[i][j + 1][k][mask ^ (1 << 0) ^ (1 << (k + 1))];
                            dp[i][j][k][mask] %= MOD;
                        }
                    }
                }
            }
        }

        return (int) dp[0][0][0][0];
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
