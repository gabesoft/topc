package topc.recursion;

import java.util.*;
import java.io.*;

// SRM 266 Division I Level Two - 450
// recursion, simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=4808&rd=7999
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm266
public class ZCurve {
    public int zValue(int N, int r, int c) {
        if (N == 1) { return (r << 1) | c; }

        int p = 1 << (N - 1);
        int m = (r >= p ? 2 : 0) + (c >= p ? 1 : 0);

        return m * p * p + zValue(N - 1, r % p, c % p);
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
