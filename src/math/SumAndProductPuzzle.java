package topc.math;

import java.util.*;
import java.io.*;

// TCO14 Parallel Round 2B Division I Level Two - 500
// math, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13205&rd=15997
// editorial: http://apps.topcoder.com/wiki/display/tc/Algorithm+Problem+Set+Analysis
public class SumAndProductPuzzle {
    public long getSum(int A, int B) {
        boolean[] prime = new boolean[B + 1];

        for (int b = 0; b <= B; b++) {
            prime[b] = (b > 1);
        }

        for (int i = 2; i * i <= B; i++) {
            if (prime[i]) {
                for (int j = 2 * i; j <= B; j += i) {
                    prime[j] = false;
                }
            }
        }

        boolean[] good = new boolean[B + 1];

        for (int S = 0; S <= B; S++) {
            good[S] = (S > 2) && !prime[S - 1];
        }

        for (int x = 2; x * x < B; x++) {
            for (int y = x; x * y < B; y++) {
                if (!prime[x + y - 1]) {
                    good[x * y + 1] = false;
                }
            }
        }

        long ans = 0;

        for (int S = A; S <= B; S++) {
            if (good[S]) {
                ans += S;
            }
        }

        return ans;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
