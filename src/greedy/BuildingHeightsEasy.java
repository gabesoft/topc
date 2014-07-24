package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 624 Division II Level Two - 500
// greedy, sorting
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13215&rd=15857
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+624
public class BuildingHeightsEasy {
    public static final int INF = 2500;

    public int minimum(int M, int[] heights) {
        Arrays.sort(heights);

        int best = INF;
        int n    = heights.length;

        for (int i = 0; i < n; i++) {
            if (i < n - 1 && heights[i] == heights[i + 1]) {
                continue;
            }
            best = Math.min(best, check(heights, M, i));
        }

        return best;
    }

    private int check(int[] heights, int M, int k) {
        int count = 0;
        int cost  = 0;

        for (int i = k; i > -1; i--) {
            if (count >= M) { break; }
            count++;
            cost += (heights[k] - heights[i]);
        }

        return count >= M ? cost : INF;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
