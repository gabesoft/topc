package topc.math;

import java.util.*;
import java.io.*;

// SRM 547 Division I Level One - 250
// simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12055&rd=14739
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+547
public class Pillars {
    public double getExpectedLength(int w, int x, int y) {
        int a = Math.max(x, y);
        int b = Math.min(x, y);

        double len[] = new double[a];
        double mul[] = new double[a];
        double ww    = (double)w * (double)w;

        for (int i = 0; i < a; i++) {
            double k = i;
            len[i]   = Math.sqrt(k * k + ww);
        }

        for (int i = 0; i < b; i++) {
            mul[i] = (b - i);
        }

        for (int i = 1; i < a; i++) {
            mul[i] += Math.min(b, a - i);
        }

        double sum = 0;
        for (int i = 0; i < len.length; i++) {
            sum += (mul[i] * len[i]);
        }

        return sum / ((double)x * (double)y);
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
