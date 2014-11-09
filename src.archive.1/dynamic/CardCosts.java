package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 245 Division II Level Three - 1000
// dynamic programming, greedy
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=4502&rd=7220
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm245
public class CardCosts {
    public long mincost(int n, int k) {
        if (k == 1) { return n; }
        if (n == 0) { return 0; }

        long K[] = powTable(n, k);
        int maxr = 0;

        while (K[maxr++] < 2 * n);

        long C[]  = new long[maxr];
        long best = 1;

        C[0] = 1;
        for (int i = 1; i < n; i++) {
            long min = 2 * C[0] + 1;
            int rmin = 0;

            for (int r = 1; r < C.length; r++) {
                long curr = K[r] * (2 * C[r] + 1);

                if (curr < min) {
                    min  = curr;
                    rmin = r;
                }
            }

            best += min;
            C[rmin]++;
        }

        return best;
    }

    private long sq(long x) {
        return x * x;
    }

    private long[] powTable(int n, long k) {
        long[] table = new long[n];

        table[0] = 1;

        for (int i = 1; i < n; i++) {
            table[i] = table[i - 1] * k;
        }

        return table;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
