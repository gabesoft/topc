package topc.dynamic;

import java.util.*;
import java.io.*;

// College Tour SRM 370 Division I Level Three - 1000
// dynamic programming, string manipulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=7967&rd=10953
// editorial: http://community.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm370
public class JohnnysPhone {
    String curr;
    String dict;
    int INF    = 1000000000;
    int [] TAB = {
        2, 2, 2,
        3, 3, 3,
        4, 4, 4,
        5, 5, 5,
        6, 6, 6,
        7, 7, 7, 7,
        8, 8, 8,
        9, 9, 9, 9 };
    int [] memo;

    public int minimizePushes(String[] dictionary, String message) {
        dict = "";
        for (int i = 0; i < dictionary.length; i++) {
            dict += dictionary[i];
        }

        StringTokenizer tok = new StringTokenizer(message);
        int res = 0;

        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) == ' ') {
                res++;
            }
        }

        while (tok.hasMoreTokens()) {
            curr = tok.nextToken();
            memo = new int[curr.length()];

            for (int i = 0; i < curr.length(); i++) {
                memo[i] = -1;
            }

            res += rec(0);
            if (res >= INF) { return -1; }
        }

        return res;
    }

    int rec(int i) {
        if (i == curr.length()) { return -1; }

        if (memo[i] == -1) {
            memo[i] = INF;

            String tmp = "";
            String pat = "";

            for (int j = i; j < curr.length(); j++) {
                char c = curr.charAt(j);
                tmp += c;
                pat += TAB[c - 'a'];
                memo[i] = Math.min(memo[i], j - i + 1 + check(tmp, pat) + 1 + rec(j + 1));
            }
        }

        return memo[i];
    }

    int check(String word, String pattern) {
        StringTokenizer tok = new StringTokenizer(dict);
        int res = 0;

        while (tok.hasMoreTokens()) {
            String tmp = tok.nextToken();
            if (tmp.length() < word.length()) {
                continue;
            }
            if (tmp.substring(0, word.length()).equals(word)) {
                return res;
            }

            String pat = "";
            for (int i = 0; i < word.length(); i++) {
                pat += TAB[tmp.charAt(i) - 'a'];
            }
            if (pat.equals(pattern)) {
                res++;
            }
        }

        return INF;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
