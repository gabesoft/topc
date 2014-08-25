package topc.search;

import java.util.*;
import java.io.*;

// SRM 607 Division II Level One - 250
// simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12990&rd=15840
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+607
public class BoundingBox {
    public int smallestArea(int[] X, int[] Y) {
        int xmin = X[0];
        int xmax = X[0];
        int ymin = Y[0];
        int ymax = Y[0];

        for (int i = 0; i < X.length; i++) {
            xmin = Math.min(xmin, X[i]);
            xmax = Math.max(xmax, X[i]);
            ymin = Math.min(ymin, Y[i]);
            ymax = Math.max(ymax, Y[i]);
        }

        return (xmax - xmin) * (ymax - ymin);
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
