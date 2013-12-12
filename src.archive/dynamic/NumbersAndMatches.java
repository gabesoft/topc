package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 454 Division I Level Two - 500
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10709&rd=13908
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+454
public class NumbersAndMatches {
    int[][] D = new int[][] { new int[] {1,1,1,0,1,1,1},
        new int[] {0,0,0,0,1,1,1},
        new int[] {0,1,1,1,1,1,0},
        new int[] {0,0,1,1,1,1,1},
        new int[] {1,0,0,1,0,1,1},
        new int[] {1,0,1,1,1,0,1},
        new int[] {1,1,1,1,1,0,1},	
        new int[] {0,0,1,0,0,1,1},	
        new int[] {1,1,1,1,1,1,1},	
        new int[] {1,0,1,1,1,1,1}
    };
    int M = 18 * 8;
    int[] digits;
    long[][][] memo;
    int[][] moveCount;
    int[][] matchCount;

    public long differentNumbers(long N, int K) {
        digits = new int[19];
        long n = N;
        int d  = 0;

        while (n > 0) {
            digits[d++] = (int)(n % 10L);
            n = n / 10;
        }

        memo = new long[18][K + 1][M * 2];

        for (int i = 0; i < memo.length; i++) {
            for (int j = 0; j < memo[0].length; j++) {
                Arrays.fill(memo[i][j], -1L);
            }
        }

        buildMoveTables();

        return count(d - 1, K, 0);
    }

    long count(int d, int moves, int matches) {
        if (d == -1) { return matches == 0 ? 1 : 0; }
        if (memo[d][moves][M - matches] > -1L) { return memo[d][moves][M - matches]; }

        long sum = 0L;
        for (int i = 0; i < 10; i++) {
            int digit = digits[d];
            int t     = matchCount[digit][i];
            int m     = moveCount[digit][i];

            if (t > 0) {
                m -= t;
            }

            int nextm = moves - m;
            if (nextm >= 0) {
                sum += count(d - 1, nextm, matches + t);
            }
        }

        memo[d][moves][M - matches] = sum;
        return sum;
    }

    void buildMoveTables() {
        int n = 10;
        moveCount = new int[n][n];
        matchCount = new int[n][n];

        for (int from = 0; from < n; from++) {
            for (int to = 0; to < n; to++) {
                int countf = 0;
                int countt = 0;
                int common = 0;

                int[] df = D[from];
                int[] dt = D[to];

                for (int i = 0; i < df.length; i++) {
                    countf += df[i];
                    countt += dt[i];
                    common += df[i] & dt[i];
                }

                moveCount[from][to]  = Math.max(countf, countt) - common;
                matchCount[from][to] = countf - countt;
            }
        }
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
