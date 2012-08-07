package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 327 Division I Level One - 300
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=6871&rd=10007
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm327
public class NiceOrUgly {
    char[] chars;
    int[][][] memo;
    public String describe(String s) {
        memo  = new int[s.length()][4][5];
        chars = new char[s.length()];

        for (int i = 0; i < chars.length; i++) {
            chars[i] = s.charAt(i);
        }

        int res = rec(0, 0, 0);
        if (res == 3) {
            return "42";
        } else {
            return res == 1 ? "UGLY" : "NICE";
        }
    }

    int rec(int pos, int v, int c) {
        if (v == 3 || c == 5) { return 1; }
        if (pos == chars.length) { return 2; }
        if (memo[pos][v][c] > 0) { return memo[pos][v][c]; }

        int res = 0;
        if (chars[pos] == '?') {
            int n1 = rec(pos + 1, v + 1, 0);
            int n2 = rec(pos + 1, 0, c + 1);

            if (n1 == 3 || n2 == 3) { 
                res = 3;
            } else {
                res = n1 == n2 ? n1 : n1 + n2;
            }
        } else {
            boolean isv = vowel(chars[pos]);
            res         = rec(pos + 1, isv ? v + 1 : 0, isv ? 0 : c + 1);
        }

        memo[pos][v][c] = res;
        return res;
    }

    boolean vowel(char c) {
        return c == 'A' 
            || c == 'E'
            || c == 'I'
            || c == 'O'
            || c == 'U';
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
