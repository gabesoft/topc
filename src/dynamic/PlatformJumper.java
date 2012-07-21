package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 353 Division I Level Two - 500
// dynamic programming, search, simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=7847&rd=10710
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm353
public class PlatformJumper {
    double ERR = 10E-12;
    double v;
    double g;
    int n;
    int[][] data;
    int[] memo;
    boolean[][] jumps;

    public int maxCoins(String[] platforms, int v, int g) {
        this.v = v;
        this.g = g;
        this.n = platforms.length;

        this.data = new int[n][3];

        for (int i = 0; i < n; i++) {
            String[] parts = platforms[i].split(" ");

            data[i][0] = Integer.parseInt(parts[0]);
            data[i][1] = Integer.parseInt(parts[1]);
            data[i][2] = Integer.parseInt(parts[2]);
        }

        this.jumps = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                jumps[i][j] = canJump(i, j);
            }
        }

        this.memo = new int[n];
        Arrays.fill(memo, -1);

        int best = 0;
        for (int i = 0; i < n; i++) {
            best = Math.max(best, rec(i));
        }

        return best;
    }

    int rec(int platform) {
        if (memo[platform] > -1) { return memo[platform]; }

        int coins = 0;

        for (int i = 0; i < n; i++) {
            if (jumps[platform][i]) {
                coins = Math.max(coins, rec(i));
            }
        }

        memo[platform] = coins + data[platform][2];
        return memo[platform];
    }

    boolean canJump(int i, int j) {
        if (i == j) { return false; }

        int x1 = data[i][0];
        int y1 = data[i][1];
        int x2 = data[j][0];
        int y2 = data[j][1];

        if (y1 <= y2) { return false; }
        if (x1 == x2) { return true; }

        double dx = Math.abs(x1 - x2);
        double dy = Math.abs(y1 - y2);
        double t  = Math.sqrt(2 * dy / g);

        return dx - v * t <= ERR;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
