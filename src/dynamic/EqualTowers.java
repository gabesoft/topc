package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 442 Division II Level Three - 1000
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10466&rd=13750
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+442
public class EqualTowers {
    int MAX_TOWER = 250000;
    int MIN       = -1000000;
    int [][] memo;

    public int height(int[] bricks) {
        memo = new int[50][MAX_TOWER + 1];

        for (int i = 0; i < memo.length; i++) {
            Arrays.fill(memo[i], -1);
        }

        int best = rec(bricks, 0, 0);

        return best == 0 ? -1 : best;
    }

    int rec(int[] bricks, int k, int d) {
        if (d > MAX_TOWER) { return MIN; }
        if (k == bricks.length) { return d == 0 ? 0 : MIN; }
        if (memo[k][d] > -1) { return memo[k][d]; }

        int best = 0;
        int a = rec(bricks, k + 1, d);
        int b = rec(bricks, k + 1, d + bricks[k]);
        int c = 0;

        if (bricks[k] > d) {
            c = d + rec(bricks, k + 1, bricks[k] - d);
        } else {
            c = bricks[k] + rec(bricks, k + 1, d - bricks[k]);
        }

        best = Math.max(a, Math.max(b, c));

        memo[k][d] = best;
        return best;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
