package topc.math;

import java.util.*;
import java.io.*;

// SRM 337 Division II Level Three - 1100
// math, recursion
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=7407&rd=10661
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm337
public class AnagramList {
    long fact[];

    public String getAnagram(String s, int k) {
        int n       = s.length();
        int chars[] = new int[26];

        fact = buildFactTable(n);

        for (int i = 0; i < n; i++) {
            int c = s.charAt(i) - 'a';
            chars[c]++;
        }

        long curr = 0;
        long prev = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] > 0) {
                chars[i]--;
                curr += count(chars);
                chars[i]++;
                if (curr > k) {
                    int loc   = s.indexOf(i + 'a');
                    String ns = s.substring(0, loc) + s.substring(loc + 1);
                    int nk    = k - (int)prev;
                    return (char)(i + 'a') + getAnagram(ns, nk);
                } else {
                    prev = curr;
                }
            }
        }

        return "";
    }

    long count(int[] chars) {
        int n  = 0;
        long f = 1;

        for (int i = 0; i < chars.length; i++) {
            f *= fact[chars[i]];
            n += chars[i];
        }

        return fact[n] / f;
    }

    long[] buildFactTable(int n) {
        long[] fact = new long[n + 1];
        fact[0]     = 1;

        for (int i = 1; i < fact.length; i++) {
            fact[i] = i * fact[i - 1];
        }

        return fact;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
