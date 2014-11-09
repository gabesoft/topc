package topc.dynamic;

import java.util.*;
import java.io.*;

// TCO14 Round 1A Division I Level Two - 500
// dynamic programming, graph theory, greedy
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12974&rd=15942
// editorial: http://apps.topcoder.com/wiki/display/tc/TCO+2014+Round+1a
public class EllysScrabble {
    public String getMin(String letters, int maxDistance) {
        int n = letters.length();
        boolean[] used = new boolean[n];
        char[] chars = new char[n];

        for (int i = 0; i < n; i++) {
            int idx = -1;

            if (i - maxDistance >= 0 && !used[i - maxDistance]) {
                idx = i - maxDistance;
            } else {
                for (int c = Math.max(0, i - maxDistance); c <= Math.min(n - 1, i + maxDistance); c++) {
                    if (!used[c] && (idx == -1 || letters.charAt(c) < letters.charAt(idx))) {
                        idx = c;
                    }
                }
            }

            chars[i] = letters.charAt(idx);
            used[idx] = true;
        }

        return new String(chars);
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
