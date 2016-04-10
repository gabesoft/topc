package topc.easy;

import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class LineUpTheCaptives {
    public static String answer(int x, int y, int n) {
        if (x + y < 3 || x + y > n + 1) {
            return "0";
        }

        java.math.BigInteger res = java.math.BigInteger.ZERO;
        java.math.BigInteger[][][][][] cache = new java.math.BigInteger[n][n][n][x][y];

        if (x == 1) {
            res = dp(cache, n, n - 1, 0, 0, 0, y - 1);
        } else if (y == 1) {
            res = dp(cache, n, n - 1, n - 1, n - 1, x - 1, 0);
        } else {
            for (int i = x - 1; i <= n - y; i++) {
                res = res.add(dp(cache, n, n - 1, i, i, x - 1, y - 1));
            }
        }

        return res.toString();
    }

    private static java.math.BigInteger dp(java.math.BigInteger[][][][][] cache, int n, int k, int l, int m, int x, int y) {
        if (k == 0) {
            // end condition
            return (x == 0 && y == 0) ? java.math.BigInteger.ONE : java.math.BigInteger.ZERO;
        } else if (cache[k][l][m][x][y] != null) {
            return cache[k][l][m][x][y];
        } else {
            java.math.BigInteger res = java.math.BigInteger.ZERO;

            // try to left   - > x - 1
            if (x > 0) {
                for (int i = x - 1; i < l; i++) {
                    res = res.add(dp(cache, n, k - 1, i, m, x - 1, y));
                }
            }

            // try to right  - > y - 1
            if (y > 0) {
                for (int i = m + 1; i <= n - y; i++) {
                    res = res.add(dp(cache, n, k - 1, l, i, x, y - 1));
                }
            }

            // try middle
            if ((m - l + 1) - (n - k) > 0) {
                java.math.BigInteger rest = dp(cache, n, k - 1, l, m, x, y);
                java.math.BigInteger fact = java.math.BigInteger.valueOf((m - l + 1) - (n - k));
                res = res.add(rest.multiply(fact));
            }

            cache[k][l][m][x][y] = res;

            return res;
        }
    }
}
