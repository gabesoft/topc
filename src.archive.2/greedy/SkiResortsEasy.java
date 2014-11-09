package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 573 Division II Level One - 250
// greedy
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12469&rd=15493
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+573
public class SkiResortsEasy {
    public int minCost(int[] altitude) {
        int cost = 0;

        for (int i = 1; i < altitude.length; i++) {
            if (altitude[i] > altitude[i - 1]) {
                cost += (altitude[i] - altitude[i - 1]);
                altitude[i] = altitude[i - 1];
            }
        }

        return cost;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
