package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 548 Division II Level Three - 1000
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11869&rd=15170
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+548
public class KingdomAndPassword {
    int n;
    int[] cs;
    int[] old;
    int[] rt;
    int[] res;
    int[][][] dp;
    long pass;

    public long newPassword(long oldPassword, int[] restrictedDigits) {
        n    = 0;
        pass = oldPassword;
        rt   = restrictedDigits;
        cs   = new int[rt.length];

        long x = oldPassword;
        while (x > 0) {
            cs[n++] = (int)(x % 10);
            x = x / 10;
        }

        old = new int[n];
        for (int i = 0; i < n; i++) {
            old[i] = cs[n - 1 - i];
        }

        Arrays.sort(cs);

        boolean canBeSame = true; 
        for (int i = 0; i < n; i++) {
            if (old[i] == rt[i]) {
                canBeSame = false;
                break;
            }
        }

        if (canBeSame) { return oldPassword; }

        dp  = new int[1 << n][n + 2][2];
        res = new int[n];

        long a = -1L;
        long b = -1L;

        clear(dp);
        if (lower(0, 0, 0) == 1) {
            findLower(0, 0, 0);
            a = 0;
            for (int i = 0; i < n; i++) {
                a = a * 10 + res[i];
            }
        }

        clear(dp);
        if (upper(0, 0, 0) == 1) {
            findUpper(0, 0, 0);
            b = 0;
            for (int i = 0; i < n; i++) {
                b = b * 10 + res[i];
            }
        }

        if (a == -1) { return b; }
        if (b == -1) { return a; }

        if (Math.abs(a - oldPassword) > Math.abs(b - oldPassword)) {
            return b;
        }
        if (Math.abs(a - oldPassword) > Math.abs(b - oldPassword)) {
            return a;
        }

        return a;
    }

    int lower(int s, int i, int ok) {
        if (dp[s][i][ok] != -1) { return dp[s][i][ok]; }
        if (i == n) {
            dp[s][i][ok] = ok;
            return dp[s][i][ok];
        }

        dp[s][i][ok] = 0;
        for (int j = n - 1; j > -1; j--) {
            if (off(s, j) && cs[j] != rt[i] && (ok == 1 || cs[j] <= old[i])) {
                if (lower(s | (1 << j), i + 1, (ok == 1 || cs[j] < old[i]) ? 1 : 0) == 1) {
                    dp[s][i][ok] = 1;
                    return dp[s][i][ok];
                }
            }
        }

        return dp[s][i][ok];
    }

    void findLower(int s, int i, int ok) {
        if (i == n) { return; }

        for (int j = n - 1; j > -1; j--) {
            if (off(s, j) && cs[j] != rt[i] && (ok == 1 || cs[j] <= old[i])) {
                if (lower(s | (1 << j), i + 1, (ok == 1 || cs[j] < old[i]) ? 1 : 0) == 1) {
                    res[i] = cs[j];
                    findLower(s | (1 << j), i + 1, (ok == 1 || cs[j] < old[i]) ? 1 : 0);
                    return;
                }
            }
        }
    }

    int upper(int s, int i, int ok) {
        if (dp[s][i][ok] != -1) { return dp[s][i][ok]; }
        if (i == n) {
            dp[s][i][ok] = ok;
            return dp[s][i][ok];
        }

        dp[s][i][ok] = 0;
        for (int j = 0; j < n; j++) {
            if (off(s, j) && cs[j] != rt[i] && (ok == 1 || cs[j] >= old[i])) {
                if (upper(s | (1 << j), i + 1, (ok == 1 || cs[j] > old[i]) ? 1 : 0) == 1) {
                    dp[s][i][ok] = 1;
                    return dp[s][i][ok];
                }
            }
        }

        return dp[s][i][ok];
    }

    void findUpper(int s, int i, int ok) {
        if (i == n) { return; }

        for (int j = 0; j < n; j++) {
            if (off(s, j) && cs[j] != rt[i] && (ok == 1 || cs[j] >= old[i])) {
                if (upper(s | (1 << j), i + 1, (ok == 1 || cs[j] > old[i]) ? 1 : 0) == 1) {
                    res[i] = cs[j];
                    findUpper(s | (1 << j), i + 1, (ok == 1 || cs[j] > old[i]) ? 1 : 0);
                    return;
                }
            }
        }
    }

    void clear(int[][][] dp) {
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }
    }

    boolean off(int mask, int d) {
        return ((mask >> d) & 1) == 0;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
