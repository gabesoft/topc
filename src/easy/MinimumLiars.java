package topc.easy;

import java.util.*;
import java.io.*;

// TCO11 Qual 1 Division I Level One - 250
// brute force, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11414&rd=14524
// editorial: http://apps.topcoder.com/wiki/display/tc/TCO'11+Qualification+Round+1
public class MinimumLiars {
    public int getMinimum(int[] claim) {
        int n = claim.length;
        for (int x = 0; x <= n; x++) {
            int c = 0;
            for (int y : claim) {
                if (y > x) {
                    c++;
                }
            }

            if (x == c) {
                return x;
            }
        }

        return -1;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
