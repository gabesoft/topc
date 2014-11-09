package topc.easy;

import java.util.*;
import java.io.*;

// SRM 323 Division II Level Three - 1000
// brute force, search
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=6603&rd=10003
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm323
public class UnrepeatableWords {
    char[] letters;
    int k;

    public String getWord(int k, int n, int allowed) {
        letters = new char[allowed];
        this.k  = k;

        for (int i = 0; i < letters.length; i++) {
            letters[i] = (char)('A' + i);
        }

        char r[] = search(new char[n], 0);

        return r == null ? "" : new String(r);
    }

    private char[] search(char[] s, int index) {
        if (index == s.length) { return s; }

        for (int i = 0; i < letters.length; i++) {
            s[index] = letters[i];
            if (valid(s, index)) {
                char[] next = search(s, index + 1);
                if (next != null) {
                    return next;
                }
            }
        }

        return null;
    }

    private boolean valid(char[] c, int pos) {
        int lim = (pos + 1) / k;

        for (int l = 1; l <= lim; l++) {
            if (repeats(c, pos, l) >= k) {
                return false;
            }
        }

        return true;
    }

    private int repeats(char[] s, int pos, int l) {
        int count = 1;
        int pcurr = pos - l;

        while (pcurr >= l - 1) {
            for (int i = 0; i < l; i++) {
                if (s[pcurr - l + i + 1] != s[pos - l + i + 1]) {
                    return count;
                }
            }

            count++;
            pcurr -= l;
        }

        return count;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
