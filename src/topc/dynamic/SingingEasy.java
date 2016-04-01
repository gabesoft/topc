package topc.dynamic;

import java.util.*;

// SRM 653 Division II Level Three - 1000
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13685&rd=16317
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+653
public class SingingEasy {
    int[] pitch;
    int n;
    int[][] dp;

    public int solve(int[] pitch) {
        this.pitch = pitch;
        this.n = pitch.length;
        this.dp = new int[n + 1][n + 1];

        for (int[] d : dp) {
            Arrays.fill(d, -1);
        }

        return rec(-1, -1);
    }

    private int rec(int l0, int l1) {
        int k = Math.max(l0, l1) + 1;
        if (k == n) { return 0; }
        if (dp[l0 + 1][l1 + 1] > -1) { return dp[l0 + 1][l1 + 1]; }

        int c0 = rec(k, l1) + (l0 == -1 ? 0 : Math.abs(pitch[k] - pitch[l0]));
        int c1 = rec(l0, k) + (l1 == -1 ? 0 : Math.abs(pitch[k] - pitch[l1]));

        dp[l0 + 1][l1 + 1] = Math.min(c0, c1);

        return dp[l0 + 1][l1 + 1];
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
