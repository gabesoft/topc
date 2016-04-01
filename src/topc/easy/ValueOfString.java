package topc.easy;

import java.util.*;

// SRM 652 Division II Level One - 250
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13678&rd=16316
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+652
public class ValueOfString {
    public int findValue(String s) {
        int c = 0;

        for (char c1 : s.toCharArray()) {
            int v = c1 - 'a' + 1;

            for (char c2 : s.toCharArray()) {
                if (c2 <= c1) {
                    c += v;
                }
            }
        }

        return c;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
