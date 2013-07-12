package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 209 Division II Level Three - 900
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=2947&rd=5855
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm209
public class LoadBalancing {
    int MAX = 102400;
    int INF = 1 << 30;
    int n;
    int data[];
    int memo[][];

    public int minTime(int[] chunkSizes) {
        n    = chunkSizes.length;
        data = chunkSizes;
        memo = new int[MAX + 1][n];

        for (int i = 0; i < n; i++) {
            data[i] /= 1024;
        }

        return find(0, 0) * 1024;
    }

    private int find(int d, int k) {
        if (k == n) { return d; }
        if (memo[d][k] > 0) { return memo[d][k]; }

        int v = data[k];
        int x = d + v > MAX ? INF : find(d + v, k + 1);

        int nextd = Math.abs(v - d);
        int time  = v > d ? d : v;
        int y     = time + find(Math.abs(nextd), k + 1);

        memo[d][k] = Math.min(x, y);
        return memo[d][k];
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
