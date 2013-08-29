package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 558 Division I Level One - 275
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11835&rd=15180
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+558
public class Stamp {
    int INF = 1 << 30;
    int STAR = 7;
    int[] colors;
    int memo[][][];
    int n;
    int S;
    int P;

    public int getMinimumCost(String desiredColor, int stampCost, int pushCost) {
        n = desiredColor.length();
        S = stampCost;
        P = pushCost;

        colors = new int[n];
        for (int i = 0; i < n; i++) {
            char c = desiredColor.charAt(i);
            if (c == '*') { colors[i] = 7; }
            if (c == 'R') { colors[i] = 1; }
            if (c == 'G') { colors[i] = 2; }
            if (c == 'B') { colors[i] = 4; }
        }

        memo = new int[n + 1][n + 1][8];
        for (int i = 0; i < memo.length; i++) {
            for (int j = 0; j < memo[0].length; j++) {
                Arrays.fill(memo[i][j], -1);
            }
        }

        int min = INF;
        for (int i = 1; i < n + 1; i++) {
            min = Math.min(min, i * S + cost(i, 0, STAR));
        }

        return min;
    }

    private int cost(int l, int start, int color) {
        if (start + l > n) { return INF; }
        if (memo[l][start][color] > -1) {
            return memo[l][start][color];
        }

        int last = color;
        for (int i = start; i < start + l; i++) {
            last &= colors[i];

            if (last == 0) {
                break;
            }
        }

        if (last == 0) { return INF; }
        if (start + l == n) { return P; }

        int min = INF;
        for (int i = start + 1; i <= start + l; i++) {
            int c = P + cost(l, i, i < (start + l) ? last : STAR);
            min   = Math.min(min, c);
        }

        memo[l][start][color] = min;
        return min;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
