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

        for (int i = 0; i < n; i++) {
            int len = platformLength[i];
            int max = platformMount[i];
            int min = max - len;

            for (int ball : balls) {
                if (platformMount[i] >= ball) {
                    min = Math.max(min, ball + 1);
                }
                if (platformMount[i] <= ball) {
                    max = Math.min(max, ball - 1 - len);
                }
            }

            int ways = 0;
            if (max >= min) {
                ways = (max - min + 1);
            }

            count *= ways;
            count %= MOD;
        }

        return (int)count;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
