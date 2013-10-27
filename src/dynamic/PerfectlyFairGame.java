package topc.dynamic;

import java.util.*;
import java.io.*;

// TCO11 Championship Round Division I Level One - 250
// dynamic programming, simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11530&rd=14655
// editorial: http://apps.topcoder.com/wiki/display/tc/Algorithm+Problem+Set+Analysis
public class PerfectlyFairGame {
    int n;
    int m;
    int B[][];
    int dr[] = new int[] { -1, -1, -1,  0, 0, 0,  1, 1, 1 };
    int dc[] = new int[] { -1,  0,  1, -1, 0, 1, -1, 0, 1 };
    double memo[][][];

    public double winChance(String[] board, int darts) {
        n = board.length;
        m = board[0].length();
        B = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                B[i][j] = board[i].charAt(j) - '0';
            }
        }

        memo = new double[darts * 2 + 1][darts * 9 + 1][darts * 9 + 1];

        for (int i = 0; i < memo.length; i++) {
            for (int j = 0; j < memo[0].length; j++) {
                Arrays.fill(memo[i][j], -2.0);
            }
        }

        return play(darts * 2, 0, 0);
    }

    private double play(int darts, int dick, int jane) {
        if (darts == 0) {
            if (dick == jane) { return 0.5; }
            return dick > jane ? 0 : 1;
        }

        if (memo[darts][dick][jane] > -1.0) {
            return memo[darts][dick][jane];
        }

        double next[] = new double[10];

        if (darts % 2 == 0) {
            double best = 10.0;

            for (int i = 0; i < 10; i++) {
                next[i] = play(darts - 1, dick + i, jane);
            }

            for (int i = 1; i < n - 1; i++) {
                for (int j = 1; j < m - 1; j++) {
                    double curr = 0;
                    for (int k = 0; k < 9; k++) {
                        int v = B[i + dr[k]][j + dc[k]];
                        curr += next[v];
                    }
                    best = Math.min(best, curr);
                }
            }

            memo[darts][dick][jane] = best / 9.0;
        } else {
            double best = 0.0;

            for (int i = 0; i < 10; i++) {
                next[i] = play(darts - 1, dick, jane + i);
            }

            for (int i = 1; i < n - 1; i++) {
                for (int j = 1; j < m - 1; j++) {
                    double curr = 0;
                    for (int k = 0; k < 9; k++) {
                        int v = B[i + dr[k]][j + dc[k]];
                        curr += next[v];
                    }
                    best = Math.max(best, curr);
                }
            }

            memo[darts][dick][jane] = best / 9.0;
        }

        return memo[darts][dick][jane]; 
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
