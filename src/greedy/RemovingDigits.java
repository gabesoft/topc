package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 396 Division II Level Three - 1000
// greedy, search, string manipulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=8721&rd=12168
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm396
public class RemovingDigits {
    public String maxNumber(String number, String digits) {
        String n = number;

        for (int i = 0; i < digits.length(); i++) {
            n = remove(n, digits.charAt(i));
        }

        return sort(n, number);
    }

    String sort(String number, String original) {
        char o[]       = original.toCharArray();
        char c[]       = number.toCharArray();
        boolean used[] = new boolean[number.length()];

        Arrays.sort(c);

        String n  = "";
        int index = 0;

        for (int l = 0; l < c.length; l++) {
            for (int i = c.length - 1; i > -1; i--) {
                if (used[i]) { continue; }

                char ch[]   = o.clone();
                int next    = indexOf(o, c[i], index);
                boolean all = true;

                for (int j = 0; j < c.length; j++) {
                    if (i != j && !used[j]) {
                        if (!found(ch, c[j], next)) {
                            all = false;
                            break;
                        }
                    }
                }

                if (all) {
                    used[i] = true;
                    o[next] = '.';
                    index   = next;

                    n += c[i];
                    break;
                }
            }
        }

        return n;
    }

    int indexOf(char[] chars, char c, int index) {
        for (int i = index; i < chars.length; i++) {
            if (chars[i] == c) { return i; }
        }
        return -1;
    }

    boolean found(char[] chars, char c, int index) {
        for (int i = index + 1; i < chars.length; i++) {
            if (chars[i] == c) {
                chars[i] = '.';
                return true;
            }
        }
        return false;
    }

    String remove(String n, char d) {
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) == d) {
                return n.substring(0, i) + n.substring(i + 1);
            }
        }
        return n;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
