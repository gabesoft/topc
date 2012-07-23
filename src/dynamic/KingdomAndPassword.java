package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 548 Division II Level Three - 1000
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11869&rd=15170
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+548
public class KingdomAndPassword {
    long INF = Long.MAX_VALUE / 4;
    int n;
    int[] R;        // digits restricted
    int[] D;        // digits available
    long[] P;       // powers of 10
    long pass;

    public long newPassword(long oldPassword, int[] restrictedDigits) {
        n    = restrictedDigits.length;
        R = restrictedDigits;
        D = new int[n];
        pass = oldPassword;

        long x  = oldPassword;
        int idx = 0;
        while (x > 0L) {
            D[idx++] = (int)(x % 10);
            x = x / 10;
        }

        P = new long[n + 1];
        P[0] = 1;
        for (int i = 1; i < n + 1; i++) {
            P[i] = 10 * P[i - 1];
        }

        debug(D);
        debug(P);

        //return 0;
        return rec(0, 0, true);
    }

    long rec(int digits, int d, boolean lt) {
        if (d == n) { return 0; }

        int k     = n - 1 - d;
        long best = 0;
        long pow  = P[k];
        long old  = pass % P[k + 1];
        //long old = pass;

        for (int i = 0; i < n; i++) {
            if (off(digits, i) && R[d] != D[i]) {
                //debug("DIGIT", D[i], D[d], d, D[i] <= D[d]);

                long next = rec(digits | (1 << i), d + 1, D[i] <= D[k]);
                long num  = D[i] * pow + next;


                if (next == -1) { continue; }

                long d1 = Math.abs(old - num);
                long d2 = Math.abs(old - best);
                //if (d == 0) {
                    //debug(digits, d, i, "\t", k, next, "\t", best, num, "\t", old, "\t", d1, d2, lt);
                //}
                if (best == 0) { 
                    best = num;
                } else if (lt ? d1 < d2 : d1 > d2) {
                    best = num; 
                //} else if (d1 < d2) {
                    //best = num; 
                } else if (d1 == d2) {
                    best = Math.min(best, num);
                }
            }
        }

        //debug("END", digits, d, best);
        return best == 0 ? -1 : best;
    }

    boolean off(int mask, int d) {
        return ((mask >> d) & 1) == 0;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
