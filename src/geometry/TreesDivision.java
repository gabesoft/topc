package topc.geometry;

import java.util.*;
import java.io.*;

// SRM 432 Division II Level Three - 1000
// geometry, search
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=9873&rd=13694
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm432
public class TreesDivision {
    public int minDifference(int[] x, int[] y, int[] income) {
        int best = Integer.MAX_VALUE / 4;
        int n = x.length;
        int pa = 0; 
        int pb = 0;
        int qa = 0;
        int qb = 0;

        boolean good = true;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                good = true;

                pa = income[i];
                qa = income[i];

                pb = income[j];
                qb = income[j];

                for (int k = 0; k < n; k++) {
                    if (k != i && k != j) {
                        int dir = (x[i] - x[j]) * (y[i] - y[k]) - (x[i] - x[k]) * (y[i] - y[j]);

                        if (dir < 0) {
                            pa += income[k];
                            qb += income[k];
                        } else if (dir > 0) {
                            pb += income[k];
                            qa += income[k];
                        } else {
                            if (between(x[i], y[i], x[j], y[j], x[k], y[k])) {
                                good = false;
                                break;
                            } else if (between(x[i], y[i], x[k], y[k], x[j], y[j])) {
                                pb += income[k];
                                qb += income[k];
                            } else {
                                pa += income[k];
                                qa += income[k];
                            }
                        }
                    }
                }

                if (good) {
                    best = Math.min(best, Math.abs(pa - pb));
                    best = Math.min(best, Math.abs(qa - qb));
                }
            }
        }

        return best;
    }

    boolean between(int x1, int y1, int x2, int y2, int x, int y) {
        if (x < Math.min(x1, x2) || x > Math.max(x1, x2)) { return false; }
        if (y < Math.min(y1, y2) || y > Math.max(y1, y2)) { return false; }
        return true;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
