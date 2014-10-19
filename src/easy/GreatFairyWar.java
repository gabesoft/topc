package topc.easy;

import java.util.*;
import java.io.*;

// SRM 557 Division II Level One - 250
// brute force, greedy
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11954&rd=15179
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+557
public class GreatFairyWar {
    public int minHP(int[] dps, int[] hp) {
        int res = 0;
        int dpsSum = 0;
        int n = hp.length;

        for (int i = n - 1; i > -1; i--) {
            dpsSum += dps[i];
            res += hp[i] * dpsSum;
        }

        return res;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
