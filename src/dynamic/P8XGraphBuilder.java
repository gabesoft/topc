package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 527 Division I Level One - 275
// dynamic programming, graph theory
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11308&rd=14552
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+527
public class P8XGraphBuilder {
    int[] S;
    int[][] memo;

    public int solve(int[] scores) {
        S = scores;
        memo = new int[scores.length + 1][2 * scores.length + 1];

        for (int i = 0; i < memo.length; i++) {
            Arrays.fill(memo[i], -1);
        }

        return rec(scores.length, 2 * scores.length);
    }

    private int rec(int index, int deg) {
        if (index == 0) { return S[deg - 1]; }
        if (memo[index][deg] > -1) { return memo[index][deg]; }

        int best = 0;
        int lim  = deg / 2;

        for (int d = 1; d < lim + 1 && d + index <= deg; d++) {
            best = Math.max(S[d - 1] + rec(index - 1, deg - d), best);
        }

        memo[index][deg] = best;
        return best;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
