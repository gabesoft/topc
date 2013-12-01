package topc.greedy;

import java.util.*;
import java.io.*;

// TCO10 Round 1 Division I Level One - 250
// greedy
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10933&rd=14279
// editorial: http://apps.topcoder.com/wiki/display/tc/TCO'10+Online+Round+1
public class EqualizeStrings {
    public String getEq(String s, String t) {
        int n    = s.length();
        char r[] = new char[n];

        for (int i = 0; i < n; i++) {
            r[i] = best(s.charAt(i), t.charAt(i));
        }

        return new String(r);
    }

    private char best(char c1, char c2) {
        int cost = 100;
        char r   = '.';

        for (char c = 'a'; c <= 'z'; c++) {
            int a = Math.min(Math.abs(c1 - c), 'z' - c1 + (c - 'a' + 1));
            int b = Math.min(Math.abs(c2 - c), 'z' - c2 + (c - 'a' + 1));

            int curr = a + b;
            if (curr < cost) {
                cost = curr;
                r = c;
            }
        }

        return r;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
