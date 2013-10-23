package topc.math;

import java.util.*;
import java.io.*;

// SRM 523 Division I Level One - 250
// math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10957&rd=14548
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+523
public class CountingSeries {
    public long countThem(long a, long b, long c, long d, long upperBound) {
        long arith = upperBound >= a ? (upperBound - a) / b + 1 : 0;
        long geom  = 0;

        long fact = c;
        while (fact <= upperBound) {
            if (include(fact, a, b, arith)) {
                geom++;
            }

            long next = fact * d;
            if (next == fact) {
                break;
            }

            fact = next;
        }

        return arith + geom;
    }

    private boolean include(long g, long a, long b, long k) {
        return g < a || (g - a) % b != 0;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
