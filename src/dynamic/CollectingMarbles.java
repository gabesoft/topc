package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 397 Division II Level Three - 1000
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=8746&rd=12169
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm397
public class CollectingMarbles {
    int [] W;
    int C;
    int [][][] memo;

    public int mostMarbles(int[] marblesWeights, int bagCapacity, int numberOfBags) {
        W    = marblesWeights;
        C    = bagCapacity;
        memo = new int[1 << W.length][numberOfBags + 1][C + 1];

        for (int i = 0; i < memo.length; i++) {
            for (int j = 0; j < memo[0].length; j++) {
                Arrays.fill(memo[i][j], -1);
            }
        }

        return rec(0, numberOfBags, C);
    }

    int rec(int marbles, int bag, int space) {
        if (bag == 0) { return 0; }
        if (marbles == (1 << W.length) - 1) { return 0; }
        if (memo[marbles][bag][space] > -1) { return memo[marbles][bag][space]; }

        int best = 0;
        for (int i = 0; i < W.length; i++) {
            if (((marbles >> i) & 1) == 0 && W[i] <= space) {
                int next = rec(marbles | (1 << i), bag, space - W[i]);
                best     = Math.max(best, next + 1);
            }
        }

        if (best == 0) {
            best = rec(marbles, bag - 1, C);
        }

        memo[marbles][bag][space] = best;
        return best;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
