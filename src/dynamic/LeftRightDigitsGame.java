package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 556 Division II Level Three - 1000
// dynamic programming, greedy
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12173&rd=15178
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+556
public class LeftRightDigitsGame {
    public String minNumber(String digits) {
        int n      = digits.length();
        String res = "";

        for (int i = 0; i < n; i++) {
            char c = digits.charAt(i);
            if (c != '0') {
                String s = "" + c;

                if (i > 0) {
                    s += find(digits.substring(0, i));
                }
                if (i != n - 1) {
                    s += digits.substring(i + 1, n);
                }
                if (res == "" || res.compareTo(s) > 0) {
                    res = s;
                }
            }
        }

        return res;
    }

    String find(String s) {
        int n = s.length();
        String res = "";

        for (int i = 0; i < n; i++) {
            String s1 = res + s.charAt(i);
            String s2 = s.charAt(i) + res;
            res = s1.compareTo(s2) < 0 ? s1 : s2;
        }

        return res;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
