package topc.dynamic;

import java.util.*;
import java.io.*;

// TCO12 Parallel Round 3B Division I Level One - 300
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11896&rd=15304
// editorial: http://apps.topcoder.com/wiki/display/tc/Algorithm+Problem+Set+Analysis
public class CrossingTheRiver {
    int n;
    int depth;

    int[] heights;
    boolean[] taken;

    public String isItEvenPossible(int waterWidth, int landWidth, int[] blockHeight, int depth) {
        this.n       = blockHeight.length;
        this.heights = blockHeight;
        this.depth   = depth;
        this.taken   = new boolean[n];

        Arrays.sort(heights);

        return possible(waterWidth, landWidth, 0, 0) ? "POSSIBLE" : "IMPOSSIBLE";
    }

    private boolean possible(int water, int land, int level, int start) {
        if (water == 0 && land == 0) { return true; }
        if (water == 0 && level == 0) { return true; }
        if (start == n) { return false; }

        int nw = water == 0 ? 0 : (water - 1);
        int nl = water == 0 ? (land - 1) : land;

        int prevh = -1;
        for (int i = start; i < n; i++) {
            if (taken[i]) { continue; }

            int h = heights[i] - (water > 0 ? depth : 0);
            int s = water == 1 ? 0 : i + 1;

            if (prevh == h) { continue; }

            if (h == level || h == level + 1) {
                taken[i] = true;
                if (possible(nw, nl, h, s)) {
                    return true;
                }
                taken[i] = false;
            } else {
                break;
            }

            prevh = h;
        }

        return false;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
