package topc.simulation;

import java.util.*;
import java.io.*;

// SRM 634 Division II Level Two - 500
// simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13458&rd=16077
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+634
public class ShoppingSurveyDiv2 {
    public int minValue(int N, int[] s) {
        for (int i = 0; i <= N; i++) {
            if (can(s, N, i)) {
                return i;
            }
        }

        return 0;
    }

    private boolean can(int[] s, int n, int k) {
        int[] xs = s.clone();

        n -= k;

        for (int j = 0; j < k; j++) {
            for (int i = 0; i < xs.length; i++) {
                xs[i]--;

                if (xs[i] < 0) {
                    return false;
                }
            }
        }

        while (n > 0) {
            Arrays.sort(xs);

            for (int i = xs.length - 1; i > 0; i--) {
                if (xs[i] > 0) {
                    xs[i]--;
                } else {
                    break;
                }
            }

            n--;
        }

        for (int i = 0; i < xs.length; i++) {
            if (xs[i] > 0) {
                return false;
            }
        }

        return true;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
