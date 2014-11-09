package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 615 Division II Level Three - 1000
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13095&rd=15848
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+615
public class MergeStrings {
    public String getmin(String S, String A, String B) {
        int sn = S.length();
        int an = A.length();
        int bn = B.length();

        String[][][] dp = new String[sn + 1][an + 1][bn + 1];
        for (int i = sn; i >= 0; i--) {
            for (int j = an; j >= 0; j--) {
                for (int k = bn; k >= 0; k--) {
                    if (i == sn) {
                        dp[i][j][k] = "";
                    } else {
                        dp[i][j][k] = "[invalid]";

                        if ((j < an) && (S.charAt(i) == A.charAt(j) || S.charAt(i) == '?')) {
                            String x = dp[i + 1][j + 1][k];
                            if (!x.equals("[invalid]")) {
                                dp[i][j][k] = min(dp[i][j][k], A.charAt(j) + x);
                            }
                        }

                        if ((k < bn) && (S.charAt(i) == B.charAt(k) || S.charAt(i) == '?')) {
                            String x = dp[i + 1][j][k + 1];
                            if (!x.equals("[invalid]")) {
                                dp[i][j][k] = min(dp[i][j][k], B.charAt(k) + x);
                            }
                        }
                    }
                }
            }
        }

        return dp[0][0][0].equals("[invalid]") ? "" : dp[0][0][0];
    }

    private String min(String x, String y) {
        return x.compareTo(y) < 0 ? x : y;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
