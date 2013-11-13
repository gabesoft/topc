package topc.search;

import java.util.*;
import java.io.*;

// SRM 498 Division I Level One - 250
// simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11219&rd=14427
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+498
public class FoxSequence {
    public String isValid(int[] seq) {
        if (seq.length <= 4) { return "NO"; }

        int n = seq.length;
        int diff[] = new int[n];

        for (int i = 1; i < n; i++) {
            diff[i] = seq[i] - seq[i - 1];
        }

        if (diff[1] <= 0 || diff[n - 1] >= 0) {
            return "NO";
        }

        int pos  = 1;
        int neg  = 0;
        int zero = 0;
        int pre  = diff[1];

        for (int i = 2; i < diff.length; i++) {
            if (diff[i] != pre) {
                if (diff[i] * pre > 0) {
                    return "NO";
                }
                if (diff[i] * pre == 0 && pre > 0) {
                    return "NO";
                }
                if (diff[i] * pre == 0 && diff[i] < 0) {
                    return "NO";
                }
                if (diff[i] == 0) {
                    zero++;
                } else if (diff[i] < 0) {
                    neg++;
                } else {
                    pos++;
                }

                pre = diff[i];
            }
        }

        return (pos == 2 && neg == 2 && zero <= 1) ? "YES" : "NO";
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
