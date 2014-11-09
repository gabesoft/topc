package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 573 Division II Level Three - 1000
// dynamic programming, math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12467&rd=15493
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+573
public class WolfPackDivTwo {
    public static final int MOD = 1000000007;
    public static final int MAX_M = 50;

    int mx[] = new int[] { 0, 0, 1, -1 };
    int my[] = new int[] { 1, -1, 0, 0 };
    int mem[][][] = null;

    public int calc(int[] x, int[] y, int m) {
        mem = new int[MAX_M + 1][MAX_M + 1][MAX_M + 1];

        for (int[][] m1 : mem) {
            for (int[] m2 : m1) {
                Arrays.fill(m2, -1);
            }
        }

        int res = 0;
        for (int tx = x[0] - m; tx <= x[0] + m; tx++) {
            for (int ty = y[0] - m; ty <= y[0] + m; ty++) {
                long p = 1;
                for (int i = 0; i < x.length; i++) {
                    int dx = Math.abs(tx - x[i]);
                    int dy = Math.abs(ty - y[i]);
                    if (dx + dy <= m) {
                        p *= ways(dx, dy, m);
                        p %= MOD;
                    } else {
                        p = 0;
                    }
                }
                res += (int)p;
                res %= MOD;
            }
        }

        return res;
    }

    private int ways(int dx, int dy, int m) {
        if (mem[dx][dy][m] > -1) { return mem[dx][dy][m]; }
        if (m == 0) { return (dx == 0 && dy == 0) ? 1 : 0; }

        int res = 0;
        for (int i = 0; i < mx.length; i++) {
            int ndx = Math.abs(dx - mx[i]);
            int ndy = Math.abs(dy - my[i]);
            if (ndx + ndy <= m - 1) {
                res += ways(ndx, ndy, m - 1);
                res %= MOD;
            }
        }

        mem[dx][dy][m] = res;
        return res;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
