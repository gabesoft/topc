package topc.geometry;

import java.util.*;
import java.io.*;

// SRM 493 Division II Level Three - 1000
// geometry, search
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11214&rd=14422
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+493
public class CrouchingAmoebas {
    int n;
    int A;
    int x[];
    int y[];
    int ax[];
    int ay[];
    int memo[][][][][];
    int mx[] = { 1, 1, -1, -1 };
    int my[] = { 1, -1, 1, -1 };

    public int count(int[] x, int[] y, int A, int T) {
        this.n    = x.length;
        this.A    = A;
        this.x    = x;
        this.y    = y;
        this.memo = new int[n][n][T + 1][n + 1][4];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < T + 1; k++) {
                    for (int l = 0; l < n + 1; l++) {
                        Arrays.fill(memo[i][j][k][l], -1);
                    }
                }
            }
        }

        this.ax = x.clone();
        this.ay = y.clone();

        Arrays.sort(ax);
        Arrays.sort(ay);

        int best = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < 4; k++) {
                    best = Math.max(best, insideCount(square(i, j, k)) + move(i, j, k, T, 0));
                }
            }
        }

        return best;
    }

    // square top left (x1, y1)
    // square bottom right (x2, y2)
    long[] square(int i, int j, int k) {
        return new long[] { ax[i], ay[j] + my[k] * A, ax[i] + mx[k] * A, ay[j] };
    }

    int move(int xi, int yj, int k, int t, int index) {
        if (t <= 0 || t > 15) { return 0; }
        if (memo[xi][yj][t][index][k] > -1) { return memo[xi][yj][t][index][k]; }

        long sq[] = square(xi, yj, k);
        long x1   = sq[0];
        long y1   = sq[1];
        long x2   = sq[2];
        long y2   = sq[3];
        int best  = 0;

        for (int i = index; i < n; i++) {
            if (outside(x1, y1, x2, y2, i)) {
                long d = costToMoveInside(x1, y1, x2, y2, i);
                if (d <= t) {
                    best = Math.max(best, 1 + move(xi, yj, k, (int)(t - d), i + 1));
                }
            }
        }

        memo[xi][yj][t][index][k] = best;
        return best;
    }

    long costToMoveInside(long x1, long y1, long x2, long y2, int i) {
        long dx = x1 <= x[i] && x[i] <= x2 ? 0 : Math.min(Math.abs(x[i] - x1), Math.abs(x[i] - x2));
        long dy = y2 <= y[i] && y[i] <= y1 ? 0 : Math.min(Math.abs(y[i] - y1), Math.abs(y[i] - y2));
        return dx + dy;
    }

    boolean outside(long x1, long y1, long x2, long y2, int i) {
        return !inside(x1, y1, x2, y2, i);
    }

    boolean inside(long x1, long y1, long x2, long y2, int i) {
        return x1 <= x[i] && x[i] <= x2 && y2 <= y[i] && y[i] <= y1;
    }

    int insideCount(long[] sq) {
        long x1   = sq[0];
        long y1   = sq[1];
        long x2   = sq[2];
        long y2   = sq[3];
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (inside(x1, y1, x2, y2, i)) {
                count++;
            }
        }

        return count;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
