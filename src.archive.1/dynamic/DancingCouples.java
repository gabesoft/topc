package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 416 Division II Level Three - 1000
// dynamic programming, graph theory
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=9902&rd=13507
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm416
public class DancingCouples {
    int n;
    int m;
    boolean [][] graph;
    int [][][] memo;

    public int countPairs(String[] canDance, int K) {
        n     = canDance.length;
        m     = canDance[0].length();
        graph = new boolean[n][m];
        memo  = new int[n][1 << m][K + 1];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                graph[i][j] = canDance[i].charAt(j) == 'Y';
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (1 << m); j++) {
                Arrays.fill(memo[i][j], -1);
            }
        }

        return rec(0, 0, K);
    }

    int rec(int b, int gmask, int k) {
        if (k == 0) { return 1; }
        if (b == n || gmask == (1 << m) - 1) { return 0; }
        if (memo[b][gmask][k] > -1) { return memo[b][gmask][k]; }

        int sum = 0;
        for (int i = b; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (((gmask >> j) & 1) == 0 && graph[i][j]) {
                    sum += rec(i + 1, gmask | (1 << j), k - 1);
                }
            }
        }

        memo[b][gmask][k] = sum;
        return sum;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
