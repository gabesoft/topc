package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 227 Division II Level Three - 1000
// dynamic programming, recursion, simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=3515&rd=6516
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm227
public class TreePlanting {
    long memo[][][];
    int total;

    public long countArrangements(int total, int fancy) {
        memo = new long[total + 1][total + 1][];

        for (int i = 0; i < memo.length; i++) {
            for (int j = 0; j < memo[0].length; j++) {
                memo[i][j] = new long[] { -1, -1 };
            }
        }

        return count(0, fancy, total - fancy);
    }

    private long count(int lst, int fancy, int plain) {
        if (fancy == 0) { return 1; }
        if (plain == 0 && lst == 1) { return 0; }
        if (plain == 0) { return count(1, fancy - 1, plain); }

        if (memo[fancy][plain][lst] > -1) {
            return memo[fancy][plain][lst];
        }

        if (lst == 1) {
            return count(0, fancy, plain - 1);
        }

        long a = count(1, fancy - 1, plain);
        long b = count(0, fancy, plain - 1);

        memo[fancy][plain][lst] = a + b;
        return memo[fancy][plain][lst];
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
