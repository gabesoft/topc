package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 548 Division I Level One - 250
// greedy, search
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11967&rd=15170
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+548
public class KingdomAndTrees {
    public int minLevel(int[] heights) {
        int hi = 1000000001;
        int lo = 0;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (!valid(heights, mid)) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        return lo;
    }

    private boolean valid(int[] heights, int x) {
        heights = heights.clone();

        int n    = heights.length;
        int maxh = heights[n - 1] + x;

        for (int i = n - 2; i > -1; i--) {
            int h = heights[i];

            if (h < maxh) {
                h = Math.min(maxh - 1, h + x);
            } else {
                h = Math.max(maxh - 1, h - x);
            }

            if (h <= 0 || h >= maxh) {
                return false;
            }

            maxh = h;
        }

        return true;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
