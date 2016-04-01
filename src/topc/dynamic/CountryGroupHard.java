package topc.dynamic;

import java.util.*;

// SRM 653 Division I Level One - 250
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13688&rd=16317
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+653
public class CountryGroupHard {
    int a[];
    int n;
    int dp[][][];

    public String solve(int[] a) {
        this.a = a;
        this.n = a.length;
        this.dp = new int[n + 1][n + 1][n + 1];

        for (int[][] dp1 : dp) {
            for (int[] dp2 : dp1) {
                Arrays.fill(dp2, -1);
            }
        }

        return check(0, 0, 0) > 1 ? "Insufficient" : "Sufficient";
    }

    private int check(int index, int last, int left) {
        if (index == n) { return left == 0 ? 1 : 0; }
        if (dp[index][last][left] > -1) { return dp[index][last][left]; }

        if (left > 0 && a[index] != last && a[index] != 0) { return 0; }
        if (left > 0) { return check(index + 1, last, left - 1); }
        if (a[index] != 0) { return check(index + 1, a[index], a[index] - 1); }

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += check(index + 1, i, i - 1);
            if (sum > 1) { break; }
        }

        dp[index][last][left] = sum;
        return sum;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
