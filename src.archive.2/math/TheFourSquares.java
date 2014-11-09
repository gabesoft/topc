package topc.math;

import java.util.*;
import java.io.*;

// TCO13 Wildcard Round Division I Level One - 250
// math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12705&rd=15812
// editorial: http://apps.topcoder.com/wiki/display/tc/Algorithm+Problem+Set+Analysis
public class TheFourSquares {
    final long MOD = 1000000009L;

    public int countPlacements(int N, int M) {
        int n = Math.min(N, M);
        int m = Math.max(N, M);

        long[] two = new long[m + 1];

        for (int i = 1; i <= m; i++) {
            two[i] = two[i - 1];

            if (i <= n) {
                int mx = Math.min(n - i, i - 1);
                if (mx >= 1) {
                    two[i] += 2 * mx;
                }

                if (i + i <= n) {
                    two[i]++;
                }
            }

            two[i] %= MOD;
        }

        long res = 0;

        for (int i = 1; i <= n; i++) {
            long w = 0;
            if (i + i <= n) {
                w++;
            }

            long mx = Math.min(n - i, i - 1);
            if (mx >= 1) {
                w += 2 * mx;
            }
            res += (w * two[m - i]) % MOD;
        }

        return (int)(res % MOD);
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
