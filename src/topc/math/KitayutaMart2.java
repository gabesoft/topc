package topc.math;

import java.util.*;

// SRM 648 Division II Level One - 250
// simple math, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13650&rd=16312
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+648
public class KitayutaMart2 {
    public int numBought(int K, int T) {
        int x = 1;
        int y = (1 << x) * K;

        while (y < T) {
            x++;
            y = (1 << x) * K;
        }

        return x;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
