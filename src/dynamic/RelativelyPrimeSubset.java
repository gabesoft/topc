package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 547 Division II Level Three - 1000
// dynamic programming, recursion
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12074&rd=14739
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+547
public class RelativelyPrimeSubset {
    int primes[] = new int[] { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97 };
    int n = 0;
    int S[] = null;
    int dp[][] = null;
    int mask[] = null;
    HashMap<String, Integer> map;

    public int findSize(int[] S) {
        this.n = S.length;
        this.S = S;
        this.mask = new int[n];
        this.map = new HashMap<String, Integer>();
        //this.dp = new int[n][1 << primes.length];

        //for (int[] d : dp) {
            //Arrays.fill(d, -1);
        //}
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < primes.length; j++) {
                if (S[i] % primes[j] == 0) {
                    mask[i] |= (1 << j);
                }
            }

            debug(i, S[i], mask[i], Integer.toBinaryString(mask[i]));
        }

        return -1;
        //return size(0, 0);
    }

    private int size(int k, int m) {
        if (k == n) { return 0; }

        String key = k + ":" + m;
        if (map.containsKey(key)) {
            return map.get(key);
        }
        //if (dp[k][v] > -1) { return dp[k][v]; }

        int a = size(k + 1, m);
        int b = 0;

        //debug(Integer.toBinaryString(mask[k]), Integer.toBinaryString(m), Integer.toBinaryString(mask[k] & m));
        if ((mask[k] & m) == 0) {
            b = 1 + size(k + 1, mask[k] | m);
        }

        //dp[k][v] = Math.max(a, b);
        //return dp[k][v];

        map.put(key, Math.max(a, b));
        return map.get(key);
    }

    private int gcd(int x, int y) {
        while (x != 0) {
            int z = x;
            x = y % x;
            y = z;
        }
        return y;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
