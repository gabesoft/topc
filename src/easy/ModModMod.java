package topc.easy;

import java.util.*;
import java.io.*;

// 2015 TCO 2A Division I Level One - 300
// brute force, search, simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13614&rd=16475
// editorial: http://apps.topcoder.com/wiki/display/tc/Algorithm+Problem+Set+Analysis
public class ModModMod {
    int MAXN = 10010000;
    long memo[];

    public long findSum(int[] m, int R) {
        memo = new long[MAXN];

        for (int i = 1; i <= R; i++) {
            memo[i] = 1;
        }

        int cur = MAXN;

        for (int md : m) {
            if (cur > md) {
                for (int i = md; i < cur; i++) {
                    memo[i % md] += memo[i];
                    memo[i] = 0;
                }
                cur = md;
            }
        }

        long ans = 0;
        for (int i = 0; i < cur; i++) {
            ans += (long)i * memo[i];
        }

        return ans;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
