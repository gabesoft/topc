package topc.easy;

import java.util.*;
import java.io.*;

// SRM 635 Division II Level One - 250
// brute force, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13487&rd=16078
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+635
public class IdentifyingWood {
    public String check(String s, String t) {
        int n = s.length();
        int m = t.length();
        int i = 0;
        int j = 0;

        while (i < n && j < m) {
            if (s.charAt(i) == t.charAt(j)) {
                j++;
            }
            i++;
        }

        return j == m ? "Yep, it's wood." : "Nope.";
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
