package topc.easy;

import java.util.*;

// SRM 656 Division II Level Two - 500
// brute force, dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13749&rd=16416
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+656
public class RandomPancakeStackDiv2 {
    int[] d;
    int n;

    public double expectedDeliciousness(int[] d) {
        this.d = d;
        this.n = d.length;
        return exp(0, n);
    }

    private double exp(int selected, int last) {
        int cnt = Integer.bitCount(selected);

        double p   = 1.0 / (n - cnt);
        double res = 0;
        double del = 0;

        for (int i = 0; i < n; i++) {
            if (((selected >> i) & 1) == 1) {
                del += d[i];
            }
        }

        if (cnt == n) { return del; }

        for (int i = 0; i < n; i++) {
            if (((selected >> i) & 1) == 0) {
                res += p * (i < last ? exp(selected | (1 << i), i) : del);
            }
        }

        return res;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
