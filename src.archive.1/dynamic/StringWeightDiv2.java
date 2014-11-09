package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 586 Division II Level Three - 1000
// dynamic programming, string manipulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12695&rd=15698
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+586
public class StringWeightDiv2 {
    int LETTERS = 26;
    long MOD    = 1000000009L;
    long memo[][];

    public int countMinimums(int L) {
        long max   = (L > LETTERS) ? LETTERS : L;
        long count = 1;

        for (int i = 0; i < max; i++) {
            count *= (LETTERS - i);
            count %= MOD;
        }

        if (L > LETTERS) {
            memo = new long[L - LETTERS + 1][LETTERS + 1];
            for (int i = 0; i < memo.length; i++) {
                Arrays.fill(memo[i], -1);
            }
        }

        long dist = distribute(L - LETTERS, LETTERS);

        count *= dist;
        count %= MOD;

        return (int)count;
    }

    private long distribute(int amt, int letters) {
        if (amt <= 0 || letters == 1) { return 1; }
        if (memo[amt][letters] > -1) { return memo[amt][letters]; }

        long count = 0;
        for (int i = 0; i < amt + 1; i++) {
            count += distribute(amt - i, letters - 1);
            if (count > MOD) {
                count -= MOD;
            }
        }

        memo[amt][letters] = count;
        return count;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
