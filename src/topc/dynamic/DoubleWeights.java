package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 685 Division II Level Two - 500
// dynamic programming, graph theory
// statement: https://community.topcoder.com/stat?c=problem_statement&pm=14191&rd=16689
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+685
public class DoubleWeights {
    public int minimalCost(String[] weight1, String[] weight2) {
        int n = weight1.length;
        int w1[] = new int[n * n * n];
        int w2[] = new int[n * n * n];
        int idx[] = new int[n * n * n];
        int seen[] = new int[n];

        int h = 0;
        int t = 0;
        idx[h++] = 0;

        int best = Integer.MAX_VALUE;

        Arrays.fill(seen, -1);

        while(h >= t) {
            int top = idx[t];
            int topw1 = w1[t];
            int topw2 = w2[t];
            t++;

            if (top == 1) {
                best = Math.min(best, topw1 * topw2);
            }

            if (seen[top] != -1 && seen[top] <= topw1 * topw2) {
                continue;
            }

            seen[top] = topw1 * topw2;

            for (int i = 0; i < n; i++) {
                if (weight1[top].charAt(i) == '.') {
                    continue;
                }

                int iw1 = weight1[top].charAt(i) - '0';
                int iw2 = weight2[top].charAt(i) - '0';

                idx[h] = i;
                w1[h] = topw1 + iw1;
                w2[h] = topw2 + iw2;
                h++;
            }
        }

        return best == Integer.MAX_VALUE ? -1: best;
    }

    @SuppressWarnings("unused")
    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
