package topc.math;

import java.util.*;
import java.io.*;

// SRM 511 Division I Level One - 250
// math, recursion
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11485&rd=14536
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+511
public class Zoo {
    public long theCount(int[] answers) {
        Arrays.sort(answers);
        return valid(answers) ? count(answers, answers.length - 1) * 2 : 0;
    }

    private long count(int[] ans, int index) {
        if (ans[index] == 0) { return 1; }

        long v = ans[index];
        long c = 0;

        for (int i = index - 1; i > -1; i--) {
            if (ans[i] == v) { continue; }
            if (ans[i] == v - 1) {
                c += count(ans, i);
            } else {
                break;
            }
        }

        return c;
    }

    private boolean valid(int[] ans) {
        int n      = ans.length;
        int last   = n - 1;
        int[] type = new int[n];

        Arrays.fill(type, -1);

        type[last] = 1;
        for (int i = n - 2; i > -1; i--) {
            if (ans[i] == ans[last] - 1) {
                type[i] = 1;
                last    = i;
            }
        }

        last = -1;
        for (int i = n - 2; i > -1; i--) {
            if (type[i] == 1) { continue; }
            if (last == -1) {
                last = i;
                type[i] = 2;
            } else if (ans[i] == ans[last] - 1) {
                last = i;
                type[i] = 2;
            }
        }

        int f1 = -1;
        int f2 = -1;

        for (int i = 0; i < n; i++) {
            if (type[i] == -1) {
                return false;
            }
            if (type[i] == 1 && f1 == -1) {
                f1 = i;
            }
            if (type[i] == 2 && f2 == -1) {
                f2 = i;
            }
        }

        return (f1 == -1 || ans[f1] == 0) && (f2 == -1 || ans[f2] == 0);
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
