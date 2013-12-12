package topc.math;

import java.util.*;
import java.io.*;

// SRM 517 Division I Level One - 250
// math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11535&rd=14542
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+517
public class CompositeSmash {
    int T;
    public String thePossible(int N, int target) {
        if (N < target) { return "No"; }
        if (N == target) { return "Yes"; }

        T = target;
        return find(N) ? "Yes" : "No";
    }

    private boolean find(int x) {
        if (x == T) { return true; }
        if (x <= 2) { return false; }

        boolean res = true;
        int count   = 0;

        for (int i = 2; i * i < x + 1; i++) {
            if (x % i == 0) {
                count++;
                res &= (find(i) || find(x / i));
            }
        }

        return count > 0 && res;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
