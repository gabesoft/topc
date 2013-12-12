package topc.dynamic;

import java.util.*;
import java.io.*;
import java.math.*;

// SRM 547 Division II Level Three - 1000
// dynamic programming, recursion
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12074&rd=14739
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+547
public class RelativelyPrimeSubset {
    int[] primes   = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47 };
    int[] primes50 = { 53, 59, 61, 67, 71, 73, 79, 83, 89, 97 };
    int[] nums;
    int[][] memo;
    int n;

    public int findSize(int[] S) {
        n    = S.length;
        memo = new int[n][1 << primes.length];

        for (int i = 0; i < memo.length; i++) {
            Arrays.fill(memo[i], -1);
        }

        int count = 0;

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            boolean add = true;

            for (int j = 0; j < primes50.length; j++) {
                if (!relPrimes(S[i], primes50[j])) {
                    count++;
                    add = false;
                    break;
                }
            }

            if (add) {
                list.add(S[i]);
            }
        }

        n = list.size();
        nums = new int[n];

        int idx = 0;
        for (int x : list) {
            nums[idx++] = x;
        }

        return count + rec(0, 0);
    }

    int rec(int set, int k) {
        if (k == n) { return 0; }
        if (memo[k][set] > -1) { return memo[k][set]; }
        
        int count = 0;

        if (canAdd(set, nums[k])) {
            int next = addToSet(set, nums[k]);
            count = 1 + rec(next, k + 1);
        }

        count = Math.max(count, rec(set, k + 1));

        memo[k][set] = count;
        return count;
    }

    int addToSet(int set, int k) {
        int res = set;
        for (int i = 0; i < primes.length; i++) {
            if (!relPrimes(primes[i], k)) {
                res = res | (1 << i);
            }
        }
        return res;
    }

    boolean canAdd(int set, int k) {
        for (int i = 0; i < primes.length; i++) {
            if (((set >> i) & 1) == 1 && !relPrimes(primes[i], k)) {
                return false;
            }
        }
        return true;
    }

    boolean relPrimes(int a, int b) {
        return gcd(a, b) == 1L;
    }

    long gcd(long a, long b) {
        BigInteger x = BigInteger.valueOf(a);
        BigInteger y = BigInteger.valueOf(b);
        return x.gcd(y).longValue();
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
