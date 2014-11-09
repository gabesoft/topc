package topc.math;

import java.util.*;
import java.io.*;

// SRM 514 Division II Level Three - 1000
// simple math, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11479&rd=14539
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+514
public class MagicalGirlLevelThreeDivTwo {
    String first[];
    long count[];
    int K;

    public int theCount(String[] first, int n, long lo, long hi) {
        K     = first.length;
        count = new long[Math.max(n, K) + 1];

        for (int i = 0; i < K; i++) {
            count[i] = first[i].length();
        }
        for (int i = K; i < n + 1; i++) {
            count[i] = 0;
            for (int j = i - 1; j >= 0; j -= K) {
                count[i] += count[j];
                count[i] = Math.min(count[i], hi + 1);
            }
        }

        this.first  = first;
        int c       = 0;
        for (long i = lo; i <= hi; i++) {
            c += digit(n, i) == '1' ? 1 : 0;
        }
        return c;
    }

    char digit(int i, long p) {
        if (i < K) {
            return first[i].charAt((int)p);
        } else {
            long before = 0;
            int j       = i - 1;
            while (p >= before + count[j]) {
                before += count[j];
                j -= K;
            }
            return digit(j, p - before);
        }
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
