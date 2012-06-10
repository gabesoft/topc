package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 532 Division II Level Three - 950
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11765&rd=14725
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+532
public class DengklekPaintingSquares {
    int MOD = 1000000007;
    int MAXM = 8 + 1;

    int [] pow3;
    int [][] get;
    int [][][] set;

    void init() {
        pow3 = new int[MAXM + 1];
        pow3[0] = 1;
        for (int i = 1; i < MAXM + 1; i++) {
            pow3[i] = 3 * pow3[i - 1];
        }

        get = new int[pow3[MAXM]][MAXM];
        for (int i = 0; i < pow3[MAXM]; i++) {
            for (int j = 0; j < MAXM; j++) {
                get[i][j] = (i / pow3[j]) % 3;
            }
        }

        set = new int[pow3[MAXM]][MAXM][3];
        for (int i = 0; i < pow3[MAXM]; i++) {
            for (int j = 0; j < MAXM; j++) {
                for (int k = 0; k < 3; k++) {
                    set[i][j][k] = i + (k - get[i][j]) * pow3[j];
                }
            }
        }
    }

    public int numSolutions(int N, int M) {
        init();

        int [][][] dp = new int[N + 1][M + 1][pow3[M]];
        int startk = 0;

        for (int i = 0; i < M; i++) {
            startk = set[startk][i][2];
        }

        dp[0][0][startk] = 1;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                for (int k = 0; k < pow3[M]; k++) {
                    if (get[k][j] != 1) {
                        dp[i][j + 1][set[k][j][2]] += dp[i][j][k];
                        dp[i][j + 1][set[k][j][2]] %= MOD;
                    }

                    if (get[k][j] != 0) {
                        int newk = k;
                        newk = set[newk][j][0];
                        if (get[k][j] != 2) {
                            newk = set[newk][j][1 -get[newk][j]];
                        }
                        if (j > 0 && get[k][j - 1] != 2) {
                            newk = set[newk][j][1 - get[newk][j]];
                            newk = set[newk][j - 1][1 - get[newk][j - 1]];
                        }

                        dp[i][j + 1][newk] += dp[i][j][k];
                        dp[i][j + 1][newk] %= MOD;
                    }
                }

            }

            for (int k = 0; k < pow3[M]; k++) {
                dp[i + 1][0][k] = dp[i][M][k];
            }
        }

        int res = 0;
        for (int k = 0; k < pow3[M]; k++) {
            boolean valid = true;
            for (int j = 0; j < M; j++) {
                if (get[k][j] == 1) {
                    valid = false;
                }
            }
            if (valid) {
                res = (res + dp[N][0][k]) % MOD;
            }
        }

        return res;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
