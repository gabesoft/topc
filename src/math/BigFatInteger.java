package topc.math;

import java.util.*;
import java.io.*;

// SRM 599 Division I Level One - 250
// math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12867&rd=15711
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+599
public class BigFatInteger {
    public int minOperations(int A, int B) {
        boolean[] primes = getPrimes(1000);

        int fmax = 1;
        int fcnt = 0;

        for (int p = 2; p < primes.length; p++) {
            if (primes[p] && A % p == 0) {
                int pow = 0;

                while (A % p == 0) {
                    pow += 1;
                    A   /= p;
                }

                fmax = Math.max(fmax, pow);
                fcnt++;
            }
        }

        if (A > 1) {
            fcnt++;
        }

        int ops = 0;
        int b   = 1;

        while (b < fmax * B) {
            b *= 2;
            ops++;
        }

        return fcnt + ops;
    }

    boolean[] getPrimes(int n) {
        boolean[] primes = new boolean[n + 1];

        Arrays.fill(primes, true);
        primes[0] = false;
        primes[1] = false;

        for (int i = 2; i < Math.sqrt(primes.length) + 1; i++) {
            if (primes[i]) {
                for (int j = i * i; j < primes.length; j += i) {
                    primes[j] = false;
                }
            }
        }

        return primes;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
