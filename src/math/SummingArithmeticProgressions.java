package topc.math;

import java.util.*;
import java.io.*;
import java.math.*;

// SRM 385 Division II Level Three - 1000
// simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=8474&rd=10810
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm385
public class SummingArithmeticProgressions {
    public int howMany(int left, int right, int k) {
        int A = k;
        int B = k * (k - 1) / 2;
        int D = (int)gcd(A, B);

        A /= D;
        B /= D;

        left   = (left + D - 1) / D;
        right /= D;

        int count = 0;
        while (left <= right && left < 2 * A * B) {
            count += canRepresent(A, B, left++);
        }

        count += right - left + 1;
        return count;
    }

    int canRepresent(int A, int B, int n) {
        for (int x = 1; x <= B; x++) {
            if (A * x >= n) {
                return 0;
            }
            if ((n - A * x) % B == 0) {
                return 1;
            }
        }
        return 0;
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
