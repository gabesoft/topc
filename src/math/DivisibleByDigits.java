package topc.math;

import java.util.*;
import java.io.*;

// SRM 375 Division I Level One - 250
// simple math, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=8318&rd=10794
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm375
public class DivisibleByDigits {
    public long getContinuation(int n) {
        String x = n + "";
        String r = "";

        if (good(n, x)) { return n; }

        for (int i = 0; i < 4; i++) {
            int[] d      = new int[i + 1];
            boolean more = true;

            while (more) {
                String y = x + toString(d);

                if (good(n, y)) { return Long.parseLong(y); }

                more = false;
                for (int j = d.length - 1; j > -1; j--) {
                    if (d[j] < 9) {
                        d[j]++;
                        more = true;
                        break;
                    } else if (j > 0) {
                        d[j] = 0;
                    }
                }
            }
        }

        return 0L;
    }

    String toString(int[] d) {
        String r = "";
        for (int i = 0; i < d.length; i++) {
            r += d[i];
        }
        return r;
    }

    boolean good(int n, String s) {
        long x = Long.parseLong(s);
        long d = 0;

        while (n > 0) {
            d  = n % 10;
            n /= 10;

            if (d == 0) {
                continue;
            }

            if (x % d != 0) { 
                return false;
            }
        }

        return true;
    }
    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
