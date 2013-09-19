package topc.search;

import java.util.*;
import java.io.*;

// SRM 540 Division I Level One - 250
// simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11842&rd=14732
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+540
public class ImportantSequence {
    public int getCount(int[] B, String operators) {
        long INF = 1L << 50;
        long min = 1;
        long max = INF;

        for (int i = 0; i < B.length; i++) {
            if (min > max) { break; }

            long mn = 0;
            long mx = 0;

            if (operators.charAt(i) == '-') {
                mn = Math.max(1, min - B[i]);
                mx = (max == INF) ? INF : max - B[i];
            } else {
                mx = B[i] - min;
                mn = Math.max(B[i] - max, 1);
            }

            min = mn;
            max = mx;
        }

        if (max < min) { return 0; }
        if (max == INF) { return -1; }

        return (int)(max - min + 1);
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
