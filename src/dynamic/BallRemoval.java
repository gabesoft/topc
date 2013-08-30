package topc.dynamic;

import java.util.*;
import java.io.*;

// TCO12 Semifinal 2 Division I Level One - 275
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12157&rd=15151
// editorial: http://apps.topcoder.com/wiki/display/tc/Algorithm+Problem+Set+Analysis
public class BallRemoval {
    char[] O;

    public String canLeave(String label) {
        int n = label.length();

        O = new char[n];

        Arrays.fill(O, '.');

        for (int i = 0; i < n; i++) {
            String right = label.substring(i + 1);
            String left  = reverse(label.substring(0, i));
            if (canClear(right) && canClear(left)) {
                O[i] = 'o';
            }
        }

        return new String(O);
    }

    private boolean canClear(String s) {
        int n = s.length();

        if (n == 0) { return true; }
        if (n % 2 == 1) { return false; }

        int dp[][] = new int[n][n];
        for (int l = 1; l < n; l += 2) {
            for (int i = 0; i < n; i++) {
                int j = i + l;

                if (j < n) {
                    char ci = s.charAt(i);
                    char cj = s.charAt(j);

                    dp[i][j] = (ci == '>' || (j < n - 1 && cj == '<')) ? 1 : 0;

                    if (l > 1 && dp[i][j] == 1) {
                        int ii = i + 1;
                        int jj = j - 1;

                        dp[i][j] = dp[ii][jj];
                    }

                    if (dp[i][j] == 0) {
                        for (int k = 1; k < l && i + k + 1 < j; k++) {
                            if (dp[i][i + k] == 1 && dp[i + k + 1][j] == 1) {
                                dp[i][j] = 1;
                                break;
                            }
                        }
                    }
                }
            }
        }

        return dp[0][n - 1] == 1;
    }

    private String reverse(String s) {
        int n    = s.length();
        String r = "";

        for (int i = n - 1; i > -1; i--) {
            r += s.charAt(i) == '>' ? '<' : '>';
        }

        return r;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
