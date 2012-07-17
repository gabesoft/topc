package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 358 Division II Level Three - 1000
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=7705&rd=10768
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm358
public class SameDigits {
    long MOD = 44444444;
    long [][][] memo;
    int K;

    public int howMany(int n, int k) {
        K    = k;
        memo = new long[n + 1][k + 1][2];

        for (int i = 0; i < memo.length; i++) {
            for (int j = 0; j < memo[i].length; j++) {
                Arrays.fill(memo[i][j], -1);
            }
        }

        long ans = 0;
        for (int i = k; i < n + 1; i++) {
            ans += 9 * rec(i - 1, 1, 0);
            ans %= MOD;
        }

        return (int)ans;
    }

    long rec(int n, int lastSame, int reached) {
        if (memo[n][lastSame][reached] > -1) {
            return memo[n][lastSame][reached];
        }

        long res = 0;
        if (n == 0) {
            res = reached == 1 || lastSame == K ? 1 : 0;
        } else {
            if (lastSame == K) {
                res  = 9 * rec(n - 1, 1, 1);
                res %= MOD;
            } else {
                res  = rec(n - 1, lastSame + 1, reached);
                res += 9 * rec(n - 1, 1, reached);
                res %= MOD;
            }
        }

        memo[n][lastSame][reached] = res;
        return res;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
