package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 555 Division I Level One - 255
// dynamic programming, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12155&rd=15177
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+555
public class CuttingBitString {
    public static final int INF = 100;
    HashSet<String> p5;
    String s;
    int n = 0;

    public int getmin(String S) {
        p5 = new HashSet<String>();
        s  = S;
        n  = s.length();

        long x = 1;

        for (int i = 2; i < 25; i++) {
            debug(x, Long.toBinaryString(x), Long.toBinaryString(x).length());
            p5.add(Long.toBinaryString(x));
            x *= 5;
        }

        int r = count(0);

        return r >= INF ? -1 : r;
    }

    private int count(int k) {
        if (k == n) { return INF; }

        String sub = s.substring(k);

        if (p5.contains(sub)) { return 1; }

        int best = INF;
        for (int i = k + 1; i < n; i++) {
            sub = s.substring(k, i);
            if (p5.contains(sub)) {
                best = Math.min(best, 1 + count(i));
            }
        }

        return best;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
