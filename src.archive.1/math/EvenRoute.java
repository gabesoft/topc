package topc.math;

import java.util.*;
import java.io.*;

// SRM 538 Division I Level One - 250
// dynamic programming, math, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11808&rd=14729
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+538
public class EvenRoute {
    public String isItPossible(int[] x, int[] y, int wantedParity) {
        int n = x.length;
        int ox = 0;
        int oz = 0;

        oz += parity(0, 0, x[0], y[0]);

        for (int i = 0; i < n - 1; i++) {
            oz += parity(0, 0, x[i + 1], y[i + 1]);
            ox += parity(x[i], y[i], x[i + 1], y[i + 1]);
        }

        if (wantedParity == 0) {
            return (oz > 0 && ox == 0) ? "CANNOT" : "CAN";
        }
        if (wantedParity == 1) {
            return (ox > 0 || oz > 0) ? "CAN" : "CANNOT";
        }

        return null;
    }

    private int parity(int x1, int y1, int x2, int y2) {
        return (Math.abs(x1 - x2) + Math.abs(y1 - y2)) % 2;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
