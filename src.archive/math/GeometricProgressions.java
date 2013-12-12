package topc.math;

import java.util.*;
import java.io.*;
import java.math.*;

// SRM 500 Division II Level Three - 1000
// math, simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11343&rd=14429
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+500
public class GeometricProgressions {
    public int count(int b1, int q1, int n1, int b2, int q2, int n2) {
        if (b2 == 0 || q2 <= 1) {
            int tb = b1;
            int tq = q1;
            int tn = n1;
            b1     = b2;
            q1     = q2;
            n1     = n2;
            b2     = tb;
            q2     = tq;
            n2     = tn;
        }

        if (b1 == 0 || q1 <= 1) {
            HashSet<Integer> set = new HashSet<Integer>();
            set.add(b1);
            if (n1 > 1) {
                set.add(b1 * q1);
            }

            long curr = b2;
            for (int i = 0; i < n2; i++) {
                set.add((int)curr);
                curr *= q2;
                if (curr > 500000000) {
                    return (n2 - i - 1) + set.size();
                }
            }

            return set.size();
        } else {
            HashSet<String> set = new HashSet<String>();

            int factors[] = findFactors(b1, q1, b2, q2);
            int repb1[]   = decompose(b1, factors);
            int repb2[]   = decompose(b2, factors);
            int repq1[]   = decompose(q1, factors);
            int repq2[]   = decompose(q2, factors);

            for (int i = 0; i < n1; i++) {
                set.add(Arrays.toString(repb1));
                for (int j = 0; j < repb1.length; j++) {
                    repb1[j] += repq1[j];
                }
            }


            for (int i = 0; i < n2; i++) {
                set.add(Arrays.toString(repb2));
                for (int j = 0; j < repb2.length; j++) {
                    repb2[j] += repq2[j];
                }
            }

            return set.size();
        }
    }

    // finds the factorization vector of n given the factors
    int[] decompose(int n, int[] factors) {
        int fact[] = new int[factors.length];

        for (int i = 0; i < factors.length; i++) {
            int factor = factors[i];

            int v = 0;
            int k = n;

            while (k > 0 && (k % factor) == 0) {
                v++;
                k /= factor;
            }

            fact[i] = v;
        }

        return fact;
    }

    int[] findFactors(int x, int y, int w, int z) {
        HashSet<Integer> factors = new HashSet<Integer>();

        addFactors(factors, x);
        addFactors(factors, y);
        addFactors(factors, w);
        addFactors(factors, z);

        int res[] = new int[factors.size()];
        int i     = 0;
        for (int f : factors) {
            res[i++] = f;
        }
        return res;
    }

    // finds the prime factors of a number
    void addFactors(HashSet<Integer> set, int n) {
        while (n > 0) {
            int k = largestPrimeFactor(n);
            set.add(k);
            n /= k;
        }
    }

    int largestPrimeFactor(int n) {
        int k = 2;
        for (k = 2; k <= n; k++) {
            if (n % k == 0) {
                n /= k;
                k--;
            }
        }
        return k;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
