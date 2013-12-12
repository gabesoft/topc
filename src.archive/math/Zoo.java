package topc.math;

import java.util.*;
import java.io.*;

// SRM 511 Division I Level One - 250
// math, recursion
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11485&rd=14536
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+511
public class Zoo {
    public long theCount(int[] answers) {
        int n = answers.length;
        int m = 41;

        int cnt[] = new int[m];
        for (int i = 0; i < n; i++) {
            cnt[answers[i]]++;
        }

        if (cnt[0] > 2) { return 0; }
        for (int i = 1; i < m; i++) {
            if (cnt[i] > cnt[i - 1]) {
                return 0;
            }
        }

        long count = 1;
        int  i = 0;
        while (cnt[i] == 2) {
            i++;
            count *= 2;
        }
        if (cnt[i] == 1) {
            count *= 2;
        }

        return count;
    }
}
