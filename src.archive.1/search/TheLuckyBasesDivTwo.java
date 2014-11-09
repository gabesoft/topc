package topc.search;

import java.util.*;
import java.io.*;

// SRM 510 Division II Level Three - 1000
// search
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11466&rd=14439
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+510
public class TheLuckyBasesDivTwo {
    public long find(long n) {
        return (n == 4 || n == 7) ? -1 : count2d(n) + count3dplus(n);
    }

    boolean lucky(long n, long b) {
        if (n < b) { return n == 4 || n == 7; }
        long x = n / b;
        long y = n % b;
        return (y == 4 || y == 7) && lucky(x, b);
    }

    long count3dplus(long n) {
        long lim = (long)Math.sqrt(n);
        long res = 0;
        for (int b = 5; b < lim + 1; b++) {
            if (lucky(n, b)) {
                res++;
            }
        }
        return res;
    }

    long count2d(long n) {
        long res = 0;
        for (long a = 4; a <= 7; a += 3) {
            for (long b = 4; b <= 7; b+= 3) {
                res += canDoPair(n, a, b) ? 1 : 0;
            }
        }
        return res;
    }

    boolean canDoPair(long n, long a, long b) {
        long ax = n - b;
        if (ax % a == 0) {
            long x = ax / a;
            return x > a && x > b;
        }
        return false;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
