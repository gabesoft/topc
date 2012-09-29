package topc.math;

import java.util.*;
import java.io.*;

// SRM 519 Division I Level One - 250
// simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11552&rd=14544
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+519
public class BinaryCards {
    public long largestNumber(long A, long B) {
        for (int i = 60; i >= 0; i--) {
            if (((A ^ B) & (1L << i)) != 0) {
                return A | ((1L << (i + 1)) - 1);
            }
        }
        return A;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
