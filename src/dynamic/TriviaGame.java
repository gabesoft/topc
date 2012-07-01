package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 395 Division II Level Three - 1000
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=8463&rd=11129
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm395
public class TriviaGame {
    int [] P;
    int [] B;
    int [][] memo;
    int T;

    public int maximumScore(int[] points, int tokensNeeded, int[] bonuses) {
        P    = points;
        B    = bonuses;
        T    = tokensNeeded;
        memo = new int[P.length][P.length];

        for (int i = 0; i < memo.length; i++) {
            Arrays.fill(memo[i], -1);
        }

        return score(0, 0);
    }

    int score(int q, int t) {
        if (q == P.length) { return 0; }
        if (memo[q][t] > -1) { return memo[q][t]; }

        // answer correctly
        int bonus = (t + 1) == T ? B[q] : 0;
        int nextt = (t + 1) == T ? 0 : t + 1;
        int a     = P[q] + bonus + score(q + 1, nextt);

        // answer incorrectly
        int b = -P[q] + score(q + 1, t);

        int res    = Math.max(a, b);
        memo[q][t] = res;

        return res;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
