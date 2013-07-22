package topc.easy;

import java.util.*;
import java.io.*;

// SRM 194 Division II Level Three - 1000
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=2387&rd=5069
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm194
public class DiskScheduler {
    int INF = 1 << 30;
    int[] sect;
    int[][][] memo;
    int n;

    public int optimize(int start, int[] sectors) {
        n    = sectors.length;
        sect = sectors.clone();

        if (n == 1) { return dist(start, sectors[0]); }

        for (int i = 0; i < n; i++) {
            if (sect[i] < 50) {
                sect[i] += 100;
            }
        }

        Arrays.sort(sect);

        int l = -1;
        int r = -1;
        int h = start < 50 ? start + 100 : start;
        for (int i = 1; i < n; i++) {
            if (sect[i - 1] < h && h < sect[i]) {
                l = i - 1;
                r = i;
            }
        }

        if (l == -1 && h > sect[n - 1]) {
            l = n - 1;
            r = n;
        }
        if (r == -1 && h < sect[0]) {
            l = -1;
            r = 0;
        }

        for (int i = 0; i < n; i++) {
            if (sect[i] > 100) {
                sect[i] -= 100;
            }
        }

        memo = new int[101][n][n];
        for (int i = 0; i < memo.length; i++) {
            for (int j = 0; j < memo[i].length; j++) {
                Arrays.fill(memo[i][j], -1);
            }
        }

        return search(start, l, r);
    }

    private int search(int h, int l, int r) {
        if (r == 2 * n) { return INF; }
        if (l == -n) { return INF; }
        if (r - l == n + 1) { return 0; }

        int lk = (n + l) % n;
        int rk = r % n;

        if (memo[h][lk][rk] > -1) { return memo[h][lk][rk]; }

        int a = dist(h, sect[lk]) + search(sect[lk], l - 1, r);
        int b = dist(h, sect[rk]) + search(sect[rk], l, r + 1);

        memo[h][lk][rk] = Math.min(a, b);
        return memo[h][lk][rk];
    }

    private int dist(int x, int y) {
        if (x == y) { return 0; }

        int a = Math.min(x, y);
        int b = Math.max(x, y);

        return Math.min(b - a, 100 + a - b);
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
