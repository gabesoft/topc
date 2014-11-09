package topc.math;

import java.util.*;
import java.io.*;

// SRM 274 Division II Level Three - 1000
// simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=4845&rd=8071
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm274
public class AmountApproximation {
    public int approximate(int D, int p1, int p2) {
        int a = Math.max(p1, p2);
        int b = Math.min(p1, p2);

        int lim  = Math.min(D / a + 1, b);
        int best = a * (D % a == 0 ? (D / a) : (D / a + 1));

        for (int x = 0; x < lim + 1; x++) {
            int dx = D - a * x;
            if (dx < 0) { continue; }

            int y    = dx % b == 0 ? dx / b : (dx / b + 1);
            int next = a * x + b * y;
            best     = Math.min(best, next);
        }

        return best;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
