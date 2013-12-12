package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 346 Division I Level Two - 500
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=7682&rd=10670
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm346
public class HeightRound {
    public int[] getBestRound(int[] heights) {
        int n      = heights.length;
        int res[]  = new int[n];

        Arrays.sort(heights);

        res[0] = heights[0];

        int maxnum = heights[n - 1];
        int i = 0;
        int j = 0;

        while (true) {
            int flag[]   = new int[50];
            int k        = n - 1;
            boolean fail = false;
            int cur      = heights[0];

            flag[0] = 1;

            while (true) {
                if (cur == maxnum) { break; }
                for (j = n - 1; j >= 0; j--) {
                    if (flag[j] == 0 && heights[j] - cur <= i) {
                        break;
                    }
                }
                if (j < 0) {
                    fail = true;
                    break;
                }
                cur     = heights[j];
                flag[j] = 1;
                res[k] = cur;
                k --;
            }
            if (!fail) {
                k = 1;
                while (true) {
                    for (j = 0; j < n; j++) {
                        if (flag[j] == 0) { break; }
                    }
                    if (j < n) {
                        flag[j] = 1;
                        res[k++] = heights[j];
                    } else {
                        break;
                    }
                }
                for (j = 0; j < n - 1; j++) {
                    if (Math.abs(res[j + 1] - res[j]) > i) { break; }
                }
                if (j == n - 1) {
                    return res;
                }
            }

            i++;
        }
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
