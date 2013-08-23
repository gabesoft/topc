package topc.stringm;

import java.util.*;
import java.io.*;

// SRM 574 Division I Level One - 275
// string manipulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12474&rd=15494
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+574
public class TheNumberGame {
    public String determineOutcome(int A, int B) {
        int da[]  = digits(A);
        int db[]  = digits(B);
        int dbr[] = digits(rev(B));

        if (da.length < db.length) { return "Manao loses"; }

        for (int i = 0; i < da.length; i++) {
            boolean f1 = true;
            for (int j = 0; j < db.length; j++) {
                if (i + j == da.length || da[i + j] != db[j]) {
                    f1 = false;
                    break;
                }
            }

            boolean f2 = true;
            for (int j = 0; j < db.length; j++) {
                if (i + j == da.length || da[i + j] != dbr[j]) {
                    f2 = false;
                    break;
                }
            }

            if (f1 || f2) {
                return "Manao wins";
            }
        }

        return "Manao loses";
    }

    private int[] digits(int n) {
        int k = 0;
        int m = n;
        while (m > 0) {
            k++;
            m /= 10;
        }

        int r[] = new int[k];
        int i = k - 1;
        while (n > 0) {
            r[i--] = n % 10;
            n /= 10;
        }

        return r;
    }

    private int rev(int n) {
        if (n < 10) { return n; }

        int r = 0;
        while (n > 0) {
            int d = n % 10;

            r *= 10;
            r += d;

            n /= 10;
        }

        return r;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
