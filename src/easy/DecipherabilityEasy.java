package topc.easy;

import java.util.*;
import java.io.*;

// SRM 649 Division II Level One - 250
// brute force, string manipulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13658&rd=16313
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+649
public class DecipherabilityEasy {
    public String check(String s, String t) {
        if (s.length() - t.length() != 1) { return "Impossible"; }

        int n = s.length();
        for (int i = 0; i < n; i++) {
            String x = s.substring(0, i) + s.substring(i + 1);
            if (x.equals(t)) {
                return "Possible";
            }
        }

        return "Impossible";
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
