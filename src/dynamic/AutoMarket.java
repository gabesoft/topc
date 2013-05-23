package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 233 Division II Level Three - 1000
// dynamic programming, graph theory, sorting
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=3937&rd=6532
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm233
public class AutoMarket {
    int n;
    Auto autos[];
    int memo[][];

    public int maxSet(int[] cost, int[] features, int[] fixTimes) {
        n     = cost.length + 1;
        autos = new Auto[n];
        memo  = new int[n][n];

        autos[n - 1] = new Auto(0, 1000, 0);
        for (int i = 0; i < n - 1; i++) {
            autos[i] = new Auto(cost[i], features[i], fixTimes[i]);
        }
        Arrays.sort(autos);

        for (int i = 0; i < n; i++) {
            Arrays.fill(memo[i], -1);
        }

        return find(1, 0);
    }

    private int find(int k, int t) {
        if (k == n) { return 0; }
        if (memo[k][t] > -1) { return memo[k][t]; }

        int a = find(k + 1, t);
        int b = 0;

        Auto auto = autos[k];
        Auto th   = autos[t];
        if (auto.cost > th.cost && auto.feat < th.feat && auto.time > th.time) {
            b = 1 + find(k + 1, k);
        }

        memo[k][t] = Math.max(a, b);
        return memo[k][t];
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    public class Auto implements Comparable<Auto> {
        public final int cost;
        public final int feat;
        public final int time;

        public Auto(int cost, int feat, int time) {
            this.cost = cost;
            this.feat = feat;
            this.time = time;
        }

        public int compareTo(Auto o) {
            return cost - o.cost;
        }
    }
}
