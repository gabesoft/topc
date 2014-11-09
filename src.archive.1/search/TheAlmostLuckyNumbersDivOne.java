package topc.search;

import java.util.*;
import java.io.*;

// SRM 510 Division I Level One - 250
// simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11461&rd=14439
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+510
public class TheAlmostLuckyNumbersDivOne {
    public long find(long a, long b) {
        long c1 = count(a - 1, 0, false);
        long c2 = count(b, 0, false);
        return c2 - c1;
    }

    private long count(long n, long x, boolean only47) {
        if (x > n) { return 0; }

        long c = 1;

        if (only47) {
            c += count(n, x * 10 + 4, only47);
            c += count(n, x * 10 + 7, only47);
        } else {
            int s = x == 0 ? 1 : 0;
            for (int i = s; i < 10; i++) {
                c += count(n, x * 10 + i, i != 4 && i != 7);
            }
        }

        return c;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
