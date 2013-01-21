package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 369 Division II Level Three - 1000
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=8179&rd=10785
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm369
public class IsoscelesTriangulations {
    int dist[][];
    long dp[][][];

    long mod = 123456789L;

    public int getCount(int n, int k) {
        int m =  51;
        dist  = new int[m][m];
        dp    = new long[m][m][m];

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                dist[i][j] = Math.min(j - i, i + n - j);
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }

        return (int)solve(0, n - 1, k);
    }

    long solve(int start, int end, int k) {
        if (k < 0) { return 0; }
        if (start + 1 == end) { return k == 0 ? 1 : 0; }
        if (start + 2 == end) { return k == 1 ? 1 : 0; }

        if (dp[start][end][k] > -1) { return dp[start][end][k]; }

        long ret = 0;

        for (int i = start + 1; i < end; i++) {
            int a     = dist[start][i];
            int b     = dist[i][end];
            int c     = dist[start][end];
            long isoc = iso(a, b, c) ? 1 : 0;

            for (int kk = 0; kk <= k - isoc; kk++) {
                ret = (ret + solve(start, i, kk) * solve(i, end, (int)(k - isoc - kk)));
                ret %= mod;
            }
        }

        dp[start][end][k] = ret;
        return ret;
    }

    boolean iso(int a, int b, int c) {
        int v[] = new int[] { a, b, c };
        Arrays.sort(v);
        return v[0] == v[1] || v[1] == v[2];
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
