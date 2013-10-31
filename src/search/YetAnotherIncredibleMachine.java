package topc.search;

import java.util.*;
import java.io.*;

// SRM 513 Division I Level One - 250
// simple math, simple search, iteration, sorting
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11502&rd=14538
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+513
public class YetAnotherIncredibleMachine {
    final long MOD = 1000000009L;

    public int countWays(int[] platformMount, int[] platformLength, int[] balls) {
        int n = platformLength.length;
        long count = 1;

        Arrays.sort(balls);

        for (int i = 0; i < n; i++) {
            long pos  = 0;
            int end   = platformMount[i];
            int start = platformMount[i] - platformLength[i];

            for (int j = start; j <= end; j++) {
                if (canPlace(j, platformLength[i], balls)) {
                    pos++;
                }
            }

            count *= pos;
            count %= MOD;
        }

        return (int)count;
    }

    private boolean canPlace(int left, int len, int[] balls) {
        if (balls[0] > left + len) { return true; }
        if (balls[balls.length - 1] < left) { return true; }

        int start = left;
        int end   = left + len;

        for (int i = 0; i < balls.length; i++) {
            if (left <= balls[i] && balls[i] <= end) {
                return false;
            }
            if (balls[i] > end) {
                break;
            }
        }

        return true;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
