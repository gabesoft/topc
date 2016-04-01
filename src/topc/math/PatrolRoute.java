package topc.math;

import java.util.*;

// SRM 542 Division I Level One - 250
// simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11934&rd=14734
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+542
public class PatrolRoute {
    public static final int MOD = 1000000007;

    public int countRoutes(int X, int Y, int minT, int maxT) {
        long x = X;
        long y = Y;

        long xtime[] = new long[20002];
        long ysum[] = new long[20002];

        for (int i = 2; i < x; i++) {
            xtime[2 * i] = ((i - 1) * (x - i)) % MOD;
        }

        for (int i = 2; i < 10001; i++) {
            if (i < y) {
                ysum[2 * i] = ysum[2 * i - 1] + ((i - 1) * (y - i)) % MOD;
            } else {
                ysum[2 * i] = ysum[2 * i - 2];
            }
            ysum[2 * i + 1] = ysum[2 * i];
        }

        long ret = 0;
        for (int i = 4; i < 2 * x; i += 2) {
            int low  = Math.max(1, minT - i);
            int high = maxT - i;

            if (high < 0) {
                break;
            }

            ret += xtime[i] * (ysum[high] - ysum[low - 1] + MOD) % MOD;
            ret %= MOD;
        }

        return (int)(ret * 6 % MOD);
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
