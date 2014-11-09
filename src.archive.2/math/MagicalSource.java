package topc.math;

import java.util.*;
import java.io.*;

// SRM 451 Division I Level One - 250
// math, simple math, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10635&rd=13905
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+451
public class MagicalSource {
    public long calculate(long x) {
        long t = 10;
        long r = x;
        long y = x * 9;

        while (t - 1 <= y) {
            if (y % (t - 1) == 0) {
                r = y / (t - 1);
            }
            t *= 10;
        }

        return r;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
