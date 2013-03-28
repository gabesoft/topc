package topc.easy;

import java.util.*;
import java.io.*;

// SRM 291 Division I Level Two - 500
// brute force, graph theory
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=6071&rd=9812
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm291
public class CrazySwitches {
    public int minimumActions(int[] switches) {
        int n     = switches.length;
        int d[][] = new int[n][1 << n];
        int mq[]  = new int[2 * (1 << n) * n];
        int rq[]  = new int[2 * (1 << n) * n];

        int h = (1 << n) * n;
        int t = (1 << n) * n + 1;

        mq[h] = 1;
        rq[h] = 0;

        d[0][1] = 1;
        while (h < t) {
            int m = mq[h];
            int r = rq[h];
            h++;

            for (int i = 0; i < n; i++) {
                if (i != r && switches[i] == r) {
                    int nm = flip(m, i);
                    if (d[r][nm] == 0) {
                        d[r][nm] = d[r][m];
                        h--;
                        mq[h] = nm;
                        rq[h] = r;
                    }
                }

                if (i != r && isOn(m, i)) {
                    if (d[i][m] == 0) {
                        d[i][m] = d[r][m] + 1;
                        mq[t] = m;
                        rq[t] = i;
                        t++;
                    }
                }
            }
        }

        return d[n - 1][1 << (n - 1)] - 1;
    }

    boolean isOff(int mask, int bit) {
        return !isOn(mask, bit);
    }

    boolean isOn(int mask, int bit) {
        return ((mask >> bit) & 1) == 1;
    }

    int flip(int mask, int bit) {
        return mask ^ (1 << bit);
    }

    int on(int mask, int bit) {
        return mask | (1 << bit);
    }

    int off(int mask, int bit) {
        return mask & ~(1 << bit);
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
