package topc.recursion;

import java.util.*;
import java.io.*;

// SRM 185 Division II Level Three - 900
// recursion
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=2376&rd=4745
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm185
public class Hilbert {
    public int steps(int k, int x, int y) {
        if (k == 0) { return 0; }

        int k2 = 1 << (k - 1);  // 2 ^ (k - 1)
        int k4 = k2 * k2;       // 4 ^ (k - 1)

        if (x <= k2 && y <= k2) {   // Q1
            return steps(k - 1, y, x);
        }
        if (x <= k2 && y > k2) {    // Q2
            return k4 + steps(k - 1, x, y - k2);
        }
        if (x > k2 && y > k2) {     // Q3
            return k4 * 2 + steps(k - 1, x - k2, y - k2);
        }
        if (x > k2 && y <= k2) {    // Q4
            return k4 * 3 + steps(k - 1, (k2 + 1) - y, (k2 + 1) - (x - k2));
        }

        return 0;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
