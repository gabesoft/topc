package topc.search;

import java.util.*;
import java.io.*;

// SRM 576 Division II Level One - 256
// simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12508&rd=15496
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+576
public class TheExperimentDiv2 {
    public int[] determineHumidity(int[] intensity, int L, int[] leftEnd) {
        int n = leftEnd.length;
        int r[] = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < intensity.length; j++) {
                if (leftEnd[i] <= j && j < leftEnd[i] + L) {
                    r[i] += intensity[j];
                    intensity[j] = 0;
                }
            }
        }

        return r;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
