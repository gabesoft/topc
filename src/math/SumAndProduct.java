package topc.math;

import java.util.*;
import java.io.*;

// SRM 431 Division II Level Three - 1000
// math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10257&rd=13522
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm431
public class SumAndProduct {
    public int smallestSet(int S, int P) {
        if (S == P) { return 1; }

        int n = 2;
        while (Math.pow(S / (double) n, n) < P) {
            n++;
            if (n > S) { return -1; }
        }

        return n;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
