package topc.dynamic;

import java.util.*;

// SRM 647 Division I Level One - 250
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13634&rd=16279
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+647
public class BuildingTowersEasy {
    public int maxHeight(int N, int[] x, int[] t) {
        int[] H  = new int[N];
        int best = 0;

        for (int i = 0; i < N; i++) {
            H[i] = i;

            for (int j = 0; j < x.length; j++) {
                H[i] = Math.min(H[i], t[j] + Math.abs(i - (x[j] - 1)));
            }

            best = Math.max(best, H[i]);
        }

        return best;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
