package topc.easy;

import java.util.*;
import java.io.*;

// SRM 269 Division II Level Three - 1000
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=4831&rd=8002
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm269
public class RegimentArming {
    int n;
    int[] counts;
    int[] powers;

    public int chooseGuns(int[] counts, int[] powers, int N) {
        this.n      = counts.length;
        this.counts = counts;
        this.powers = powers;

        int a = search(N, 0,  1);
        int b = search(N, n - 1, -1);

        return Math.max(a, b);
    }

    private int search(int k, int p, int dir) {
        if (k == 0) { return 0; }
        if (p == n || p < 0) { return 0; }

        int a    = 0;
        int rest = k;

        for (int i = p; i < n && i > -1; i += dir) {
            if (rest == 0) { break; }

            int count = Math.min(rest, counts[i]);

            a    += count * powers[i];
            rest -= count;
        }

        int b = search(k, p + dir, dir);

        return Math.max(a, b);
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
