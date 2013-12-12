package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 536 Division I Level One - 250
// greedy, sorting
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11799&rd=14728
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+536
public class MergersDivOne {
    public double findMaximum(int[] revenues) {
        Arrays.sort(revenues);

        double res = revenues[0];
        for (int i = 1; i < revenues.length; i++) {
            res = (res + revenues[i]) / 2.0;
        }

        return res;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
