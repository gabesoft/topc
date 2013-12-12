package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 472 Division II Level Three - 1000
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10945&rd=14154
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+472
public class RectangularIsland {
    public double theProbablity(int width, int height, int x, int y, int steps) {
        double dp[][] = new double[2][steps + 10];
        
        dp[0][0] = 1.0;
        for (int i = 0; i < steps; i++) {
            int curr = i % 2;
            int next = (i + 1) % 2;

            for (int j = 0; j < steps + 1; j++) {
                dp[next][j] = 0.0;
            }

            for (int j = 0; j < i + 1; j++) {
                if (dp[curr][j] > 0.0) {
                    dp[next][j] += dp[curr][j] / 2.0;
                    dp[next][j + 1] += dp[curr][j] / 2.0;
                }
            }
        }

        double p[] = func(width, x, steps);
        double q[] = func(height, y, steps);

        double ans = 0.0;
        for (int i = 0; i < steps + 1; i++) {
            ans += dp[steps % 2][i] * p[i] * q[steps - i];
        }

        return ans;
    }

    double[] func(int N, int start, int steps) {
        double [][] dp = new double[2][N + 10];
        dp[0][start] = 1.0;

        double [] ans = new double[steps + 1];
        ans[0] = 1.0;

        for (int i = 0; i < steps; i++) {
            int curr = i % 2;
            int next = (i + 1) % 2;

            for (int j = 0; j < N; j++) {
                dp[next][j] = 0.0;
            }
            for (int j = 0; j < N; j++) {
                if (dp[curr][j] > 0.0) {
                    if (j > 0) { dp[next][j - 1] += dp[curr][j] / 2.0; }
                    if (j < N - 1) { dp[next][j + 1] += dp[curr][j] / 2.0; }
                }
            }
            for (int j = 0; j < N; j++) {
                ans[i + 1] += dp[next][j];
            }
        }

        return ans;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
