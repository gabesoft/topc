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
        int d = 0;

        Arrays.sort(heights);

        for (int i = 2; i < n; i++) {
            d = Math.max(d, heights[i] - heights[i - 2]);
        }

        return d;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
