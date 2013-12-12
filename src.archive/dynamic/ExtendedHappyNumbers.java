package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 334 Division I Level Two - 500
// dynamic programming, math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=7244&rd=10658
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm334
public class ExtendedHappyNumbers {
    int MAX = 4000000;
    int[] memo;
    int[] pow;
    int[] stack;
    int k;
    int top;

    public long calcTheSum(int A, int B, int K) {
        memo  = new int[MAX];
        stack = new int[MAX];
        pow   = new int[10];
        k     = K;
        top   = 0;

        for (int i = 1; i < pow.length; i++) {
            pow[i] = i;
            for (int j = 1; j < K; j++) {
                pow[i] *= i;
            }
        }

        long sum = 0;
        for (int i = A; i < B + 1; i++) {
            sum += happiness(i);
        }

        return sum;
    }

    long happiness(int n) {

        int m = memo[n];
        if (m > 0) { return m; }

        int r = 0;
        if (m < 0) {
            r = n;
            for (int i = -m; i < top; i++) {
                r = Math.min(r, stack[i]);
            }
        } else {
            stack[top++] = n;
            memo[n]      = -top;
            r            = (int)Math.min(n, happiness(next(n)));
            top--;
        }

        memo[n] = r;
        return r;
    }

    int next(int n) {
        int m = 0;
        while (n > 0) {
            int d = n % 10;
            m += pow[d];
            n /= 10;
        }
        return m;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
