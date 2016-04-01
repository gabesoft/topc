package topc.math;

import java.util.*;

// SRM 653 Division II Level Two - 500
// simple math, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13686&rd=16317
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+653
public class RockPaperScissorsMagicEasy {
    int MOD = 1000000007;

    public int count(int[] card, int score) {
        if (score > card.length) { return 0; }
        if (score == card.length) { return 1; }

        int n = card.length;
        long[][] bc = binomialCoefficient(n);

        long r = (bc[n][score] * pow2(n - score)) % MOD;

        return (int)r;
    }

    private long pow2(int n) {
        long r = 1;
        for (int i = 0; i < n; i++) {
            r = r << 1;
            r = r % MOD;
        }

        return r;
    }

    private long[][] binomialCoefficient(long n) {
        long[][] bc = new long[(int)n + 1][(int)n + 1];
        if (MOD == 1) { return bc; }

        for (int i = 0; i < n + 1; i++) {
            bc[i][0] = 1;
            for (int j = 1; j < i + 1; j++) {
                bc[i][j] = bc[i - 1][j - 1] + bc[i - 1][j];
                bc[i][j] = (bc[i][j] >= MOD) ? (bc[i][j] - MOD) : bc[i][j];
            }
        }

        return bc;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
