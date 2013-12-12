package topc.easy;

import java.util.*;
import java.io.*;

// SRM 580 Division I Level One - 250
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12575&rd=15500
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+580
public class EelAndRabbit {
    public int getmax(int[] l, int[] t) {
        int catches = 0;

        for (int i = 0; i < t.length; i++) {
            int t1 = t[i];

            for (int j = i; j < t.length; j++) {
                int c  = 0;
                int t2 = t[j];

                for (int k = 0; k < t.length; k++) {
                    boolean contains1 = t[k] <= t1 && t1 <= t[k] + l[k];
                    boolean contains2 = t[k] <= t2 && t2 <= t[k] + l[k];

                    if (contains1 || contains2) {
                        c++;
                    }
                }

                catches = Math.max(catches, c);
            }
        }

        return catches;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
