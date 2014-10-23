package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 556 Division II Level Three - 1000
// dynamic programming, greedy
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12173&rd=15178
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+556
public class LeftRightDigitsGame {
    public String minNumber(String digits) {
        String s = "" + digits.charAt(0);

        int n = digits.length();
        for (int i = 1; i < n; i++) {
            char c = digits.charAt(i);
            if (c != '0') {
                if (s.charAt(0) == '0') {
                    s = hasLE(digits, i + 1, c) ? s + c : c + s;
                } else {
                    s = (c <= s.charAt(0)) ? c + s : s + c;
                }
            } else if (s.charAt(0) == '0') {
                s = c + s;
            } else {
                s = hasLE(digits, i + 1, s.charAt(0)) ? c + s : s + c;
            }
        }

        return s;
    }

    private boolean hasLE(String d, int start, char c) {
        int n = d.length();

        for (int i = start; i < n; i++) {
            if (d.charAt(i) <= c && d.charAt(i) != '0') {
                return true;
            }
        }
        return false;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
