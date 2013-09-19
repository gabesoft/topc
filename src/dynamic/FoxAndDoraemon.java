package topc.dynamic;

import java.util.*;
import java.io.*;

// TCO12 Round 1B Division I Level Two - 500
// dynamic programming, math, search
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11860&rd=15091
// editorial: http://apps.topcoder.com/wiki/display/tc/TCO+2012+Round+1b
public class FoxAndDoraemon {
    int[] W;
    int split;
    int INF = 1 << 30;
    int memo[][][];

    public int minTime(int[] workCost, int splitCost) {
        Arrays.sort(workCost);

        int n = workCost.length;
        W     = workCost;
        split = splitCost;

        memo = new int[n][n][n];
        for (int i = 0; i < memo.length; i++) {
            for (int j = 0; j < memo[i].length; j++) {
                Arrays.fill(memo[i][j], -1);
            }
        }

        return run(n - 1, 1, 0);
    }

    private int run(int t, int f, int used) {
        if (t < 0) { return 0; }
        if (f - used >= t + 1) { return W[t]; }

        if (memo[t][f][used] > -1) { return memo[t][f][used]; }

        int best  = split + run(t, 2 * f, used);
        int fresh = f - used;

        for (int i = 1; i < fresh; i++) {
            int r = run(t - i, 2 * (f - i), used);
            best  = Math.min(best, Math.max(W[t], split + r));
        }

        if (fresh > 0) {
            best = Math.min(best, W[t] + run(t - fresh, f, f));
        }

        memo[t][f][used] = best;
        return best;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
