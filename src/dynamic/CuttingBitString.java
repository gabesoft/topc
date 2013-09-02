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
        valid = new String[25];
        valid[0] = "1";

        long x = 1L;
        for (int i = 1; i < valid.length; i++) {
            x *= 5L;
            valid[i] = toBinary(x);
        }

        return cut(S, 0);
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
