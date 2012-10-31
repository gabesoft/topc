package topc.math;

import java.util.*;
import java.io.*;

// Member SRM 482 Division II Level Three - 900
// math, recursion
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10856&rd=14235
// editorial: http://apps.topcoder.com/wiki/display/tc/Algorithm+Problem+Set+Analysis
public class BaseConfusion {
    public long sum(int M, int N, int B) {
        return sum(N, B) - sum(M - 1, B);
    }

    long sum(int N, int B) {
        long r = 0;

        for (long b1 = 1, b2 = 1; b1 < N + 1; b1 *= B, b2 *= (B + 1)) {
            for (int d = 0; d < B; d++) {
                r += ((N / b1 + B - d - 1) / B * b1 + (N / b1 % B == d ? N % b1 + 1 : 0)) * d * b2;
            }
        }

        return r;
    }

    long toBase(long x, long b) {
        long res   = 0;
        long mul = 1;
        while (x > 0) {
            res += (x % b) * mul;
            mul *= 10L;
            x /= b;
        }
        return res;
    }

    long ofBase(long x, long b) {
        long mul = 1;
        long res = 0;
        while (x > 0) {
            res += (x % 10) * mul;
            mul *= b;
            x /= 10L;
        }

        return res;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
