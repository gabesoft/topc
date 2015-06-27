package topc.easy;

import java.util.*;
import java.io.*;

// SRM 660 Division II Level Three - 1000
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13802&rd=16463
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+660
public class Powerit {
    long mod;

    public int calc(int n, int k, int m) {
        this.mod     = m;
        long sum     = 1;
        long dp[]    = new long[n + 1];
        int factor[] = new int[n + 1];

        Arrays.fill(factor, 1);
        Arrays.fill(dp, 1);

        for (int i = 2; i <= n; i++) {
            if (factor[i] == 1) {
                factor[i] = i;
                for (int j = i + i; j <= n; j += i) {
                    factor[j] = i;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (factor[i] == i) {
                dp[i] = pow(i, k);
            } else {
                dp[i] = dp[factor[i]] * dp[i / factor[i]];
                dp[i] %= m;
            }

            sum += dp[i];
            sum %= m;
        }
        return (int)sum;
    }

    private long pow(int x, int k) {
        long p = x;
        long q = p;

        for (int j = 1; j < k; j++) {
            q = (q * q) % mod;
            p = (p * q) % mod;
        }

        return p;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
