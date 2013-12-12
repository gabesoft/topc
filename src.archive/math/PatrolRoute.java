package topc.math;

import java.util.*;
import java.io.*;

// SRM 542 Division I Level One - 250
// simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11934&rd=14734
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+542
public class PatrolRoute {
    final long MOD = 1000000007L;

    public int countRoutes(int X, int Y, int minT, int maxT) {
        long x = X;
        long y = Y;

        long[] xTime = new long[20002];
        long[] ySum  = new long[20002];

        for (int i = 2; i < x; i++) {
            xTime[2 * i] = ((i - 1) * (X - i)) % MOD;
        }
        for (int i = 2; i < 10001; i++) {
            if (i < y) {
                ySum[2 * i] = ySum[2 * i - 2] + ((i - 1) * (y - i)) % MOD;
            } else {
                ySum[2 * i] = ySum[2 * i - 2];
            }
            ySum[2 * i + 1] = ySum[2 * i];
        }

        long sum = 0;
        for (int i = 4; i < 2 * x; i += 2) {
            int low  = minT - i;
            int high = maxT - i;

            if (high < 0) { break; }

            low = Math.max(low, 1);
            sum = (sum + xTime[i] * (ySum[high] - ySum[low - 1] + MOD) % MOD) % MOD;
        }

        return (int)(sum * 6 % MOD);
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
