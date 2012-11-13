package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 456 Division I Level Two - 450
// greedy, math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10563&rd=13909
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+456
public class CutSticks {
    public double maxKth(int[] sticks, int C, int K) {
        Arrays.sort(sticks);

        int n     = sticks.length;
        double lo = 0.0;
        double hi = sticks[n - 1];

        for (int i = 0; i < 500; i++) {
            double mid   = (hi + lo) / 2.0;
            long can     = 0L;
            long present = 0L;

            for (int j = n - 1; j > -1; j--) {
                can     += (long) ((double) sticks[j] / mid);
                present += ((long) ((double) sticks[j] / mid)) == 0 ? 0L : 1L;
            }

            if (can >= K && C + present >= K) {
                lo = mid;
            } else {
                hi = mid;
            }
        }

        return lo;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
