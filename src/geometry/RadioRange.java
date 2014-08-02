package topc.geometry;

import java.util.*;
import java.io.*;

// SRM 621 Division I Level One - 275
// geometry, simple math, sorting
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13187&rd=15854
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+621
public class RadioRange {
    public double RadiusProbability(int[] X, int[] Y, int[] R, int Z) {
        ArrayList<Double> evs = new ArrayList<Double>();
        evs.add(0.0);
        evs.add((double)Z);

        for (int i = 0; i < X.length; i++) {
            double d = dist(X[i], Y[i]);

            double d1 = d - R[i];
            double d2 = d + R[i];
            if (0 <= d1 && d1 <= Z) { evs.add(d1); }
            if (0 <= d2 && d2 <= Z) { evs.add(d2); }
        }

        Collections.sort(evs);
        double good = 0.0;

        for (int j = 1; j < evs.size(); j++) {
            double p = (evs.get(j) + evs.get(j - 1)) / 2.0;
            boolean isGood = true;

            for (int i = 0; i < X.length; i++) {
                double d = dist(X[i], Y[i]);
                isGood &= !(d - R[i] <= p && p <= d + R[i]);
            }

            if (isGood) {
                good += (evs.get(j) - evs.get(j - 1));
            }
        }


        return good / Z;
    }

    private double dist(double x, double y) {
        return Math.sqrt(x * x + y * y);
    }

    private double sq(int x) {
        return x * x;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
