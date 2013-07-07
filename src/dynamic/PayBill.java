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

        return solveA(totalMoney);
        //return solveB(totalMoney);
    }

    // using dp
    private int[] solveA(int totalMoney) {
        return dp(totalMoney);
    }

    // using backtracking with memoization
    private int[] solveB(int totalMoney) {
        memo = new int[n][totalMoney + 1];
        for (int i = 0; i < n; i++) {
            Arrays.fill(memo[i], -1);
        }

        backtrack(0, totalMoney);

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

    private int[] dp(int W) {
        int A[][]   = new int[n + 1][W + 1];

        for (int i = 1; i <= n; i++) {
            for (int w = 0; w <= W; w++) {
                int wi = M[i - 1];
                if (wi > w) {
                    A[i][w] = A[i - 1][w];
                } else {
                    if (wi + A[i - 1][w - wi] > A[i - 1][w]) {
                        A[i][w] = wi + A[i - 1][w - wi];
                    } else {
                        A[i][w] = A[i - 1][w];
                    }
                }
            }
        }

        boolean R[] = new boolean[n];
        int k       = 0;

        findSolution(A, R, n, W);
        for (int i = 0; i < n; i++) {
            if (R[i]) {
                k++;
            }
        }

        int res[] = new int[k];
        int j     = 0;

        for (int i = 0; i < n; i++) {
            if (R[i]) {
                res[j++] = i;
            }
        }

        return res;
    }

    private void findSolution(int[][] A, boolean[] R, int k, int w) {
        if (k == 0) { return; }

        int wk = M[k - 1];
        if (wk <= w && wk + A[k - 1][w - wk] > A[k - 1][w]) {
            R[k - 1] = true;
            findSolution(A, R, k - 1, w - wk);
        } else {
            findSolution(A, R, k - 1, w);
        }
    }

    private int backtrack(int k, int total) {
        if (k == n || total == 0) { return total; }
        if (memo[k][total] > -1) { return memo[k][total]; }

        int a = backtrack(k + 1, total);
        int b = 1 << 30;

        if (M[k] <= total) {
            b = backtrack(k + 1, total - M[k]);
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
