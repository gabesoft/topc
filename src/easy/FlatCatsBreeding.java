package topc.easy;

import java.util.*;
import java.io.*;

// TCHS10 Round 2 Division I Level One - 250
// brute force
// statement: http://community.topcoder.com/tc?module=HSProblemStatement&pm=10790&rd=14225
// editorial: http://apps.topcoder.com/wiki/display/tc/Algorithm+Problem+Set+Analysis
public class FlatCatsBreeding {
    public int days(int D, int K, int T) {
        int d = 0;
        int k = 1;

        while (k < T) {
            d += D;
            k += (k * K);
        }

        return d;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
