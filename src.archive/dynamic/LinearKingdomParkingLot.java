package topc.dynamic;

import java.util.*;
import java.io.*;

// TCO10 Round 5 Division I Level One - 250
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10982&rd=14283
// editorial: http://apps.topcoder.com/wiki/display/tc/TCO'10+Online+Round+5
public class LinearKingdomParkingLot {
    int n;
    int C[];
    int memo[][][];

    public int borrowKeys(int[] exitOrder) {
        n = exitOrder.length;
        C = exitOrder;

        memo = new int[n][n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Arrays.fill(memo[i][j], -1);
            }
        }

        return park(0, n - 1, n - 1);
    }

    private int park(int index, int left, int right) {
        if (index == n) { return 0; }
        if (memo[index][left][right] > -1) { return memo[index][left][right]; }

        int c = C[index];

        int a = park(index + 1, Math.min(c, left), right);
        int b = park(index + 1, left, Math.min(c, right));

        memo[index][left][right] = Math.min(a + (c > left ? 1 : 0), b + (c > right ? 1 : 0));
        return memo[index][left][right];
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
