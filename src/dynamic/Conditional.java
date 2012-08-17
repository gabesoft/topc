package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 304 Division I Level Two - 450
// dynamic programming, math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=6412&rd=9825
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm304
public class Conditional {
    long MOD = 1000000007;
    int m;
    int n;
    int v;
    int s;
    double[][][][] memo;

    public double probability(int nDice, int maxSide, int v, int theSum) {
        this.v    = v;
        this.n    = nDice;
        this.m    = maxSide;
        this.s    = n * m;
        this.memo = new double[n][s + theSum + 1][2][];

        double[] cnt = count(0, theSum, false);

        return cnt[0] / cnt[1];
    }

    double[] count(int index, int sum, boolean hasv) {
        if (index == n) {
            int den = hasv ? 1 : 0;
            int num = sum <= 0 && hasv ? 1 : 0;
            return new double[] { num, den };
        }
        if (memo[index][s + sum][hasv ? 1 : 0] != null) {
            return memo[index][s + sum][hasv ? 1 : 0];
        }

        double[] cnt = new double[2];
        for (int x = 1; x < m + 1; x++) {
            double[] next = count(index + 1, sum - x, hasv || x == v);
            cnt[0] += next[0];
            cnt[1] += next[1];
        }

        memo[index][s + sum][hasv ? 1 : 0] = cnt;
        return cnt;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
