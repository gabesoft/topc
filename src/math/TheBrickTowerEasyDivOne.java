package topc.math;

import java.util.*;
import java.io.*;

// SRM 554 Division I Level One - 250
// simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12159&rd=15176
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+554
public class TheBrickTowerEasyDivOne {
    public int find(int redCount, int redHeight, int blueCount, int blueHeight) {
            int a = Math.min(redCount, blueCount);
            int b = Math.max(redCount, blueCount);
            int r = a == b ? (a * 2) : (a * 2 + 1);
            return redHeight == blueHeight ? r : r + (r / 2);
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
