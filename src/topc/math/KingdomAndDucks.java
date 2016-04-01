package topc.math;

import java.util.*;

// SRM 548 Division II Level One - 250
// simple math, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11985&rd=15170
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+548
public class KingdomAndDucks {
    public int minDucks(int[] duckTypes) {
        int cnt[] = new int[51];
        for (int t : duckTypes) {
            cnt[t]++;
        }

        int types = 0;
        int max = 0;
        for (int t = 0; t < cnt.length; t++) {
            if (cnt[t] > 0) {
                types++;
            }
            if (cnt[t] > max) {
                max = cnt[t];
            }
        }

        return types * max;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
