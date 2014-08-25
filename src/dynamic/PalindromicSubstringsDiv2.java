package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 607 Division II Level Two - 500
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12967&rd=15840
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+607
public class PalindromicSubstringsDiv2 {
    public int count(String[] S1, String[] S2) {
        String s = join(S1) + join(S2);
        int n = s.length();
        int c = 0;

        for (int i = 1; i <= n; i++) {
            c += pali(s, i);
        }

        return c;
    }

    private int pali(String s, int l) {
        int n = s.length();
        int c = 0;
        for (int i = 0; i <= (n - l); i++) {
            if (pali(s.substring(i, i + l))) {
                c++;
            }
        }
        return c;
    }

    private boolean pali(String s) {
        int n = s.length();

        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }

        return true;
    }

    String join(String[] input) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < input.length; i++) {
            builder.append(input[i]);
        }
        return builder.toString();
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
