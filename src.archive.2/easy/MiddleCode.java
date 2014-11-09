package topc.easy;

import java.util.*;
import java.io.*;

// SRM 603 Division II Level One - 250
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12940&rd=15836
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+603
public class MiddleCode {
    public String encode(String s) {
        String t = "";

        while (s.length() > 0) {
            int k = s.length() / 2;

            if (s.length() == 1) {
                t = t + s;
                s = "";
            } else if (s.length() % 2 == 0) {
                char c1 = s.charAt(k - 1);
                char c2 = s.charAt(k);

                t = t + (char)Math.min(c1, c2);
                s = c1 < c2 ? removeChar(s, k - 1) : removeChar(s, k);
            } else {
                t = t + s.charAt(k);
                s = removeChar(s, k);
            }
        }

        return t;
    }

    private String removeChar(String s, int k) {
        return s.substring(0, k) + s.substring(k + 1);
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
