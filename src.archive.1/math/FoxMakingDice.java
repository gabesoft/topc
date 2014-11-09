package topc.math;

import java.util.*;
import java.io.*;

// Member SRM 491 Division I Level One - 250
// simple math, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11234&rd=14244
// editorial: http://apps.topcoder.com/wiki/display/tc/Algorithm+Problem+Set+Analysis
public class FoxMakingDice {
    public long theCount(int N, int K) {
        int pairs[] = new int[2 * N + 1];

        for (int i = 1; i < N + 1; i++) {
            for (int j = i + 1; j < N + 1; j++) {
                if (i + j >= K) {
                    pairs[i + j]++;
                }
            }
        }

        long count = 0;
        for (int i = K; i < pairs.length; i++) {
            long x = pairs[i];
            long b = x * (x - 1) * (x - 2) / 6;
            count += b * 2;
        }

        return count;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
