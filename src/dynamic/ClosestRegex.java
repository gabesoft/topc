package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 410 Division II Level Three - 1000
// dynamic programming, string manipulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=9727&rd=12182
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm410
public class ClosestRegex {
    int[] text;
    int[] regex;
    boolean[] star;
    int rlen;
    Pair[][] memo;

    public String closestString(String text, String regex) {
        this.text  = new int[text.length()];
        this.regex = new int[regex.length()];
        this.star  = new boolean[regex.length()];
        this.memo  = new Pair[text.length()][4 * text.length()];

        for (int i = 0; i < this.text.length; i++) {
            this.text[i] = text.charAt(i) - 'a';
        }

        rlen = 0;
        for (int j = 0; j < regex.length(); j++) {
            if (regex.charAt(j) == '*') {
                this.star[rlen - 1] = true;
            } else {
                this.regex[rlen++] = regex.charAt(j) - 'a';
            }
        }

        Pair res = rec(0, 0);

        return res != null ? res.getKey() : "";
    }

    Pair rec(int tpos, int rpos) {
        if (tpos == text.length) {
            boolean done = true;
            for (int i = rpos; i < rlen; i++) {
                done &= star[i];
            }
            return done ? new Pair("", 0) : null;
        }
        if (rpos == rlen) {
            return null;
        }

        if (memo[tpos][rpos] != null) { return memo[tpos][rpos]; }

        int best  = 100;
        String s  = null;
        Pair next = null;

        for (int i = 0; i < 26; i++) {
            if (i == regex[rpos]) {
                next = rec(tpos + 1, rpos + 1);
                next = check(next, s, best, tpos, i, false);
                s    = next.getKey();
                best = next.getValue();

                if (star[rpos]) {
                    next = rec(tpos + 1, rpos);
                    next = check(next, s, best, tpos, i, false);
                    s    = next.getKey();
                    best = next.getValue();
                }
            }
        }

        if (star[rpos]) {
            next = rec(tpos, rpos + 1);
            next = check(next, s, best, tpos, text[tpos], true);
            s    = next.getKey();
            best = next.getValue();
        }

        memo[tpos][rpos] = s != null ? new Pair(s, best) : null;
        return memo[tpos][rpos];
    }

    Pair check(Pair p, String s, int best, int tpos, int c, boolean same) {
        if (p == null) { return new Pair(s, best); }

        int v    = c != text[tpos] ? p.getValue() + 1 : p.getValue();
        String u = same ? p.getKey() : (char)(c + 'a') + p.getKey();

        return (v < best || (v == best && s.compareTo(u) > 0)) 
            ? new Pair(u, v)
            : new Pair(s, best);
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    class Pair extends AbstractMap.SimpleEntry<String, Integer> {
        public Pair(String k, int v) {
            super(k, v);
        }
    }
}
