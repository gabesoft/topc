package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 255 Division I Level Two - 600
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=4473&rd=7228
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm255
public class PluCodeGenerator {
    int digits[];
    int n;
    int memo[][][][][][];

    public int countInvalidCodes(int N) {
        n      = (int)Math.log10(N) + 1;
        digits = new int[11];
        memo   = new int[n + 1][11][11][2][2][2];

        for (int i = n - 1; i >= 0; i--) {
            digits[i] = N % 10;
            N = N / 10;
        }

        for (int i = 0; i < memo.length; i++) {
            for (int d1 = 0; d1 < 11; d1++) {
                for (int d2 = 0; d2 < 11; d2++) {
                    for (int j = 0; j < 2; j++) {
                        for (int k = 0; k < 2; k++) {
                            for (int l = 0; l < 2; l++) {
                                memo[i][d1][d2][j][k][l] = -1;
                            }
                        }
                    }
                }
            }
        }

        return count(0, false, false, true, 10, 10);
    }

    private int count(int index, boolean less, boolean done, boolean leadingZeros, int d2, int d1) {
        if (index == n) { return done && less ? 1 : 0; }
        if (memo[index][d1][d2][less ? 1 : 0][done ? 1 : 0][leadingZeros ? 1 : 0] > -1) {
            return memo[index][d1][d2][less ? 1 : 0][done ? 1 : 0][leadingZeros ? 1 : 0];
        }

        int res = 0;
        int lim = less ? 9 : digits[index];

        for (int digit = 0; digit < lim + 1; digit++) {
            res += count(index + 1,
                    less || (digit < digits[index]),
                    done || (digit == d2 && d2 == d1 && (digit > 0 || !leadingZeros)),
                    leadingZeros && digit == 0,
                    digit, d2);

        }

        memo[index][d1][d2][less ? 1 : 0][done ? 1 : 0][leadingZeros ? 1 : 0] = res;
        return res;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
