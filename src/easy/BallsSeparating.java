package topc.easy;

import java.util.*;
import java.io.*;

// SRM 568 Division I Level One - 250
// brute force, greedy
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12398&rd=15488
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+568
public class BallsSeparating {
    public static final long INF = 1 << 60;
    int[] green = null;
    int[] red = null;
    int[] blue = null;
    long[][][][] mem = null;

    public int minOperations(int[] red, int[] green, int[] blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;

        mem = new long[red.length][2][2][2];

        for (long[][][] m1 : mem) {
            for (long[][] m2 : m1) {
                for (long[] m3 : m2) {
                    Arrays.fill(m3, -1);
                }
            }
        }

        long res = min(0, 0, 0, 0);

        return res >= INF ? -1 : (int)res;
    }

    private long min(int k, int r, int g, int b) {
        if (k == red.length) {
            return (r == 1) && (g == 1) && (b == 1) ? 0 : INF;
        }

        if (mem[k][r][g][b] > -1) { return mem[k][r][g][b]; }

        long rr = green[k] + blue[k] + min(k + 1, 1, g, b);
        long rb = red[k] + green[k] + min(k + 1, r, g, 1);
        long rg = red[k] + blue[k] + min(k + 1, r, 1, b);

        mem[k][r][g][b] = Math.min(rr, Math.min(rb, rg));

        return mem[k][r][g][b];
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
