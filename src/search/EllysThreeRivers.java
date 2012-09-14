package topc.search;

import java.util.*;
import java.io.*;

// SRM 543 Division II Level Three - 1000
// search
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11911&rd=14735
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+543
public class EllysThreeRivers {
    int MAX = 3;
    int INF = 2000000000;

    double[][] a;
    double walkSpeed;
    double sqr(double val) { return val * val; }

    public double getMin(int length, int walk, int[] width, int[] swim) {
        walkSpeed = walk;
        a         = new double[MAX][2];

        for (int i = 0; i < MAX; i++) {
            a[i][0] = width[i];
            a[i][1] = swim[i];
        }

        return rec(0, length);
    }

    double rec(int idx, double rem) {
        if (idx >= 3) { return rem / walkSpeed; }

        double ans   = INF;
        double left  = 0.0;
        double right = rem;

        for (int iter = 0; iter < 100; iter++) {
            double m1 = left + (right - left) / 3.0;
            double m2 = right - (right - left) / 3.0;

            double a1 = rec(idx + 1, rem - m1) + Math.sqrt(sqr(a[idx][0]) + sqr(m1)) / a[idx][1];
            double a2 = rec(idx + 1, rem - m2) + Math.sqrt(sqr(a[idx][0]) + sqr(m2)) / a[idx][1];

            ans = Math.min(ans, a1);
            ans = Math.min(ans, a2);

            if (a1 < a2) {
                right = m2;
            } else {
                left = m1;
            }
        }

        return ans;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
