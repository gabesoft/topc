package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 351 Division II Level Three - 1000
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=4844&rd=10675
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm351
public class InsertSort {
    public int calcMinimalCost(int[] theArray) {
        int n   = theArray.length;
        int[] f = new int[n];
        int res = 0;

        for (int i = 0; i < n; i++) {
            f[i] = theArray[i];
            for (int j = 0; j < i; j++) {
                if (theArray[j] <= theArray[i]) {
                    f[i] = Math.max(f[i], f[j] + theArray[i]);
                }
            }
            res = Math.max(res, f[i]);
        }

        res = -res;
        for (int i = 0; i < n; i++) {
            res += theArray[i];
        }

        return res;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
