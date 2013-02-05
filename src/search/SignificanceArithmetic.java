package topc.search;

import java.util.*;
import java.io.*;

// SRM 362 Division II Level Three - 1000
// search, simple math, simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=8056&rd=10775
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm362
public class SignificanceArithmetic {
    public String evaluate(String expression) {
        String e[] = expression.split("\\+");
        String n1 = trimLeadingZeros(e[0]);
        String n2 = trimLeadingZeros(e[1]);

        int d1   = digitsAfterDot(n1);
        int d2   = digitsAfterDot(n2);
        int dmin = Math.min(d1, d2);
        int dmax = Math.max(d1, d2);

        String n = String.format("%f", Double.parseDouble(n1) + Double.parseDouble(n2));

        return round(round(n, dmax), dmin);
    }

    String round(String n, int d) {
        int x = digitsAfterDot(n);
        int k = n.indexOf('.');

        if (k == -1 || x == d) { return n; }
        if (x < d) { return padAfter(n, d - x); }

        k += d;

        if (n.charAt(k + 1) == '5') {
            return roundEq(n, d);
        }
        if (n.charAt(k + 1) > '5') {
            return roundUp(n, d);
        }
        if (n.charAt(k + 1) < '5') {
            return roundDown(n, d);
        }

        return n;
    }

    String roundUp(String n, int d) {
        int k = n.indexOf('.') + d;
        int p = d == 0 ? k : k + 1;

        return addOne(n.substring(0, p), p - 1);
    }

    String roundDown(String n, int d) {
        int k = n.indexOf('.') + d;
        int p = d == 0 ? k : k + 1;

        return n.substring(0, p);
    }

    String addOne(String n, int k) {
        if (k < 0) { return "1" + n; }

        if (n.charAt(k) == '9') {
            String next = n.substring(0, k) + '0' + n.substring(k + 1);
            return addOne(next, k - 1);
        }

        if (n.charAt(k) == '.') { return addOne(n, k - 1); }

        return n.substring(0, k) + (char)(n.charAt(k) + 1) + n.substring(k + 1);
    }

    String roundEq(String n, int d) {
        int k = n.indexOf('.') + d;
        int l = n.length();
        int s = k + 2;

        boolean hasNonZeroDigits = false;

        for (int i = s; i < l; i++) {
            if (n.charAt(i) != '0') {
                hasNonZeroDigits = true;
                break;
            }
        }

        if (hasNonZeroDigits) {
            return roundUp(n, d);
        }

        String up = roundUp(n, d);
        String dn = roundDown(n, d);

        int l1 = up.charAt(up.length() - 1);
        int l2 = dn.charAt(dn.length() - 1);

        return l1 % 2 == 0 ? up : dn;
    }

    String padAfter(String s, int d) {
        for (int i = 0; i < d; i++) {
            s += '0';
        }
        return s;
    }

    int digitsAfterDot(String s) {
        int x = s.indexOf('.');
        return x == -1 ? 0 : s.length() - (x + 1);
    }

    String trimLeadingZeros(String s) {
        if (s.charAt(0) != '0') { return s; }

        int k = 0;
        int l = s.length();
        while (k < l - 1 && s.charAt(k) == '0') {
            k++;
        }

        if (s.charAt(k) == '.') {
            k--;
        }

        return s.substring(k);
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
