package topc.math;

import java.util.*;
import java.io.*;

// SRM 236 Division I Level Two - 500
// advanced math, search
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=4459&rd=6535
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm236
public class HammingNumbers {
    long MAX = 2146636800;

    public int getNumber(int[] factors, int n) {
        TreeSet<Long> set = new TreeSet<Long>();

        Arrays.sort(factors);

        set.add(1L);

        long max  = 1;
        long num  = 0;
        int count = 0;
        int total = 1;

        while (count < n) {
            long min = set.pollFirst();

            for (int i = 0; i < factors.length; i++) {
                long next = min * factors[i];
                if (total < n + 1 || next < max + 1) {
                    max = Math.max(max, next);
                    if (set.add(next)) {
                        total++;
                    }
                }
            }

            num = min;
            count++;
        }

        return (num <= 0 || num > MAX) ? -1 : (int)num;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
