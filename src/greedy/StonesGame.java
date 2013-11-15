package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 493 Division I Level One - 300
// greedy, simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11292&rd=14422
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+493
public class StonesGame {
    public String winner(int N, int M, int K, int L) {
        if (K == 1) { return "Draw"; }

        int k = reachable(N, M, K, L, true);

        if (k == 1) {
            return "Romeo";
        }
        if (k == 2) {
            return "Strangelet";
        }

        return "Draw";
    }

    private int reachable(int N, int M, int K, int L, boolean first) {
        int start = Math.max(1, M - K + 1);
        int end   = Math.min(N - K + 1, M);
        int delta = start - (M - K + 1);

        if (!first) {
            if ((start + delta) % 2 != L % 2) { return 0; }

            if (start + delta <= L && L <= (end + delta + (end - start + 1))) {
                return 1;
            } else {
                return 0;
            }
        }

        boolean all = true;
        int count   = 0;

        for (int i = start; i <= end; i++) {
            int x = i + delta;

            delta++;

            if (x == L) {
                return 1;
            }

            if (first && all) {
                all &= (reachable(N, x, K, L, false) == 1);
            }

            if (x != M) {
                count++;
            }
        }

        if (first && all && count > 0) {
            return 2;
        }

        return 0;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
