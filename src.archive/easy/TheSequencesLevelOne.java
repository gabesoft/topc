package topc.easy;

import java.util.*;
import java.io.*;

// TCHS10 Round 1 Division I Level One - 250
// brute force
// statement: http://community.topcoder.com/tc?module=HSProblemStatement&pm=10816&rd=14224
// editorial: http://apps.topcoder.com/wiki/display/tc/Algorithm+Problem+Set+Analysis
public class TheSequencesLevelOne {
    public int[] find(int[] sequence) {
        for (int i = 0; i < sequence.length; i++) {
            int k = sequence[i];
            while (k % 4 != 0 && k % 7 != 0) {
                k--;
            }
            int p = sequence[i];
            while (p % 4 != 0 && p % 7 != 0) {
                p++;
            }

            if (p - sequence[i] < sequence[i] - k) {
                sequence[i] = p;
            } else {
                sequence[i] = k;
            }
        }
        return sequence;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
