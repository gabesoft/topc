package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 244 Division I Level One - 300
// greedy
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=4507&rd=7219
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm244
public class CircleDance {
    public int arrangeDancers(int[] heights) {
        int n = heights.length;
        boolean seen[] = new boolean[n];

        int l = 0;
        int r = 0;
        int d = 0;

        for (int i = 1; i < n; i++) {
            if (heights[i] > heights[l]) {
                l = i;
                r = i;
            }
        }

        seen[l] = true;
        int c   = 1;

        while (c < n) {
            int k = -1;

            for (int i = 0; i < n; i++) {
                if (seen[i]) { continue; }

                if (k == -1) {
                    k = i;
                } else if (heights[i] > heights[k]) {
                    k = i;
                }
            }

            if (l == r) {
                d = Math.max(d, heights[l] - heights[k]);
                l = k;
            } else if (heights[l] > heights[r]) {
                d = Math.max(d, heights[l] - heights[k]);
                l = k;
            } else {
                d = Math.max(d, heights[r] - heights[k]);
                r = k;
            }

            seen[k] = true;
            c++;
        }

        return Math.max(d, Math.abs(heights[l] - heights[r]));
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
