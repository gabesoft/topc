package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 547 Division II Level Three - 1000
// dynamic programming, recursion
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12074&rd=14739
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+547
public class RelativelyPrimeSubset {
    int primesL[] = new int[] { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47 };
    int primesH[] = new int[] { 53, 59, 61, 67, 71, 73, 79, 83, 89, 97 };
    int n = 0;
    int S[] = null;
    int dp[][] = null;
    int mask[] = null;

    public int findSize(int[] S) {
        int cnt = 0;
        ArrayList<Integer> lower = new ArrayList<Integer>();

        for (int i = 0; i < S.length; i++) {
            boolean add = true;
            for (int j = 0; j < primesH.length; j++) {
                if (S[i] % primesH[j] == 0) {
                    add = false;
                    cnt++;
                }
            }

            if (add) {
                lower.add(S[i]);
            }
        }

        this.n = lower.size();
        this.mask = new int[n];
        this.S = new int[n];
        this.dp = new int[n][1 << primesL.length];

        for (int i = 0; i < n; i++) {
            this.S[i] = lower.get(i);
        }

        for (int[] d : dp) {
            Arrays.fill(d, -1);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < primesL.length; j++) {
                if (this.S[i] % primesL[j] == 0) {
                    mask[i] |= (1 << j);
                }
            }
        }

        return cnt + size(0, 0);
    }

    private int size(int k, int m) {
        if (k == n) { return 0; }
        if (dp[k][m] > -1) { return dp[k][m]; }

        int a = size(k + 1, m);
        int b = 0;

        if ((mask[k] & m) == 0) {
            b = 1 + size(k + 1, mask[k] | m);
        }

        dp[k][m] = Math.max(a, b);
        return dp[k][m];
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
