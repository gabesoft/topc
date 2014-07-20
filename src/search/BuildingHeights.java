package topc.search;

import java.util.*;
import java.io.*;

// SRM 624 Division I Level One - 250
// greedy, search, simple math, sorting
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13211&rd=15857
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+624
public class BuildingHeights {
    public static final int INF = 4000 * 4000;

    public int minimum(int[] heights) {
        int n      = heights.length;
        int[] cost = new int[n + 1];

        Arrays.sort(heights);
        Arrays.fill(cost, INF);

        cost[1] = 0;

        for (int i = 0; i < n; i++) {
            int c = 0;

            for (int j = i - 1; j >= 0; j--) {
                c += (heights[i] - heights[j]);
                cost[i - j + 1] = Math.min(cost[i - j + 1], c);
            }
        }

        int r = 0;
        for (int i = 2; i <= n; i++) {
            r ^= cost[i];
        }

        return r;
    }
}
