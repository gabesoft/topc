package topc.easy;

import java.util.*;
import java.io.*;

// SRM 466 Division I Level One - 250
// brute force, simple math, string manipulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10862&rd=14150
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+466
public class LotteryCheating {
    public int minimalChange(String ID) {
        ID = new StringBuilder(ID).reverse().toString();

        int r = 10;
        int n = ID.length();
        int e = (int)Math.sqrt(Math.pow(10, n));

        for (long i = 0; i <= e; i++) {
            long y = i * i;
            int c  = 0;

            for (int j = 0; j < n; j++) {
                char d = (char)('0' + (y % 10));
                y /= 10;

                if (ID.charAt(j) != d) {
                    c++;
                }
            }

            r = Math.min(r, c);
        }

        return r;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
