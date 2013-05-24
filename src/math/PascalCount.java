package topc.math;

import java.util.*;
import java.io.*;

// SRM 230 Division I Level Two - 500
// math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=3564&rd=6519
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm230
public class PascalCount {
    int data[][] = {
        { 2, 0, 0, -1 },
        { 3, 0, 0, -1 },
        { 2, 0, 1, -1 },
        { 5, 0, 0, -1 },
        { 3, 2, 0,  0 }
    };

    public int howMany(int i, int d) {
        if (i == 0) { return 0; }

        int d1 = data[d - 2][0];
        int d2 = data[d - 2][1];
        int t1 = data[d - 2][2];
        int t2 = data[d - 2][3];

        int f1 = factors(d1, i);
        int f2 = factors(d2, i);
        int c  = (f1 > t1 && f2 > t2) ? 1 : 0;
        int l  = 0;

        int last = i % 2 == 0 ? (i / 2) - 1 : i / 2;

        for (int j = 2; j <= last; j++) {
            f1 += factors(d1, i - (j - 1));
            f1 -= factors(d1, j);

            f2 += factors(d2, i - (j - 1));
            f2 -= factors(d2, j);

            if (f1 > t1 && f2 > t2) {
                c++;
            }
        }

        if (i % 2 == 0) {
            f1 += factors(d1, i - (i / 2 - 1));
            f1 -= factors(d1, i / 2);

            f2 += factors(d2, i - (i / 2 - 1));
            f2 -= factors(d2, i / 2);

            if (f1 > t1 && f2 > t2) {
                l++;
            }
        }

        return 2 * c + l;
    }

    private int factors(int d, int n) {
        if (d == 0) { return 0; }

        int c = 0;
        while (n % d == 0) {
            c++;
            n /= d;
        }
        return c;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
