package topc.math;

import java.util.*;
import java.io.*;

// SRM 508 Division I Level One - 250
// simple math, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11434&rd=14437
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+508
public class DivideAndShift {
    int[] primes;
    public int getLeast(int N, int M) {
        return solve1(N, M);
        //return solve2(N, M);
    }

    private int solve2(int n, int m) {
        int res = n;
        m--;

        for (int y = 1; y <= n; y++) {
            if (n % y == 0) {
                int x = n / y;
                int c = 0;
                for (int p = 2; p <= x / p; p++) {
                    while (x % p == 0) {
                        c++;
                        x /= p;
                    }
                }
                c += (x != 1 ? 1 : 0);

                int s = Math.min(m % y, y - m % y);
                res = Math.min(res, s + c);
            }
        }

        return res;
    }

    private int solve1(int n, int m) {
        primes = primesUpTo(n);
        return find(n, m);
    }

    private int find(int n, int m) {
        if (m == 1) { return 0; }

        int best = Math.min(m - 1, n - m + 1);

        int p = Arrays.binarySearch(primes, n);
        int s = p > -1 ? p : Math.min(primes.length - 1, -p);
        int e = p > -1 ? p - 1 : 0;

        for (int i = s; i > e; i--) {
            if (n % primes[i] == 0) {
                int k = n / primes[i];
                int l = m % k;
                best = Math.min(best, 1 + find(k, l == 0 ? k : l));
            }
        }

        return best;
    }

    int[] primesUpTo(int n) {
        int sieve[] = new int[n + 1];
        int k = 0;

        for (int i = 0; i < sieve.length; i++) {
            sieve[i] = i;
        }

        for (int i = 2; i < n + 1; i++) {
            if (sieve[i] == i) {    // i is prime
                k++;
                for (int j = 1; j * i < sieve.length; j++) {
                    sieve[j * i] = i;
                }
            }
        }

        int primes[] = new int[k + 1];
        int m = 0;
        for (int i = 1; i < sieve.length; i++) {
            if (sieve[i] == i) {
                primes[m++] = i;
            }
        }

        return primes;
    }


    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
