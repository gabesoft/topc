package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 533 Division I Level One - 250
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11781&rd=14726
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+533
public class CasketOfStar {
    public int maxEnergy(int[] weight) {
        int n = weight.length;
        int dp[][] = new int[n][n];

        for (int d = 1; d < n; d++) {
            for (int i = 0; i + d < n; i++) {
                if (d == 1) {
                    dp[i][i + d] = 0;
                } else {
                    dp[i][i + d] = 0;
                    for (int j = i + 1; j < i + d; j++) {
                        if (dp[i][j] + dp[j][i + d] + weight[i] * weight[i + d] > dp[i][i + d]) {
                            dp[i][i + d] = dp[i][j] + dp[j][i + d] + weight[i] * weight[i + d];
                        }
                    }
                }
            }
        }

        return dp[0][n - 1];
    }
}
