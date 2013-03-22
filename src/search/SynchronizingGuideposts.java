package topc.search;

import java.util.*;
import java.io.*;

// SRM 309 Division II Level Three - 1000
// search
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=6242&rd=9989
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm309
public class SynchronizingGuideposts {
    public long minCost(String[] guideposts, int C) {
        int n     = guideposts.length;
        int pos[] = new int[n];
        int dst[] = new int[n];
        int lim[] = new int[n];

        for (int i = 0; i < n; i++) {
            String parts[] = guideposts[i].split("\\s+");

            pos[i] = Integer.parseInt(parts[0]);
            dst[i] = Integer.parseInt(parts[1]);
            lim[i] = Integer.parseInt(parts[2]);
        }

        long best = cost(pos, dst, lim, 0, C);

        for (int i = 0; i < n; i++) {
            int l1 = pos[i] + dst[i];
            int l2 = l1 + lim[i];
            int l3 = l1 - lim[i];

            if (l1 > 0) {
                best = Math.min(best, cost(pos, dst, lim, l1, C));
            }
            if (l2 > 0) {
                best = Math.min(best, cost(pos, dst, lim, l2, C));
            }
            if (l3 > 0) {
                best = Math.min(best, cost(pos, dst, lim, l3, C));
            }
        }


        return best;
    }

    private long cost(int[] pos, int[] dst, int[] lim, long loc, long C) {
        long c = 0;
        for (int i = 0; i < pos.length; i++) {
           long actual = pos[i] + dst[i];
           long delta  = Math.abs(loc - actual);

           c += delta;
           if (delta > lim[i]) {
               c += (delta - lim[i]) * C;
           }
        }
        return c;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
