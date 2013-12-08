package topc.search;

import java.util.*;
import java.io.*;

// SRM 462 Division I Level One - 250
// search, simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10589&rd=14147
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+462
public class AgeEncoding {
    public double getRadix(int age, String candlesLine) {
        double hi = 100;
        double lo = 0;

        double prev = -1;

        int c = 0;
        while (c++ < 100) {
            double mid  = lo + (hi - lo) / 2.0;
            double curr = check(candlesLine, mid);

            if (curr < age) {
                lo = mid;
            } else {
                hi = mid;
            }

            prev = curr;
        }

        int l = candlesLine.length();

        if (age == 1 && candlesLine.charAt(l - 1) == '1' && candlesLine.substring(0, l - 1).indexOf('1') == -1) {
            return -2;
        }

        if (lo == 0 || Math.abs(check(candlesLine, lo) - age) > 1.0e-8) {
            return -1;
        }

        return lo;
    }

    private double check(String n, double base) {
        int l = n.length();

        double y = (int)(n.charAt(l - 1) - '0');
        double b = base;
        for (int i = l - 2; i > -1; i--) {
            int d = n.charAt(i) - '0';

            y += d * b;
            b *= base;
        }

        return y;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
