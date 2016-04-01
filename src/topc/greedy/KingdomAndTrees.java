package topc.greedy;

import java.util.*;

// SRM 548 Division I Level One - 250
// greedy, search
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11967&rd=15170
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+548
public class KingdomAndTrees {
    public int minLevel(int[] heights) {
        int lo = 0;
        int hi = 1000000001;

        while (lo <= hi) {
            int md = lo + (hi - lo) / 2;

            if (can(heights, md)) {
                hi = md - 1;
            } else {
                lo = md + 1;
            }
        }

        return lo;
    }

    private boolean can(int[] heights, int x) {
        int last = Math.max(1, heights[0] - x);
        for (int i = 1; i < heights.length; i++) {
            int curr = heights[i];
            if (curr + x <= last) {
                return false;
            }
            last = Math.max(last + 1, curr - x);
        }

        return true;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
