package topc.math;

import java.util.*;
import java.io.*;

// SRM 179 Division I Level Two - 600
// advanced math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=1099&rd=4715
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm179
public class Regions {
    long MAX = 2000000000L;

    public int numTaxes(int[] row, int[] col) {
        long sum = 0;
        for (int i = 1; i < row.length; i++) {
            sum += dist(row[i - 1], col[i - 1], row[i], col[i]);
            if (sum > MAX) {
                break;
            }
        }

        return (int)(sum > MAX ? -1 : sum);
    }

    private long dist(long x1, long y1, long x2, long y2) {
        long dx = Math.abs(x1 - x2);
        long dy = Math.abs(y1 - y2);
        long g  = gcd(dx, dy);

        return g == 0 ? 0 : dx + dy - (dx / g % 2 == dy / g % 2 ? g : 0);
    }

    private long gcd(long a, long b) {
        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {
            long c = b;
            b = a % b;
            a = c;
        }

        return a;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
