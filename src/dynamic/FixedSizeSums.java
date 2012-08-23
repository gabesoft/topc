package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 287 Division II Level Three - 1000
// dynamic programming, math, sorting
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=6015&rd=9808
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm287
public class FixedSizeSums {
    int[][][] dp;
    int n;

    public String kthElement(int sum, int count, int index) {
        n  = count;
        dp = new int[sum + 1][count + 1][sum + 1];

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }

        for (int i = sum; i > 0; i--) {
            rec(sum, i, count);
        }

        int all = 0;
        for (int i = 1; i < sum + 1; i++) {
            all += dp[sum][count][i];
        }

        if (all <= index) { return ""; }

        String res  = sum + "=";
        int remains = sum;
        int last    = sum;

        for (int i = 0; i < count; i++) {
            int elem = last + 1;
            int seen = 0;

            while (seen <= index) {
                elem -= 1;
                seen += dp[remains][count - i][elem];
            }

            res += (i > 0 ? "+" : "") + elem;

            index   -= (seen - dp[remains][count - i][elem]);
            remains -= elem;
            last     = elem;
        }

        return res;
    }

    int rec(int sum, int fst, int count) {
        if (sum < 0) { return 0; }
        if (dp[sum][count][fst] > -1) { return dp[sum][count][fst]; }

        dp[sum][count][fst] = 0;
        if (count == 1) {
            if (sum == fst) {
                dp[sum][count][fst] = 1;
            }
        } else {
            for (int i = fst; i > 0; i--) {
                dp[sum][count][fst] += rec(sum - fst, i, count - 1);
            }
        }

        return dp[sum][count][fst];
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
