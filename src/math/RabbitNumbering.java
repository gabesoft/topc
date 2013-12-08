package topc.math;

import java.util.*;
import java.io.*;

// SRM 463 Division I Level One - 250
// math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10697&rd=14148
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+463
public class RabbitNumbering {
    long MOD = 1000000007L;

    public int theCount(int[] maxNumber) {
        Arrays.sort(maxNumber);

        int n  = maxNumber.length;
        long r = 1;
        long k = 0;

        for (int i = 0; i < n; i++) {
            r *= Math.max(0L, maxNumber[i] - k);
            r %= MOD;
            k++;
        }

        return (int)r;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
