package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 354 Division II Level Three - 1000
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=4471&rd=10711
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm354
public class UnsealTheSafe {
    int [][] adj = {
        new int [] { 7 },          // 0
        new int [] { 2, 4 },       // 1
        new int [] { 1, 5, 3 },    // 2
        new int [] { 2, 6 },       // 3
        new int [] { 1, 5, 7 },    // 4
        new int [] { 2, 4, 6, 8 }, // 5
        new int [] { 3, 5, 9 },    // 6
        new int [] { 4, 8, 0 },    // 7
        new int [] { 7, 5, 9 },    // 8
        new int [] { 8, 6 },       // 9
    };
    long [][] memo;

    public long countPasswords(int N) {
        memo = new long[N + 1][10];
        for (int i = 0; i < memo.length; i++) {
            Arrays.fill(memo[i], -1L);
        }

        long sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += rec(N, i);
        }
        return sum;
    }

    long rec(int n, int digit) {
        if (n == 1) { return 1; }
        if (memo[n][digit] > -1) { return memo[n][digit]; }

        long sum      = 0;
        int [] digits = adj[digit];

        for (int i = 0; i < digits.length; i++) {
            sum += rec(n - 1, digits[i]);
        }

        memo[n][digit] = sum;
        return sum;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
