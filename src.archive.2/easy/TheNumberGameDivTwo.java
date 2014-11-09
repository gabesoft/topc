package topc.easy;

import java.util.*;
import java.io.*;

// SRM 575 Division II Level Two - 500
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12497&rd=15495
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+575
public class TheNumberGameDivTwo {
    int[] dp;

    public String find(int n) {
        dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return win(n) ? "John" : "Brus";
    }

    private boolean win(int n) {
        if (dp[n] > -1) {
            return dp[n] == 1;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                if (!win(n - i)) {
                    dp[n] = 1;
                    return true;
                }
                if (i != n / i && !win(n - n / i)) {
                    dp[n] = 1;
                    return true;
                }
            }
        }

        dp[n] = 0;
        return false;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
