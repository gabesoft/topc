package topc.math;

import java.util.*;
import java.io.*;

// SRM 394 Division II Level Three - 1000
// math, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=8547&rd=11128
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm394
public class ProperDivisors {
    public int analyzeInterval(int a, int b, int n) {
        int sum = 0;
        if (a == 1) {
            a++;
            b--;
        }

        for (int k = 2; k <= (a + b) / 2; k++) {
            sum += ((a + b) / k - (a - 1) / k);
        }
        for (int k = 2; pow(k, n) <= (a + b); k++) {
            sum -= ((a + b) / pow(k, n) - (a - 1) / pow(k, n));
        }
        if (a <= (a + b) / 2) {
            sum -= ((a + b) / 2 - a + 1);
        }

        return sum;
    }

    int pow(int k, int n) {
        if (n == 1) { return k; }
        return k * pow(k, n - 1);
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
