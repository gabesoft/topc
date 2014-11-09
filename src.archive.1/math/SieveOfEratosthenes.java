package topc.math;

import java.util.*;
import java.io.*;

// TCO10 Round 3 Division I Level One - 250
// math, search
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10931&rd=14281
// editorial: http://apps.topcoder.com/wiki/display/tc/TCO'10+Online+Round+3
public class SieveOfEratosthenes {
    public int lastScratch(int maxNum) {
        int lim     = (int)Math.sqrt(maxNum);
        int sieve[] = buildSieve(lim * 2L);
        int largest = 0;

        for (int i = lim; i > -1; i--) {
            if (sieve[i] == 1) {
                largest = i;
                break;
            }
        }

        int last = largest;
        for (int i = largest; i * largest <= maxNum; i++) {
            if (largest == 2 || sieve[i] == 1) {
                last = i * largest;
            }
        }

        return last;
    }

    int[] buildSieve(long n) {
        int sieve[] = new int[(int)(n + 1)];

        Arrays.fill(sieve, 1);

        sieve[1] = 0;

        for (long i = 2; i < n + 1; i++) {
            if (sieve[(int)i] == 1) {
                for (long j = i * i; j < n + 1; j += i) {
                    sieve[(int)j] = 0;
                }
            }
        }

        return sieve;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
