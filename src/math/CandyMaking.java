package topc.math;

import java.util.*;
import java.io.*;

// SRM 629 Division II Level Two - 550
// simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13340&rd=16060
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+629
public class CandyMaking {
    public double findSuitableDensity(int[] containerVolume, int[] desiredWeight) {
        int n = containerVolume.length;
        double best = Double.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            double ro = desiredWeight[i] / (double) containerVolume[i];
            double delta = 0;

            for (int j = 0; j < n; j++) {
                if (j == i) { continue; }

                delta += Math.abs(desiredWeight[j] - ro * containerVolume[j]);
            }

            best = Math.min(best, delta);
        }

        return best;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
