package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 493 Division I Level One - 300
// greedy, simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11292&rd=14422
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+493
public class StonesGame {
    public String winner(int N, int M, int K, int L) {
        if (reachable(N, M, K, L)) { return "Romeo"; }

        for (int i = 1; i <= N; i++) {
            if (reachable(N, M, K, i) && !reachable(N, i, K, L)) {
                return "Draw";
            }
        }

        return "Strangelet";
    }

    private boolean reachable(int N, int M, int K, int L) {
        int D = Math.abs(M - L);

        return (K + 1) % 2 == D % 2
            && Math.min(M, L) - (K - (D + 1)) / 2 >= 1
            && Math.max(M, L) + (K - (D + 1)) / 2 <= N
            && D <= K;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
