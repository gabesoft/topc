package topc.easy;

import java.util.*;
import java.io.*;

// SRM 634 Division II Level One - 250
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13454&rd=16077
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+634
public class MountainRanges {
    public int countPeaks(int[] heights) {
        int n = heights.length;
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            boolean l = i == 0 || heights[i - 1] < heights[i];
            boolean r = i == n - 1 || heights[i + 1] < heights[i];
            if (l && r) {
                cnt++;
            }
        }

        return cnt;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
