package topc.math;

import java.util.*;
import java.io.*;

// SRM 608 Division II Level Two - 500
// math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12998&rd=15841
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+608
public class MysticAndCandiesEasy {
    public int minBoxes(int C, int X, int[] high) {
        Arrays.sort(high);

        int r = C;
        int k = -1;
        while (r - high[k + 1] >= X) {
            r -= high[++k];
        }

        return high.length - k - 1;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
