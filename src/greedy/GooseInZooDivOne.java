package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 578 Division I Level One - 250
// greedy, simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12539&rd=15498
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+578
public class GooseInZooDivOne {
    long MOD = 1000000007L;
    int n;
    int m;

    public int count(String[] field, int dist) {
        n = field.length;
        m = field[0].length();

        int odd  = 0;
        int even = 0;

        boolean[][] seen = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (field[i].charAt(j) == 'v' && !seen[i][j]) {
                    int c = dfs(field, seen, dist, i, j);
                    if (c > 0) {
                        even += (c % 2 == 0 ? 1 : 0);
                        odd  += (c % 2 == 0 ? 0 : 1);
                    }
                }
            }
        }

        long[][] bc    = binomialCoefficient(n * m, MOD);
        int groups     = Math.max(odd, even);
        long countOdd  = 0;
        long countEven = 0;

        for (int i = 1; i < groups + 1; i++) {
            if (i <= even) {
                countEven += bc[even][i];
                countEven %= MOD;
            }
            if (i <= odd && i % 2 == 0) {
                countOdd += bc[odd][i];
                countOdd %= MOD;
            }
        }

        if (countEven == 0 && countOdd == 0) { return 0; }

        long r = 0;

        if (countEven > 0) {
            r += countOdd;
        }
        if (countOdd > 0) {
            r += countEven;
        }

        if (countOdd == 0) { countOdd = 1; }
        if (countEven == 0) { countEven = 1; }

        r += (countOdd * countEven);
        r %= MOD;

        return (int)r;
    }

    private int dfs(String[] field, boolean[][] seen, int dist, int r, int c) {
        int count = 1;

        seen[r][c] = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (seen[i][j]) { continue; }

                int d = Math.abs(i - r) + Math.abs(j - c);
                if (field[i].charAt(j) == 'v' && d <= dist) {
                    count += dfs(field, seen, dist, i, j);
                }
            }
        }

        return count;
    }

    private int bfs(String[] field, boolean[][] seen, int dist, int row, int col) {
        if (seen[row][col]) { return 0; }

        int k     = (n + 1) * (m + 1);
        int[] rq  = new int[k];
        int[] cq  = new int[k];
        int count = 0;

        int h = 0;
        int t = 0;

        rq[t] = row;
        cq[t] = col;
        t++;

        while (h < t) {
            int r = rq[h % k];
            int c = cq[(h++) % k];

            if (seen[r][c]) { continue; }

            seen[r][c] = true;
            count++;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (seen[i][j]) { continue; }

                    int d = Math.abs(i - r) + Math.abs(j - c);
                    if (field[i].charAt(j) == 'v' && d <= dist) {
                        rq[t % k] = i;
                        cq[(t++) % k] = j;
                    }
                }
            }
        }

        return count;
    }


    public static long[][] binomialCoefficient(long n, long mod) {
        long[][] bc = new long[(int)n + 1][(int)n + 1];
        if (mod == 1) { return bc; }

        for (int i = 0; i < n + 1; i++) {
            bc[i][0] = 1;
            for (int j = 1; j < i + 1; j++) {
                bc[i][j] = bc[i - 1][j - 1] + bc[i - 1][j];
                bc[i][j] = (bc[i][j] >= mod) ? (bc[i][j] - mod) : bc[i][j];
            }
        }

        return bc;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
