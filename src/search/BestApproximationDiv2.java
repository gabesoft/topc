package topc.search;

import java.util.*;
import java.io.*;

// SRM 483 Division II Level Three - 1000
// search, simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11073&rd=14236
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+483
public class BestApproximationDiv2 {
    public String findFraction(int maxDen, String number) {
        int lo = 0;
        int hi = number.length() - 1;
        int A  = 0;
        int B  = 0;

        while (lo <= hi) {
            int mid      = lo + (hi - lo) / 2;
            int[] approx = approximate(mid - 1, number.substring(0, mid + 1), maxDen);

            if (approx == null) {
                hi = mid - 1;
            } else {
                A = approx[0];
                B = approx[1];
                lo = mid + 1;
            }
        }

        return String.format("%s/%s has %s exact digits", A, B, lo - 1);
    }

    int[] approximate(int d, String n, int maxDen) {
        int A    = 0;
        double x = Double.parseDouble(n);

        for (int B = 1; B < maxDen + 1; B++) {
            A = (int)Math.floor(B * x);
            if (check(d, n, x, A, B)) {
                return new int[] { A, B };
            }
            A = (int)Math.ceil(B * x);
            if (check(d, n, x, A, B)) {
                return new int[] { A, B };
            }
        }

        return null;
    }

    boolean check(int d, String n, double x, int A, int B) {
        return (A < B && (A / (double)B) >= x) ? matched(d, n, A, B) : false;
    }

    boolean matched(int d, String n, int A, int B) {

        int y    = A * 10;
        int d1   = 0;
        int d2   = 0;

        for (int i = 1; i < d + 1; i++) {
            d1  = (int)(y / (double)B);
            y  -= d1 * B;
            y  *= 10;

            d2 = n.length() > i ? n.charAt(i + 1) - '0' : 0;

            if (d1 != d2) { return false; }
        }

        return true;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
