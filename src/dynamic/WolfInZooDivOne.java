package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 578 Division I Level Two - 500
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12534&rd=15498
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+578
public class WolfInZooDivOne {
    int MOD = 1000000007;
    int memo[][];
    int N;
    int L[];
    int R[];

    public int count(int N, String[] L, String[] R) {
        this.N    = N;
        this.memo = new int[N + 2][N + 1];

        for (int i = 0; i < memo.length; i++) {
            Arrays.fill(memo[i], -1);
        }

        String sl = "";
        String sr = "";

        for (int i = 0; i < L.length; i++) { sl += L[i]; }
        for (int i = 0; i < R.length; i++) { sr += R[i]; }

        String left[]  = sl.split("\\s+");
        String right[] = sr.split("\\s+");

        this.L = new int[left.length];
        this.R = new int[right.length];

        for (int i = 0; i < left.length; i++) {
            this.L[i] = Integer.parseInt(left[i]);
            this.R[i] = Integer.parseInt(right[i]);
        }

        return count(-1, 0);
    }

    private int count(int last, int at) {
        if (at == N) { return 1; }
        if (memo[last + 1][at] > -1) { return memo[last + 1][at]; }

        int next = at;
        for (int i = 0; i < L.length; i++) {
            if (L[i] <= last && at <= R[i]) {
                if (next < R[i]) {
                    next = R[i];
                }
            }
        }

        int a = count(last, at + 1);
        int b = count(at, next + 1);

        memo[last + 1][at] = (a + b) % MOD;
        return memo[last + 1][at];
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
