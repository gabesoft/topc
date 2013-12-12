package topc.easy;

import java.util.*;
import java.io.*;

// SRM 246 Division I Level Three - 1000
// brute force, math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=4519&rd=7221
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm246
public class CalcRoot {
    public String approximate(int N, int D) {
        long bestx = 0;
        long besty = 0;
        long delta = 0;

        for (long y = 1; y < D + 1; y++) {
            long x = Math.round(y * Math.sqrt(N));

            if (y > 1 && x % y == 0) { continue; }

            long d = Math.abs(sq(x) - N * sq(y));

            if (delta == 0 || sq(besty) * d < sq(y) * delta) {
                delta = d;
                bestx = x;
                besty = y;
            }
        }

        return bestx + "/" + besty;
    }

    private long sq(long x) {
        return x * x;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
