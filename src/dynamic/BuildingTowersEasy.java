package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 647 Division I Level One - 250
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13634&rd=16279
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+647
public class BuildingTowersEasy {
    public int maxHeight(int N, int[] x, int[] t) {
        int[] H = new int[N];

        for (int i = 0; i < N; i++) {
            H[i] = i;
        }

        for (int i = 0; i < x.length; i++) {
            int j = x[i] - 1;
            int h = t[i];
            int d = j - h;

            for (int k = 0; k < N; k++) {
                if (k == j) {
                    H[k] = Math.min(H[k], h);
                } else if (k > j) {
                    H[k] = Math.min(H[k], k - d);
                } else {
                    H[k] = Math.min(H[k], k - (d - 2 * (j - k)));
                }
            }
        }

        int best = 0;
        for (int i = 0; i < N; i++) {
            best = Math.max(best, H[i]);
        }

        return best;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
