package topc.easy;

import java.util.*;
import java.io.*;

// SRM 212 Division II Level Three - 1000
// brute force, geometry, simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=3005&rd=5858
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm212
public class LargestCircle {
    int[] dx = new int[] { 0, 0, -1, -1 };
    int[] dy = new int[] { 0, -1, 0, -1 };

    boolean[][] marked;
    int n;
    int m;

    public int radius(String[] grid) {
        n      = grid.length;
        m      = grid[0].length();
        marked = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                marked[i][j] = grid[i].charAt(j) == '#';
            }
        }

        int best = 0;
        for (int x = 0; x < n - 1; x++) {
            for (int y = 0; y < m - 1; y++) {
                int rh = Math.min(x + 1, (n - 1) - x);
                int rv = Math.min(y + 1, (m - 1) - y);
                int rm = Math.min(rh, rv);

                for (int r = 1; r <= rm; r++) {
                    if (canDraw(x, y, r)) {
                        best = Math.max(best, r);
                    }
                }
            }
        }

        return best;
    }

    private boolean canDraw(int x, int y, int r) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (onCircle(i, j, x, y, r) && marked[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean onCircle(int i, int j, int x, int y, int r) {
        int rsq = sq(r);
        int gt  = 0;
        int lt  = 0;

        for (int k = 0; k < dx.length; k++) {
            int x1 = i + dx[k];
            int y1 = j + dy[k];

            int dist = sq(x1 - x) + sq(y1 - y);
            if (dist > rsq) {
                gt++;
            } 
            if (dist < rsq) {
                lt++;
            }
        }

        return lt > 0 && gt > 0;
    }

    private int sq(int n) {
        return n * n;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
