package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 301 Division II Level Three - 1000
// dynamic programming, recursion, string manipulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=6221&rd=9822
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm301
public class CorrectingParenthesization {
    int INF = Integer.MAX_VALUE / 4;
    char[] chars;
    int[][] memo;

    public int getMinErrors(String s) {
        chars = new char[s.length()];
        memo = new int[s.length()][s.length()];

        for (int i = 0; i < chars.length; i++) {
            chars[i] = s.charAt(i);
        }

        for (int i = 0; i < memo.length ; i++) {
            Arrays.fill(memo[i], -1);
        }

        if (chars.length == 0) { return 0; }

        return count(0, chars.length - 1);
    }

    boolean pair(int s, int e) {
        return chars[s] == '(' && chars[e] == ')'
            || chars[s] == '[' && chars[e] == ']'
            || chars[s] == '{' && chars[e] == '}';
    }

    boolean open(int s) {
        return chars[s] == '(' || chars[s] == '[' || chars[s] == '{';
    }

    boolean closed(int s) {
        return chars[s] == ')' || chars[s] == ']' || chars[s] == '}';
    }

    int adjustement(int s, int e) {
        if (pair(s, e)) { return 0; }
        if (open(s) || closed(e)) { return 1; }
        return 2;
    }

    int count(int s, int e) {
        assert s <= e : "invalid bounds: " + s + " " + e;

        if (s == e) { return INF; }
        if (s + 1 == e) { return adjustement(s, e); }

        if (memo[s][e] > -1) { return memo[s][e]; }

        int best = adjustement(s, e) + count(s + 1, e - 1);

        for (int i = s + 1; i < e; i++) {
            best = Math.min(best, count(s, i) + count(i + 1, e));
        }

        memo[s][e] = best;
        return best;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
