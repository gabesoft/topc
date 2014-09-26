package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 578 Division II Level Two - 500
// greedy, simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12545&rd=15498
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+578
public class GooseInZooDivTwo {
    public static final long MOD = 1000000007;
    boolean seen[][] = null;
    char F[][] = null;
    int d = 0;
    int R = 0;
    int C = 0;

    public int count(String[] field, int dist) {
        R = field.length;
        C = field[0].length();
        F = new char[R][];
        d = dist;

        for (int i = 0; i < R; i++) {
            F[i] = field[i].toCharArray();
        }

        seen = new boolean[R][C];

        int cnt = 0;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (seen[i][j]) { continue; }
                if (F[i][j] == '.') { continue; }
                cnt++;
                dfs(i, j);
            }
        }

        long ans = 1;
        for (int i = 1; i <= cnt; i++) {
            ans *= 2;
            ans %= MOD;
        }

        ans = (ans - 1 + MOD) % MOD;

        return (int)ans;
    }

    private void dfs(int r, int c) {
        seen[r][c] = true;

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (F[i][j] == 'v' && Math.abs(r - i) + Math.abs(c - j) <= d && !seen[i][j]) {
                    dfs(i, j);
                }
            }
        }
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
