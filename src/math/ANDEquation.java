package topc.math;

import java.util.*;
import java.io.*;

// SRM 545 Division II Level One - 250
// simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12029&rd=14737
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+545
public class ANDEquation {
    public int restoreY(int[] A) {
        for (int i = 0; i < A.length; i++) {
            int and = (1 << 20) - 1;

            for (int j = 0; j < A.length; j++) {
                if (j != i) {
                    and &= A[j];
                }
            }

            if (and == A[i]) {
                return and;
            }
        }

        return -1;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
