package topc.math;

import java.util.*;
import java.io.*;

// SRM 546 Division I Level One - 250
// simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12049&rd=14738
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+546
public class KleofasTail {
    public long countGoodSequences(long K, long A, long B) {
        return count(B, K) - count(A - 1, K);
    }

    private long count(long n, long x) {
        if (x == 0) { return n + 1; }
        if (x == n) { return 1; }
        if (x > n) { return 0; }

        if (x % 2 == 1) { return 1 + count(n, x * 2); }

        long m = 1;
        long c = 0;
        while (2L * m * x <= n) {
            c += 2 * m;
            m *= 2;
        }

        return c + Math.min(n, m * x + 2 * m - 1) - m * x + 1;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
