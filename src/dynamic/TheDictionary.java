package topc.dynamic;

import java.util.*;
import java.io.*;
import java.math.*;

// SRM 428 Division II Level Three - 1000
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10183&rd=13519
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm428
public class TheDictionary {
     BigInteger [][][] cnt;

    public String find(int n, int m, int k) {
        cnt  = new BigInteger[2][n + 1][m + 1];

        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < m + 1; j++) {
                cnt[0][i][j] = BigInteger.valueOf(0);
                cnt[1][i][j] = BigInteger.valueOf(0);
            }
        }

        for (int i = 1; i < n + 1; i++) {
            cnt[0][i][0] = BigInteger.valueOf(1);
        }

        for (int j = 1; j < m + 1; j++) {
            cnt[1][0][j] = BigInteger.valueOf(1);
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                cnt[0][i][j] = cnt[0][i - 1][j].add(cnt[1][i - 1][j]);
                cnt[1][i][j] = cnt[0][i][j - 1].add(cnt[1][i][j - 1]);
            }
        }

        String res = rec(n, m, BigInteger.valueOf(k));
        return res.indexOf("-1") > -1 ? "" : res;
    }

    String rec(int n, int m, BigInteger k) {
        if (n == 0 && m == 0) { return ""; }
        if (n < 0 || m < 0) { return "-1"; }
        if (k.longValue() < 0) { return "-1"; }

        BigInteger acnt = cnt[0][n][m];
        BigInteger zcnt = cnt[1][n][m];

        if (k.compareTo(acnt) <= 0) {
            return "a" + rec(n - 1, m, k);
        }

        if (k.compareTo(acnt.add(zcnt)) <= 0) {
            return "z" + rec(n, m - 1, k.subtract(acnt));
        }

        return "-1";
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
