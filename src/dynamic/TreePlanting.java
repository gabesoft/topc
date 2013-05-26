package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 227 Division II Level Three - 1000
// dynamic programming, recursion, simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=3515&rd=6516
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm227
public class TreePlanting {
    public long countArrangements(int total, int fancy) {
        long memo[][] = new long[total + 1][fancy + 1];

        memo[0][0] = 1;
        memo[1][1] = 1;

        for (int i = 0; i < total + 1; i++) {
            for (int j = 0; j < fancy + 1; j++) {
                if (i > 0) {
                    memo[i][j] += memo[i - 1][j];
                }
                if (i > 1 && j > 0) {
                    memo[i][j] += memo[i - 2][j - 1];
                }
            }
        }

        return memo[total][fancy];
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
