package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 557 Division II Level Three - 1000
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11810&rd=15179
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+557
public class FoxAndMountain {
    public static final int MOD = 1000000009;
    int n = 0;
    int l = 0;
    String H;
    int[][][] dp;

    public int count(int n, String history) {
        if (n % 2 == 1) { return 0; }

        this.n = n;
        this.l = history.length();
        this.H = history;

        this.dp = new int[n][l + 1][n];

        for (int[][] d1 : dp) {
            for (int[] d2 : d1) {
                Arrays.fill(d2, -1);
            }
        }

        return count(0, 0, 0);
    }

    private int count(int pathIndex, int matchIndex, int alt) {
        if (alt < 0) { return 0; }
        if (pathIndex == n) { return (alt == 0 && matchIndex == l) ? 1 : 0; }
        if (dp[pathIndex][matchIndex][alt] > -1) { return dp[pathIndex][matchIndex][alt]; }

        int res = 0;

        assert matchIndex <= l : "invalid matchIndex: " + matchIndex;

        if (matchIndex == l) {
            res += count(pathIndex + 1, matchIndex, alt + 1);
            res += count(pathIndex + 1, matchIndex, alt - 1);
        } else {
            int U = table(matchIndex, 'U');
            int D = table(matchIndex, 'D');

            res += count(pathIndex + 1, U, alt + 1);
            res += count(pathIndex + 1, D, alt - 1);
        }

        dp[pathIndex][matchIndex][alt] = res % MOD;

        return dp[pathIndex][matchIndex][alt];
    }

    private int table(int matchIndex, char c) {
        if (H.charAt(matchIndex) == c) { return matchIndex + 1; }
        if (matchIndex == 0) { return 0; }

        String S = H.substring(0, matchIndex) + c;
        int k = 1;
        int p = 0;
        int m = S.length();

        while (k < m) {
            if (endsWith(S, H, k)) {
                return m - k;
            } else {
                k++;
            }
        }

        return 0;
    }

    private boolean endsWith(String a, String b, int k) {
        int i = k;
        int m = a.length();

        while (i < m) {
            if (a.charAt(i) != b.charAt(i - k)) {
                return false;
            } else {
                i++;
            }
        }

        return true;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
