package topc.search;

import java.util.*;
import java.io.*;

// SRM 567 Division II Level One - 250
// simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12376&rd=15487
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+567
public class NinjaTurtles {
    public int countOpponents(int P, int K) {
        int lo = 3 * K * (P - 1) / (9 + K);
        int hi = 3 * K * (P + ((9 + K) / 3 * K)) / (9 + K);

        for (int i = lo; i <= hi + 1; i++) {
            if (valid(P, K, i)) {
                return i;
            }
        }

        return -1;
    }

    private boolean valid(int p, int k, int n) {
        return p == 3 * (n / k) + (n / 3);
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
