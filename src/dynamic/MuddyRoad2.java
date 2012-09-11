package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 555 Division II Level Three - 955
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12189&rd=15177
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+555
public class MuddyRoad2 {
    int MOD = 555555555;

    public int theCount(int N, int muddyCount) {
        int[][][] f = new int[556][N + 1][3];
        int[][] c   = new int[N + 1][N + 1];
        int n       = 0;

        for (int i = 0; i < N + 1; i++) {
            c[i][0] = 1;
            for (int j = 1; j < i + 1; j++) {
                c[i][j] = (c[i - 1][j] + c[i - 1][j - 1]) % MOD;
            }
        }

        for (int i = 1; i < N + 1; i++) {
            f[i][1][i % 3] = 1;

            for (int j = 2; j < i + 1; j++) {
                for (int k = 1; k < 3; k++) {
                    f[i][j][k] = (f[i - k][j - 1][1] + f[i - k][j - 1][2]) % MOD;
                    if (i >= 3) {
                        f[i][j][k] = (f[i][j][k] + f[i - 3][j][k]) % MOD;
                    }
                }
            }
        }

        int res = 
            c[N - 2][muddyCount] - 
            f[N - muddyCount][muddyCount + 1][1] - 
            f[N - muddyCount][muddyCount + 1][2];

        res %= MOD;
        res = (res + MOD) % MOD;

        return res;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
