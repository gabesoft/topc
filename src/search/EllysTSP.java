package topc.search;

import java.util.*;
import java.io.*;

// SRM 543 Division II Level One - 250
// simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11907&rd=14735
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+543
public class EllysTSP {
    public int getMax(String places) {
        int c = 0;
        int v = 0;

        for (char p : places.toCharArray()) {
            if (p == 'C') {
                c++;
            } else {
                v++;
            }
        }

        return 2 * Math.min(c, v) + (v != c ? 1 : 0);
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
