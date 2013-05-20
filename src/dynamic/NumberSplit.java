package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 242 Division II Level Three - 1000
// dynamic programming, graph theory, simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=4451&rd=7217
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm242
public class NumberSplit {
    int memo[];
    public int longestSequence(int start) {
        memo = new int[500000];

        Arrays.fill(memo, -1);
        return longest(start);
    }

    private int longest(int num) {
        if (num < 10) { return 1; }
        if (memo[num] > -1) { return memo[num]; }

        int len  = 1 << (digits(num) - 1);
        int best = 0;

        for (int i = 1; i < len; i++) {
            best = Math.max(best, 1 + longest(generate(num, i)));
        }

        memo[num] = best;
        return best;
    }

    private int generate(int n, int split) {
        int k = 1;
        int t = 0;
        int c = 0;
        int e = 1;

        while (n > 0) {
            int d = n % 10;

            t += d * e;
            e *= 10;

            if (((split >> c) & 1) == 1) {
                k *= t;
                e  = 1;
                t  = 0;
            }

            n /= 10;
            c++;
        }

        if (t > 0) {
            k *= t;
        }

        return k;
    }

    private int digits(int n) {
        int k = 0;
        while (n > 0) {
            n /= 10;
            k++;
        }

        return k;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
