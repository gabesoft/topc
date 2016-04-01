package topc.easy;

import java.util.*;

// SRM 658 Division II Level One - 250
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13783&rd=16461
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+658
public class InfiniteString {
    public String equal(String s, String t) {
        int slen = s.length();
        int tlen = t.length();
        for (int i = 0; i < slen && i < tlen; i++) {
            if (s.charAt(i) != t.charAt(i)) {
                return "Not equal";
            }
        }

        int l = lcm(slen, tlen);
        String s1 = "";
        String s2 = "";

        for (int i = 0; i < l / slen; i++) {
            s1 += s;
        }
        for (int i = 0; i < l / tlen; i++) {
            s2 += t;
        }

        return s1.equals(s2) ? "Equal" : "Not equal";
    }

    private int gcd(int x, int y) {
        while (x != 0) {
            int z = x;
            x = y % x;
            y = z;
        }
        return y;
    }

    private int lcm(int x, int y) {
        return x * (y / gcd(x, y));
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
