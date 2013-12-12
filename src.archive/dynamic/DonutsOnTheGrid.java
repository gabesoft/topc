package topc.dynamic;

import java.util.*;
import java.io.*;

// Member SRM 455 Division II Level Three - 1000
// dynamic programming, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10717&rd=14179
// editorial: http://apps.topcoder.com/wiki/display/tc/Algorithm+Problem+Set+Analysis
public class DonutsOnTheGrid {
    public long calc(int H, int W, int seed, int threshold) {
        boolean[][] grid = genGrid(H, W, seed, threshold);
        return calc(grid, H, W);
    }

    long calc(boolean[][] grid, int H, int W) {
        boolean[] col = new boolean[W];

        long sum = 0L;
        for (int hi = 0; hi < H - 2; hi++) {
            for (int c = 0; c < W; c++) {
                col[c] = grid[hi][c] && grid[hi + 1][c];
            }

            for (int lo = hi + 2; lo < H; lo++) {
                int first = -1;
                int last  = -1;

                for (int c = 0; c < W; c++) {
                    col[c] &= grid[lo][c];
                    if (col[c]) {
                        first = (first == -1) ? c : first;
                        last  = c;
                    }
                }

                if (first == last) { continue; }

                int count       = 0;
                boolean segment = true;

                for (int c = first + 1; c <= last; c++) {
                    segment &= grid[hi][c] && grid[lo][c];
                    if (col[c]) {
                        if (segment) {
                            count++;
                            sum += count;
                            if (col[c - 1]) { sum--; }
                        } else {
                            count   = 0;
                            segment = true;
                        }
                    }
                }
            }
        }

        return sum;
    }

    boolean[][] genGrid(int H, int W, int seed, int threshold) {
        boolean[][] grid = new boolean[H][W];

        int v1  = 25173;
        int v2  = 13849;
        int mod = 65536;
        int v   = seed;

        for (int r = 0; r < H; r++) {
            for (int c = 0; c < W; c++) {
                v = (v * v1 + v2) % mod;
                grid[r][c] = v < threshold;
            }
        }

        return grid;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
