package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 413 Division II Level Three - 1000
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=9837&rd=13504
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm413
public class InfiniteSequence {
    int P;
    int Q;
    int c;
    HashMap<Long, Long> map;

    public long calc(long n, int p, int q) {
        P   = p;
        Q   = q;
        c   = 0;
        map = new HashMap<Long, Long>();
        return rec(n);
    }

    long rec(long n) {
        if (n == 0) { return 1L; }
        if (map.containsKey(n)) { return map.get(n); }

        long res = rec(n / P) + rec(n / Q);

        map.put(n, res);
        return res;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
