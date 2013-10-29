package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 518 Division I Level One - 250
// greedy, string manipulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11471&rd=14543
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+518
public class LargestSubsequence {
    public String getLargest(String s) {
        int n = s.length();

        if (n <= 1) { return s; }

        int k  = 0;
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) > s.charAt(k)) {
                k = i;
            }
        }

        return s.charAt(k) + getLargest(s.substring(k + 1));
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
