package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 230 Division II Level Three - 1000
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=3448&rd=6519
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm230
public class DeserializeSequence {
    int MAX = 1000000;
    int n;
    String seq;

    public int howMany(String str) {
        seq = str;
        n   = str.length();
        return count(0, 1);
    }

    private int count(int k, int min) {
        if (k == n) { return 1; }

        int c = 0;
        int x = 0;

        for (int i = k; i < n; i++) {
            x *= 10;
            x += seq.charAt(i) - '0';

            if (x > MAX) { break; }

            if (x >= min) {
                c += count(i + 1, x);
            }
        }

        return c;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
