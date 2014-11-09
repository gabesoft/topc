package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 439 Division II Level Three - 1000
// dynamic programming, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10380&rd=13747
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+439
public class PalindromeFactory {
    public int getEditDistance(String initial) {
        int n        = initial.length();
        char chars[] = initial.toCharArray();
        int best     = findMin(chars);

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                swap(chars, i, j);
                best = Math.min(best, 1 + findMin(chars));
                swap(chars, i, j);
            }
        }

        return best;
    }

    int findMin(char[] data) {
        int n      = data.length;
        int dp[][] = new int[n][n];

        for (int k = 1; k < n; k++) {
            for (int i = 0; i < n - 1; i++) {
                if (i + k < n) {
                    dp[i][i + k] = min(
                            dp[i + 1][i + k - 1] + value(data, i, i + k),
                            dp[i + 1][i + k] + 1,
                            dp[i][i + k - 1] + 1
                            );
                }
            }
        }

        return dp[0][n - 1];
    }

    int value(char[] c, int i, int j) {
        return c[i] == c[j] ? 0 : 1;
    }

    int min(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }

    void swap(char[] c, int i, int j) {
        char t = c[i];
        c[i]   = c[j];
        c[j]   = t;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
