package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 573 Division II Level Three - 1000
// dynamic programming, math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12467&rd=15493
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+573
public class WolfPackDivTwo {
    long MOD  = 1000000007L;
    int MAX_M = 50;
    int mx[]  = new int[] {0,0,1,-1};
    int my[]  = new int[] {1,-1,0,0};

    long memo[][][];

    public int calc(int[] x, int[] y, int m) {
        memo = new long[MAX_M + 1][MAX_M + 1][MAX_M + 1];

        for (int i = 0; i < memo.length; i++) {
            for (int j = 0; j < memo[0].length; j++) {
                Arrays.fill(memo[i][j], -1);
            }
        }

        long count = 0;

        for (int tx = x[0] - m; tx <= x[0] + m; tx++) {
            for (int ty = y[0] - m; ty <= y[0] + m; ty++) {
                long p = 1L;

                for (int i = 0; i < x.length; i++) {
                    int dx = Math.abs(tx - x[i]);
                    int dy = Math.abs(ty - y[i]);
                    if (dx + dy <= m) {
                        p = (p * ways(dx, dy, m)) % MOD;
                    } else {
                        p = 0;
                    }
                }

                count = (count + p) % MOD;
            }
        }

        return (int)count;
    }

    private long ways(int dx, int dy, int m) {
        if (m == 0) { return dx == 0 && dy == 0 ? 1 : 0; }
        if (memo[dx][dy][m] > -1) { return memo[dx][dy][m]; }

        long res = 0;
        for (int i = 0; i < mx.length; i++) {
            int ndx = Math.abs(dx - mx[i]);
            int ndy = Math.abs(dy - my[i]);
            if (ndx + ndy <= m - 1) {
                res = (res + ways(ndx, ndy, m - 1)) % MOD;
            }
        }

        memo[dx][dy][m] = res;
        return res;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
