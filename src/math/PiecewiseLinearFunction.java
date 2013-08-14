package topc.math;

import java.util.*;
import java.io.*;

// SRM 586 Division I Level One - 250
// simple math, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12691&rd=15698
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+586
public class PiecewiseLinearFunction {
    int INF = 1000000001;

    public int maximumSolutions(int[] Y) {
        int n = Y.length;

        for (int i = 1; i < n; i++) {
            if (Y[i] == Y[i - 1]) {
                return -1;
            }
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            int c1    = 0;
            int c2    = 0;
            double y1 = Y[i];
            double y2 = Y[i] + 0.5;

            for (int j = 0; j < n; j++) {
                if (y1 == Y[j]) {
                    c1++;
                }
            }

            for (int j = 1; j < n; j++) {
                int lo = Math.min(Y[j - 1], Y[j]);
                int hi = Math.max(Y[j - 1], Y[j]);

                if (lo < y1 && y1 < hi) {
                    c1++;
                }
                if (lo < y2 && y2 < hi) {
                    c2++;
                }
            }

            count = Math.max(count, c1);
            count = Math.max(count, c2);
        }

        return count;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
