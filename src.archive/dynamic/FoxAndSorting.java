package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 535 Division II Level Three - 1000
// dynamic programming, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11572&rd=15037
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+535
public class FoxAndSorting {
    final int DIGITS = 18;
    long[][] dp;

    public long get(long idx) {
        dp = new long[DIGITS + 1][163];

        for (int i = 0; i < DIGITS + 1; i++) {
            Arrays.fill(dp[i], -1);
        }

        return findNth(idx);
    }

    long findNth(long idx) {
        int s = 0;
        while (idx > rec(s, DIGITS)) {
            idx -= rec(s, DIGITS);
            s++;
        }

        long num = 0;
        for (int x = DIGITS; x > 0; x--) {
            if (s == 0) {
                if (idx == 1) { 
                    break;
                } else {
                    idx--;
                }
            }

            for (int d = 0; d < 10 && s - d > -1; d++) {
                if (d != 0 || x != DIGITS) {
                    if (idx <= rec(s - d, x - 1)) {
                        num = num * 10 + d;
                        s -= d;
                        break;
                    } else {
                        idx -= rec(s - d, x - 1);
                    }
                }
            }
        }

        return num;
    }

    long rec(int s, int x) {
        if (dp[x][s] == -1) {
            long res = 0;

            if (s==0) { res ++; }

            for (int d=0; (d<=9) && (s-d >= 0); d++) {
                if ( (x != 0) && ( (d != 0) || (x != DIGITS) ) ) {
                    res += rec(s - d, x-1);
                }
            }

            dp[x][s] = res;
        }

        return dp[x][s];
    }
    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
