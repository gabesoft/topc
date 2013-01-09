package topc.math;

import java.util.*;
import java.io.*;

// SRM 388 Division II Level Three - 1000
// math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=8565&rd=11122
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm388
public class SmoothNumbersHard {
    public int countSmoothNumbers(int N, int k) {
        int sieve[] = buildSieve(N);
        int count   = 0;

        for (int i = 1; i < sieve.length; i++) {
            if (sieve[i] <= k) {
                count++;
            }
        }

        return count;
    }

    int[] buildSieve(int n) {
        int sieve[] = new int[n + 1];
        int lim     = (int)Math.sqrt(n + 1);

        for (int i = 0; i < sieve.length; i++) {
            sieve[i] = i;
        }

        for (int i = 2; i < n + 1; i++) {
            if (sieve[i] == i) {    // i is prime
                for (int j = 1; j * i < sieve.length; j++) {
                    sieve[j * i] = i;
                }
            }
        }

        return sieve;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
