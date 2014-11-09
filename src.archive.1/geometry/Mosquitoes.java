package topc.geometry;

import java.util.*;
import java.io.*;

// SRM 528 Division II Level Three - 1000
// geometry, math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11654&rd=14553
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+528
public class Mosquitoes {
    int[] xInit;
    int[] v;
    int R;
    int n;

    public int getMaximum(int[] xInit, int[] v, int R) {
        this.xInit = xInit;
        this.v     = v;
        this.R     = R;
        this.n     = xInit.length;
        int best   = attime(0, 1);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int xj = xInit[j] - xInit[i];
                int vj = v[j] - v[i];
                if (vj != 0 && -xj * vj >= 0) {
                    best = Math.max(best, attime(-xj, vj));
                }
            }
        }

        return best;
    }

    int attime(int ta, int tb) {    
        int best = 0;
        for (int i = 0; i < n; i++) {
            int c   = 0;
            int x0i = xInit[i];
            int vi  = v[i];

            for (int j = 0; j < n; j++) {
                int x0j = xInit[j];
                int vj = v[j];

                if (x0i * tb + vi * ta <= x0j * tb + vj * ta) {
                    if (x0i * tb + vi * ta + 2 * R * tb >= x0j * tb + vj * ta) {
                        c++;
                    }
                }
            }

            best = Math.max(best, c);
        }

        return best;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
