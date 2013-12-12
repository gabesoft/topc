package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 347 Division II Level Three - 1000
// dynamic programming, search
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=7633&rd=10671
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm347
public class TaxiManager {
    int INF = Integer.MAX_VALUE / 4;
    int n;
    int m;
    int[][] dist;
    int[][] cust;
    int[][] memo;

    public int schedule(String[] roads, String[] customers) {
        n    = roads.length;
        m    = customers.length;
        dist = new int[n][n];
        cust = new int[m][2];
        memo = new int[1 << m][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dist[i][j] = roads[i].charAt(j) - '0';
                if (dist[i][j] == 0 && i != j) {
                    dist[i][j] = INF;
                }
            }
        }

        floydWarshall();

        for (int i = 0; i < cust.length; i++) {
            String[] route = customers[i].split(" ");
            cust[i][0] = Integer.parseInt(route[0]);
            cust[i][1] = Integer.parseInt(route[1]);
        }

        for (int i = 0; i < memo.length; i++) {
            Arrays.fill(memo[i], -1);
        }

        int mm  = 1 << m;
        int res = INF;

        for (int i = 0; i < mm; i++) {
            res = Math.min(res, Math.max(time(i, 0), time(mm - 1 - i, 0)));
        }

        return res;
    }

    int time(int customers, int loc) {
        if (customers == 0) { return dist[loc][0]; }
        if (memo[customers][loc] > -1) { return memo[customers][loc]; }

        int best = INF;
        for (int i = 0; i < m; i++) {
            if (on(customers, i)) {
                int st = cust[i][0];
                int en = cust[i][1];
                int next = dist[loc][st] + dist[st][en] + time(turnOff(customers, i), en);
                best = Math.min(best, next);
            }
        }

        memo[customers][loc] = best;
        return best;
    }

    int turnOff(int mask, int k) {
        return mask & ~(1 << k);
    }

    boolean on(int mask, int k) {
        return ((mask >> k) & 1) == 1;
    }

    void floydWarshall() {
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                }
            }
        }
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
