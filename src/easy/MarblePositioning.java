package topc.easy;

import java.util.*;
import java.io.*;

// SRM 579 Division II Level Three - 1000
// brute force, geometry, search
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12324&rd=15499
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+579
public class MarblePositioning {
    int P[] = null;
    int R[] = null;
    double best = Double.MAX_VALUE;

    public double totalWidth(int[] radius) {
        R = radius;
        P = new int[radius.length];
        for (int i = 0; i < P.length; i++) {
            P[i] = i;
        }

        perm(0);
        return best;
    }

    private double countDist() {
        int n = P.length;
        double p[] = new double[n];

        p[0] = 0.0;
        for (int i = 1; i < n; i++) {
            p[i] = 0;
            for (int j = 0; j < i; j++) {
                double dist = p[j] + dist(R[P[i]], R[P[j]]);
                p[i] = Math.max(p[i], dist);
            }
        }

        return p[n - 1] - p[0];
    }

    private double dist(double r1, double r2) {
        return 2 * Math.sqrt(r1 * r2);
    }

    private void perm(int i) {
        if (i == P.length - 1) {
            best = Math.min(best, countDist());
        } else {
            for (int j = i; j < P.length; j++) {
                swap(P, i, j);
                perm(i + 1);
                swap(P, i, j);
            }
        }
    }

    private void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
