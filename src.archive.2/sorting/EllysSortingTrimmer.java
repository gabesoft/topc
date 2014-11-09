package topc.sorting;

import java.util.*;
import java.io.*;

// TCO14 Round 1A Division I Level One - 250
// sorting, string manipulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12971&rd=15942
// editorial: http://apps.topcoder.com/wiki/display/tc/TCO+2014+Round+1a
public class EllysSortingTrimmer {
    public String getMin(String S, int L) {
        char[] chars = S.toCharArray();
        int n = chars.length;

        for (int i = n - L; i > -1; i--) {
            Arrays.sort(chars, i, i + L);
        }

        return new String(Arrays.copyOf(chars, L));
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
