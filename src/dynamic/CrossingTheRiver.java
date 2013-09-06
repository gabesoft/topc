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
        this.n = blockHeight.length;

        //return solve1(waterWidth, landWidth, blockHeight, depth);
        return solve2(waterWidth, landWidth, blockHeight, depth);
    }

    private String solve2(int waterWidth, int landWidth, int[] blockHeight, int depth) {
        int[] count = new int[101];

        for (int i = 0; i < n; i++) {
            count[blockHeight[i]]++;
        }

        if (count[depth] >= waterWidth) {
            return "POSSIBLE";
        }

        for (int wl = depth; wl <= depth + 1; wl++) {
            if (count[wl] == 0) { continue; }

            for (int wh = wl; wh <= 100; wh++) {
                if (count[wh] == 0) { continue; }

                for (int ll = wh - depth; ll <= wh - depth + 1; ll++) {
                    if (ll < 0 || count[ll] == 0) { continue; }

                    for (int lh = ll; lh <= 100; lh++) {
                        if (count[lh] == 0) { continue; }

                        if (possiblePick(waterWidth, landWidth, count.clone(), depth, wl, wh, ll, lh)) {
                            return "POSSIBLE";
                        }
                    }
                }
            }
        }

        return "IMPOSSIBLE";
    }

    private boolean possiblePick(int waterWidth, int landWidth, int[] rem, int depth, int wl, int wh, int ll, int lh) {
        for (int x = wl; x <= wh; x++) {
            if ((--waterWidth < 0) || (--rem[x] < 0)) {
                return false;
            }
        }

        for (int x = ll; x <= lh; x++) {
            if ((--landWidth < 0) || (--rem[x] < 0)) {
                return false;
            }
        }

        int inter = 0;
        int landonly = 0;
        int wateronly = 0;

        for (int x = depth; x <= 100; x++) {
            boolean water = (wl <= x && x <= wh);
            boolean land  = (ll <= x && x <= lh);

            if (water && land) {
                inter += rem[x];
            } else if (water) {
                wateronly += rem[x];
            } else if (land) {
                landonly += rem[x];
            }
        }

        waterWidth = Math.max(0, waterWidth - wateronly);
        landWidth  = Math.max(0, landWidth - landonly);

        return waterWidth + landWidth <= inter;
    }

    private String solve1(int waterWidth, int landWidth, int[] blockHeight, int depth) {
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
