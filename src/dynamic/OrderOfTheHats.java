package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 549 Division II Level Three - 1000
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11955&rd=15171
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+549
public class OrderOfTheHats {
    final int INF = 1 << 29;
    int n;
    int[] adj;
    int[] memo;
    
    public int minChanged(String[] spellChart) {
        n    = spellChart.length;
        memo = new int[1 << n];

        Arrays.fill(memo, -1);

        adj = new int[n];

        for (int i = 0; i < n; i++) {
            adj[i] = 0;
            for (int j = 0; j < n; j++) {
                if (spellChart[i].charAt(j) == 'Y') {
                    adj[i] |= (1 << j);
                }
            }
        }

        return rec(0);
    }

    int rec(int mask) {
        if (mask == ((1 << n) - 1)) { return 0; }
        if (memo[mask] > -1) { return memo[mask]; }

        int res = INF;

        for (int i = 0; i < n; i++) {
            if (off(mask, i)) {
                int next = mask | (1 << i);
                res = Math.min(res, countOnes(next & adj[i]) + rec(mask | (1 << i)));
            }
        }

        memo[mask] = res;
        return res;
    }

    boolean off(int mask, int k) {
        return !on(mask, k);
    }

    boolean on(int mask, int k) {
        return ((mask >> k) & 1) == 1;
    }

    int countOnes(int m) {
        int sum = 0;
        while (m > 0) {
            sum += (m & 1);
            m >>= 1;
        }
        return sum;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
