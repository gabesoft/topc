package topc.math;

import java.util.*;
import java.io.*;

// TCO12 Wildcard Round Division I Level One - 250
// math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12172&rd=15152
// editorial: http://apps.topcoder.com/wiki/display/tc/Algorithm+Problem+Set+Analysis
public class KnightOfIntegerland {
    public String able(int d, int fx, int fy) {
        if (fx == 0 && fy == 0) { return "YES"; }

        if (fx < 0) { fx = -fx; }
        if (fy < 0) { fy = -fy; }

        ArrayList<Integer> sq = new ArrayList<Integer>();
        for (int i = 0; i * i <= d; i++) {
            sq.add(i * i);
        }

        ArrayList<Integer> xs = new ArrayList<Integer>();
        ArrayList<Integer> ys = new ArrayList<Integer>();

        int g = 0;
        for (int i = 0; i < sq.size(); i++) {
            if (Collections.binarySearch(sq, d - sq.get(i)) >= 0) {
                int x = (int) Math.sqrt(sq.get(i) + 0.1);
                int y = (int) Math.sqrt(d - sq.get(i) + 0.1);
                g = gcd(g, 2 * x);
                g = gcd(g, 2 * y);
                xs.add(x);
                ys.add(y);
            }
        }

        if (g == 0) { return "NO"; }
        if (fx % g == 0 && fy % g == 0) { return "YES"; }

        boolean xx = false;
        boolean yy = false;
        boolean zz = false;

        for (int i = 0; i < xs.size(); i++) {
            int mx = xs.get(i) % g;
            int my = ys.get(i) % g;

            yy |= mx == 0 && my != 0;
            xx |= mx != 0 && my == 0;
            zz |= mx != 0 && my != 0;
        }

        zz |= xx && yy;
        yy |= zz && xx;
        xx |= zz && yy;

        boolean dd[][] = new boolean[2][2];

        dd[0][0] = true;
        dd[1][0] = xx;
        dd[0][1] = yy;
        dd[1][1] = zz;

        if (g % 2 == 0) {
            if (fx % (g / 2) == 0 && fy % (g / 2) == 0) {
                if (dd[fx % g != 0 ? 1 : 0][fy % g != 0 ? 1 : 0]) {
                    return "YES";
                }
            }
        }

        return "NO";
    }

    private int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {
            int c = b;
            b = a % b;
            a = c;
        }

        return a;
    }


    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
