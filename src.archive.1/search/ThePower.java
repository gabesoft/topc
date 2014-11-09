package topc.search;

import java.util.*;
import java.io.*;

// SRM 437 Division II Level Three - 1000
// search
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10235&rd=13699
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+437
public class ThePower {
    HashMap<Long, Integer> map = new HashMap<Long, Integer>();

    public int count(long n) {
        if (n == 1) { return 0; }
        if (n == 2) { return 1; }
        if (n <= 4) { return 2; }
        if (map.containsKey(n)) { return map.get(n); }

        long lm = (long) Math.ceil(Math.log(n) / Math.log(2));
        long ans = 1L << 60;

        for (int i = 2; i < lm + 1; i++) {
            long x = (long) Math.floor(Math.pow(n, 1.0 / i));
            long y = x + 1;
            long u = 1 + count(x) + Math.abs(n - pow(x, i));
            long v = 1 + count(y) + Math.abs(pow(y, i) - n);
            ans = Math.min(ans, Math.min(u, v));
        }

        map.put(n, (int)ans);

        return (int)ans;
    }

    long pow(long a, int b) {
        if (b == 0) { return 1; }
        if (b == 1) { return a; }

        long c = pow(a, b / 2);
        c = c * c;

        return (b & 1) == 1 ? c * a : c;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
