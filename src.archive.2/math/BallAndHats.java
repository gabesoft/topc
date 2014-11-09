package topc.math;

import java.util.*;
import java.io.*;

// SRM 549 Division II Level One - 250
// simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11964&rd=15171
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+549
public class BallAndHats {
    public int getHat(String hats, int numSwaps) {
        int[][] res = new int[2][];
        res[0] = new int[] { 0, 1, 0 };
        res[1] = new int[] { 1, 0, 1 };

        int pos = hats.indexOf('o');

        return numSwaps == 0 ? pos : res[numSwaps % 2][pos];
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
