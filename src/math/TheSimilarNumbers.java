package topc.math;

import java.util.*;
import java.io.*;

// SRM 568 Division II Level One - 250
// simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10553&rd=15488
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+568
public class TheSimilarNumbers {
    public int find(int lower, int upper) {
        int c = 0;
        int l = lower;

        while (l <= upper) {
            c++;
            l = l * 10 + 1;
        }

        return c;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
