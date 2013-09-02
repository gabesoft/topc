package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 555 Division I Level One - 255
// dynamic programming, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12155&rd=15177
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+555
public class CuttingBitString {
    String[] valid;

    public int getmin(String S) {
        //return solve1(S);
        return solve2(S);
    }

    // dp
    private int solve2(String s) {
        int n   = s.length();
        int f[] = new int[n];

        for (int i = 0; i < n; i++) {
            f[i] = -1;

            if (isPow5(s.substring(0, i + 1))) {
                f[i] = 1;
            } else {
                for (int j = 1; j < i + 1; j++) {
                    if (isPow5(s.substring(j, i + 1)) && f[j - 1] != -1) {
                        if (f[i] == -1 || f[i] > f[j - 1] + 1) {
                            f[i] = f[j - 1] + 1;
                        }
                    }
                }
            }
        }

        return f[n - 1];
    }

    // recursive
    private int solve1(String s) {
        valid = new String[25];
        valid[0] = "1";

        long x = 1L;
        for (int i = 1; i < valid.length; i++) {
            x *= 5L;
            valid[i] = toBinary(x);
        }

        return cut(s, 0);
    }

    private boolean isPow5(String s) {
        if (s.length() == 0 || s.charAt(0) == '0') { return false; }

        long t = 0;
        int n  = s.length();

        for (int i = 0; i < n; i++) {
            t = t * 2 + (s.charAt(i) == '1' ? 1 : 0);
        }

        while ((t % 5) == 0) {
            t /= 5;
        }

        return t == 1;
    }

    private int cut(String s, int k) {
        if (s.length() == 0) { return k; }

        int best = -1;
        for (int i = valid.length - 1; i > -1; i--) {
            if (valid[i].equals(s)) {
                best = k + 1;
                break;
            }
            if (valid[i].length() <= s.length() && s.startsWith(valid[i])) {
                int next = cut(s.substring(valid[i].length()), k + 1);
                if (next > -1 && (best == -1 || best > next)) {
                    best = next;
                }
            }
        }

        return best;
    }

    private String toBinary(long x) {
        String s = "";
        while (x > 0) {
            s = (x % 2) + s;
            x /= 2;
        }
        return s;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
