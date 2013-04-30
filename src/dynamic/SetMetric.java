package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 264 Division II Level Three - 1000
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=4442&rd=7998
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm264
public class SetMetric {
    int n;
    int m;
    int target[];
    int candidate[];
    int memo[][];

    public int nearness(int[] target, int[] candidate) {
        this.n         = target.length;
        this.m         = candidate.length;
        this.target    = target;
        this.candidate = candidate;
        this.memo      = new int[n][m];

        for (int i = 0; i < n; i++) {
            Arrays.fill(this.memo[i], -2);
        }

        Arrays.sort(target);
        Arrays.sort(candidate);

        return search(0, 0);
    }

    private int search(int t, int c) {
        if (t == n) { return 0; }
        if (c == m) { return -1; }
        if (memo[t][c] > -2) { return memo[t][c]; }

        int v = Math.abs(target[t] - candidate[c]);
        int a = search(t + 1, c + 1);
        int b = search(t, c + 1);

        if (a == -1 && b == -1) { return -1; }
        if (b == -1) { return a + v; }
        if (a == -1) { return b; }

        memo[t][c] = Math.min(a + v, b);
        return memo[t][c];
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
