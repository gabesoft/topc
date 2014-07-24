package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 625 Division II Level Two - 500
// greedy, sorting
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12107&rd=15858
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+625
public class IncrementingSequence {
    public String canItBeDone(int k, int[] A) {
        Arrays.sort(A);

        for (int i = 0; i < A.length; i++) {
            if (!find(A, i + 1, k)) {
                return "IMPOSSIBLE";
            }
        }

        return "POSSIBLE";
    }

    private boolean find(int[] a, int n, int k) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) { continue; }

            int m = a[i];

            while (m + k <= n) {
                m += k;
            }

            if (m == n) {
                a[i] = 0;
                return true;
            }
        }

        return false;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
