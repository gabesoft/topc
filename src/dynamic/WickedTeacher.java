package topc.dynamic;

import java.util.*;
import java.io.*;
import java.math.*;

// SRM 440 Division II Level Three - 1000
// dynamic programming, math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10289&rd=13748
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+440
public class WickedTeacher {
    public String cheatProbability(String[] numbers, int K) {
        int n = numbers.length;

        long[] nums = new long[n];
        long[] dec  = new long[n]; 

        BigInteger k = BigInteger.valueOf(K);
        for (int i = 0; i < n; i++) {
            BigInteger d   = get10ToPow(numbers[i].length());
            BigInteger num = new BigInteger(numbers[i]);

            nums[i] = num.mod(k).longValue();
            dec[i]  = d.mod(k).longValue();
        }

        long[][] dp = new long[1 << n][K];
        dp[0][0]    = 1L;

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < K; j++) {
                for (int p = 0; p < n; p++) {
                    if (((i >> p) & 1) == 0) {
                        long rem = (j * dec[p] + nums[p]) % K;
                        dp[i | (1 << p)][(int)rem] += dp[i][j];
                    }
                }
            }
        }

        long a = dp[(1 << n) - 1][0];
        long b = fact(n);
        long g = gcd(a, b);

        long num = a / g;
        long den = b / g;

        return String.format("%s/%s", num, den);
    }

    long gcd(long a, long b) {
        BigInteger x = BigInteger.valueOf(a);
        BigInteger y = BigInteger.valueOf(b);
        return x.gcd(y).longValue();
    }
    
    long fact(int n) {
        long ret = 1L;
        for (int i = 1; i <= n; ++i) { 
            ret *= i;
        }
        return ret;
    }

    BigInteger get10ToPow(int pow) {
        StringBuffer num = new StringBuffer();
        num.append("1");
        for (int i = 0; i < pow; i++) {
            num.append("0");
        }
        return new BigInteger(num.toString());
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
