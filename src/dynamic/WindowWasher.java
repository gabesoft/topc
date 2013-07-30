package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 168 Division II Level Three - 1100
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=1919&rd=4645
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm168
public class WindowWasher {
    int INF = 1 << 30;
    int n;
    int T[];
    int memo[][];

    public int fastest(int width, int height, int[] washTimes) {
        n    = washTimes.length;
        T    = new int[n];
        memo = new int[n][width + 1];

        for (int i = 0; i < n; i++) {
            T[i] = washTimes[i] * height;
            Arrays.fill(memo[i], -1);
        }

        return search(0, width);
    }

    private int search(int k, int w) {
        if (w == 0) { return 0; }
        if (k == n) { return INF; }
        if (memo[k][w] > -1) { return memo[k][w]; }

        int best = INF;
        for (int i = 0; i < w + 1; i++) {
            int time = T[k] * i;
            int rest = search(k + 1, w - i);
            best = Math.min(best, Math.max(time, rest));
        }

        memo[k][w] = best;
        return best;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
