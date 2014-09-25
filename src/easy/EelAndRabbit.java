package topc.easy;

import java.util.*;
import java.io.*;

// SRM 580 Division I Level One - 250
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12575&rd=15500
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+580
public class EelAndRabbit {
    public int getmax(int[] l, int[] t) {
        int best = 0;
        int n = l.length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                best = Math.max(best, count(l, t, t[i], t[j]));
            }
        }

        return best;
    }

    private int count(int[] l, int[] t, int t1, int t2) {
       int c = 0;
       int n = l.length;
       for (int i = 0; i < n; i++) {
           int ts = t[i];
           int te = t[i] + l[i];
           if ((ts <= t1 && t1 <= te) || (ts <= t2 && t2 <= te)) {
               c++;
           }
       }
       return c;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
