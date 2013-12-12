package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 209 Division II Level Three - 900
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=2947&rd=5855
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm209
public class LoadBalancing {
    int MAX = 102400;
    int n;
    int data[];
    int memo[][];

    public int minTime(int[] chunkSizes) {
        n    = chunkSizes.length;
        data = chunkSizes;
        memo = new int[MAX + 1][n];

        for (int i = 0; i < n; i++) {
            data[i] /= 1024;
        }

        //return find1(0, 0) * 1024;
        return find2() * 1024;
    }

    // dp (faster)
    private int find2() {
        int M[]   = new int[MAX * 2 + 1];
        int total = 0;

        M[0] = 1;
        for (int i = 0; i < n; i++) {
            total += data[i];
            for (int j = MAX * 2; j >= 0; j--) {
                if (M[j] == 1) {
                    M[j + data[i]] = 1;
                }
            }
        }

        for (int i = (total + 1) / 2; true; i++) {
            if (M[i] == 1) { return i; }
        }
    }

    // backtracking (slower)
    private int find1(int d, int k) {
        if (k == n) { return d; }
        if (memo[d][k] > 0) { return memo[d][k]; }

        int v = data[k];
        int x = d + v > MAX ? MAX : find1(d + v, k + 1);

        int nextd = Math.abs(v - d);
        int time  = v > d ? d : v;
        int y     = time + find1(Math.abs(nextd), k + 1);

        memo[d][k] = Math.min(x, y);
        return memo[d][k];
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
