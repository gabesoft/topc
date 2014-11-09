package topc.sorting;

import java.util.*;
import java.io.*;

// SRM 621 Division II Level One - 250
// sorting, string manipulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11084&rd=15854
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+621
public class TwoWaysSorting {
    public String sortingMethod(String[] stringList) {
        boolean a = lexi(stringList);
        boolean b = bylen(stringList);

        if (a && b) {
            return "both";
        }
        if (a) {
            return "lexicographically";
        }
        if (b) {
            return "lengths";
        }

        return "none";
    }

    private boolean lexi(String[] str) {
        for (int i = 1; i < str.length; i++) {
            if (str[i].compareTo(str[i - 1]) < 0) {
                return false;
            }
        }
        return true;
    }

    private boolean bylen(String[] str) {
        for (int i = 1; i < str.length; i++) {
            if (str[i].length() < str[i - 1].length()) {
                return false;
            }
        }
        return true;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
