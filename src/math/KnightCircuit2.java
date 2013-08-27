package topc.math;

import java.util.*;
import java.io.*;

// SRM 564 Division I Level One - 250
// simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10968&rd=15186
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+564
public class KnightCircuit2 {
    public int maxSize(int w, int h) {
        if (w == 1 || h == 1) { return 1; }

        if (w == h) {
            if (w == 2) { return 1; }
            if (w == 3) { return 8; }
            return w * h;
        }

        if (w == 2 || h == 2) {
            int k = Math.max(w, h);
            return k / 2 + (k % 2);
        }

        return w * h;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
