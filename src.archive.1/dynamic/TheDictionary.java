package topc.dynamic;

import java.util.*;
import java.io.*;
import java.math.*;

// SRM 428 Division II Level Three - 1000
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10183&rd=13519
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm428
public class TheDictionary {
    int MAX = 1000000001;
    int [][][] cnt;

    public String find(int n, int m, int k) {
        cnt  = new int[2][n + 1][m + 1];

        for (int i = 1; i < n + 1; i++) {
            cnt[0][i][0] = 1;
        }

        for (int j = 1; j < m + 1; j++) {
            cnt[1][0][j] = 1;
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                cnt[0][i][j] = Math.min(cnt[0][i - 1][j] + cnt[1][i - 1][j], MAX);
                cnt[1][i][j] = Math.min(cnt[0][i][j - 1] + cnt[1][i][j - 1], MAX);
            }
        }

        String res = rec(n, m, k);
        return res.indexOf("-1") > -1 ? "" : res;
    }

    String rec(int n, int m, int k) {
        if (n == 0 && m == 0) { return ""; }
        if (n < 0 || m < 0) { return "-1"; }
        if (k < 0) { return "-1"; }

        int acnt = cnt[0][n][m];
        int zcnt = cnt[1][n][m];

        if (k <= acnt) {
            return "a" + rec(n - 1, m, k);
        }

        if (k <= acnt + zcnt) {
            return "z" + rec(n, m - 1, k - acnt);
        }

        return "-1";
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
