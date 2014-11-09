package topc.math;

import java.util.*;
import java.io.*;

// Member SRM 485 Division I Level One - 250
// simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11146&rd=14238
// editorial: http://apps.topcoder.com/wiki/display/tc/Algorithm+Problem+Set+Analysis
public class AfraidOfEven {
    public int[] restoreProgression(int[] seq) {
        boolean done = false;
        int [] curr  = null;

        for (int i = 0; i < 10 && !done; i++) {
            curr = seq.clone();

            for (int j = 0; j < 10; j++) {
                if (valid(curr)) {
                    done = true;
                    break;
                }
                curr[1] *= 2;
            }

            seq[0] *= 2;
        }

        return curr;
    }

    private boolean valid(int[] seq) {
        int diff = seq[1] - seq[0];
        for (int i = 2; i < seq.length; i++) {
            while (seq[i] < diff + seq[i - 1]) {
                seq[i] *= 2;
            }
            if (seq[i] != diff + seq[i - 1]) {
                return false;
            }
        }
        return true;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
