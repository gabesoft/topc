package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 596 Division I Level One - 250
// dynamic programming, simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12790&rd=15708
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+596
public class IncrementAndDoubling {
    public int getMin(int[] desiredArray) {
        int n = desiredArray.length;
        int count = 0;

        boolean change = true;
        while (change) {
            change = false;

            for (int i = 0; i < n; i++) {
                if (desiredArray[i] % 2 == 1) {
                    desiredArray[i]--;
                    count++;
                    change = true;
                }
            }

            boolean half = false;
            for (int i = 0; i < n; i++) {
                if (desiredArray[i] > 0) {
                    desiredArray[i] /= 2;
                    half = true;
                    change = true;
                }
            }

            if (half) {
                count++;
            }
        }

        return count;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
