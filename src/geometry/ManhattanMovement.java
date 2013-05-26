package topc.geometry;

import java.util.*;
import java.io.*;

// SRM 226 Division I Level One - 250
// geometry, simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=3498&rd=6515
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm226
public class ManhattanMovement {
    public double getDistance(int a, int b, int x0, int y0) {
        if (a == 0) {
           return Math.abs(1.0 / b - y0);
        }
        if (b == 0) {
            return Math.abs(1.0 / a - x0);
        }

        double y = 1.0 / b - a / (double)b * x0;
        double x = 1.0 / a - b / (double)a * y0;

        double vert = Math.abs(y - y0);
        double horz = Math.abs(x - x0);

        return Math.min(vert, horz);
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
