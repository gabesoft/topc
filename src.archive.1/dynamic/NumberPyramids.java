package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 459 Division I Level Two - 500
// dynamic programming, math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10683&rd=14145
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+459
public class NumberPyramids {
    final int MOD = 1000000009;

    public int count(int baseLength, int top) {
        int[] bc = new int[21];
        int[] dp = new int[1000001];

        int r = baseLength - 1;
        if (r >= 20) { return 0; }

        top = top - (1 << r);
        if (top < 0) { return 0; }

        // binomial coefficient C(r, k), r is fixed
        bc[0] = 1;
        for (int i = 0; i < r + 1; i++) {
            for (int j = i; j > 0; j--) {
                bc[j] += bc[j - 1];
            }
        }

        // finds the number of solutions to the eq
        // B = A0*x0 + A1*x1 + A2*x2 + .. + An*xn
        dp[0] = 1;
        for (int i = 0; i < r + 1; i++) {
            for (int j = bc[i]; j < top + 1; j++) {
                dp[j] = (dp[j] + dp[j - bc[i]]) % MOD;
            }
        }

        return dp[top];
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
