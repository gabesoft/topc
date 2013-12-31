package topc.easy;

import java.util.*;
import java.io.*;

// SRM 598 Division I Level One - 250
// brute force, greedy
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12861&rd=15710
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+598
public class BinPacking {
    public int minBins(int[] item) {
        Arrays.sort(item);

        int c = 0;
        int n = item.length;

        boolean[] seen = new boolean[n];
        for (int i = n - 1; i > -1; i--) {
            if (seen[i]) { continue; }

            int w   = item[i];
            seen[i] = true;

            for (int j = i - 1; j > -1; j--) {
                if (!seen[j] && w + item[j] <= 300) {
                    seen[j]  = true;
                    w       += item[j];
                }
            }

            c++;
        }

        return c;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
