package topc.easy;

import java.util.*;
import java.io.*;

// SRM 379 Division II Level Three - 900
// brute force, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=8401&rd=10800
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm379
public class TVGameWinnings {
    int[][] grid;
    int n;
    int min;
    int max;

    public int[] getMinMax(String[] board) {
        this.n    = board.length;
        this.grid = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = value(board[i].charAt(j));
            }
        }

        this.min = Integer.MAX_VALUE / 4;
        this.max = -(Integer.MAX_VALUE / 4);

        pick(new Pair[n], 0, 0, 0);

        return new int[] { min, max };
    }

    int value(char c) {
        return Character.isDigit(c) ? c - '0' : -(c - 'A' + 1);
    }

    void pick(Pair[] pairs, int picked, int row, int index) {
        if (row >= n) { 
            compute(pairs);
            return;
        }

        for (int c = 0; c < n; c++) {
            if (((picked >> c) & 1) == 0) {
                pairs[index] = new Pair(row, c);
                pick(pairs, picked | (1 << c), row + 1, index + 1);
            }
        }
    }

    void compute(Pair[] picked) {
        int groups = countGroups(picked);
        int value  = 1;

        for (int i = 0; i < picked.length; i++) {
            Pair p = picked[i];
            value *= grid[p.r][p.c];
        }

        int v = groups % 2 == 0 ? -1 * value : value;

        min = Math.min(min, v);
        max = Math.max(max, v);
    }

    int countGroups(Pair[] pairs) {
        boolean seen[] = new boolean[pairs.length];

        int count = 1;
        seen[0]   = true;

        mark(pairs, seen, 0);
        for (int i = 0; i < pairs.length; i++) {
            if (!seen[i]) {
                mark(pairs, seen, i);
                count++;
            }
        }

        return count;
    }

    void mark(Pair[] pairs, boolean[] seen, int k) {
        for (int i = 0; i < pairs.length; i++) {
            if (seen[i]) { continue; }
            if (pairs[k].canJoin(pairs[i])) {
                seen[i] = true;
                mark(pairs, seen, i);
            }
        }
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    class Pair {
        public final int r;
        public final int c;

        public Pair(int r, int c) {
            this.r = r;
            this.c = c;
        }

        public boolean canJoin(Pair o) {
            return c == o.r || r == o.c;
        }

        public String toString() {
            return String.format("(%s,%s)", r, c);
        }
    }
}
