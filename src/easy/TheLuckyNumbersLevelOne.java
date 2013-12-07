package topc.easy;

import java.util.*;
import java.io.*;

// TCHS10 Championship Round Division I Level One - 250
// brute force
// statement: http://community.topcoder.com/tc?module=HSProblemStatement&pm=10832&rd=14247
// editorial: http://apps.topcoder.com/wiki/display/tc/Algorithm+Problem+Set+Analysis
public class TheLuckyNumbersLevelOne {
    public long find(long a, long b) {
        return count(b) - count(a - 1);
    }

    private long count(long n) {
        int c = 0;

        for (int i = 1; i < 20; i++) {
            if (i % 2 == 1) {
                c += rec("4", i, n);
                c += rec("7", i, n);
            } else {
                c += rec("44", i, n);
                c += rec("77", i, n);
            }
        }

        return c;
    }

    private long rec(String num, long len, long n) {
        if (num.length() == len) {
            return Long.parseLong(num) <= n ? 1 : 0;
        } else {
            return rec("4" + num + "4", len, n) + rec("7" + num + "7", len, n);
        }
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
