package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 178 Division II Level Three - 1000
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=1872&rd=4710
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm178
public class BadSubstring {
    // S(n) = F(2*n + 1) 
    // where 
    //  - S(n) is the count of sequences of length n
    //  - F(n) is the nth fibonacci number
    public long howMany(int length) {
        if (length == 0) { return 1; }

        long dp[][] = new long[length + 1][3];

        Arrays.fill(dp[1], 1);

        for (int l = 2; l < dp.length; l++) {
            for (int d = 0; d < 3; d++) {
                for (int d2 = 0; d2 < 3; d2++) {
                    if (d == 0 && d2 == 1) { continue; }

                    dp[l][d] += dp[l - 1][d2];
                }
            }
        }

        return dp[length][0] + dp[length][1] + dp[length][2];
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
