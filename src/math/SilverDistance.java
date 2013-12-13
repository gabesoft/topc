package topc.math;

import java.util.*;
import java.io.*;

// SRM 456 Division I Level One - 250
// math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10699&rd=13909
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+456
public class SilverDistance {
    public int minSteps(int sx, int sy, int gx, int gy) {
        gx -= sx;
        gy -= sy;

        int steps = Math.min(Math.abs(gx), Math.abs(gy));

        gx -= (gx < 0 ? -steps : steps);
        gy -= (gy < 0 ? -steps : steps);

        if (gy == 0) {
            steps += (Math.abs(gx) + (Math.abs(gx) % 2));
        }
        if (gy > 0) {
            steps += gy;
        } else {
            steps += (Math.abs(gy) + 2 * (Math.abs(gy) % 2));
        }

        return steps;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
