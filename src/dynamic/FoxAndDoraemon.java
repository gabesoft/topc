package topc.dynamic;

import java.util.*;
import java.io.*;

// TCO12 Round 1B Division I Level Two - 500
// dynamic programming, math, search
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11860&rd=15091
// editorial: http://apps.topcoder.com/wiki/display/tc/TCO+2012+Round+1b
public class FoxAndDoraemon {
    int[] W;
    int n;
    int split;
    int INF = 1 << 30;
    int dp[][];

    public int minTime(int[] workCost, int splitCost) {
        Arrays.sort(workCost);

        n     = workCost.length;
        W     = workCost;
        split = splitCost;

        dp = new int[n][n];
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }

        return run(1, 0);
    }

    private int run(int foxes, int done) {
        if (foxes >= n - done) { return W[n - done - 1]; }
        if (done == n) { return 0; }
        if (foxes == 0) { return INF; }

        if (dp[foxes][done] > -1) { return dp[foxes][done]; }

        int result = INF;

        result = Math.min(result, Math.max(W[n - done - 1], run(foxes - 1, done + 1)));
        result = Math.min(result, split + run(foxes * 2, done));

        dp[foxes][done] = result;

        return result;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
