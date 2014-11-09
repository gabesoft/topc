package topc.search;

import java.util.*;
import java.io.*;

// SRM 314 Division I Level Two - 500
// search
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=6467&rd=9994
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm314
public class GrasslandFencer {
    int n;
    int fences[];
    double memo[];

    public double maximalFencedArea(int[] fences) {
        this.n      = fences.length;
        this.fences = fences;
        this.memo   = new double[1 << n];

        Arrays.sort(fences);
        Arrays.fill(memo, -2.0);

        return search((1 << n) - 1);
    }

    private double search(int free) {
        if (memo[free] > -1.0) { return memo[free]; }

        double best = 0.0;

        for (int i = 0; i < n; i++) {
            if (isOff(free, i)) { continue; }

            for (int j = i + 1; j < n; j++) {
                if (isOff(free, j)) { continue; }

                for (int k = j + 1; k < n; k++) {
                    if (isOff(free, k)) { continue; }

                    if (fences[i] + fences[j] > fences[k]) {
                        int rest    = off(off(off(free, i), j), k);
                        double curr = area(fences[i], fences[j], fences[k]);
                        double next = search(rest);
                        best        = Math.max(best, curr + next);
                    }
                }
            }
        }

        memo[free] = best;
        return best;
    }

    private boolean isOff(int n, int bit) {
        return ((n >> bit) & 1) != 1;
    }

    int off(int n, int bit) {
        return n & ~(1 << bit);
    }

    private int on(int n, int bit) {
        return n | (1 << bit);
    }

    private double area(int a, int b, int c) {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
