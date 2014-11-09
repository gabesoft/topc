package topc.math;

import java.util.*;
import java.io.*;

// SRM 626 Division I Level One - 250
// advanced math, dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13239&rd=15859
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+626
public class FixedDiceGameDiv1 {
    public double getExpectation(int a, int b, int c, int d) {
        if (a * b <= c) { return -1; }

        double[] A = probs(a, b);
        double[] B = probs(c, d);

        double pw = 0;
        double ew = 0;
        for (int x = a; x <= a * b; x++) {
            for (int y = c; y <= c * d; y++) {
                if (x > y) {
                    pw += A[x] * B[y];
                    ew += x * A[x] * B[y];
                }
            }
        }

        return ew / pw;
    }

    private double[] probs(int diceCount, int diceSize) {
        double[][] dp = new double[51][2501];

        dp[0][0] = 1.0;

        for (int a = 1; a <= diceCount; a++) {
            for (int x = 1; x <= a * diceSize; x++) {
                dp[a][x] = 0.0;
                for (int y = 1; y <= diceSize && y <= x; y++) {
                    dp[a][x] += dp[a - 1][x - y] / diceSize;
                }
            }
        }

        double[] res = new double[diceCount * diceSize + 1];
        for (int i = 0; i <= diceCount * diceSize; i++) {
            res[i] = dp[diceCount][i];
        }

        return res;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
