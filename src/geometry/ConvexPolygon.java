package topc.geometry;

import java.util.*;
import java.io.*;

// SRM 166 Division II Level Three - 900
// geometry
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=1660&rd=4635
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm166
public class ConvexPolygon {
    public double findArea(int[] x, int[] y) {
        double area = 0.0;

        for (int i = 1; i < x.length - 1; i++) {

            int x1 = x[i] - x[0];
            int y1 = y[i] - y[0];
            int x2 = x[i + 1] - x[0];
            int y2 = y[i + 1] - y[0];

            area += (x1 * y2 - x2 * y1);
        }

        return Math.abs(area / 2.0);
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
