package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 219 Division II Level Three - 1000
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=3114&rd=5865
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm219
public class PayBill {
    int[] M;
    boolean[] R;
    int n;
    int[][] memo;

    public int[] whoPaid(int[] meals, int totalMoney) {
        n = meals.length;
        M = meals;
        R = new boolean[n];

        memo = new int[n][totalMoney + 1];
        for (int i = 0; i < n; i++) {
            Arrays.fill(memo[i], -1);
        }

        dp(0, totalMoney);

        int k = 0;
        for (int i = 0; i < n; i++) {
            if (R[i]) {
                k++;
            }
        }

        int paid[] = new int[k];
        int j      = 0;
        for (int i = 0; i < n; i++) {
            if (R[i]) {
                paid[j++] = i;
            }
        }

        return paid;
    }

    private int dp(int k, int total) {
        if (k == n || total == 0) { return total; }
        if (memo[k][total] > -1) { return memo[k][total]; }

        int a = dp(k + 1, total);
        int b = 1 << 30;

        if (M[k] <= total) {
            b = dp(k + 1, total - M[k]);
        }

        if (b == 0) {
            R[k] = true;
        } 

        memo[k][total] = Math.min(a, b);
        return memo[k][total];
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
