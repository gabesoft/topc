package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 382 Division II Level Three - 1000
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=8470&rd=10805
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm382
public class CharmingTicketsEasy {
    int MOD = 999983;
    int [] digits;
    int [][][] memo;
    int k;

    public int count(int K, String good) {
        k      = K;
        digits = new int[good.length()];

        for (int i = 0; i < digits.length; i++) {
            digits[i] = good.charAt(i) - '0';
        }

        memo = new int[K * 9 + 1][K * 9 + 1][K * 2 + 1];
        for (int i = 0; i < memo.length; i++) {
            for (int j = 0; j < memo[0].length; j++) {
                Arrays.fill(memo[i][j], -1);
            }
        }

        return rec(0, 0, 2 * K);
    }

    int rec(int s1, int s2, int i) {

        int k1 = k * 9;
        int k2 = k * 9;
        if (s1 < 0) { k1 += s1; } else { k1 = s1; }
        if (s2 < 0) { k2 += s2; } else { k2 = s2; }

        if (i == 0) { return (s1 == 0 || s2 == 0) ? 1 : 0; }
        if (memo[k1][k2][i] > -1) { return memo[k1][k2][i]; }

        int mul1 = i > k ? 1 : -1;
        int mul2 = i % 2 == 0 ? 1 : -1;
        int sum  = 0;

        for (int j = 0; j < digits.length; j++) {

            int d   = digits[j];
            int ns1 = s1 + d * mul1;
            int ns2 = s2 + d * mul2;

            sum += rec(ns1, ns2, i - 1);
        }

        memo[k1][k2][i] = sum % MOD;
        return memo[k1][k2][i];
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
