package topc.easy;

import java.util.*;
import java.io.*;

// SRM 484 Division I Level One - 250
// brute force, math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11131&rd=14237
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+484
public class RabbitNumber {
    public int theCount(int low, int high) {
        return solve1(low, high);
        //return solve2(low, high);
    }

    private int solve1(int low, int high) {
        return countleq(high) - countleq(low - 1);
    }

    private int solve2(int low, int high) {
        int count = 0;
        for (int i = 0; i < (1 << 20); i++) {
            long x = 0;
            for (int j = 0; j < 10; j++) {
                x = x * 10 + ((i >> (2 * j)) & 3);
            }
            if (x >= low && x <= high && isRabbit(x)) {
                count++;
            }
        }
        return count;
    }

    private int countleq(int n) {
        if (n == 0) { return 0; }

        int c = 0;
        for (int i = 1; i < 4; i++) {
            c += count(i, n);
        }

        return c;
    }

    private int count(long n, long lim) {
        if (n > lim) { return 0; }

        int c = isRabbit(n) ? 1 : 0;
        long k = n * 10;
        for (int i = 0; i < 4; i++) {
            if (k + i > lim) { break; }

            c += count(k + i, lim);
        }

        return c;
    }

    private boolean isRabbit(long n) {
        int s = sum(n);
        return s * s == sum(n  * n);
    }

    private int sum(long n) {
        int s = 0;
        while (n > 0) {
            s += (n % 10);
            n /= 10;
        }
        return s;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
