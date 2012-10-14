package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 557 Division II Level Three - 1000
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11810&rd=15179
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+557
public class FoxAndMountain {
    long MOD = 1000000009; 

    public int count(int n, String history) {
        if (n % 2 == 1) { return 0; }

        int m        = history.length();
        int next[][] = new int[55][2];

        for (int i = 0; i < m; i++) {
            String cur  = history.substring(0, i);
            String up   = cur + 'U';
            String down = cur + 'D';

            for (int j = 0; j < i + 2; j++) {
                String sub = history.substring(0, j);
                int st = (i + 1) - j;
                int en = st + j;
                if (sub.compareTo(up.substring(st, en)) == 0) {
                    next[i][0] = j;
                }
                if (sub.compareTo(down.substring(st, en)) == 0) {
                    next[i][1] = j;
                }
            }
        }
        next[m][0] = m;
        next[m][1] = m;

        long dp[][][] = new long[55][55][55];

        dp[0][0][0] = 1;
        for (int step = 0; step < n; step++) {
            for (int h = 0; h <= step; h++) {
                for (int i = 0; i <= m; i++) {
                    dp[step + 1][h + 1][next[i][0]] = add(dp[step + 1][h + 1][next[i][0]], dp[step][h][i]);

                    if (h > 0) {
                        dp[step + 1][h - 1][next[i][1]] = add(dp[step + 1][h - 1][next[i][1]], dp[step][h][i]);
                    }
                }
            }
        }

        return (int)dp[n][0][m];
    }

    long add(long a, long b) {
        long res = a + b;
        if (res >= MOD) {
            res -= MOD;
        }
        return res;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
