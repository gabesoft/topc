package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 387 Division II Level Three - 1000
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=8538&rd=11121
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm387
public class MarblesRegroupingHard {
    int INF = Integer.MAX_VALUE / 4;
    int [][] data;
    int n; // boxes
    int m; // colors
    int [][] memo;
    int [][] move;

    public int minMoves(String[] boxes) {
        n = boxes.length;
        m = boxes[0].split(" ").length;

        memo = new int[1 << m][n];
        for (int i = 0; i < memo.length; i++) {
            Arrays.fill(memo[i], -2);
        }

        data = new int[n][m];
        for (int i = 0; i < n; i++) {
            String[] colors = boxes[i].split(" ");
            for (int j = 0; j < colors.length; j++) {
                data[i][j] = Integer.parseInt(colors[j]);
            }
        }

        move = new int[n][m];
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                for (int k = 0; k < n; k++) {
                    if (k != i) {
                        move[i][j] += data[k][j];
                    }
                }
            }
        }

        return rec(0, 0);
    }

    int rec(int colors, int box) {
        if (colors == ((1 << m) - 1)) { return 0; }
        if (box == n) { return -1; }
        if (memo[colors][box] > -2) { return memo[colors][box]; }

        int best = INF;

        for (int c = 0; c < m; c++) {
            if (((colors >> c) & 1) == 0) {
                int temp = rec(colors | (1 << c), box + 1);
                if (temp > -1) {
                    best = Math.min(best, move[box][c] + temp);
                }
            }
        }

        int temp = rec(colors, box + 1);
        if (temp > -1) {
            best = Math.min(best, temp);
        }

        memo[colors][box] = best == INF ? -1 : best;
        return memo[colors][box];
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
