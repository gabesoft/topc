package topc.easy;

import java.util.*;
import java.io.*;

// SRM 660 Division II Level One - 250
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13814&rd=16463
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+660
public class Cyclemin {
    public String bestmod(String s, int k) {
        int len = s.length();
        String min = s;

        for (int i = 1; i <= len; i++) {
            String t = s;
            int uk = 0;

            for (int j = 0; j < len; j++) {
                if (uk < k && s.charAt(j) != 'a') {
                    uk++;
                    t = t.substring(0, j) + 'a' + s.substring(j + 1);
                }
            }

            min = min.compareTo(t) > 0 ? t : min;
            s = s.substring(1) + s.substring(0, 1);
        }

        return min;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
