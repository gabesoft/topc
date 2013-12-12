package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 584 Division II Level Three - 1000
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12644&rd=15696
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+584
public class Excavations2 {
    int MAX = 55;
    long[][] BC;
    long[][] memo;
    boolean[] found;
    int[] type;

    public long count(int[] kind, int[] found, int K) {
        this.BC    = binomialCoefficient(MAX);
        this.found = new boolean[MAX];
        this.type  = new int[MAX];
        this.memo  = new long[MAX][K + 1];

        for (int i = 0; i < found.length; i++) {
            this.found[found[i]] = true;
        }
        for (int i = 0; i < kind.length; i++) {
            this.type[kind[i]]++;
        }
        for (int i = 0; i < memo.length; i++) {
            Arrays.fill(memo[i], -1);
        }

        return count(0, K);
    }

    private long count(int index, int k) {
        if (index == MAX) { return k == 0 ? 1 : 0; }
        if (!found[index]) { return count(index + 1, k); }
        if (memo[index][k] > -1) { return memo[index][k]; }

        long sum = 0;
        for (int i = 1; i < type[index] + 1; i++) {
            if (k - i < 0) { break; }

            sum += BC[type[index]][i] * count(index + 1, k - i);
        }

        memo[index][k] = sum;
        return sum;
    }

    public static long[][] binomialCoefficient(long n) {
        long[][] bc = new long[(int)n + 1][(int)n + 1];

        for (int i = 0; i < n + 1; i++) {
            bc[i][0] = 1;
            for (int j = 1; j < i + 1; j++) {
                bc[i][j] = bc[i - 1][j - 1] + bc[i - 1][j];
            }
        }

        return bc;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
