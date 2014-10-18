package topc.math;

import java.util.*;
import java.io.*;

// SRM 559 Division I Level One - 250
// simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12201&rd=15181
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+559
public class HyperKnight {
    public long countCells(int a, int b, int numRows, int numColumns, int k) {
        long A = Math.max(a, b);
        long B = Math.min(a, b);
        long r[] = new long[9];

        r[2] = 4 * B * B;
        r[3] = 8 * (A - B) * B;
        r[6] = 2 * (A - B) * (numRows + numColumns - 4 * A);
        r[8] = (numRows - 2 * A) * (numColumns - 2 * A);
        r[4] = numRows * (long)numColumns - r[2] - r[3] - r[6] - r[8];

        return r[k];
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
