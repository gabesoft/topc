package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 594 Division I Level One - 250
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12804&rd=15706
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+594
public class AstronomicalRecords {
    int[] A;
    int[] B;

    public int minimalPlanets(int[] A, int[] B) {
        this.A = A.length > B.length ? A : B;
        this.B = A.length > B.length ? B : A;

        int[][] memo = new int[this.A.length][this.B.length];
        for (int[] m : memo) {
            Arrays.fill(m, -1);
        }

        int best = find(memo, 0, 0, 1, 1);
        for (int i = 0; i < this.A.length; i++) {
            for (int j = 0; j < this.B.length; j++) {
                if (this.A[i] != this.B[j]) {

                    memo = new int[this.A.length][this.B.length];
                    for (int[] m : memo) {
                        Arrays.fill(m, -1);
                    }

                    best = Math.max(best, find(memo, 0, 0, this.B[j], this.A[i]));
                }
            }
        }

        return A.length + (B.length - best);
    }

    private int find(int[][] memo, int ai, int bi, long ma, long mb) {
        if (bi == B.length || ai == A.length) { return 0; }
        if (memo[ai][bi] > -1) { return memo[ai][bi]; }

        int best = find(memo, ai, bi + 1, ma, mb);
        for (int i = ai; i < A.length; i++) {
            if (ma * A[i] == mb * B[bi]) {
                best = Math.max(best, 1 + find(memo, i + 1, bi + 1, ma, mb));
                break;
            } 
        }

        memo[ai][bi] = best;
        return best;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
