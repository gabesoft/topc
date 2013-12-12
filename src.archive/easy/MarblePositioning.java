package topc.easy;

import java.util.*;
import java.io.*;

// SRM 579 Division II Level Three - 1000
// brute force, geometry, search
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12324&rd=15499
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+579
public class MarblePositioning {
    int[] perm;
    int[] radius;
    int n;
    int level;
    double best;

    public double totalWidth(int[] radius) {
        this.n      = radius.length;
        this.radius = radius;
        this.level  = -1;
        this.best   = Double.MAX_VALUE / 4;
        this.perm   = new int[n];

        permute(0);

        return best;
    }

    private double dist(int[] perm) {
        double p[] = new double[n];

        p[0] = 0.0;
        for (int i = 1; i < n; i++) {

            p[i] = 0;
            for (int j = 0; j < i; j++) {
                double r1 = radius[perm[i] - 1];
                double r2 = radius[perm[j] - 1];
                double d  = p[j] + 2.0 * Math.sqrt(r1 * r2);

                p[i] = Math.max(p[i], d);
            }
        }

        return p[n - 1] - p[0];
    }

    private void permute(int k) {
        level++;
        perm[k] = level;
        if (level == perm.length) {
            best = Math.min(best, dist(perm));
        } else {
            for (int i = 0; i < perm.length; i++) {
                if (perm[i] == 0) {
                    permute(i);
                }
            }
        }
        level--;
        perm[k] = 0;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
