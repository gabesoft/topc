package topc.math;

import java.util.*;
import java.io.*;

// Member SRM 458 Division I Level One - 250
// math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10726&rd=14180
// editorial: http://apps.topcoder.com/wiki/display/tc/Algorithm+Problem+Set+Analysis
public class BouncingBalls {
    public double expectedBounces(int[] x, int T) {
        double r = 0.0;
        Arrays.sort(x);

        for (int i = 0; i < x.length; i++) {
            for (int j = i + 1; j < x.length; j++) {
                if (x[i] + T >= x[j] - T) {
                    r += 0.25;
                }
            }
        }

        return r;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
