package topc.math;

import java.util.*;
import java.io.*;

// SRM 283 Division II Level Three - 1000
// math, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=5963&rd=8080
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm283
public class FactorialGCD {
    public int factGCD(long a, long b) {
        int primes[] = getPrimes((int)(Math.sqrt(Math.max(a,b)) + 1));

        int pb[] = new int[primes.length + 1];
        int eb[] = new int[primes.length + 1];
        int plen = 0;

        for (int i = 0; i < primes.length; i++) {
            if (primes[i] > b) { break; }

            int exp = ppow(b, primes[i]);
            if (exp > 0) {
                pb[plen] = primes[i];
                eb[plen] = exp;
                for (int j = 0; j < exp; j++) {
                    b = b / primes[i];
                }
                plen++;
            }
        }

        if (b > 0) {
            pb[plen] = (int)b;
            eb[plen] = 1;
            plen++;
        }

        int ea[] = new int[plen];
        for (int i = 0; i < plen; i++) {
            ea[i] = ppow2(a, pb[i]);
        }

        long res = 1;
        for (int i = 0; i < plen; i++) {
            long p = pb[i];
            long e = Math.min(ea[i], eb[i]);
            res *= pow(p, e);
        }

        return (int)res;
    }

    private int ppow2(long a, long p) {
        if (a == p) { return 1; }
        if (p == 1) { return (int)a; }

        int count = 0;
        while (p <= a) {
            count += a / p;
            a     /= p;
        }

        return count;
    }

    private int ppow(long b, long p) {
        if (b < p || b % p != 0) { return 0; }

        return 1 + ppow(b / p, p);
    }

    long pow(long x, long y) {
        long r = 1;
        long a = x;
        while (y > 0) {
            r = (y % 2 == 1) ? (r * a) : r;
            a = (a * a);
            y = (y / 2);
        }
        return r;
    }

    int[] getPrimes(int n) {
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

        int k = 0;
        for (int i = 2; i < primes.length; i++) {
            if (primes[i]) {
                k++;
            }
        }

        int nums[] = new int[k];
        int p      = 0;
        for (int i = 2; i < primes.length; i++) {
            if (primes[i]) {
                nums[p++] = i;
            }
        }

        return nums;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
