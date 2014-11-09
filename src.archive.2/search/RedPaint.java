package topc.search;

import java.util.*;
import java.io.*;

// TCO14 Round 1C Division I Level Three - 950
// dynamic programming, simple search, iteration, simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13063&rd=15958
// editorial: http://apps.topcoder.com/wiki/display/tc/TCO+2014+Round+1c
public class RedPaint {
    public double expectedCells(int N) {
        double P = Math.pow(0.5, N);
        double[][][] dp = new double[2][N + 1][N + 1];

        for (int i = 0; i < dp[0].length; i++) {
            for (int l = 0; l <= N; l++) {
                for (int r = 0; r <= N; r++) {
                    dp[0][l][r] = l + r + 1;
                }
            }
        }

        for (int n = 1; n <= N; n++) {
            for (int l = 0; l < N; l++) {
                for (int r = 0; r < N; r++) {
                    dp[n % 2][l][r] =
                        dp[(n - 1) % 2][l + 1][Math.max(0, r - 1)] +
                        dp[(n - 1) % 2][Math.max(0, l - 1)][r + 1];
                }
            }
        }

        return P * dp[N % 2][0][0];
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
