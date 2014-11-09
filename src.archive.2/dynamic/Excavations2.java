package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 584 Division II Level Three - 1000
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12644&rd=15696
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+584
public class Excavations2 {
    int K[] = null;
    int F[] = null;
    long BC[][] = null;
    long dp[][] = null;

    public long count(int[] kind, int[] found, int k) {
        F = found;
        K = new int[51];
        BC = binomialCoefficient(50);
        dp = new long[found.length][k + 1];

        for (int i = 0; i < kind.length; i++) {
            K[kind[i]]++;
        }

        return run(0, k);
    }

    private long run(int index, int k) {
        if (index == F.length) { return k == 0 ? 1 : 0; }
        if (dp[index][k] > 0) { return dp[index][k]; }

        int t  = F[index];
        int l  = Math.min(k - (F.length - index - 1), K[t]);
        long r = 0;

        for (int i = 1; i <= l; i++) {
            r += BC[K[t]][i] * run(index + 1, k - i);
        }

        dp[index][k] = r;
        return r;
    }

    public static long[][] binomialCoefficient(long n) {
        long[][] bc = new long[(int)n + 1][(int)n + 1];

        for (int i = 0; i < n + 1; i++) {
            bc[i][0] = 1;
            for (int j = 1; j < i + 1; j++) {
                bc[i][j] = bc[i - 1][j - 1] + bc[i - 1][j];
            }
        }

        return bc;
    }


    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
