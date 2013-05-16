package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 248 Division I Level Two - 500
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=3525&rd=7223
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm248
public class ContractWork {
    int INF = Integer.MAX_VALUE / 4;
    int n;  // companies
    int m;  // tasks
    int C[][];
    int M[][][];

    public int minimumCost(String[] costs, int numTasks) {
        n = costs.length;
        m = numTasks;
        C = new int[n][m];
        M = new int[m][n + 1][n + 1];

        for (int i = 0; i < n; i++) {
            String nums[] = costs[i].split("\\s+");
            for (int j = 0; j < m; j++) {
                C[i][j] = Integer.parseInt(nums[j]);
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n + 1; j++) {
                Arrays.fill(M[i][j], -1);
            }
        }

        return cost(0, n, n);
    }

    private int cost(int t, int beforePrev, int prev) {
        if (t == m) { return 0; }
        if (M[t][beforePrev][prev] > -1) { return M[t][beforePrev][prev]; }

        int best = INF;
        for (int i = 0; i < n; i++) {
            if (beforePrev == prev && prev == i) { continue; }

            best = Math.min(best, C[i][t] + cost(t + 1, prev, i));
        }

        M[t][beforePrev][prev] = best;
        return best;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
