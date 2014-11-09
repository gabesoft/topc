package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 395 Division I Level Two - 500
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=8582&rd=11129
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm395
public class Skyscrapers {
    long MOD = 1000000007L;
    long memo[][][];

    public int buildingCount(int N, int leftSide, int rightSide) {
        memo = new long[N + 1][N + 1][N + 1];
        for (int i = 0; i < memo.length; i++) {
            for (int j = 0; j < memo[0].length; j++) {
                Arrays.fill(memo[i][j], -1L);
            }
        }
        return (int)rec(N, leftSide, rightSide);
    }

    long rec(int n, int l, int r) {
        if (n == 1) {
            return (l == 1 && r == 1) ? 1 : 0;
        }
        if (l < 1 || r < 1) {
            return 0;
        }
        if (memo[n][l][r] > -1) { 
            return memo[n][l][r];
        }

        long a = rec(n - 1, l - 1, r);
        long b = rec(n - 1, l, r - 1);
        long c = (n - 2) * rec(n - 1, l, r);

        memo[n][l][r] = (a + b + c) % MOD;

        return memo[n][l][r];
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
