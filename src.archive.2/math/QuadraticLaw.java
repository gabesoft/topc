package topc.math;

import java.util.*;
import java.io.*;

// SRM 635 Division II Level Two - 500
// math, search
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13486&rd=16078
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+635
public class QuadraticLaw {
    public long getTime(long d) {
        long lo = 0;
        long hi = Math.min(d / 2, (long)Math.sqrt(Long.MAX_VALUE));;

        while (lo <= hi) {
            long md = lo + (hi - lo) / 2;
            long m  = md * md;
            long v  = md + m;

            if (m >= 0 && v >= 0 && v <= d) {
                lo = md + 1;
            } else {
                hi = md - 1;
            }
        }

        return lo - 1;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
