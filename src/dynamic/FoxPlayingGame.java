package topc.dynamic;

import java.math.*;
import java.util.*;
import java.io.*;

// Member SRM 501 Division I Level One - 250
// dynamic programming, greedy, simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11284&rd=14430
// editorial: http://apps.topcoder.com/wiki/display/tc/Algorithm+Problem+Set+Analysis
public class FoxPlayingGame {
    public double theMax(int nA, int nB, int paramA, int paramB) {
        double scoreA = paramA / 1000.0;
        double scoreB = paramB / 1000.0;

        double[] pow = new double[nB + 1];
        pow[0] = nA * scoreA;

        for (int i = 1; i < pow.length; i++) {
            pow[i] = scoreB * pow[i - 1];
        }

        Arrays.sort(pow);

        return pow[pow.length - 1];
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
