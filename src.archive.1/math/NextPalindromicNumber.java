package topc.math;

import java.util.*;
import java.io.*;
import java.math.*;
import java.text.*;

// SRM 330 Division II Level Three - 1000
// simple math, string manipulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=7257&rd=10010
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm330
public class NextPalindromicNumber {
    public String getNext(String n) {
        if (highest(n)) { return "1" + zeros(n.length() - 1) + "1"; }

        char p[] = pali(n).toCharArray();
        int k1   = p.length % 2 == 1 ? p.length / 2 : (p.length - 1) / 2;
        int k2   = p.length % 2 == 1 ? p.length / 2 : (p.length + 1) / 2;

        if (greater(new String(p), n)) { return new String(p); }

        while (k1 != -1) {
            if (p[k1] < '9') {
                p[k1]++;
                if (k1 != k2) {
                    p[k2]++;
                }
                k1 = -1;
                k2 = -1;
            } else {
                p[k1] = '0';
                p[k2] = '0';
                k1--;
                k2++;
            }
        }

        return new String(p);
    }

    private boolean greater(String a, String b) {
        BigInteger x = new BigInteger(a);
        BigInteger y = new BigInteger(b);
        return x.compareTo(y) > 0;
    }

    private String pali(String n) {
        int l       = n.length();
        String half = n.substring(0, l / 2);

        if (l % 2 == 0) {
            return half + reverse(half);
        } else {
            return half + n.charAt(l / 2) + reverse(half);
        }
    }

    private String reverse(String n) {
        return (new StringBuffer(n)).reverse().toString();
    }

    private String zeros(int k) {
        String s = "";
        for (int i = 0; i < k; i++) {
            s += "0";
        }
        return s;
    }

    private boolean highest(String n) {
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) != '9') { return false; }
        }
        return true;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
