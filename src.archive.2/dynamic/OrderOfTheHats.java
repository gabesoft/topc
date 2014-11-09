package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 549 Division II Level Three - 1000
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11955&rd=15171
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+549
public class OrderOfTheHats {
    int INF   = 1 << 30;
    int n     = 0;
    int G[][] = null;
    int dp[]  = null;

    public int minChanged(String[] spellChart) {
        n = spellChart.length;
        G = new int[n][n];

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (spellChart[i].charAt(j) == 'Y') {
                   if (i == j) {
                       cnt++;
                   } else {
                       G[i][j] = 1;
                   }
                }
            }
        }

        int nodes = 0;
        boolean change = true;
        while (change) {
            change = false;
            for (int i = 0; i < n; i++) {
                if (on(nodes, i)) { continue; }

                boolean leaf = true;
                for (int j = 0; j < n; j++) {
                    if (G[i][j] == 1 && !on(nodes, j)) {
                        leaf = false;
                        break;
                    }
                }
                if (leaf) {
                    nodes |= (1 << i);
                    change = true;
                }
            }
        }

        dp = new int[1 << n];
        Arrays.fill(dp, -1);

        return cnt + minCost(nodes);
    }

    private int minCost(int nodes) {
        if (nodes == (1 << n) - 1) { return 0; }
        if (dp[nodes] > -1) { return dp[nodes]; }

        int best = INF;
        for (int i = 0; i < n; i++) {
            if (on(nodes, i)) { continue; }

            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (G[i][j] == 1 && !on(nodes, j)) {
                    cnt++;
                }
            }

            best = Math.min(best, cnt + minCost(nodes | (1 << i)));
        }

        dp[nodes] = best == INF ? 0 : best;
        return dp[nodes];
    }

    private boolean on(int mask, int k) {
        return ((mask >> k) & 1) == 1;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
