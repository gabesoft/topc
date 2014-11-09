package topc.math;

import java.util.*;
import java.io.*;

// SRM 540 Division II Level Three - 1000
// math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11135&rd=14732
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+540
public class FractionInDifferentBases {
    public long getNumberOfGoodBases(long P, long Q, long A, long B) {
        long g = gcd(P, Q);
        long q = Q / g;

        long y = 1;
        for (int i = 2; i <= q / i; i++) {
            if (q % i == 0) {
                y *= i;
                while (q % i == 0) {
                    q /= i;
                }
            }
        }

        y *= q;

        long finite = B / y - (A - 1) / y;
        return (B + 1 - A) - finite;
    }

    long gcd(long a, long b) {
        while (b != 0) {
            long c = b;
            b = a % b;
            a = c;
        }
        return a;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
