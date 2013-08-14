package topc.math;

import java.util.*;
import java.io.*;

// SRM 585 Division I Level One - 250
// math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11361&rd=15697
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+585
public class TrafficCongestion {
    long MOD = 1000000007;

    public int theMinCars(int n) {
        //return ((1 << (n + 1)) - (n % 2 == 0 ? -1 : 1)) / 3;

        long res = 1;
        for (int i = 1; i < n + 1; i++) {
            res  = 2 * res;
            res += (i & 1) == 0 ? 1 : -1;
            res %= MOD;
        }
        return (int) res;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
