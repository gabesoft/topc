package topc.math;

import java.util.*;
import java.io.*;

// SRM 559 Division I Level One - 250
// simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12201&rd=15181
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+559
public class HyperKnight {
    public long countCells(int a, int b, int numRows, int numColumns, int k) {
        long R = numRows;
        long C = numColumns;
        long A = Math.min(a, b);
        long B = Math.max(a, b);

        if (k == 2) {
            return 4L * sq(A);
        }
        if (k == 3) {
           return 8L * A * (B - A); 
        }
        if (k == 4) {
            return 4L * sq(B - A) + 2 * A * (C - 2 * B) + 2 * A * (R - 2 * B);
        }
        if (k == 6) {
            return 2L * (B - A) * (C - 2 * B) + 2L * (B - A) * (R - 2 * B);
        }
        if (k == 8) {
            return (R - 2 * B) * (C - 2 * B);
        }

        return 0L;
    }

    private long sq(long n) {
        return n * n;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
