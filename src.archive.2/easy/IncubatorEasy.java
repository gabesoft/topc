package topc.easy;

import java.util.*;
import java.io.*;

// SRM 557 Division II Level Two - 550
// brute force, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12196&rd=15179
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+557
public class IncubatorEasy {
    public int maxMagicalGirls(String[] love) {
        int n = love.length;

        boolean G[][] = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                G[i][j] = love[i].charAt(j) == 'Y';
            }
        }

        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    G[i][j] = G[i][j] || (G[i][k] && G[k][j]);
                }
            }
        }

        return find(G, 0, 0, 0);
    }

    private int find(boolean[][] G, int P, int M, int k) {
        if (k == G.length) {
            int cnt = 0;
            for (int i = 0; i < G.length; i++) {
                if (on(M, i) && !on(P, i)) {
                    cnt++;
                }
            }
            return cnt;
        }
        if (G[k][k] || on(P, k) || on(M, k)) { return find(G, P, M, k + 1); }

        int best = find(G, P, M, k + 1);

        for (int i = 0; i < G.length; i++) {
            if (G[k][i]) {
                P |= (1 << i);
            }
        }

        return Math.max(best, find(G, P, M | (1 << k), k + 1));
    }

    private boolean on(int mask, int k) {
        return ((mask >> k) & 1) == 1;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
