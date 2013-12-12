package topc.math;

import java.util.*;
import java.io.*;

// SRM 258 Division II Level Three - 1000
// math, search
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=4705&rd=7993
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm258
public class MissileTarget {
    public int[] bestFit(int[] x, int[] y) {
        int n = x.length;

        double sumx = 0.0;
        double sumy = 0.0;

        for (int i = 0; i < n; i++) {
            sumx += x[i];
            sumy += y[i];
        }

        double cx = sumx / n;
        double cy = sumy / n;

        return new int[] { (int)Math.round(cx), (int)Math.round(cy) };
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
