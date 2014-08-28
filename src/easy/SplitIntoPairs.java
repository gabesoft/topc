package topc.easy;

import java.util.*;
import java.io.*;

// SRM 603 Division II Level Two - 500
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12939&rd=15836
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+603
public class SplitIntoPairs {
    public int makepairs(int[] A, int X) {
        int neg = 0;
        int pos = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] < 0) {
                neg++;
            }
            if (A[i] >= 0) {
                pos++;
            }
        }

        if (neg % 2 == 0) {
            return neg / 2 + pos / 2;
        } else {
            int r = (neg - 1) / 2 + (pos - 1) / 2;

            boolean found = false;

            for (int i = 0; i < A.length; i++) {
                for (int j = 0; j < A.length; j++) {
                    long x = A[i];
                    long y = A[j];
                    if (A[i] >= 0 && A[j] < 0 && !found && x * y >= X) {
                        found = true;
                        break;
                    }
                }
            }

            return found ? r + 1 : r;
        }

    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
