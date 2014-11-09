package topc.stringm;

import java.util.*;
import java.io.*;

// SRM 247 Division II Level Three - 1000
// string manipulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=4521&rd=7222
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm247
public class Speller {
    int INF = 500;

    String ONES[] = { "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
    String TEEN[] = { "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
    String TENS[] = { "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };

    public int value(String number) {
        if (number.length() < 3) { return -1; }

        int n    = -1;
        int best = INF;
        int dups = 0;

        for (int i = 0; i < ONES.length; i++) {
            int dist = check(number, ONES[i]);
            if (dist < best) {
                best = dist;
                n    = i + 1;
            } else if (dist == best) {
                n = -1;
            }
        }

        for (int i = 0; i < TEEN.length; i++) {
            int dist = check(number, TEEN[i]);
            if (dist < best) {
                best = dist;
                n    = i + 10;
            } else if (dist == best) {
                n = -1;
            }
        }

        for (int i = 0; i < TENS.length; i++) {
            int dist = check(number, TENS[i]);
            if (dist < best) {
                best = dist;
                n    = (i + 2) * 10;
            } else if (dist == best) {
                n = -1;
            }
        }

        for (int i = 0; i < TENS.length; i++) {
            for (int j = 0; j < ONES.length; j++) {
                int dist = check(number, TENS[i] + "-" + ONES[j]);
                if (dist < best) {
                    best = dist;
                    n    = (i + 2) * 10 + (j + 1);
                } else if (dist == best) {
                    n = -1;
                }
            }
        }

        return n;
    }

    private int check(String s1, String s2) {
        if (s1.length() != s2.length()) { return INF; }

        int diff = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                diff++;
            }
        }

        //debug(s1, s2, diff);
        return diff;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
