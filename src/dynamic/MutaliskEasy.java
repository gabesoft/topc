package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 658 Division II Level Two - 500
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13782&rd=16461
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+658
public class MutaliskEasy {
    int x[] = new int[] {9, 3, 1, 9, 1, 3, 3, 9, 1, 3, 1, 9, 1, 3, 9, 1, 9, 3};
    int dp[][][];

    public int minimalAttacks(int[] x) {
        dp = new int[61][61][61];

        for (int d2[][] : dp) {
            for (int d1[] : d2) {
                Arrays.fill(d1, -1);
            }
        }

        return min(x[0], x.length > 1 ? x[1] : 0,  x.length > 2 ? x[2] : 0);
    }

    private int min(int a, int b, int c) {
        if (a <= 0 && b <= 0 && c <= 0) { return 0; }
        if (dp[a][b][c] > -1) { return dp[a][b][c]; }

        int best = 1 << 25;
        for (int i = 0; i < x.length - 2; i += 3) {
            best = Math.min(best, 1 + min(
                        Math.max(0, a - x[i]),
                        Math.max(0, b - x[i + 1]),
                        Math.max(0, c - x[i + 2])));
        }

        dp[a][b][c] = best;
        return best;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
