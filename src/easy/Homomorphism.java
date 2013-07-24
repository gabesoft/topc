package topc.easy;

import java.util.*;
import java.io.*;

// SRM 190 Division II Level Three - 1000
// brute force, string manipulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=2363&rd=4770
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm190
public class Homomorphism {
    public int count(String u, String v) {
        if (u.length() == 1) { return -1; }
        if (u.length() > v.length()) { return 0; }
        if (u.indexOf('1') == -1 || u.indexOf('0') == -1) {
            return v.length() % u.length() == 0 ? -1 : 0;
        }
        return search(u, v, "", "");
    }

    private int search(String u, String v, String one, String zero) {
        if (u.length() == 0) { return v.length() == 0 ? 1 : 0; }

        char c = u.charAt(0);

        if (u.length() == 1 && c == '0') {
            return zero.length() == 0 || zero.equals(v) ? 1 : 0;
        }
        if (u.length() == 1 && c == '1') {
            return one.length() == 0 || one.equals(v) ? 1 : 0;
        }

        String nu    = u.substring(1);
        String digit = c == '0' ? zero : one;

        if (digit.length() > 0) {
            return v.startsWith(digit) ? search(nu, v.substring(digit.length()), one, zero) : 0;
        } else {
            int len = v.length();
            int cnt = 0;
            for (int i = 1; i < len; i++) {
                String nd = v.substring(0, i);
                String nv = v.substring(i);
                cnt += search(nu, nv, c == '0' ? one : nd, c == '1' ? zero : nd);
            }
            return cnt;
        }
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
