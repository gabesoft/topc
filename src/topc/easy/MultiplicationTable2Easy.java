package topc.easy;

import java.util.*;
import java.io.*;

// SRM 685 Division II Level One - 250
// brute force
// statement: https://community.topcoder.com/stat?c=problem_statement&pm=14190&rd=16689
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+685
public class MultiplicationTable2Easy {
    public String isGoodSet(int[] table, int[] t) {
        int n = (int)Math.sqrt(table.length);

        Arrays.sort(t);

        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t.length; j++) {
                int k = table[t[i] * n + t[j]];

                if (Arrays.binarySearch(t, k) < 0) {
                    return "Not Good";
                }
            }
        }

        return "Good";
    }

    @SuppressWarnings("unused")
    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
