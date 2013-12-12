package topc.geometry;

import java.util.*;
import java.io.*;

// SRM 244 Division I Level Two - 450
// geometry
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=4509&rd=7219
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm244
public class Polyline {
    public double length(int a, int b, int x0, int y0, int x1, int y1) {
        double ret = Double.POSITIVE_INFINITY;
        for (int i = -2; i <= 2; i += 4) {
            for (int j = -2; j <= 2; j += 4) {
                ret = Math.min(ret, dist(x0, y0, x1 + i * a, y1 + j * b));
            }
        }
        return ret;
    }

    private double dist(int x1, int y1, int x2, int y2) {
        return Math.sqrt(sq(x1 - x2) + sq(y1 - y2));
    }

    private int sq(int x) {
        return x * x;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
