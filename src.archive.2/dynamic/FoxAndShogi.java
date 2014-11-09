package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 590 Division II Level Three - 1000
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12745&rd=15702
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+590
public class FoxAndShogi {
    public static final int MOD = 1000000007;

    public int differentOutcomes(String[] board) {
        int n = board.length;
        long res = 1;

        for (int i = 0; i < n; i++) {
            String col = "";
            for (int j = 0; j < n; j++) {
                col += board[j].charAt(i);
            }
            res = (res * column(col)) % MOD;
        }

        return (int)res;
    }

    private long column(String s) {
        int[] x = positions(s);
        int t = x.length;
        int n = s.length();
        long f[][] = new long[t + 1][n + 1];

        for (int i = t; i >= 0; i--) {
            for (int p = n; p >= 0; p--) {
                if (i == t) {
                    f[i][p] = 1;
                } else {
                   int hi = n - (t - i);
                   int lo = p;

                   if (s.charAt(x[i]) == 'D') {
                       lo = Math.max(p, x[i]);
                   } else {
                       hi = Math.min(hi, x[i]);
                   }

                   f[i][p] = 0;
                   for (int j = lo; j <= hi; j++) {
                       f[i][p] += f[i + 1][j + 1];
                   }
                   f[i][p] %= MOD;
                }
            }
        }

        return f[0][0];
    }

    private int[] positions(String s) {
        int n = s.length();
        int k = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != '.') {
                k++;
            }
        }

        int[] x = new int[k];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != '.') {
                x[j++] = i;
            }
        }

        return x;
    }

    private void swap(char[] row, int i, int j) {
        char t = row[i];
        row[i] = row[j];
        row[j] = t;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
